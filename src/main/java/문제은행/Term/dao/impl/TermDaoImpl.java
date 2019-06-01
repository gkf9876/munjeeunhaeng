package 문제은행.Term.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import 문제은행.SqlService.SqlService;
import 문제은행.Term.dao.TermDao;
import 문제은행.Term.vo.TermVo;

@Repository
public class TermDaoImpl implements TermDao{
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private SqlService sqlService;
	
	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	private RowMapper<TermVo> termVoMapper = new RowMapper<TermVo>() {
		public TermVo mapRow(ResultSet rs, int rowNum) throws SQLException {
			TermVo termVo = new TermVo();
			termVo.setIdx(rs.getInt("idx"));
			termVo.setWord("word");
			termVo.setTranslate("translate");
			termVo.setExercise("exercise");
			termVo.setGrammarQuestion("grammarQuestion");
			termVo.setGrammarAnswer("grammarAnswer");
			return termVo;
		}
	};
	
	public void add(final TermVo termVo){
		this.jdbcTemplate.update(this.sqlService.getSql("termVoAdd"), 
				termVo.getIdx(), termVo.getWord(), termVo.getTranslate(), termVo.getExercise(), termVo.getGrammarQuestion(), termVo.getGrammarAnswer());
	}
	
	public TermVo get(String id){
		return this.jdbcTemplate.queryForObject(this.sqlService.getSql("termVoGet"), 
				new Object[] {id}, this.termVoMapper);
	}
	
	public void deleteAll(){
		this.jdbcTemplate.update(this.sqlService.getSql("termVoDeleteAll"));
	}
	
	public int getCount() {
		return this.jdbcTemplate.queryForObject(this.sqlService.getSql("termVoGetCount"), Integer.class);
	}
	
	public List<TermVo> getAll(){
		return this.jdbcTemplate.query(this.sqlService.getSql("termVoGetAll"), this.termVoMapper);
	}

	public void update(TermVo termVo) {
		this.jdbcTemplate.update(this.sqlService.getSql("termVoUpdate"),
				termVo.getWord(), termVo.getTranslate(), termVo.getExercise(), termVo.getGrammarQuestion(), termVo.getGrammarAnswer(), termVo.getIdx());
	}
}
