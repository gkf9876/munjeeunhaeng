package 문제은행.모델;

import 문제은행.모델.Question_bank.Keyword;

public class Subject
{
	public String name;
    public Keyword code;

    public Subject(String name, Keyword code2)
    {
        this.name = name;
        this.code = code2;
    }
}
