package 문제은행.모델;

import java.util.List;

import 문제은행.AppContext.AppContext;
import 문제은행.Concept.dao.ConceptDao;
import 문제은행.모델.Question_bank.Keyword;

class ProfessionalEngineerInformationManagement extends Subject
{
	ConceptDao conceptDao;
	
	public ProfessionalEngineerInformationManagement(String name, Keyword code, List<String> chapterList)
	{
		super(name, code, chapterList);
	}
}