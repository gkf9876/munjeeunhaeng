package ��������.��;

import ��������.��.Question_bank.Keyword;

public class Subject
{
	public String name;
    public Keyword code;

    public Term[] HT;
    public Concept[] CT;

    public Subject(String name, Keyword code2)
    {
        this.name = name;
        this.code = code2;
    }
}
