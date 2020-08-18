package 문제은행.Concept.dao;

import java.util.List;

import 문제은행.Concept.vo.ConceptVo;

public interface ConceptDao {
	public void add(final ConceptVo conceptVo);
	public ConceptVo get(String id);
	public void deleteAll();
	public int getCount();
	public List<ConceptVo> getAll(String type, int chapter);
	public void update(ConceptVo conceptVo);
}
