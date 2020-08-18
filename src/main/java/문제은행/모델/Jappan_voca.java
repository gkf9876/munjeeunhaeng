package 문제은행.모델;

import java.util.List;

import 문제은행.AppContext.AppContext;
import 문제은행.Term.dao.TermDao;
import 문제은행.모델.Question_bank.Keyword;

class Jappan_voca extends Subject
{
	TermDao termDao;
	
    public Jappan_voca(String name, Keyword code, List<String> chapterList)
    {
    	super(name, code, chapterList);
    }
}