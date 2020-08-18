package 문제은행.Term.dao;

import java.util.List;

import 문제은행.Term.vo.TermVo;

public interface TermDao {
	public void add(final TermVo termVo);
	public TermVo get(String id);
	public void deleteAll();
	public int getCount();
	public List<TermVo> getAll(String type, String chapter);
	public void update(TermVo termVo);
	public List<String> selectChapterList(String type);
}
