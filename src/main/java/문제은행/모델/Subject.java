package 문제은행.모델;

import java.util.List;

import 문제은행.모델.Question_bank.Keyword;

public class Subject
{
	public String name;
	public Keyword code;
	public List<String> chapterList;

	public Subject(String name, Keyword code, List<String> chapterList)
	{
		this.name = name;
		this.code = code;
		this.chapterList = chapterList;
	}
}
