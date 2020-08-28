package kr.co.sourcecake.munjeeunhaeng.term.dao;

import java.util.List;

import kr.co.sourcecake.munjeeunhaeng.term.vo.TermVo;

public interface TermDao {
	public void add(final TermVo termVo);
	public TermVo get(String id);
	public void deleteAll();
	public int getCount();
	public List<TermVo> getAll(String type);
	public void update(TermVo termVo);
	public List<String> selectChapterList(String type);
	public List<TermVo> getList(String type, String chapter);
}
