package 문제은행.모델;

import java.util.ArrayList;

import 문제은행.Concept.vo.ConceptVo;

public class Concept
{
	public String name;
    public ArrayList<ConceptVo> conceptList;
    public int count;

    public Concept(String name)
    {
        this.name = name;
        this.conceptList = new ArrayList<>();
        this.count = 0;
    }

    public void add_concept(String word, String interpret)
    {
    	ConceptVo conceptVo = new ConceptVo();
    	conceptVo.setWord(word);
    	conceptVo.setInterpret(interpret);
    	conceptList.add(conceptVo);
    	count++;
    }

    public void add_concept(Concept cc)
    {
        for (int i = 0; i < cc.count; i++)
        {
            if (count < 10)
            {
            	ConceptVo conceptVo = new ConceptVo();
            	conceptVo.setWord(cc.conceptList.get(i).getWord());
            	conceptVo.setInterpret(cc.conceptList.get(i).getInterpret());
            	conceptList.add(conceptVo);
                count++;
            }
        }
    }
}
