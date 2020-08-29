package kr.co.sourcecake.munjeeunhaeng.model;

import java.awt.Image;
import java.util.List;

import kr.co.sourcecake.munjeeunhaeng.concept.vo.ConceptVo;

class ProfessionalEngineerInformationManagement extends Subject<ConceptVo>
{
	private List<Image> questionImages;
	private List<Image> answerImages;
	
	public ProfessionalEngineerInformationManagement(String name, String subject)
	{
		super(name, subject);
	}

	public List<Image> getQuestionImages() {
		return questionImages;
	}

	public void setQuestionImages(List<Image> questionImages) {
		this.questionImages = questionImages;
	}

	public List<Image> getAnswerImages() {
		return answerImages;
	}

	public void setAnswerImages(List<Image> answerImages) {
		this.answerImages = answerImages;
	}
}