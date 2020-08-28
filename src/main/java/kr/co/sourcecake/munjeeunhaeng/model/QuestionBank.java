package kr.co.sourcecake.munjeeunhaeng.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import kr.co.sourcecake.munjeeunhaeng.appcontext.AppContext;
import kr.co.sourcecake.munjeeunhaeng.concept.dao.ConceptDao;
import kr.co.sourcecake.munjeeunhaeng.concept.vo.ConceptVo;
import kr.co.sourcecake.munjeeunhaeng.term.dao.TermDao;
import kr.co.sourcecake.munjeeunhaeng.term.vo.TermVo;

public class QuestionBank
{
	private Map<String, Subject> map;
	private Random rd;

	public String name;
	public Map<String, Subject> getMap() {
		return map;
	}

	public List<String> question = new ArrayList<String>();
	public List<String> answer = new ArrayList<String>();

	TermDao termDao;
	ConceptDao conceptDao;

	public QuestionBank(){
	}
	
	public void setTermDao(TermDao termDao) {
		this.termDao = termDao;
	}
	
	public void setConceptDao(ConceptDao conceptDao) {
		this.conceptDao = conceptDao;
	}
	
	public void getData() {
		map = new HashMap<String, Subject>();
		
		//해커스 단어 정보 불러오기
		EnglishVoca englishVoca = new EnglishVoca("해커스", "ENGLISH_VOCA");
		englishVoca.setChapterList(termDao.selectChapterList("ENGLISH_VOCA"));
		Map<String, List<TermVo>> englishVocaMap = new HashMap<String, List<TermVo>>();
		for(String chapter : englishVoca.getChapterList()) {
			englishVocaMap.put(chapter, termDao.getList("ENGLISH_VOCA", chapter));
		}
		englishVoca.setInfoMap(englishVocaMap);
		map.put("ENGLISH_VOCA", englishVoca);

		//정보처리기사 개념 불러오기
		EngineerInformationProcessing engineerInformationProcessing = new EngineerInformationProcessing("정보처리기사", "ENGINEER_INFORMATION_PROCESSING");
		engineerInformationProcessing.setChapterList(conceptDao.selectChapterList("ENGINEER_INFORMATION_PROCESSING"));
		Map<String, List<ConceptVo>> engineerInformationProcessingMap = new HashMap<String, List<ConceptVo>>();
		for(String chapter : engineerInformationProcessing.getChapterList()) {
			engineerInformationProcessingMap.put(chapter, conceptDao.getList("ENGINEER_INFORMATION_PROCESSING", chapter));
		}
		engineerInformationProcessing.setInfoMap(engineerInformationProcessingMap);
		map.put("ENGINEER_INFORMATION_PROCESSING", engineerInformationProcessing);

		//전력전자공학 정보 불러오기
		PowerElectronics powerElectronics = new PowerElectronics("전력전자공학", "POWER_ELECTRONICS");
		powerElectronics.setChapterList(termDao.selectChapterList("POWER_ELECTRONICS"));
		Map<String, List<TermVo>> powerElectronicsMap = new HashMap<String, List<TermVo>>();
		for(String chapter : powerElectronics.getChapterList()) {
			powerElectronicsMap.put(chapter, termDao.getList("POWER_ELECTRONICS", chapter));
		}
		powerElectronics.setInfoMap(powerElectronicsMap);
		map.put("POWER_ELECTRONICS", powerElectronics);

		//일본어 공부 단어 정보 불러오기
		JappanVoca jappanVoca = new JappanVoca("일본어 공부", "JAPAN_VOCA");
		jappanVoca.setChapterList(termDao.selectChapterList("JAPAN_VOCA"));
		Map<String, List<TermVo>> jappanVocaMap = new HashMap<String, List<TermVo>>();
		for(String chapter : jappanVoca.getChapterList()) {
			jappanVocaMap.put(chapter, termDao.getList("JAPAN_VOCA", chapter));
		}
		jappanVoca.setInfoMap(jappanVocaMap);
		map.put("JAPAN_VOCA", jappanVoca);

		//정보관리기술사 개념 정보 불러오기
		ProfessionalEngineerInformationManagement professionalEngineerInformationManagement = new ProfessionalEngineerInformationManagement("정보관리기술사", "PROFESSIONAL_ENGINEER_INFORMATION_MANAGEMENT");
		professionalEngineerInformationManagement.setChapterList(conceptDao.selectChapterList("PROFESSIONAL_ENGINEER_INFORMATION_MANAGEMENT"));
		Map<String, List<ConceptVo>> professionalEngineerInformationManagementMap = new HashMap<String, List<ConceptVo>>();
		for(String chapter : professionalEngineerInformationManagement.getChapterList()) {
			professionalEngineerInformationManagementMap.put(chapter, conceptDao.getList("PROFESSIONAL_ENGINEER_INFORMATION_MANAGEMENT", chapter));
		}
		professionalEngineerInformationManagement.setInfoMap(professionalEngineerInformationManagementMap);
		map.put("PROFESSIONAL_ENGINEER_INFORMATION_MANAGEMENT", professionalEngineerInformationManagement);
		rd = new Random();
	}

