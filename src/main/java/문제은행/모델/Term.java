package ��������.��;

import java.util.ArrayList;

import ��������.Term.vo.TermVo;

public class Term
{
	 public String name;
     public ArrayList<TermVo> termList;
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
     
     public void setTermList(ArrayList<TermVo> list) {
    	 this.termList = list;
    	 this.count = list.size();
     }
     
     public ArrayList<TermVo> getTermList(){
    	 return this.termList;
     }
}
