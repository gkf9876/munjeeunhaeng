package 문제은행.모델;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import 문제은행.AppContext.AppContext;
import 문제은행.Concept.dao.ConceptDao;
import 문제은행.Concept.vo.ConceptVo;
import 문제은행.Term.dao.TermDao;
import 문제은행.Term.vo.TermVo;

public class Question_bank
{
	private Map<String, Subject> sj;
	private Random rd;

	public String name;
	public Map<String, Subject> getSj() {
		return sj;
	}

	public List<String> question = new ArrayList<String>();
	public List<String> answer = new ArrayList<String>();

	TermDao termDao;
	ConceptDao conceptDao;
	
	public enum Keyword
	{
		WORDTOTRANSLATE, TRANSLATETOWORD, RANDOM, GRAMMAR, EXAMPLE_SENTENCE,		//용어 유형 키워드
		INTERPRET, INFERENCE,													   //개념 유형 키워드
		TERM, CONCEPT,
		ENGLISH_VOCA, POWER_ELECTRONICS, JAPAN_VOCA,															  //용어 과목 키워드
		ENGINEER_INFORMATION_PROCESSING,											 //개념 과목 키워드
		PROFESSIONAL_ENGINEER_INFORMATION_MANAGEMENT
	}

	public Question_bank()
	{
	}
	
	public void setTermDao(TermDao termDao) {
		this.termDao = termDao;
	}
	
	public void setConceptDao(ConceptDao conceptDao) {
		this.conceptDao = conceptDao;
	}
	
	public void getData() {
		sj = new HashMap<String, Subject>();
		sj.put("ENGLISH_VOCA", new English_voca("해커스", Keyword.ENGLISH_VOCA, termDao.selectChapterList("ENGLISH_VOCA")));
		sj.put("ENGINEER_INFORMATION_PROCESSING", new Engineer_Information_Processing("정보처리기사", Keyword.ENGINEER_INFORMATION_PROCESSING, termDao.selectChapterList("ENGINEER_INFORMATION_PROCESSING")));
		sj.put("POWER_ELECTRONICS", new Power_Electronics("전력전자공학", Keyword.POWER_ELECTRONICS, termDao.selectChapterList("POWER_ELECTRONICS")));
		sj.put("JAPAN_VOCA", new Jappan_voca("일본어 공부", Keyword.JAPAN_VOCA, termDao.selectChapterList("JAPAN_VOCA")));
		sj.put("PROFESSIONAL_ENGINEER_INFORMATION_MANAGEMENT", new ProfessionalEngineerInformationManagement("정보관리기술사", Keyword.PROFESSIONAL_ENGINEER_INFORMATION_MANAGEMENT, conceptDao.selectChapterList("PROFESSIONAL_ENGINEER_INFORMATION_MANAGEMENT")));
		rd = new Random();
	}

