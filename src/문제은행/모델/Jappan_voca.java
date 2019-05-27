package 문제은행.모델;

import 문제은행.모델.Question_bank.Keyword;

class Jappan_voca extends Subject
{
    public Jappan_voca(String name, Keyword code)
    {
    	super(name, code);
        this.HT = new Term[8];
    }
}