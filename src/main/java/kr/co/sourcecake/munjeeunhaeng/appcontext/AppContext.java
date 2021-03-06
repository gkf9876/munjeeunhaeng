﻿package kr.co.sourcecake.munjeeunhaeng.appcontext;

import javax.sql.DataSource;

import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import kr.co.sourcecake.munjeeunhaeng.concept.dao.ConceptDao;
import kr.co.sourcecake.munjeeunhaeng.concept.dao.impl.ConceptDaoImpl;
import kr.co.sourcecake.munjeeunhaeng.model.QuestionBank;
import kr.co.sourcecake.munjeeunhaeng.term.dao.TermDao;
import kr.co.sourcecake.munjeeunhaeng.term.dao.impl.TermDaoImpl;

public class AppContext {
	private DataSource dataSource = null;
	
	private TermDao termDao = null;
	private ConceptDao conceptDao = null;
	private QuestionBank questionBank = null;
	
	public DataSource dataSource() {
		if(dataSource == null) {
			SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
			dataSource.setDriverClass(org.sqlite.JDBC.class);
			dataSource.setUrl("jdbc:sqlite::resource:testbank.db");
			dataSource.setUsername("spring");
			dataSource.setPassword("");
			this.dataSource = dataSource;
		}
		return this.dataSource;
	}
	
	public TermDao termDao() {
		if(this.termDao == null) {
			TermDaoImpl termDaoImpl = new TermDaoImpl();
			termDaoImpl.setDataSource(this.dataSource());
			this.termDao = termDaoImpl;
		}
		return this.termDao;
	}
	
	public ConceptDao conceptDao() {
		if(this.conceptDao == null) {
			ConceptDaoImpl conceptDaoImpl = new ConceptDaoImpl();
			conceptDaoImpl.setDataSource(this.dataSource());
			this.conceptDao = conceptDaoImpl;
		}
		return this.conceptDao;
	}
	
	public QuestionBank questionBank() {
		if(this.questionBank == null) {
			QuestionBank questionBank = new QuestionBank();
			questionBank.setTermDao(this.termDao());
			questionBank.setConceptDao(this.conceptDao());
			questionBank.getData();
			this.questionBank = questionBank;
		}
		return questionBank;
	}
}