	public void set_chapter_exam(Keyword type, Keyword subject, String chapter, Keyword form)
	{
		switch (type)
		{
			case TERM:
				{
					List<TermVo> list = new ArrayList<TermVo>();

					switch (subject)
					{
						case ENGLISH_VOCA:
							list = termDao.getAll("ENGLISH_VOCA", chapter);
							break;
						case POWER_ELECTRONICS:
							list = termDao.getAll("POWER_ELECTRONICS", chapter);
							break;
						case JAPAN_VOCA:
							list = termDao.getAll("JAPAN_VOCA", chapter);
							break;
						default:
							list = new ArrayList<TermVo>();
							break;
					}

					int[] ran = new int[list.size()];

					for (int i = 0; i < list.size(); i++)
					{
						int cnt = 0;
						ran[i] = rd.nextInt(list.size());

						for (int j = 0; j < i; j++)
							if (ran[j] == ran[i])
								cnt++;

						if (cnt != 0)
							i--;
					}

					switch (form)
					{
						case WORDTOTRANSLATE:
							for (int i = 0; i < list.size(); i++)
							{
								question.add(String.format(list.get(ran[i]).getWord()));
								answer.add(String.format(list.get(ran[i]).getTranslate()));
							}
							break;
						case TRANSLATETOWORD:
							for (int i = 0; i < list.size(); i++)
							{
								question.add(String.format(list.get(ran[i]).getTranslate()));
								answer.add(String.format(list.get(ran[i]).getWord()));
							}
							break;
						case RANDOM:
							for(int i=0; i<list.size(); i++)
							{
								if((int)(Math.random() % 2) == 1)
								{
									question.add(String.format(list.get(ran[i]).getWord()));
									answer.add(String.format(list.get(ran[i]).getTranslate()));
								}
								else
								{
									question.add(String.format(list.get(ran[i]).getTranslate()));
									answer.add(String.format(list.get(ran[i]).getWord()));
								}
							}
							break;
						case EXAMPLE_SENTENCE:
							for (int i = 0; i < list.size(); i++)
							{
								question.add("\n 예문 : " + String.format(list.get(ran[i]).getExercise()) + "\r\n" + " 단어 : " + String.format(list.get(ran[i]).getWord()));
								answer.add(String.format(list.get(ran[i]).getTranslate()));
							}
							break;
						case GRAMMAR:
							for (int i = 0; i < list.size(); i++)
							{
								if (list.get(ran[i]).getGrammarQuestion() != null)
								{
									question.add(String.format(list.get(ran[i]).getGrammarQuestion()));
									answer.add(String.format(list.get(ran[i]).getGrammarAnswer()));
								}
							}
							break;
					}
				}
				break;
			case CONCEPT:
				{
					List<ConceptVo> list = new ArrayList<ConceptVo>();

					switch (subject)
					{
						case ENGINEER_INFORMATION_PROCESSING:
							list = conceptDao.getAll("ENGINEER_INFORMATION_PROCESSING", chapter);
							break;
						case PROFESSIONAL_ENGINEER_INFORMATION_MANAGEMENT:
							list = conceptDao.getAll("PROFESSIONAL_ENGINEER_INFORMATION_MANAGEMENT", chapter);
							break;
						default:
							list = new ArrayList<ConceptVo>();
							break;
					}

					int[] ran = new int[list.size()];

					for (int i = 0; i < list.size(); i++)
					{
						int cnt = 0;
						ran[i] = rd.nextInt(list.size());

						for (int j = 0; j < i; j++)
							if (ran[j] == ran[i])
								cnt++;

						if (cnt != 0)
							i--;
					}

					switch (form)
					{
						case INTERPRET:								 //용어를 해석
							for (int i = 0; i < list.size(); i++)
							{
								question.add(String.format(list.get(ran[i]).getWord()));
								answer.add(String.format(list.get(ran[i]).getInterpret()));
							}
							break;
						case INFERENCE:								 //개념에 대한 용어 유추
							for (int i = 0; i < list.size(); i++)
							{
								question.add(String.format(list.get(ran[i]).getWord()));
								answer.add(String.format(list.get(ran[i]).getInterpret()));
							}
							break;
						case RANDOM:
							for (int i = 0; i < list.size(); i++)
							{
								if (rd.nextInt(2) == 1)
								{
									question.add(String.format(list.get(ran[i]).getWord()));
									answer.add(String.format(list.get(ran[i]).getInterpret()));
								}
								else
								{
									question.add(String.format(list.get(ran[i]).getInterpret()));
									answer.add(String.format(list.get(ran[i]).getWord()));
								}
							}
							break;
					}
				}
				break;
		}
	}

