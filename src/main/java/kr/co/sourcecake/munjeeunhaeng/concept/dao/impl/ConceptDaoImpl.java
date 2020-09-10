package kr.co.sourcecake.munjeeunhaeng.concept.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import kr.co.sourcecake.munjeeunhaeng.concept.dao.ConceptDao;
import kr.co.sourcecake.munjeeunhaeng.concept.vo.ConceptVo;

@Repository
public class ConceptDaoImpl implements ConceptDao{
	private JdbcTemplate jdbcTemplate;
	
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	private RowMapper<ConceptVo> conceptVoMapper = new RowMapper<ConceptVo>() {
		public ConceptVo mapRow(ResultSet rs, int rowNum) throws SQLException {
			ConceptVo conceptVo = new ConceptVo();
			conceptVo.setIdx(rs.getInt("IDX"));
			conceptVo.setWord(rs.getString("WORD"));
			conceptVo.setInterpret(rs.getString("INTERPRET"));
			conceptVo.setSubject(rs.getString("SUBJECT"));
			conceptVo.setChapter(rs.getString("CHAPTER"));
			conceptVo.setQuestion(rs.getBytes("QUESTION"));
			conceptVo.setAnswer(rs.getBytes("ANSWER"));
			return conceptVo;
		}
	};
	
	public void add(ConceptVo conceptVo){
		this.jdbcTemplate.update("INSERT INTO CONCEPT(WORD, INTERPRET, SUBJECT, CHAPTER, QUESTION, ANSWER) VALUES(?, ?, ?, ?, ?, ?)"
				, conceptVo.getWord(), conceptVo.getInterpret(), conceptVo.getSubject(), conceptVo.getChapter(), conceptVo.getQuestion(), conceptVo.getAnswer());
	}
	
	public ConceptVo get(String idx){
		return this.jdbcTemplate.queryForObject("SELECT * FROM CONCEPT WHERE IDX = ?", 
				new Object[] {idx}, this.conceptVoMapper);
	}
	
	public void deleteAll(){
		this.jdbcTemplate.update("DELETE FROM CONCEPT");
	}
	
	public int getCount() {
		return this.jdbcTemplate.queryForObject("SELECT COUNT(*) FROM CONCEPT", Integer.class);
	}
	
	public List<ConceptVo> getAll(String subject){
		return this.jdbcTemplate.query("SELECT * FROM CONCEPT WHERE SUBJECT = ? ORDER BY IDX", new Object[] {subject}, this.conceptVoMapper);
	}

	@Override
	public void update(ConceptVo conceptVo) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public List<String> selectChapterList(String subject){
		return this.jdbcTemplate.query("SELECT CHAPTER FROM CONCEPT WHERE SUBJECT = ? GROUP BY CHAPTER ORDER BY CHAPTER ASC", new Object[] {subject}, new RowMapper<String>(){
			public String mapRow(ResultSet rs, int rowNum) throws SQLException {
				return rs.getString(1);
			}
		});
	}

	@Override
	public List<ConceptVo> getList(String subject, String chapter) {
		return this.jdbcTemplate.query("SELECT * FROM CONCEPT WHERE SUBJECT = ? AND CHAPTER = ? ORDER BY IDX", new Object[] {subject, chapter}, this.conceptVoMapper);
	}
}
