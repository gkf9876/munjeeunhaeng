package 문제은행.모델;

import java.util.ArrayList;

public class Concept
{
	public String name;
    public ArrayList<String> word;
    public ArrayList<String> interpret;
    public int count;

    public Concept(String name)
    {
        this.name = name;
        this.word = new ArrayList<>();
        this.interpret = new ArrayList<>();
        this.count = 0;
    }

    public void add_concept(String word, String interpret)
    {
    	this.word.add(word);
    	this.interpret.add(interpret);
    	count++;
    }

    public void add_concept(Concept cc)
    {
        for (int i = 0; i < cc.count; i++)
        {
            if (count < 10)
            {
                this.word.add(cc.word.get(i));
                this.interpret.add(cc.interpret.get(i));
                count++;
            }
        }
    }
}