	public void setChapterExam(String type, String subject, String chapter, String form)
	{
		switch (type)
		{
			case "TERM":
				{
					switch (subject)
					{
						case "ENGLISH_VOCA":
							break;
						case "POWER_ELECTRONICS":
							break;
						case "JAPAN_VOCA":
							break;
						default:
							break;
					}

					switch (form)
					{
						case "WORDTOTRANSLATE":
							break;
						case "TRANSLATETOWORD":
							break;
						case "RANDOM":
							break;
						case "EXAMPLE_SENTENCE":
							break;
						case "GRAMMAR":
							break;
					}
				}
				break;
			case "CONCEPT":
				{
					switch (subject)
					{
						case "ENGINEER_INFORMATION_PROCESSING":
							break;
						case "PROFESSIONAL_ENGINEER_INFORMATION_MANAGEMENT":
							break;
						default:
							break;
					}
					
					switch (form)
					{
						case "INTERPRET":
							break;
						case "INFERENCE":
							break;
						case "RANDOM":
							break;
					}
				}
				break;
		}
	}

	public void set_chapter_range_exam(String type, String subject, int start_chapter, int end_chapter, String form)
	{
		switch (type)
		{
			case "TERM":
				{
					List<TermVo> list = new ArrayList<TermVo>();

					switch (subject)
					{
						case "ENGLISH_VOCA":
							for (int i = start_chapter; i < end_chapter; i++) {
								list.addAll((List<TermVo>)this.map.get("ENGLISH_VOCA").getInfoMap().get(Integer.toString(i)));
							}
							break;
						case "POWER_ELECTRONICS":
							for (int i = start_chapter; i < end_chapter; i++) {
								list.addAll((List<TermVo>)this.map.get("POWER_ELECTRONICS").getInfoMap().get(Integer.toString(i)));
							}
							break;
						case "JAPAN_VOCA":
							for (int i = start_chapter; i < end_chapter; i++) {
								list.addAll((List<TermVo>)this.map.get("JAPAN_VOCA").getInfoMap().get(Integer.toString(i)));
							}
							break;
						default:
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
						case "WORDTOTRANSLATE":
							for (int i = 0; i < list.size(); i++)
							{
								question.add(String.format(list.get(ran[i]).getWord()));
								answer.add(String.format(list.get(ran[i]).getTranslate()));
							}
							break;
						case "TRANSLATETOWORD":
							for (int i = 0; i < list.size(); i++)
							{
								question.add(String.format(list.get(ran[i]).getTranslate()));
								answer.add(String.format(list.get(ran[i]).getWord()));
							}
							break;
						case "RANDOM":
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
						case "EXAMPLE_SENTENCE":
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
						case "GRAMMAR":
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
			case "CONCEPT":
				{
					List<ConceptVo> list = new ArrayList<ConceptVo>();

					switch (subject)
					{
						case "ENGINEER_INFORMATION_PROCESSING":
							for (int i = start_chapter; i < end_chapter; i++) {
								list.addAll((List<ConceptVo>)this.map.get("ENGINEER_INFORMATION_PROCESSING").getInfoMap().get(Integer.toString(i)));
							}
							break;
						case "PROFESSIONAL_ENGINEER_INFORMATION_MANAGEMENT":
							for (int i = start_chapter; i < end_chapter; i++) {
								list.addAll((List<ConceptVo>)this.map.get("PROFESSIONAL_ENGINEER_INFORMATION_MANAGEMENT").getInfoMap().get(Integer.toString(i)));
							}
							break;
						default:
							for (int i = start_chapter; i < end_chapter; i++) {
								list.addAll((List<ConceptVo>)this.map.get("ENGINEER_INFORMATION_PROCESSING").getInfoMap().get(Integer.toString(i)));
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
						case "INTERPRET":
							for (int i = 0; i < list.size(); i++)
							{
								question.add(String.format(list.get(ran[i]).getWord()));
								answer.add(String.format(list.get(ran[i]).getInterpret()));
							}
							break;
						case "INFERENCE":
							for (int i = 0; i < list.size(); i++)
							{
								question.add(String.format(list.get(ran[i]).getInterpret()));
								answer.add(String.format(list.get(ran[i]).getWord()));
							}
							break;
						case "RANDOM":
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
