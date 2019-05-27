package 문제은행.모델;

import java.util.ArrayList;

import 문제은행.Term.vo.TermVo;

public class Term
{
	 public String name;
     public ArrayList<TermVo> termList;
     public int count;

     public Term(String name)
     {
         this.name = name;
         this.termList = new ArrayList<>();
         this.count = 0;
     }

     public void add_term(String word, String translate, String exercise, String grammar_question, String grammar_answer)
     {
    	 TermVo termVo = new TermVo();
    	 termVo.setWord(word);
    	 termVo.setTranslate(translate);
    	 termVo.setExercise(exercise);
    	 termVo.setGrammarQuestion(grammar_question);
    	 termVo.setGrammarAnswer(grammar_answer);
    	 termList.add(termVo);
    	 count++;
     }
     
     public void add_term(String word, String translate, String exercise)
     {
    	 TermVo termVo = new TermVo();
    	 termVo.setWord(word);
    	 termVo.setTranslate(translate);
    	 termVo.setExercise(exercise);
    	 termVo.setGrammarQuestion(null);
    	 termVo.setGrammarAnswer(null);
    	 termList.add(termVo);
    	 count++;
     }
     
     public void add_term(String word, String translate)
     {
    	 TermVo termVo = new TermVo();
    	 termVo.setWord(word);
    	 termVo.setTranslate(translate);
    	 termVo.setExercise(null);
    	 termVo.setGrammarQuestion(null);
    	 termVo.setGrammarAnswer(null);
    	 termList.add(termVo);
    	 count++;
     }

     public void add_term(Term Ev)
     {
         for (int i = 0; i < Ev.count; i++)
         {
        	 TermVo imsiEv = new TermVo();
        	 imsiEv.setWord(Ev.termList.get(i).getWord());
        	 imsiEv.setTranslate(Ev.termList.get(i).getTranslate());
        	 imsiEv.setExercise(Ev.termList.get(i).getExercise());
        	 imsiEv.setGrammarQuestion(Ev.termList.get(i).getGrammarQuestion());
        	 imsiEv.setGrammarAnswer(Ev.termList.get(i).getGrammarAnswer());
        	 termList.add(imsiEv);
        	 count++;
         }
     }
}
