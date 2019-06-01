package 문제은행.Term.vo;

public class TermVo {
	private int idx;
    private String word;
    private String translate;
    private String exercise;
    private String grammarQuestion;
    private String grammarAnswer;
    
    public TermVo() {
    	
    }
    public TermVo(String word, String translate) {
    	this.word = word;
    	this.translate = translate;
    }
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
	public String getTranslate() {
		return translate;
	}
	public void setTranslate(String translate) {
		this.translate = translate;
	}
	public String getExercise() {
		return exercise;
	}
	public void setExercise(String exercise) {
		this.exercise = exercise;
	}
	public String getGrammarQuestion() {
		return grammarQuestion;
	}
	public void setGrammarQuestion(String grammarQuestion) {
		this.grammarQuestion = grammarQuestion;
	}
	public String getGrammarAnswer() {
		return grammarAnswer;
	}
	public void setGrammarAnswer(String grammarAnswer) {
		this.grammarAnswer = grammarAnswer;
	}
}
