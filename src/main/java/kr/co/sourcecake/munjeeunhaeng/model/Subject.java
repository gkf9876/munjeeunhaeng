package kr.co.sourcecake.munjeeunhaeng.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import kr.co.sourcecake.munjeeunhaeng.term.vo.TermVo;

public class Subject<T>
{
	private String name;
	private String subject;
	private List<String> chapterList;
	private Map<String, List<T>> infoMap;

	public Subject(String name, String subject){
		this.name = name;
		this.subject = subject;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public List<String> getChapterList() {
		return chapterList;
	}

	public void setChapterList(List<String> chapterList) {
		this.chapterList = chapterList;
	}

	public Map<String, List<T>> getInfoMap() {
		return infoMap;
	}

	public void setInfoMap(Map<String, List<T>> infoMap) {
		this.infoMap = infoMap;
	}
}
