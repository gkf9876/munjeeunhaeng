package 문제은행.모델;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import 문제은행.AppContext.AppContext;
import 문제은행.Term.dao.TermDao;
import 문제은행.Term.vo.TermVo;

@ContextConfiguration(classes= {AppContext.class})
public class Term
{
	@Autowired
	private TermDao termDao;
	
	 public String name;
     public ArrayList<TermVo> termList;
     public int count = 0;

     public Term(String name)
     {
         this.name = name;
         if(termDao != null) {
        	 System.out.println("Hello World");
         }
     }
     
     public int getCount() {
    	 return count;
     }
     
     public void setCount(int count) {
    	 this.count = count;
     }
     
     public void setTermList(ArrayList<TermVo> list) {
    	 this.termList = list;
    	 this.count = list.size();
     }
     
     public ArrayList<TermVo> getTermList(){
    	 return this.termList;
     }
}
