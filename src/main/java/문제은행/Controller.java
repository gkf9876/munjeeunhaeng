package ��������;

import ��������.��.Question_bank;

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
        count = 0;                                                                //���� ������ ������� Ǯ����
    }

    public boolean stringCompare(String long_str, String short_str)
    {
        int count = 0;
        String arr1;            //ª�� ���ڿ�
        String arr2;            //�� ���ڿ�

        String stra = "";
        String strb = "";

        if (long_str == "" && short_str == "")
            return true;
        else if (long_str == "" || short_str == "")
            return false;

        if (long_str == null || short_str == null)
            return false;

        /////////////////////////////////////////////�����̽��ٿ� ���๮�ڸ� �����Ѵ�!!
        for (int i = 0; i < long_str.length(); i++)
        {
            if (long_str.charAt(i) != ' ' && long_str.charAt(i) != '\n')
            {
                stra += long_str.charAt(i);
            }
        }

        for (int i = 0; i < short_str.length(); i++)
        {
            if (short_str.charAt(i) != ' ' && short_str.charAt(i) != '\n')
            {
                strb += short_str.charAt(i);
            }
        }
        ////////////////////////////////////////////

        if (stra.length() < strb.length())
        {
            arr1 = strb;
            arr2 = stra;
        }
        else
        {
            arr1 = stra;
            arr2 = strb;
        }

        for (int i = 0; i <= arr1.length() - arr2.length(); i++)
        {
            if (arr1.charAt(i) == arr2.charAt(0))
            {
                for (int j = 0; j < arr2.length(); j++)
                {
                    if (arr1.charAt(i + j) == arr2.charAt(j))
                    {
                        count++;
                        if (count == arr2.length())
                            return true;
                        continue;
                    }
                    else
                    {
                        count = 0;
                        break;
                    }
                }
            }
        }
        return false;
    }              //�ϳ��� ���ڿ��� �ٸ� ���ڿ��� ������ �Ǵ��� Ȯ��

    public String Answer_input(String type, String str)
    {
        String imsi = "�Է� ����";

        if (count < pb.count)
        {
            //�� �Էºκ�
            input[count++] = str;
            imsi = "�Է� : " + str + "\r\n";
            imsi += "\r\n";


            //������ ��� �� �Է����ڸ��� ������ ���� �����ش�.
            if (type == "CONCEPT")
            {
                imsi += String.format("�� : %s\r\n", pb.answer[count - 1]);
                imsi += "\r\n";
            }

            return imsi;
        }

        return imsi;
    }                       //����ڷκ��� ���� �Է¹޴� �Լ�

    public String set_question(String type)
    {
        String imsi = "���� ���� ����";
        //���� �κ�
        if (count < pb.count)
        {
            switch (type)
            {
                case "TERM":

                    if (pb.question[count] != "")
                        imsi = String.format("(%d/%d) %s : \r\n", count + 1, pb.count, pb.question[count]);

                    break;
                case "CONCEPT":

                    if (pb.question[count] != "")
                        imsi = String.format("(%d/%d) %s : \r\n", count + 1, pb.count, pb.question[count]);


                    break;
                default:
                    break;
            }
        }

        return imsi;
    }                                   //���� ����

    public String solve_start(String type, String subject, String chapter, String form)
    {
        String imsi = "���� ���� ����";
        ��������.��.Subject SJ;
        count = 0;

        switch (subject)
        {
            case "ENGLISH_VOCA":
                SJ = pb.getSubject(Question_bank.Keyword.ENGLISH_VOCA);
                break;
            case "ENGINEER_INFORMATION_PROCESSING":
                SJ = pb.getSubject(Question_bank.Keyword.ENGINEER_INFORMATION_PROCESSING);
                break;
            case "POWER_ELECTRONICS":
            	SJ = pb.getSubject(Question_bank.Keyword.POWER_ELECTRONICS);
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
                                pb.set_chapter_range_exam(Question_bank.Keyword.TERM, (Question_bank.Keyword)SJ.code, 1, SJ.HT.length, Question_bank.Keyword.WORDTOTRANSLATE);
                                break;
                            case "TRANSLATETOWORD":
                                pb.set_chapter_range_exam(Question_bank.Keyword.TERM, (Question_bank.Keyword)SJ.code, 1, SJ.HT.length, Question_bank.Keyword.TRANSLATETOWORD);
                                break;
                            case "RANDOM":
                                pb.set_chapter_range_exam(Question_bank.Keyword.TERM, (Question_bank.Keyword)SJ.code, 1, SJ.HT.length, Question_bank.Keyword.RANDOM);
                                break;
                            case "EXAMPLE_SENTENCE":
                                pb.set_chapter_range_exam(Question_bank.Keyword.TERM, (Question_bank.Keyword)SJ.code, 1, SJ.HT.length, Question_bank.Keyword.EXAMPLE_SENTENCE);
                                break;
                            case "GRAMMAR":
                                pb.set_chapter_range_exam(Question_bank.Keyword.TERM, (Question_bank.Keyword)SJ.code, 1, SJ.HT.length, Question_bank.Keyword.GRAMMAR);
                                break;
                            default:
                                break;
                        }

                        input = new String[pb.count];
                        right_answer = new int[pb.count];
                        wrong_answer = new int[pb.count];
                        right_cnt = 0;
                        wrong_cnt = 0;

                        if (pb.question[0] != "")
                            imsi = String.format("(%d/%d) %s : \r\n", 1, pb.count, pb.question[0]);

                        break;
                    //case null:
                      //  break;
                    default:

                        int num = 1;

                        for (int i = 1; i < SJ.HT.length; i++)
                        {
                            if (SJ.HT[i].name == chapter)
                            {
                                num = i;
                                break;
                            }
                        }

                        switch (form)
                        {
                            case "WORDTOTRANSLATE":
                                pb.set_chapter_exam(Question_bank.Keyword.TERM, (Question_bank.Keyword)SJ.code, num, Question_bank.Keyword.WORDTOTRANSLATE);
                                break;
                            case "TRANSLATETOWORD":
                                pb.set_chapter_exam(Question_bank.Keyword.TERM, (Question_bank.Keyword)SJ.code, num, Question_bank.Keyword.TRANSLATETOWORD);
                                break;
                            case "RANDOM":
                                pb.set_chapter_exam(Question_bank.Keyword.TERM, (Question_bank.Keyword)SJ.code, num, Question_bank.Keyword.RANDOM);
                                break;
                            case "EXAMPLE_SENTENCE":
                                pb.set_chapter_exam(Question_bank.Keyword.TERM, (Question_bank.Keyword)SJ.code, num, Question_bank.Keyword.EXAMPLE_SENTENCE);
                                break;
                            case "GRAMMAR":
                                pb.set_chapter_exam(Question_bank.Keyword.TERM, (Question_bank.Keyword)SJ.code, num, Question_bank.Keyword.GRAMMAR);
                                break;
                            default:
                                break;
                        }

                        input = new String[pb.count];
                        right_answer = new int[pb.count];
                        wrong_answer = new int[pb.count];
                        right_cnt = 0;
                        wrong_cnt = 0;

                        if (pb.question[0] != "")
                            imsi = String.format("(%d/%d) %s : \r\n", 1, pb.count, pb.question[0]);


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
                                pb.set_chapter_range_exam(Question_bank.Keyword.CONCEPT, SJ.code, 1, SJ.CT.length, Question_bank.Keyword.INTERPRET);
                                break;
                            case "INFERENCE":
                                pb.set_chapter_range_exam(Question_bank.Keyword.CONCEPT, SJ.code, 1, SJ.CT.length, Question_bank.Keyword.INFERENCE);
                                break;
                            case "RANDOM":
                                pb.set_chapter_range_exam(Question_bank.Keyword.CONCEPT, SJ.code, 1, SJ.CT.length, Question_bank.Keyword.RANDOM);
                                break;
                            default:
                                pb.set_chapter_range_exam(Question_bank.Keyword.CONCEPT, SJ.code, 1, SJ.CT.length, Question_bank.Keyword.INTERPRET);
                                break;
                        }

                        input = new String[pb.count];

                        if (pb.question[0] != "")
                            imsi = String.format("(%d/%d) %s : \r\n", 1, pb.count, pb.question[0]);

                        break;
                  //  case null:
                  //      break;
                    default:

                        int num = 1;

                        for(int i=1; i<SJ.CT.length; i++)
                        {
                            if(SJ.CT[i].name == chapter)
                            {
                                num = i;
                                break;
                            }
                        }

                        switch (form)
                        {
                            case "INTERPRET":
                                pb.set_chapter_exam(Question_bank.Keyword.CONCEPT, SJ.code, num, Question_bank.Keyword.INTERPRET);
                                break;
                            case "INFERENCE":
                                pb.set_chapter_exam(Question_bank.Keyword.CONCEPT, SJ.code, num, Question_bank.Keyword.INFERENCE);
                                break;
                            case "RANDOM":
                                pb.set_chapter_exam(Question_bank.Keyword.CONCEPT, SJ.code, num, Question_bank.Keyword.RANDOM);
                                break;
                            default:
                                pb.set_chapter_exam(Question_bank.Keyword.CONCEPT, SJ.code, num, Question_bank.Keyword.INTERPRET);
                                break;
                        }

                        input = new String[pb.count];

                        if (pb.question[0] != "")
                            imsi = String.format("(%d/%d) %s : \r\n", 1, pb.count, pb.question[0]);

                        break;
                }

                break;
        }

        return imsi;
    }   //���� ����

    public String marking(String type)
    {
        String imsi = "ä�� ����";

        switch (type)
        {
            case "TERM":
                for (int i = 0; i < input.length; i++)
                {
                    if (stringCompare(pb.answer[i], input[i]))
                    {
                        right_answer[right_cnt++] = i;
                    }
                    else
                    {
                        wrong_answer[wrong_cnt++] = i;
                    }
                }

                imsi = String.format("�������� : %d\r\n\r\n", right_cnt);
                
                for (int i = 0; i < right_cnt; i++)
                {
                    imsi += String.format("%s %s \n�Է��� �� : %s\r\n\r\n", pb.question[right_answer[i]], pb.answer[right_answer[i]], input[right_answer[i]]);
                }

                imsi += "\r\n\r\n";
                imsi += String.format("Ʋ������ : %d\r\n\r\n", wrong_cnt);
                for (int i = 0; i < wrong_cnt; i++)
                {
                    imsi += String.format("%s %s \n�Է��� �� : %s\r\n\r\n", pb.question[wrong_answer[i]], pb.answer[wrong_answer[i]], input[wrong_answer[i]]);
                }

                break;
            case "CONCEPT":

                break;
        }

        count = 0;

        return imsi;
    }                           //ä��
}