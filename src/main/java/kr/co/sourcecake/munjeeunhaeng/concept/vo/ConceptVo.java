package kr.co.sourcecake.munjeeunhaeng.concept.vo;

public class ConceptVo {
	private int idx;
	private String word;
	private String interpret;
	private String subject;
	private String chapter;
	private byte[] question;
	private byte[] answer;
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public String getInterpret() {
		return interpret;
	}
	public void setInterpret(String interpret) {
		this.interpret = interpret;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getChapter() {
		return chapter;
	}
	public void setChapter(String chapter) {
		this.chapter = chapter;
	}
	public byte[] getQuestion() {
		return question;
	}
	public void setQuestion(byte[] question) {
		this.question = question;
	}
	public byte[] getAnswer() {
		return answer;
	}
	public void setAnswer(byte[] answer) {
		this.answer = answer;
	}
}
