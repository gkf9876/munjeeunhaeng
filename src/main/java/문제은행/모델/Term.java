package 문제은행.모델;

import java.util.List;
import 문제은행.Term.vo.TermVo;

public class Term
{
	 public String name;
     public List<TermVo> termList;
     public int count = 0;

     public Term(String name)
     {
         this.name = name;
     }
     
     public int getCount() {
    	 return count;
     }
     
     public void setCount(int count) {
    	 this.count = count;
     }
     
     public void setTermList(List<TermVo> list) {
    	 this.termList = list;
    	 this.count = list.size();
     }
     
     public List<TermVo> getTermList(){
    	 return this.termList;
     }
}
