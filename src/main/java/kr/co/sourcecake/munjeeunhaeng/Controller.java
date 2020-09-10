package kr.co.sourcecake.munjeeunhaeng;

import kr.co.sourcecake.munjeeunhaeng.model.QuestionBank;
import kr.co.sourcecake.munjeeunhaeng.model.Subject;

class Controller
{
	public QuestionBank pb;
	public String[] input;
	public int[] right_answer;
	public int[] wrong_answer;
	public int right_cnt;
	private int wrong_cnt;
	
	public int count;

	public Controller()
	{
		count = 0;																//현재 문제를 몇번까지 풀었나
	}
	
	public void setQuestionBank(QuestionBank questionBank) {
		this.pb = questionBank;
	}

	public boolean stringCompare(String long_str, String short_str)
	{
		if(long_str != null && short_str != null) {
			String longStr = long_str.trim();
			String shortStr = short_str.trim();
			
			if(longStr != "" && shortStr != "") {
				if(longStr.equals(shortStr) || shortStr.contains(longStr))
					return true;
				else
					return false;
			}else
				return false;
		}else
			return false;
	}

	public String answerInput(String type, String str)
	{
		String imsi = "입력 오류";
		int size = 0;
		
		if(type.equals("TERM"))
			size = pb.termQuestion.size();
		else if(type.equals("CONCEPT"))
			size = pb.conceptQuestion.size();

		if (count < size)
		{
			//답 입력부분
			input[count++] = str;
			imsi = "입력 : " + str + "\r\n";
			imsi += "\r\n";
			
			//개념의 경우 답 입력하자마자 문제와 답을 보여준다.
			if (type == "CONCEPT"){
				imsi += "\r\n";
			}

			return imsi;
		}

		return imsi;
	}					   //사용자로부터 답을 입력받는 함수

	public String setQuestion(String type){
		String imsi = "문제 내기 오류";
		//출제 부분
		if(type.equals("TERM")) {
			if (count < pb.termQuestion.size()){
				if (pb.termQuestion.get(count).getWord() != "")
					imsi = String.format("(%d/%d) %s : \r\n", count + 1, pb.termQuestion.size(), pb.termQuestion.get(count).getWord());
			}
		}else if(type.equals("CONCEPT")) {
			if (count < pb.conceptQuestion.size()){
				if (pb.conceptQuestion.get(count).getQuestion().length > 0)
					imsi = String.format("(%d/%d) %s : \r\n", count + 1, pb.conceptQuestion.size(), pb.conceptQuestion.get(count).getQuestion());
			}
		}

		return imsi;
	}								   //문제 내기

	public String termSolveStart(String subject, String chapter, String form)
	{
		String imsi = "문제 출제 오류";
		count = 0;
		
		pb.termQuestion.clear();
		
		if(chapter.equals("all")) {
			pb.setAllChapterExam("TERM", subject, form);
		}else {
			pb.setChapterExam("TERM", subject, chapter, form);
		}
		
		input = new String[pb.termQuestion.size()];
		right_answer = new int[pb.termQuestion.size()];
		wrong_answer = new int[pb.termQuestion.size()];
		right_cnt = 0;
		wrong_cnt = 0;

		if (pb.termQuestion.size() > 0 && pb.termQuestion.get(0).getWord() != "")
			imsi = String.format("(%d/%d) %s : \r\n", 1, pb.termQuestion.size(), pb.termQuestion.get(0).getWord());
		return imsi;
	}   //문제 출제

	public String conceptSolveStart(String subject, String chapter, String form)
	{
		String imsi = "문제 출제 오류";
		count = 0;
		
		pb.conceptQuestion.clear();
		
		if(chapter.equals("all"))
			pb.setAllChapterExam("CONCEPT", subject, form);
		else
			pb.setChapterExam("CONCEPT", subject, chapter, form);

		input = new String[pb.conceptQuestion.size()];

		if (pb.conceptQuestion.size() > 0 && pb.conceptQuestion.get(0).getQuestion().length > 0)
			imsi = String.format("(%d/%d) %s : \r\n", 1, pb.conceptQuestion.size(), pb.conceptQuestion.get(0).getQuestion());

		return imsi;
	}

	public String marking(String type)
	{
		String imsi = "채점 오류";

		switch (type)
		{
			case "TERM":
				for (int i = 0; i < input.length; i++){
					if (stringCompare(pb.termQuestion.get(i).getWord(), input[i]))
						right_answer[right_cnt++] = i;
					else
						wrong_answer[wrong_cnt++] = i;
				}

				imsi = String.format("맞은갯수 : %d\r\n\r\n", right_cnt);
				
				for (int i = 0; i < right_cnt; i++){
					imsi += String.format("%s %s \n입력한 답 : %s\r\n\r\n", pb.termQuestion.get(right_answer[i]).getWord(), pb.termQuestion.get(right_answer[i]).getTranslate(), input[right_answer[i]]);
				}

				imsi += "\r\n\r\n";
				imsi += String.format("틀린갯수 : %d\r\n\r\n", wrong_cnt);
				for (int i = 0; i < wrong_cnt; i++){
					imsi += String.format("%s %s \n입력한 답 : %s\r\n\r\n", pb.termQuestion.get(wrong_answer[i]).getWord(), pb.termQuestion.get(wrong_answer[i]).getTranslate(), input[wrong_answer[i]]);
				}

				break;
			case "CONCEPT":
				break;
		}

		count = 0;

		return imsi;
	}						   //채점
}