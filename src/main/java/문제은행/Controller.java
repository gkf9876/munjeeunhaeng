package 문제은행;

import 문제은행.모델.Question_bank;

class Controller
{
	public Question_bank pb;
	public String[] input;
	public int[] right_answer;
	public int[] wrong_answer;
	public int right_cnt;
	private int wrong_cnt;
	
	public int count;

	public Controller()
	{
		pb = new Question_bank();
		count = 0;																//현재 문제를 몇번까지 풀었나
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

	public String Answer_input(String type, String str)
	{
		String imsi = "입력 오류";

		if (count < pb.question.size())
		{
			//답 입력부분
			input[count++] = str;
			imsi = "입력 : " + str + "\r\n";
			imsi += "\r\n";


			//개념의 경우 답 입력하자마자 문제와 답을 보여준다.
			if (type == "CONCEPT")
			{
				imsi += String.format("답 : %s\r\n", pb.answer.get(count - 1));
				imsi += "\r\n";
			}

			return imsi;
		}

		return imsi;
	}					   //사용자로부터 답을 입력받는 함수

	public String set_question(String type)
	{
		String imsi = "문제 내기 오류";
		//출제 부분
		if (count < pb.question.size())
		{
			switch (type)
			{
				case "TERM":
					if (pb.question.get(count) != "")
						imsi = String.format("(%d/%d) %s : \r\n", count + 1, pb.question.size(), pb.question.get(count));
					break;
				case "CONCEPT":
					if (pb.question.get(count) != "")
						imsi = String.format("(%d/%d) %s : \r\n", count + 1, pb.question.get(count), pb.question.get(count));
					break;
				default:
					break;
			}
		}

		return imsi;
	}								   //문제 내기

	public String solve_start(String type, String subject, String chapter, String form)
	{
		String imsi = "문제 출제 오류";
		문제은행.모델.Subject SJ;
		count = 0;
		
		pb.question.clear();
		pb.answer.clear();
		
		switch (subject)
		{
			case "ENGLISH_VOCA":
				SJ = pb.getSj().get("ENGLISH_VOCA");
				break;
			case "ENGINEER_INFORMATION_PROCESSING":
				SJ = pb.getSj().get("ENGINEER_INFORMATION_PROCESSING");
				break;
			case "POWER_ELECTRONICS":
				SJ = pb.getSj().get("POWER_ELECTRONICS");
				break;
			case "JAPAN_VOCA":
				SJ = pb.getSj().get("JAPAN_VOCA");
				break;
			default:
				SJ = null;
				break;
		}

		switch (type)
		{
			case "TERM":

				switch (chapter)
				{
					case "all":
						switch (form)
						{
							case "WORDTOTRANSLATE":
								pb.set_chapter_range_exam(Question_bank.Keyword.TERM, (Question_bank.Keyword)SJ.code, 1, 10, Question_bank.Keyword.WORDTOTRANSLATE);
								break;
							case "TRANSLATETOWORD":
								pb.set_chapter_range_exam(Question_bank.Keyword.TERM, (Question_bank.Keyword)SJ.code, 1, 10, Question_bank.Keyword.TRANSLATETOWORD);
								break;
							case "RANDOM":
								pb.set_chapter_range_exam(Question_bank.Keyword.TERM, (Question_bank.Keyword)SJ.code, 1, 10, Question_bank.Keyword.RANDOM);
								break;
							case "EXAMPLE_SENTENCE":
								pb.set_chapter_range_exam(Question_bank.Keyword.TERM, (Question_bank.Keyword)SJ.code, 1, 10, Question_bank.Keyword.EXAMPLE_SENTENCE);
								break;
							case "GRAMMAR":
								pb.set_chapter_range_exam(Question_bank.Keyword.TERM, (Question_bank.Keyword)SJ.code, 1, 10, Question_bank.Keyword.GRAMMAR);
								break;
							default:
								break;
						}

						input = new String[pb.question.size()];
						right_answer = new int[pb.question.size()];
						wrong_answer = new int[pb.question.size()];
						right_cnt = 0;
						wrong_cnt = 0;

						if (pb.question.size() > 0 && pb.question.get(0) != "")
							imsi = String.format("(%d/%d) %s : \r\n", 1, pb.question.size(), pb.question.get(0));
						break;
					default:
						switch (form)
						{
							case "WORDTOTRANSLATE":
								pb.set_chapter_exam(Question_bank.Keyword.TERM, (Question_bank.Keyword)SJ.code, chapter, Question_bank.Keyword.WORDTOTRANSLATE);
								break;
							case "TRANSLATETOWORD":
								pb.set_chapter_exam(Question_bank.Keyword.TERM, (Question_bank.Keyword)SJ.code, chapter, Question_bank.Keyword.TRANSLATETOWORD);
								break;
							case "RANDOM":
								pb.set_chapter_exam(Question_bank.Keyword.TERM, (Question_bank.Keyword)SJ.code, chapter, Question_bank.Keyword.RANDOM);
								break;
							case "EXAMPLE_SENTENCE":
								pb.set_chapter_exam(Question_bank.Keyword.TERM, (Question_bank.Keyword)SJ.code, chapter, Question_bank.Keyword.EXAMPLE_SENTENCE);
								break;
							case "GRAMMAR":
								pb.set_chapter_exam(Question_bank.Keyword.TERM, (Question_bank.Keyword)SJ.code, chapter, Question_bank.Keyword.GRAMMAR);
								break;
							default:
								break;
						}

						input = new String[pb.question.size()];
						right_answer = new int[pb.question.size()];
						wrong_answer = new int[pb.question.size()];
						right_cnt = 0;
						wrong_cnt = 0;

						if (pb.question.size() > 0 && pb.question.get(0) != "")
							imsi = String.format("(%d/%d) %s : \r\n", 1, pb.question.size(), pb.question.get(0));
						break;
				}
				break;
			case "CONCEPT":
				switch (chapter)
				{
					case "all":
						switch (form)
						{
							case "INTERPRET":
								pb.set_chapter_range_exam(Question_bank.Keyword.CONCEPT, SJ.code, 1, 10, Question_bank.Keyword.INTERPRET);
								break;
							case "INFERENCE":
								pb.set_chapter_range_exam(Question_bank.Keyword.CONCEPT, SJ.code, 1, 10, Question_bank.Keyword.INFERENCE);
								break;
							case "RANDOM":
								pb.set_chapter_range_exam(Question_bank.Keyword.CONCEPT, SJ.code, 1, 10, Question_bank.Keyword.RANDOM);
								break;
							default:
								pb.set_chapter_range_exam(Question_bank.Keyword.CONCEPT, SJ.code, 1, 10, Question_bank.Keyword.INTERPRET);
								break;
						}

						input = new String[pb.question.size()];

						if (pb.question.size() > 0 && pb.question.get(0) != "")
							imsi = String.format("(%d/%d) %s : \r\n", 1, pb.question.size(), pb.question.get(0));
						break;
					default:
						switch (form)
						{
							case "INTERPRET":
								pb.set_chapter_exam(Question_bank.Keyword.CONCEPT, SJ.code, chapter, Question_bank.Keyword.INTERPRET);
								break;
							case "INFERENCE":
								pb.set_chapter_exam(Question_bank.Keyword.CONCEPT, SJ.code, chapter, Question_bank.Keyword.INFERENCE);
								break;
							case "RANDOM":
								pb.set_chapter_exam(Question_bank.Keyword.CONCEPT, SJ.code, chapter, Question_bank.Keyword.RANDOM);
								break;
							default:
								pb.set_chapter_exam(Question_bank.Keyword.CONCEPT, SJ.code, chapter, Question_bank.Keyword.INTERPRET);
								break;
						}

						input = new String[pb.question.size()];

						if (pb.question.size() > 0 && pb.question.get(0) != "")
							imsi = String.format("(%d/%d) %s : \r\n", 1, pb.question.size(), pb.question.get(0));
						break;
				}

				break;
		}

		return imsi;
	}   //문제 출제

	public String marking(String type)
	{
		String imsi = "채점 오류";

		switch (type)
		{
			case "TERM":
				for (int i = 0; i < input.length; i++)
				{
					if (stringCompare(pb.answer.get(i), input[i]))
					{
						right_answer[right_cnt++] = i;
					}
					else
					{
						wrong_answer[wrong_cnt++] = i;
					}
				}

				imsi = String.format("맞은갯수 : %d\r\n\r\n", right_cnt);
				
				for (int i = 0; i < right_cnt; i++)
				{
					imsi += String.format("%s %s \n입력한 답 : %s\r\n\r\n", pb.question.get(right_answer[i]), pb.answer.get(right_answer[i]), input[right_answer[i]]);
				}

				imsi += "\r\n\r\n";
				imsi += String.format("틀린갯수 : %d\r\n\r\n", wrong_cnt);
				for (int i = 0; i < wrong_cnt; i++)
				{
					imsi += String.format("%s %s \n입력한 답 : %s\r\n\r\n", pb.question.get(wrong_answer[i]), pb.answer.get(wrong_answer[i]), input[wrong_answer[i]]);
				}

				break;
			case "CONCEPT":
				break;
		}

		count = 0;

		return imsi;
	}						   //채점
}