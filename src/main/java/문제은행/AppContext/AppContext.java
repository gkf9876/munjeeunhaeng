package 문제은행.AppContext;

import javax.sql.DataSource;

import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import 문제은행.Concept.dao.ConceptDao;
import 문제은행.Concept.dao.impl.ConceptDaoImpl;
import 문제은행.Term.dao.TermDao;
import 문제은행.Term.dao.impl.TermDaoImpl;
import 문제은행.모델.Question_bank;

public class AppContext {
	private DataSource dataSource = null;
	
	private TermDao termDao = null;
	private ConceptDao conceptDao = null;
	private Question_bank questionBank = null;
	
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
	
	public Question_bank questionBank() {
		if(this.questionBank == null) {
			Question_bank questionBank = new Question_bank();
			questionBank.setTermDao(this.termDao());
			questionBank.setConceptDao(this.conceptDao());
			questionBank.getData();
			this.questionBank = questionBank;
		}
		return questionBank;
	}
}
