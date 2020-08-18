package 문제은행.모델;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import 문제은행.AppContext.AppContext;
import 문제은행.Concept.dao.ConceptDao;
import 문제은행.Concept.vo.ConceptVo;
import 문제은행.Term.dao.TermDao;
import 문제은행.Term.vo.TermVo;

public class Question_bank
{
	private Subject[] sj;
	private Random rd;

	public String name;
	public Subject[] getSj() {
		return sj;
	}

	public String[] question;
	public String[] answer;
	public int count;															   //문제 갯수.

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
		AppContext context = new AppContext();
		termDao = context.termDao();
		conceptDao = context.conceptDao();
		
		sj = new Subject[5];
		sj[0] = new English_voca("해커스", Keyword.ENGLISH_VOCA);
		sj[1] = new Engineer_Information_Processing("정보처리기사", Keyword.ENGINEER_INFORMATION_PROCESSING);
		sj[2] = new Power_Electronics("전력전자공학", Keyword.POWER_ELECTRONICS);
		sj[3] = new Jappan_voca("일본어 공부", Keyword.JAPAN_VOCA);
		sj[4] = new ProfessionalEngineerInformationManagement("정보관리기술사", Keyword.PROFESSIONAL_ENGINEER_INFORMATION_MANAGEMENT);
		count = 0;
		rd = new Random();
	}

	public Subject getSubject(Keyword code)
	{
		for(int i=0; i<sj.length; i++)
		{
			if((Keyword)sj[i].code == code)
			{
				return sj[i];
			}
		}

		return null;
	}

	public void set_chapter_exam(Keyword type, Keyword subject, int chapter, Keyword form)
	{
		for (int i=0; i<this.count; i++)
		{
			question[i] = null;
			answer[i] = null;
		}

		this.count = 0;

		switch (type)
		{
			case TERM:
				{
					List<TermVo> list;

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

					question = new String[list.size()];
					answer = new String[list.size()];

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
								question[i] = String.format(list.get(ran[i]).getWord());
								answer[i] = String.format(list.get(ran[i]).getTranslate());
								count++;
							}
							break;
						case TRANSLATETOWORD:
							for (int i = 0; i < list.size(); i++)
							{
								question[i] = String.format(list.get(ran[i]).getTranslate());
								answer[i] = String.format(list.get(ran[i]).getWord());
								count++;
							}
							break;
						case RANDOM:
							for(int i=0; i<list.size(); i++)
							{
								if((int)(Math.random() % 2) == 1)
								{
									question[i] = String.format(list.get(ran[i]).getWord());
									answer[i] = String.format(list.get(ran[i]).getTranslate());
								}
								else
								{
									question[i] = String.format(list.get(ran[i]).getTranslate());
									answer[i] = String.format(list.get(ran[i]).getWord());
								}
								count++;
							}
							break;
						case EXAMPLE_SENTENCE:
							for (int i = 0; i < list.size(); i++)
							{
								question[i] = "\n 예문 : " + String.format(list.get(ran[i]).getExercise()) + "\r\n" + " 단어 : " + String.format(list.get(ran[i]).getWord());
								answer[i] = String.format(list.get(ran[i]).getTranslate());
								count++;
							}
							break;
						case GRAMMAR:
							int k = 0;
							for (int i = 0; i < list.size(); i++)
							{
								if (list.get(ran[i]).getGrammarQuestion() != null)
								{
									question[k] = String.format(list.get(ran[i]).getGrammarQuestion());
									answer[k++] = String.format(list.get(ran[i]).getGrammarAnswer());
									count++;
								}
							}
							break;
					}
				}
				break;
			case CONCEPT:
				{
					List<ConceptVo> list;

					switch (subject)
					{
						case ENGINEER_INFORMATION_PROCESSING:
							list = conceptDao.getAll("ENGINEER_INFORMATION_PROCESSING", chapter);
							break;
						default:
							list = new ArrayList<ConceptVo>();
							break;
					}

					question = new String[list.size()];
					answer = new String[list.size()];

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
								question[i] = String.format(list.get(ran[i]).getWord());
								answer[i] = String.format(list.get(ran[i]).getInterpret());
								count++;
							}
							break;
						case INFERENCE:								 //개념에 대한 용어 유추
							for (int i = 0; i < list.size(); i++)
							{
								question[i] = String.format(list.get(ran[i]).getWord());
								answer[i] = String.format(list.get(ran[i]).getInterpret());
								count++;
							}
							break;
						case RANDOM:
							for (int i = 0; i < list.size(); i++)
							{
								if (rd.nextInt(2) == 1)
								{
									question[i] = String.format(list.get(ran[i]).getWord());
									answer[i] = String.format(list.get(ran[i]).getInterpret());
								}
								else
								{
									question[i] = String.format(list.get(ran[i]).getInterpret());
									answer[i] = String.format(list.get(ran[i]).getWord());
								}
								count++;
							}
							break;
					}
				}
				break;
		}
	}

	public void set_chapter_range_exam(Keyword type, Keyword subject, int start_chapter, int end_chapter, Keyword form)
	{
		for (int i = 0; i < this.count; i++)
		{
			question[i] = null;
			answer[i] = null;
		}
		this.count = 0;

		switch (type)
		{
			case TERM:
				{
					List<TermVo> list = new ArrayList<TermVo>();

					switch (subject)
					{
						case ENGLISH_VOCA:
							for (int i = start_chapter; i < end_chapter; i++) {
								list.addAll(termDao.getAll("ENGLISH_VOCA", i));
							}
							break;
						case POWER_ELECTRONICS:
							for (int i = start_chapter; i < end_chapter; i++) {
								list.addAll(termDao.getAll("POWER_ELECTRONICS", i));
							}
							break;
						case JAPAN_VOCA:
							for (int i = start_chapter; i < end_chapter; i++) {
								list.addAll(termDao.getAll("JAPAN_VOCA", i));
							}
							break;
						default:
							list = new ArrayList<TermVo>();
							break;
					}

					question = new String[list.size()];
					answer = new String[list.size()];

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
								question[i] = String.format(list.get(ran[i]).getWord());
								answer[i] = String.format(list.get(ran[i]).getTranslate());
								count++;
							}
							break;
						case TRANSLATETOWORD:
							for (int i = 0; i < list.size(); i++)
							{
								question[i] = String.format(list.get(ran[i]).getTranslate());
								answer[i] = String.format(list.get(ran[i]).getWord());
								count++;
							}
							break;
						case RANDOM:
							for(int i=0; i<list.size(); i++)
							{
								if(rd.nextInt(2) == 1)
								{
									question[i] = String.format(list.get(ran[i]).getWord());
									answer[i] = String.format(list.get(ran[i]).getTranslate());
								}
								else
								{
									question[i] = String.format(list.get(ran[i]).getTranslate());
									answer[i] = String.format(list.get(ran[i]).getWord());
								}
								count++;
							}
							break;
						case EXAMPLE_SENTENCE:
							int j = 0;
							for (int i = 0; i < list.size(); i++)
							{
								if (list.get(ran[i]).getExercise() != null)
								{
									question[j] = "\n 예문 : " + String.format(list.get(ran[i]).getExercise()) + "\r\n" + " 단어 : " + String.format(list.get(ran[i]).getWord());
									answer[j++] = String.format(list.get(ran[i]).getTranslate());
									count++;
								}
							}
							break;
						case GRAMMAR:
							int k = 0;
							for (int i = 0; i < list.size(); i++)
							{
								if (list.get(ran[i]).getGrammarQuestion() != null)
								{
									question[k] = String.format(list.get(ran[i]).getGrammarQuestion());
									answer[k++] = String.format(list.get(ran[i]).getGrammarAnswer());
									count++;
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
								list.addAll(conceptDao.getAll("ENGINEER_INFORMATION_PROCESSING", i));
							}
							break;
						default:
							for (int i = start_chapter; i < end_chapter; i++) {
								list.addAll(conceptDao.getAll("ENGINEER_INFORMATION_PROCESSING", i));
							}
							break;
					}

					question = new String[list.size()];
					answer = new String[list.size()];

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
								question[i] = String.format(list.get(ran[i]).getWord());
								answer[i] = String.format(list.get(ran[i]).getInterpret());
								count++;
							}
							break;
						case INFERENCE:
							for (int i = 0; i < list.size(); i++)
							{
								question[i] = String.format(list.get(ran[i]).getInterpret());
								answer[i] = String.format(list.get(ran[i]).getWord());
								count++;
							}
							break;
						case RANDOM:
							for (int i = 0; i < list.size(); i++)
							{
								if (rd.nextInt(2) == 1)
								{
									question[i] = String.format(list.get(ran[i]).getWord());
									answer[i] = String.format(list.get(ran[i]).getInterpret());
								}
								else
								{
									question[i] = String.format(list.get(ran[i]).getInterpret());
									answer[i] = String.format(list.get(ran[i]).getWord());
								}
								count++;
							}
							break;
					}
				}
				break;
		}
	}
}
