package 문제은행.모델;

import java.util.ArrayList;

import 문제은행.Concept.vo.ConceptVo;
import 문제은행.Term.vo.TermVo;

public class Concept
{
	public String name;
    public ArrayList<ConceptVo> conceptList;
    public int count = 0;

    public Concept(String name)
    {
        this.name = name;
    }

    public int getCount() {
   	 return count;
    }
    
    public void setCount(int count) {
   	 this.count = count;
    }
    
    public void setConceptList(ArrayList<ConceptVo> list) {
   	 this.conceptList = list;
	 this.count = list.size();
    }
    
    public ArrayList<ConceptVo> getConceptList(){
   	 return this.conceptList;
    }
}
