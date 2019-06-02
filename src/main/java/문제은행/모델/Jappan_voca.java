package 문제은행.모델;

import 문제은행.AppContext.AppContext;
import 문제은행.Term.dao.TermDao;
import 문제은행.모델.Question_bank.Keyword;

class Jappan_voca extends Subject
{
	TermDao termDao;
	
    public Jappan_voca(String name, Keyword code)
    {
    	super(name, code);
        AppContext context = new AppContext();
        termDao = context.termDao();
        
        this.HT = new Term[4];
        HT[1] = new Term("1");
        HT[1].setTermList(termDao.getAll("JAPAN_VOCA", "1"));

        HT[2] = new Term("2");
        HT[2].setTermList(termDao.getAll("JAPAN_VOCA", "2"));

        HT[3] = new Term("3");
        HT[3].setTermList(termDao.getAll("JAPAN_VOCA", "3"));
    }
}