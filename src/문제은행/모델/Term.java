package 문제은행.모델;

import java.util.ArrayList;

public class Term
{
	 public String name;
     public ArrayList<String> word;
     public ArrayList<String> translate;
     public ArrayList<String> exercise;
     public ArrayList<String> grammar_question;
     public ArrayList<String> grammar_answer;
     public int count;

     public Term(String name)
     {
         this.name = name;
         word = new ArrayList<>();
         translate = new ArrayList<>();
         exercise = new ArrayList<>();
         grammar_question = new ArrayList<>();
         grammar_answer = new ArrayList<>();
         this.count = 0;
     }

     public void add_term(String word, String translate, String exercise, String grammar_question, String grammar_answer)
     {
    	 this.word.add(word);
    	 this.translate.add(translate);
    	 this.grammar_question.add(grammar_question);
    	 this.grammar_answer.add(grammar_answer);
    	 this.exercise.add(exercise);
    	 count++;
     }
     
     public void add_term(String word, String translate, String exercise)
     {
    	 this.word.add(word);
    	 this.translate.add(translate);
    	 this.grammar_question.add(null);
    	 this.grammar_answer.add(null);
    	 this.exercise.add(exercise);
    	 count++;
     }
     
     public void add_term(String word, String translate)
     {
    	 this.word.add(word);
    	 this.translate.add(translate);
    	 this.grammar_question.add(null);
    	 this.grammar_answer.add(null);
    	 this.exercise.add(null);
    	 count++;
     }

     public void add_term(Term Ev)
     {
         for (int i = 0; i < Ev.count; i++)
         {
        	 this.word.add(Ev.word.get(i));
        	 this.translate.add(Ev.translate.get(i));
        	 
        	 if(Ev.grammar_question.get(i) != null)
        		 this.grammar_question.add(Ev.grammar_question.get(i));
        	 else
        		 this.grammar_question.add(null);
        	 
        	 if(Ev.grammar_answer.get(i) != null)
        		 this.grammar_answer.add(Ev.grammar_answer.get(i));
        	 else
        		 this.grammar_answer.add(null);
        	 
        	 if(Ev.exercise.get(i) != null)
        		 this.exercise.add(Ev.exercise.get(i));
        	 else
        		 this.exercise.add(null);

        	 count++;
         }
     }
}
