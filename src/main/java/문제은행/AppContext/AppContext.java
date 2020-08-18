package 문제은행.AppContext;

import javax.sql.DataSource;

import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import 문제은행.Concept.dao.ConceptDao;
import 문제은행.Concept.dao.impl.ConceptDaoImpl;
import 문제은행.Term.dao.TermDao;
import 문제은행.Term.dao.impl.TermDaoImpl;

public class AppContext {
	private DataSource dataSource = null;
	
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
		TermDaoImpl termDao = new TermDaoImpl();
		termDao.setDataSource(this.dataSource());
		return termDao;
	}
	
	public ConceptDao conceptDao() {
		ConceptDaoImpl conceptDao = new ConceptDaoImpl();
		conceptDao.setDataSource(this.dataSource());
		return conceptDao;
	}
}
