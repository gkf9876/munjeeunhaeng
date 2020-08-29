package kr.co.sourcecake.munjeeunhaeng.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import kr.co.sourcecake.munjeeunhaeng.concept.dao.ConceptDao;
import kr.co.sourcecake.munjeeunhaeng.concept.vo.ConceptVo;
import kr.co.sourcecake.munjeeunhaeng.term.dao.TermDao;
import kr.co.sourcecake.munjeeunhaeng.term.vo.TermVo;

public class QuestionBank
{
	private Map<String, Subject<?>> map;

	public String name;
	public Map<String, Subject<?>> getMap() {
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
		map = new HashMap<String, Subject<?>>();
		
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
	}

	public void setChapterExam(String type, String subject, String chapter, String form)
	{
		if(type.equals("TERM")) {
			List<TermVo> list = (List<TermVo>)this.map.get(subject).getInfoMap().get(chapter);
			Collections.shuffle(list);
			
			for (int i = 0; i < list.size(); i++) {
				if(form.equals("WORDTOTRANSLATE")){
					question.add(list.get(i).getWord());
					answer.add(list.get(i).getTranslate());
				}else if(form.equals("TRANSLATETOWORD")) {
					question.add(list.get(i).getTranslate());
					answer.add(list.get(i).getWord());
				}else if(form.equals("RANDOM")) {
					if(((int)(Math.random() * 10) % 2) == 1)
					{
						question.add(list.get(i).getWord());
						answer.add(list.get(i).getTranslate());
					}
					else
					{
						question.add(list.get(i).getTranslate());
						answer.add(list.get(i).getWord());
					}
				}else if(form.equals("EXAMPLE_SENTENCE")) {
					question.add("\n 예문 : " + list.get(i).getExercise() + "\r\n" + " 단어 : " + list.get(i).getWord());
					answer.add(list.get(i).getTranslate());
				}else if(form.equals("GRAMMAR")) {
					if (list.get(i).getGrammarQuestion() != null)
					{
						question.add(list.get(i).getGrammarQuestion());
						answer.add(list.get(i).getGrammarAnswer());
					}
				}
			}
		}else if(type.equals("CONCEPT")) {
			List<ConceptVo> list = (List<ConceptVo>)this.map.get(subject).getInfoMap().get(chapter);
			Collections.shuffle(list);

			for (int i = 0; i < list.size(); i++) {
				if(form.equals("INTERPRET")){
					question.add(list.get(i).getQuestion());
					answer.add(list.get(i).getAnswer());
				}else if(form.equals("INFERENCE")) {
					question.add(list.get(i).getQuestion());
					answer.add(list.get(i).getAnswer());
				}else if(form.equals("RANDOM")) {
					if(((int)(Math.random() * 10) % 2) == 1)
					{
						question.add(list.get(i).getQuestion());
						answer.add(list.get(i).getAnswer());
					}
					else
					{
						question.add(list.get(i).getAnswer());
						answer.add(list.get(i).getQuestion());
					}
				}
			}
		}
	}

	public void setAllChapterExam(String type, String subject, String form)
	{
		if(type.equals("TERM")){
			List<TermVo> list = new ArrayList<TermVo>();
			
			for(String chapter : this.map.get(subject).getChapterList()) {
				list.addAll((List<TermVo>)this.map.get(subject).getInfoMap().get(chapter));
			}
			Collections.shuffle(list);
			
			for (int i = 0; i < list.size(); i++) {
				if(form.equals("WORDTOTRANSLATE")) {
					question.add(list.get(i).getWord());
					answer.add(list.get(i).getTranslate());
				}else if(form.equals("TRANSLATETOWORD")) {
					question.add(list.get(i).getTranslate());
					answer.add(list.get(i).getWord());
				}else if(form.equals("RANDOM")) {
					if(((int)(Math.random() * 10) % 2) == 1)
					{
						question.add(list.get(i).getWord());
						answer.add(list.get(i).getTranslate());
					}
					else
					{
						question.add(list.get(i).getTranslate());
						answer.add(list.get(i).getWord());
					}
				}else if(form.equals("EXAMPLE_SENTENCE")) {
					if (list.get(i).getExercise() != null)
					{
						question.add("\n 예문 : " + list.get(i).getExercise() + "\r\n" + " 단어 : " + list.get(i).getWord());
						answer.add(list.get(i).getTranslate());
					}
				}else if(form.equals("GRAMMAR")) {
					if (list.get(i).getGrammarQuestion() != null)
					{
						question.add(list.get(i).getGrammarQuestion());
						answer.add(list.get(i).getGrammarAnswer());
					}
				}
			}
		}else if(type.equals("CONCEPT")) {
			List<ConceptVo> list = new ArrayList<ConceptVo>();

			for(String chapter : this.map.get(subject).getChapterList()) {
				list.addAll((List<ConceptVo>)this.map.get(subject).getInfoMap().get(chapter));
			}
			Collections.shuffle(list);
			
			for (int i = 0; i < list.size(); i++) {
				if(form.equals("INTERPRET")) {
					question.add(list.get(i).getWord());
					answer.add(list.get(i).getInterpret());
				}else if(form.equals("INFERENCE")) {
					question.add(list.get(i).getInterpret());
					answer.add(list.get(i).getWord());
				}else if(form.equals("RANDOM")) {
					if(((int)(Math.random() * 10) % 2) == 1)
					{
						question.add(list.get(i).getWord());
						answer.add(list.get(i).getInterpret());
					}
					else
					{
						question.add(list.get(i).getInterpret());
						answer.add(list.get(i).getWord());
					}
				}
			}
		}
	}
}
