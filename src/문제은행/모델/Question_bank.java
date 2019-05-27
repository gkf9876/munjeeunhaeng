package 문제은행.모델;

import java.util.Random;

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
    public int count;                                                               //문제 갯수.

    public enum Keyword
    {
        WORDTOTRANSLATE, TRANSLATETOWORD, RANDOM, GRAMMAR, EXAMPLE_SENTENCE,        //용어 유형 키워드
        INTERPRET, INFERENCE,                                                       //개념 유형 키워드
        TERM, CONCEPT,
        ENGLISH_VOCA, POWER_ELECTRONICS,                                                              //용어 과목 키워드
        ENGINEER_INFORMATION_PROCESSING                                             //개념 과목 키워드
    }

    public Question_bank()
    {
        sj = new Subject[3];
        sj[0] = new English_voca("해커스", Keyword.ENGLISH_VOCA);
        sj[1] = new Engineer_Information_Processing("정보처리기사", Keyword.ENGINEER_INFORMATION_PROCESSING);
        sj[2] = new Power_Electronics("전력전자공학", Keyword.POWER_ELECTRONICS);
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
                    Term tr;

                    switch (subject)
                    {
                        case ENGLISH_VOCA:
                            tr = ((English_voca)getSubject(Keyword.ENGLISH_VOCA)).HT[chapter];
                            this.name = String.format(tr.name);
                            break;
                        case POWER_ELECTRONICS:
                        	tr = getSubject(Keyword.POWER_ELECTRONICS).HT[chapter];
                        	this.name = String.format(tr.name);
                        	break;
                        default:
                            tr = null;
                            break;
                    }

                    question = new String[tr.count];
                    answer = new String[tr.count];

                    int[] ran = new int[tr.count];

                    for (int i = 0; i < tr.count; i++)
                    {
                        int cnt = 0;
                        ran[i] = rd.nextInt(tr.count);

                        for (int j = 0; j < i; j++)
                            if (ran[j] == ran[i])
                                cnt++;

                        if (cnt != 0)
                            i--;
                    }

                    switch (form)
                    {
                        case WORDTOTRANSLATE:
                            for (int i = 0; i < tr.count; i++)
                            {
                                question[i] = String.format(tr.word.get(ran[i]));
                                answer[i] = String.format(tr.translate.get(ran[i]));
                                count++;
                            }
                            break;
                        case TRANSLATETOWORD:
                            for (int i = 0; i < tr.count; i++)
                            {
                                question[i] = String.format(tr.translate.get(ran[i]));
                                answer[i] = String.format(tr.word.get(ran[i]));
                                count++;
                            }
                            break;
                        case RANDOM:
                            for(int i=0; i<tr.count; i++)
                            {
                                if((int)(Math.random() % 2) == 1)
                                {
                                    question[i] = String.format(tr.word.get(ran[i]));
                                    answer[i] = String.format(tr.translate.get(ran[i]));
                                }
                                else
                                {
                                    question[i] = String.format(tr.translate.get(ran[i]));
                                    answer[i] = String.format(tr.word.get(ran[i]));
                                }
                                count++;
                            }
                            break;
                        case EXAMPLE_SENTENCE:
                            for (int i = 0; i < tr.count; i++)
                            {
                                question[i] = "\n 예문 : " + String.format(tr.exercise.get(ran[i])) + "\r\n" + " 단어 : " + String.format(tr.word.get(ran[i]));
                                answer[i] = String.format(tr.translate.get(ran[i]));
                                count++;
                            }
                            break;
                        case GRAMMAR:
                            int k = 0;
                            for (int i = 0; i < tr.count; i++)
                            {
                                if (tr.grammar_question.get(ran[i]) != null)
                                {
                                    question[k] = String.format(tr.grammar_question.get(ran[i]));
                                    answer[k++] = String.format(tr.grammar_answer.get(ran[i]));
                                    count++;
                                }
                            }
                            break;
                    }
                }
                break;
            case CONCEPT:
                {
                    Concept cc;

                    switch (subject)
                    {
                        case ENGINEER_INFORMATION_PROCESSING:
                            cc = ((Engineer_Information_Processing)getSubject(Keyword.ENGINEER_INFORMATION_PROCESSING)).CT[chapter];
                            this.name = String.format(cc.name);
                            break;
                        default:
                            cc = new Concept("");
                            break;
                    }

                    question = new String[cc.count];
                    answer = new String[cc.count];

                    int[] ran = new int[cc.count];

                    for (int i = 0; i < cc.count; i++)
                    {
                        int cnt = 0;
                        ran[i] = rd.nextInt(cc.count);

                        for (int j = 0; j < i; j++)
                            if (ran[j] == ran[i])
                                cnt++;

                        if (cnt != 0)
                            i--;
                    }

                    switch (form)
                    {
                        case INTERPRET:                                 //용어를 해석
                            for (int i = 0; i < cc.count; i++)
                            {
                                question[i] = String.format(cc.word.get(ran[i]));
                                answer[i] = String.format(cc.interpret.get(ran[i]));
                                count++;
                            }
                            break;
                        case INFERENCE:                                 //개념에 대한 용어 유추
                            for (int i = 0; i < cc.count; i++)
                            {
                                question[i] = String.format(cc.interpret.get(ran[i]));
                                answer[i] = String.format(cc.word.get(ran[i]));
                                count++;
                            }
                            break;
                        case RANDOM:
                            for (int i = 0; i < cc.count; i++)
                            {
                                if (rd.nextInt(2) == 1)
                                {
                                    question[i] = String.format(cc.word.get(ran[i]));
                                    answer[i] = String.format(cc.interpret.get(ran[i]));
                                }
                                else
                                {
                                    question[i] = String.format(cc.interpret.get(ran[i]));
                                    answer[i] = String.format(cc.word.get(ran[i]));
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
                    Term tr;

                    switch (subject)
                    {
                        case ENGLISH_VOCA:
                            tr = new Term("voca");

                            for (int i = start_chapter; i < end_chapter; i++)
                                tr.add_term(((English_voca)sj[0]).HT[i]);

                            this.name = String.format(tr.name);
                            break;
                        case POWER_ELECTRONICS:
                            tr = new Term("voca");

                            for (int i = start_chapter; i < end_chapter; i++)
                                tr.add_term(((Power_Electronics)sj[2]).HT[i]);

                            this.name = String.format(tr.name);
                            break;
                        default:
                            tr = new Term("");
                            break;
                    }

                    question = new String[tr.count];
                    answer = new String[tr.count];

                    int[] ran = new int[tr.count];

                    for (int i = 0; i < tr.count; i++)
                    {
                        int cnt = 0;
                        ran[i] = rd.nextInt(tr.count);

                        for (int j = 0; j < i; j++)
                            if (ran[j] == ran[i])
                                cnt++;

                        if (cnt != 0)
                            i--;
                    }

                    switch (form)
                    {
                        case WORDTOTRANSLATE:
                            for (int i = 0; i < tr.count; i++)
                            {
                                question[i] = String.format(tr.word.get(ran[i]));
                                answer[i] = String.format(tr.translate.get(ran[i]));
                                count++;
                            }
                            break;
                        case TRANSLATETOWORD:
                            for (int i = 0; i < tr.count; i++)
                            {
                                question[i] = String.format(tr.translate.get(ran[i]));
                                answer[i] = String.format(tr.word.get(ran[i]));
                                count++;
                            }
                            break;
                        case RANDOM:
                            for(int i=0; i<tr.count; i++)
                            {
                                if(rd.nextInt(2) == 1)
                                {
                                    question[i] = String.format(tr.word.get(ran[i]));
                                    answer[i] = String.format(tr.translate.get(ran[i]));
                                }
                                else
                                {
                                    question[i] = String.format(tr.translate.get(ran[i]));
                                    answer[i] = String.format(tr.word.get(ran[i]));
                                }
                                count++;
                            }
                            break;
                        case EXAMPLE_SENTENCE:
                            int j = 0;
                            for (int i = 0; i < tr.count; i++)
                            {
                                if (tr.exercise.get(ran[i]) != null)
                                {
                                    question[j] = "\n 예문 : " + String.format(tr.exercise.get(ran[i])) + "\r\n" + " 단어 : " + String.format(tr.word.get(ran[i]));
                                    answer[j++] = String.format(tr.translate.get(ran[i]));
                                    count++;
                                }
                            }

                            tr.count = j;
                            break;
                        case GRAMMAR:
                            int k = 0;
                            for (int i = 0; i < tr.count; i++)
                            {
                                if (tr.grammar_question.get(ran[i]) != null)
                                {
                                    question[k] = String.format(tr.grammar_question.get(ran[i]));
                                    answer[k++] = String.format(tr.grammar_answer.get(ran[i]));
                                    count++;
                                }
                            }

                            tr.count = k;
                            break;
                    }
                }
                break;
            case CONCEPT:
                {
                    Concept tr;

                    switch (subject)
                    {
                        case ENGINEER_INFORMATION_PROCESSING:
                            tr = new Concept("정보처리");

                            for (int i = start_chapter; i < end_chapter; i++)
                                tr.add_concept(((Engineer_Information_Processing)sj[1]).CT[i]);

                            this.name = String.format(tr.name);
                            break;
                        default:
                            tr = new Concept("정보처리");

                            for (int i = start_chapter; i < end_chapter; i++)
                                tr.add_concept(((Engineer_Information_Processing)sj[1]).CT[i]);

                            this.name = String.format(tr.name);
                            break;
                    }

                    question = new String[tr.count];
                    answer = new String[tr.count];

                    int[] ran = new int[tr.count];

                    for (int i = 0; i < tr.count; i++)
                    {
                        int cnt = 0;
                        ran[i] = rd.nextInt(tr.count);

                        for (int j = 0; j < i; j++)
                            if (ran[j] == ran[i])
                                cnt++;

                        if (cnt != 0)
                            i--;
                    }

                    switch (form)
                    {
                        case INTERPRET:
                            for (int i = 0; i < tr.count; i++)
                            {
                                question[i] = String.format(tr.word.get(ran[i]));
                                answer[i] = String.format(tr.interpret.get(ran[i]));
                                count++;
                            }
                            break;
                        case INFERENCE:
                            for (int i = 0; i < tr.count; i++)
                            {
                                question[i] = String.format(tr.interpret.get(ran[i]));
                                answer[i] = String.format(tr.word.get(ran[i]));
                                count++;
                            }
                            break;
                        case RANDOM:
                            for (int i = 0; i < tr.count; i++)
                            {
                                if (rd.nextInt(2) == 1)
                                {
                                    question[i] = String.format(tr.word.get(ran[i]));
                                    answer[i] = String.format(tr.interpret.get(ran[i]));
                                }
                                else
                                {
                                    question[i] = String.format(tr.interpret.get(ran[i]));
                                    answer[i] = String.format(tr.word.get(ran[i]));
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
