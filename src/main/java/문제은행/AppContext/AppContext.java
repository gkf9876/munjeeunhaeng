package 문제은행.AppContext;

import java.sql.Driver;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import 문제은행.Concept.dao.ConceptDao;
import 문제은행.Concept.dao.impl.ConceptDaoImpl;
import 문제은행.Term.dao.TermDao;
import 문제은행.Term.dao.impl.TermDaoImpl;

@Configuration
@ComponentScan(basePackages="문제은행")
public class AppContext {
	
	@Bean
	public DataSource dataSource() {
		SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
		dataSource.setDriverClass(Driver.class);
		dataSource.setUrl("jdbc:sqlite:resources\testbank.db");
		dataSource.setUsername("spring");
		dataSource.setPassword("");
		
		return dataSource;
	}
	
	@Bean
	public TermDao termDao() {
		TermDao termDao = new TermDaoImpl();
		return termDao;
	}
	
	@Bean
	public ConceptDao conceptDao() {
		ConceptDao conceptDao = new ConceptDaoImpl();
		return conceptDao;
	}
}
