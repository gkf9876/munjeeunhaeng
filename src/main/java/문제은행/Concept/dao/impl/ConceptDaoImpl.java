package 문제은행.Concept.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import 문제은행.Concept.dao.ConceptDao;
import 문제은행.Concept.vo.ConceptVo;

@Repository
public class ConceptDaoImpl implements ConceptDao{
	private JdbcTemplate jdbcTemplate;
	
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	private RowMapper<ConceptVo> ConceptVoMapper = new RowMapper<ConceptVo>() {
		public ConceptVo mapRow(ResultSet rs, int rowNum) throws SQLException {
			ConceptVo conceptVo = new ConceptVo();
			conceptVo.setIdx(rs.getInt("IDX"));
			conceptVo.setWord(rs.getString("WORD"));
			conceptVo.setInterpret(rs.getString("INTERPRET"));
			conceptVo.setType(rs.getString("TYPE"));
			conceptVo.setChapter(rs.getInt("CHAPTER"));
			return conceptVo;
		}
	};
	
	public void add(final ConceptVo conceptVo){
		this.jdbcTemplate.update("INSERT INTO CONCEPT(WORD, INTERPRET, TYPE, CHAPTER) VALUES(?, ?, ?, ?)"
				, conceptVo.getWord(), conceptVo.getInterpret(), conceptVo.getType(), conceptVo.getChapter());
	}
	
	public ConceptVo get(String idx){
		return this.jdbcTemplate.queryForObject("SELECT * FROM CONCEPT WHERE IDX = ?", 
				new Object[] {idx}, this.ConceptVoMapper);
	}
	
	public void deleteAll(){
		this.jdbcTemplate.update("DELETE FROM CONCEPT");
	}
	
	public int getCount() {
		return this.jdbcTemplate.queryForObject("SELECT COUND(*) FROM CONCEPT", Integer.class);
	}
	
	public List<ConceptVo> getAll(String type, int chapter){
		return this.jdbcTemplate.query("SELECT * FROM CONCEPT WHERE TYPE = ? AND CHAPTER = ? ORDER BY IDX", new Object[] {type, chapter}, this.ConceptVoMapper);
	}

	@Override
	public void update(ConceptVo conceptVo) {
		// TODO Auto-generated method stub
		
	}
}
