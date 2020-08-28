package kr.co.sourcecake.munjeeunhaeng.term.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import kr.co.sourcecake.munjeeunhaeng.term.dao.TermDao;
import kr.co.sourcecake.munjeeunhaeng.term.vo.TermVo;

@Repository
public class TermDaoImpl implements TermDao{
	private JdbcTemplate jdbcTemplate;
	
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	private RowMapper<TermVo> termVoMapper = new RowMapper<TermVo>() {
		public TermVo mapRow(ResultSet rs, int rowNum) throws SQLException {
			TermVo termVo = new TermVo();
			termVo.setIdx(rs.getInt("IDX"));
			termVo.setWord(rs.getString("WORD"));
			termVo.setTranslate(rs.getString("TRANSLATE"));
			termVo.setExercise(rs.getString("EXERCISE"));
			termVo.setGrammarQuestion(rs.getString("GRAMMAR_QUESTION"));
			termVo.setGrammarAnswer(rs.getString("GRAMMAR_ANSWER"));
			return termVo;
		}
	};
	
	public void add(final TermVo termVo){
		this.jdbcTemplate.update("INSERT INTO TERM(WORD, TRANSLATE, EXERCISE, GRAMMAR_QUESTION, GRAMMAR_ANSWER) VALUES(?, ?, ?, ?, ?)"
				, termVo.getWord(), termVo.getTranslate(), termVo.getExercise(), termVo.getGrammarQuestion(), termVo.getGrammarAnswer());
	}
	
	public TermVo get(String idx){
		return this.jdbcTemplate.queryForObject("SELECT * FROM TERM WHERE IDX = ?", 
				new Object[] {idx}, this.termVoMapper);
	}
	
	public void deleteAll(){
		this.jdbcTemplate.update("DELETE FROM TERM");
	}
	
	public int getCount() {
		return this.jdbcTemplate.queryForObject("SELECT COUNT(*) FROM TERM", Integer.class);
	}
	
	public List<TermVo> getAll(String type){
		return this.jdbcTemplate.query("SELECT * FROM TERM WHERE TYPE = ? ORDER BY IDX", new Object[] {type}, this.termVoMapper);
	}

	@Override
	public void update(TermVo termVo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<String> selectChapterList(String type){
		return this.jdbcTemplate.query("SELECT CHAPTER FROM TERM WHERE TYPE = ? GROUP BY CHAPTER ORDER BY CHAPTER ASC", new Object[] {type}, new RowMapper<String>(){
			public String mapRow(ResultSet rs, int rowNum) throws SQLException {
				return rs.getString(1);
			}
		});
	}

	@Override
	public List<TermVo> getList(String type, String chapter) {
		return this.jdbcTemplate.query("SELECT * FROM TERM WHERE TYPE = ? AND CHAPTER = ? ORDER BY IDX", new Object[] {type, chapter}, this.termVoMapper);
	}
}
