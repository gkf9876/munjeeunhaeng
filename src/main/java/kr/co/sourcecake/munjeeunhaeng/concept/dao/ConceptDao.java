package kr.co.sourcecake.munjeeunhaeng.concept.dao;

import java.util.List;

import kr.co.sourcecake.munjeeunhaeng.concept.vo.ConceptVo;

public interface ConceptDao {
	public void add(final ConceptVo conceptVo);
	public ConceptVo get(String id);
	public void deleteAll();
	public int getCount();
	public List<ConceptVo> getAll(String subject);
	public void update(ConceptVo conceptVo);
	public List<String> selectChapterList(String type);
	public List<ConceptVo> getList(String subject, String chapter);
}
