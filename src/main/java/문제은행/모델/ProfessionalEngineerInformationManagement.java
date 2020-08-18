package 문제은행.모델;

import 문제은행.AppContext.AppContext;
import 문제은행.Concept.dao.ConceptDao;
import 문제은행.모델.Question_bank.Keyword;

class ProfessionalEngineerInformationManagement extends Subject
{
	ConceptDao conceptDao;
	
	public ProfessionalEngineerInformationManagement(String name, Keyword code)
	{
		super(name, code);
		AppContext context = new AppContext();
		conceptDao = context.conceptDao();
	}
}