	public void set_chapter_range_exam(Keyword type, Keyword subject, int start_chapter, int end_chapter, Keyword form)
	{
		switch (type)
		{
			case TERM:
				{
					List<TermVo> list = new ArrayList<TermVo>();

					switch (subject)
					{
						case ENGLISH_VOCA:
							for (int i = start_chapter; i < end_chapter; i++) {
								list.addAll(termDao.getAll("ENGLISH_VOCA", Integer.toString(i)));
							}
							break;
						case POWER_ELECTRONICS:
							for (int i = start_chapter; i < end_chapter; i++) {
								list.addAll(termDao.getAll("POWER_ELECTRONICS", Integer.toString(i)));
							}
							break;
						case JAPAN_VOCA:
							for (int i = start_chapter; i < end_chapter; i++) {
								list.addAll(termDao.getAll("JAPAN_VOCA", Integer.toString(i)));
							}
							break;
						default:
							list = new ArrayList<TermVo>();
							break;
					}

					int[] ran = new int[list.size()];

					for (int i = 0; i < list.size(); i++)
					{
						int cnt = 0;
						ran[i] = rd.nextInt(list.size());

						for (int j = 0; j < i; j++)
							if (ran[j] == ran[i])
								cnt++;

						if (cnt != 0)
							i--;
					}

					switch (form)
					{
						case WORDTOTRANSLATE:
							for (int i = 0; i < list.size(); i++)
							{
								question.add(String.format(list.get(ran[i]).getWord()));
								answer.add(String.format(list.get(ran[i]).getTranslate()));
							}
							break;
						case TRANSLATETOWORD:
							for (int i = 0; i < list.size(); i++)
							{
								question.add(String.format(list.get(ran[i]).getTranslate()));
								answer.add(String.format(list.get(ran[i]).getWord()));
							}
							break;
						case RANDOM:
							for(int i=0; i<list.size(); i++)
							{
								if(rd.nextInt(2) == 1)
								{
									question.add(String.format(list.get(ran[i]).getWord()));
									answer.add(String.format(list.get(ran[i]).getTranslate()));
								}
								else
								{
									question.add(String.format(list.get(ran[i]).getTranslate()));
									answer.add(String.format(list.get(ran[i]).getWord()));
								}
							}
							break;
						case EXAMPLE_SENTENCE:
							int j = 0;
							for (int i = 0; i < list.size(); i++)
							{
								if (list.get(ran[i]).getExercise() != null)
								{
									question.add("\n 예문 : " + String.format(list.get(ran[i]).getExercise()) + "\r\n" + " 단어 : " + String.format(list.get(ran[i]).getWord()));
									answer.add(String.format(list.get(ran[i]).getTranslate()));
								}
							}
							break;
						case GRAMMAR:
							int k = 0;
							for (int i = 0; i < list.size(); i++)
							{
								if (list.get(ran[i]).getGrammarQuestion() != null)
								{
									question.add(String.format(list.get(ran[i]).getGrammarQuestion()));
									answer.add(String.format(list.get(ran[i]).getGrammarAnswer()));
								}
							}
							break;
					}
				}
				break;
			case CONCEPT:
				{
					List<ConceptVo> list = new ArrayList<ConceptVo>();

					switch (subject)
					{
						case ENGINEER_INFORMATION_PROCESSING:
							for (int i = start_chapter; i < end_chapter; i++) {
								list.addAll(conceptDao.getAll("ENGINEER_INFORMATION_PROCESSING", Integer.toString(i)));
							}
							break;
						case PROFESSIONAL_ENGINEER_INFORMATION_MANAGEMENT:
							for (int i = start_chapter; i < end_chapter; i++) {
								list.addAll(conceptDao.getAll("PROFESSIONAL_ENGINEER_INFORMATION_MANAGEMENT", Integer.toString(i)));
							}
							break;
						default:
							for (int i = start_chapter; i < end_chapter; i++) {
								list.addAll(conceptDao.getAll("ENGINEER_INFORMATION_PROCESSING", Integer.toString(i)));
							}
							break;
					}

					int[] ran = new int[list.size()];

					for (int i = 0; i < list.size(); i++)
					{
						int cnt = 0;
						ran[i] = rd.nextInt(list.size());

						for (int j = 0; j < i; j++)
							if (ran[j] == ran[i])
								cnt++;

						if (cnt != 0)
							i--;
					}

					switch (form)
					{
						case INTERPRET:
							for (int i = 0; i < list.size(); i++)
							{
								question.add(String.format(list.get(ran[i]).getWord()));
								answer.add(String.format(list.get(ran[i]).getInterpret()));
							}
							break;
						case INFERENCE:
							for (int i = 0; i < list.size(); i++)
							{
								question.add(String.format(list.get(ran[i]).getInterpret()));
								answer.add(String.format(list.get(ran[i]).getWord()));
							}
							break;
						case RANDOM:
							for (int i = 0; i < list.size(); i++)
							{
								if (rd.nextInt(2) == 1)
								{
									question.add(String.format(list.get(ran[i]).getWord()));
									answer.add(String.format(list.get(ran[i]).getInterpret()));
								}
								else
								{
									question.add(String.format(list.get(ran[i]).getInterpret()));
									answer.add(String.format(list.get(ran[i]).getWord()));
								}
							}
							break;
					}
				}
				break;
		}
	}
}
