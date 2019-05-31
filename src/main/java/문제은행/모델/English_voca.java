package ��������.��;

import ��������.��.Question_bank.Keyword;

class English_voca extends Subject
{
    public English_voca(String name, Keyword code)
    {
    	super(name, code);
        this.HT = new Term[25];
        HT[1] = new Term("1");
        HT[2] = new Term("2");
        HT[3] = new Term("3");
        HT[4] = new Term("4");
        HT[5] = new Term("5");
        HT[6] = new Term("6");
        HT[7] = new Term("7");
        HT[8] = new Term("8");
        HT[9] = new Term("9");
        HT[10] = new Term("10");
        HT[11] = new Term("11");
        HT[12] = new Term("12");
        HT[13] = new Term("13");
        HT[14] = new Term("14");
        HT[15] = new Term("15");
        HT[16] = new Term("16");
        HT[17] = new Term("17");
        HT[18] = new Term("18");
        HT[19] = new Term("19");
        HT[20] = new Term("20");
        HT[21] = new Term("21");
        HT[22] = new Term("22");
        HT[23] = new Term("23");
        HT[24] = new Term("24");

		/*
		 * HT[1].add_term("applicant", "n.������, ��û��",
		 * "Each applicant is required to submit a resume.");
		 * HT[1].add_term("apprehensive", "a.�����ϴ�, �����ϴ�",
		 * "Most people feel apprehensive before an important job interview.");
		 * HT[1].add_term("aptitude", "n.���, ����",
		 * "The applicant should demonstarte aptitude in the following areas.");
		 * HT[1].add_term("associate", "v.���ý�Ű��",
		 * "Two of the applicants were associated with a rival firm.",
		 * "Two of the applicants were associated [    ] a rival firm.",
		 * "with\r\nbe associated with : ~�� ���õǴ� \r\nin association with : ~�� �����Ͽ�");
		 * HT[1].add_term("bilingual", "a.2�� ��� �����ϴ�",
		 * "Avid Pharmaceuticals is seeking a bilingual call center manager.");
		 * HT[1].add_term("broad", "a.������",
		 * "a broad knowledge of marketing strategies."); HT[1].add_term("candidate",
		 * "n.����, �ĺ���", "Five candidates will be selected for final interviews.");
		 * HT[1].add_term("certification", "n.����, ����", "accounting certification");
		 * HT[1].add_term("commensurate", "a.�����, �׼��� �����ϴ�",
		 * "Wages will be commensurate with experience and qualifications.",
		 * "Wages will be commensurate [    ] experience and qualifications.",
		 * "with\r\nbe commensurate with : ~�� ����ϴ�"); HT[1].add_term("confidence",
		 * "n.Ȯ��, �ڽ�;����",
		 * "We have confidence that she can handle the position.\r\nThe recommendations showed confidence in his abilities."
		 * , "The recommendations showed confidence [  ] his abilities.",
		 * "in\r\nconfidence in : ~�� ���� Ȯ��, ����\r\nin confidence : ��з�");
		 * HT[1].add_term("consultant", "n.��, ������Ʈ",
		 * "Emma currently works in London as an interior design consultant.",
		 * "I'll have to consult [    ] Mr.Long first.",
		 * "with\r\nconsult + ������ : ~�� ����ϴ�\r\nconsult with + ����� ��� : ~�� �����ϴ�");
		 * HT[1].add_term("degree", "n.����", "a bachelor's degree \na master's degree");
		 * HT[1].add_term("eligible", "a.�ڰ��� �մ�, ������",
		 * "The part time workers are also eligible for paid holidays.",
		 * "The part time workers are also eligible [    ] paid holidays.",
		 * "for\r\nbe eligible + membership/compensation/position : ȸ���� ��/������ ����/������ ���� �ڰ��� �ִ�.\r\nbe eligible to do : ~�� �ڰ��� �ִ�"
		 * ); HT[1].add_term("employment", "n.���",
		 * "The company announced employment opprtunities in its accounts department.");
		 * HT[1].add_term("entitle", "v.~���� ~�� �ڰ��� �ִ�",
		 * "Executive level staff are entitled to additional benefits.",
		 * "Executive level staff are entitled [  ] additional benefits.",
		 * "to\r\nbe entitled to + ��� : ~�� ���� �ڰ��� �־�����\r\nbe entitled to do : ~�� �ڰ��� �־�����"
		 * ); HT[1].add_term("get through", "phr.(���� �)�հ��ϴ�, ~�� ������ ��ġ��",
		 * "Twelve people got through the first round of interviews.");
		 * HT[1].add_term("highly", "ad.�ſ�, ����", "highly qualified candidates");
		 * HT[1].add_term("increment", "n.����,�λ�",
		 * "Employees with good records will receive wage increments as an incentive.");
		 * HT[1].add_term("lag", "v.��������,�ڶ�������",
		 * "Wage increases lag considerably behind current inflation rates.",
		 * "Wage increases lag considerably [    ] current inflation rates.",
		 * "behind\r\nlag behind : (�ӵ� ����)~���� ��������, �ڶ�������");
		 * HT[1].add_term("managerial", "������",
		 * "I am seeking a managerial position in the accounting field.");
		 * HT[1].add_term("match", "~�� ��︮��, ��ȭ�Ǵ�",
		 * "The candidate's qualifications match the job description.");
		 * HT[1].add_term("meet", "v.(�ʿ�,�䱸 ����)������Ű��",
		 * "Applicants must meet all the requirements for the job.");
		 * HT[1].add_term("minimum", "n.�ּ��ѵ�", "a minimum of three years'experience");
		 * HT[1].add_term("occupation", "n.����",
		 * "Journalism is an interesting and challenging occupation.");
		 * HT[1].add_term("opening", "n.����,���;����,����",
		 * "job openings \nthe opening of a new branch"); HT[1].add_term("otherwise",
		 * "ad.�޸�,�ٸ��������;�׷��� �ʴٸ�",
		 * "Applicants must apply in person unless otherwise indicated. \nApplications must be turned in before the deadline; otherwise they won't be processed in time."
		 * ); HT[1].add_term("paycheck", "n.�޷�,�޷� ���� ��ǥ",
		 * "Paychecks are mailed out each month."); HT[1].add_term("payroll",
		 * "n.�ӱ� ����, �޷� ���",
		 * "Fifteen new employees were added to the payroll last month.",
		 * "[ ] the payroll", "on\r\non the payroll : ���Ǿ�"); HT[1].add_term("pension",
		 * "n.����", "All new employees must sign up for the national pension plan.");
		 * HT[1].add_term("probationary", "a.�߽�����,��ä����",
		 * "The company will offer contracts on completion of a probationary period.");
		 * HT[1].add_term("professional", "a.������,��������n.������",
		 * "Compliance with the principles of professional ethics is mandatory. \nMerseyside Hospital is looking to hire a certified health professional."
		 * ); HT[1].add_term("proficiency", "n.����,�ɼ�",
		 * "proof of proficiency in a second language"); HT[1].add_term("prospective",
		 * "a.�巡��,�̷���", "prospective employees"); HT[1].add_term("qualified",
		 * "a.�ڰ� �ִ�,������", "qualified applicants",
		 * "Unfortunately, I'm not qualified [    ] this sort of thing.",
		 * "for\r\nbe qualified for : ~�� �ڰ��� �ִ�\r\nqualifications for : ~�� ���� �ڰ�");
		 * HT[1].add_term("recruit", "v.(���� ��� ����)�����ϴ�",
		 * "The firm recruits promising graduates on a yearly basis.");
		 * HT[1].add_term("reference", "n.��õ��;����",
		 * "Philippa asked her ex-boss to write a reference for her. \n This database contains reference material on all aspects of labor law."
		 * ); HT[1].add_term("regardless of", "phr.~�� �������",
		 * "All applicants will be considered regardless of age, gender, or race.");
		 * HT[1].add_term("requirement", "n.�ʿ�����",
		 * "Frequent travel is a requirement of this position.");
		 * HT[1].add_term("resume", "n.�̷¼�",
		 * "Fax your resume and cover letter to the above address.");
		 * HT[1].add_term("wage", "n.�ӱ�,�޷�",
		 * "Uncertified workers earn lower wages than certified staff.");
		 * 
		 * HT[2].add_term("abolish", "v.(����,���� ����)�����ϴ�",
		 * "Congress decided to abolish taxes on imported fruit.");
		 * HT[2].add_term("access", "n.�̿� ����, ����;���, v.~�� �����ϴ�,�����ϴ�",
		 * "Only authorized personnel may request access to client files.\r\nOur new office has direct access to the subway.\r\nClick on the link to access the detailed job description."
		 * , "Our new office has direct access [  ] the subway.",
		 * "to\r\nhave access to : ~�� ���� ������ ������ �ִ�.\r\n��� access�� ��ġ�� to�� ��� �̷�� ���� �����ȴ�. ������ ���� access�� Ÿ�����̹Ƿ� �ڿ� ��ġ�� to�� �� �� ���ٴ� ���� �� ����ص���."
		 * ); HT[2].add_term("accordance", "n.��ġ,��ȭ",
		 * "We strive to operate in accordance with local customs.",
		 * "We strive to operate [  ] accordance [    ] local customs.",
		 * "in,with\r\nin accordance with : ~�� ����, ~���\r\naccordance�� in accordance with ���·� ���ǹǷ� �� ����� �־� �Ѵ�. with �������� '����� �� ��Ģ'�̳� '��� ����'���� �´�."
		 * ); HT[2].add_term("according to", "phr.~�� ����",
		 * "All transactions must be handled according to the guidelines.");
		 * HT[2].add_term("accuse", "v.���ϴ�,����ϴ�",
		 * "The director accused his secretary of leaking classified information.",
		 * "The director accused his secretary [  ] leaking classified information.",
		 * "of\r\naccuse A of B : B�� ���� A�� ���ϴ�"); HT[2].add_term("adhere",
		 * "v.����ϴ�,��Ű��", "It is difficult to adhere to all the policies.",
		 * "It is difficult to adhere [  ] all the policies.",
		 * "to\r\nadhere to + policies/rules/standards : ��å/��Ģ/������ ����ϴ�\r\nadhere�� '~�� ����ϴ�'�� �ǹ��� �� �ڵ����̹Ƿ� ��ġ�� to�� ���� ����Ѵ�."
		 * ); HT[2].add_term("approval", "n.����,�ΰ�",
		 * "Please obtain the supervisor's approval before purchasing supplies.");
		 * HT[2].add_term("at all times", "phr.�׻�,������",
		 * "Employees must have security cards at all times."); HT[2].add_term("attire",
		 * "n.����,��������",
		 * "Professional business attire is required from all presentation participants."
		 * ); HT[2].add_term("attorney", "n.��ȣ��",
		 * "The attorney advised his client to remain silent.");
		 * HT[2].add_term("authorize", "v.~�� �ΰ��ϴ�",
		 * "Allocations of funds must be authorized by management");
		 * HT[2].add_term("circumscribe", "v.~�� �����ϴ�",
		 * "The new legislation will circumscribe the use of animals in product testing."
		 * ); HT[2].add_term("code", "n.�Թ�,����;��ȣ", "dress code\r\nemployee code");
		 * HT[2].add_term("comply", "v.������,�ؼ��ϴ�",
		 * "Employees must comply with the regulations governing computer use.");
		 * HT[2].add_term("concern", "n.���,����",
		 * "Employees voiced concerns about safety at the meeting",
		 * "Employees voiced concerns [  ] safety at the meeting",
		 * "about\r\nconcern about/over : ~�� ���� ���,����\r\nconcern�� �Բ� ���̴� ��ġ�� about,over�� ��� �˾Ƶ���.\r\nquestions concerning : ~�� ���� ����\r\nquestion�� ��︮�� ��ġ�� concerning(~�� ����)�� ���� ������ �����ȴ�. concerning�� about, regarding�� ���� �ǹ��̴�."
		 * ); HT[2].add_term("custody", "n.����,����",
		 * "The suspect was kept in custody for three days."); HT[2].add_term("effect",
		 * "n.ȿ��,����,(���� ����)ȿ��,v.����μ� ~�� ��������",
		 * "The tardiness policy will be in effect starting next week.\r\nHe effected a sudden change in the company's direction."
		 * , "The tardiness policy will be [   ] effect starting next week.",
		 * "in\r\nin effect : (���� ����)�ǽõ�, ȿ�� �ִ�\r\ncome into effect : �ǽõǴ�,��ȿ�Ǵ�\r\nhave an effect on : ~�� ������ ��ġ��\r\nsecondary effect : �μ��� ȿ��"
		 * ); HT[2].add_term("enforce", "v.(������)�����ϴ�,�����ϴ�",
		 * "All departments must enforce the no smoking policy.");
		 * HT[2].add_term("exception", "n.����",
		 * "Management decided not to make exceptions to the rules.",
		 * "[   ] very few exceptions, private schools get the best exam results.",
		 * "with\r\nwith the exception of : ~�� �����ϰ�\r\nwith very few exceptions : ���� ���� ����"
		 * ); HT[2].add_term("form", "n.����,���",
		 * "Visitors are required to present a form of identification to security guards."
		 * ); HT[2].add_term("fraud", "n.���",
		 * "The company's owners will be charged with tax fraud.");
		 * HT[2].add_term("habit", "n.����,����",
		 * "Setting goals should be a regular habit."); HT[2].add_term("immediately",
		 * "ad.���,��",
		 * "Effective immediately, pension installments will be automatically deducted from each paycheck."
		 * ); HT[2].add_term("infringement", "n.ħ��",
		 * "An infringement of copyright led to the cancellation of production.");
		 * HT[2].add_term("legislation", "n.����,����",
		 * "The committee unanimously voted for the new export limitation legislation."
		 * ); HT[2].add_term("legitimate", "a.�չ�����,������",
		 * "All legitimate business expenses will be reimbursed.");
		 * HT[2].add_term("litigation", "n.�Ҽ�,���",
		 * "We will pursue litigation against all delinquent debtors.");
		 * HT[2].add_term("observance", "n.�ؼ�",
		 * "We will close tomorrow in observance of the national holiday.",
		 * "We will close tomorrow [  ] observance [  ] the national holiday.",
		 * "in,of\r\nin observance of : ~�� �ؼ��Ͽ�"); HT[2].add_term("petition",
		 * "n.������,ź����",
		 * "Employees circulated a petition to ban smoking in the building.");
		 * HT[2].add_term("policy", "n.����;���� ����",
		 * "the company policy regarding absenteeism\r\na life insurance policy");
		 * HT[2].add_term("procedure", "n.����",
		 * "The procedure for patent applications is outlined on the APTO website.");
		 * HT[2].add_term("prohibit", "v.�����ϴ�",
		 * "The museum prohibits visitors from taking pictures.",
		 * "The museum prohibits visitors from take + [   ] pictures.",
		 * "ing\r\nprohibit A from -ing : A�� -�ϴ� ���� ���ϴ�\r\nforbid A to do : A�� ~�ϴ� ���� ���ϴ�"
		 * ); HT[2].add_term("prosecute", "v.����ϴ�",
		 * "The government may prosecute journalists for publishing classified information."
		 * ); HT[2].add_term("refrain", "v.�����ϴ�,�ﰡ��",
		 * "Guards should refrain from talking on shift.",
		 * "Guards should refrain [   ] talking on shift.",
		 * "from\r\nrefrain from : ~�� �����ϴ�\r\nrefrain�� �ڵ����̹Ƿ� ��ġ�� from�� �־�� ����� �� �� �ִ�."
		 * ); HT[2].add_term("regulation", "n.����",
		 * "Regulations regarding lunch breaks were established.");
		 * HT[2].add_term("restrict", "v.�����ϴ�,�����ϴ�",
		 * "Access is restricted to authorized personnel.",
		 * "Access is restricted [  ] authorized personnel.",
		 * "to\r\nrestrict A to B : A�� B�� �����ϴ�"); HT[2].add_term("severely",
		 * "ad.���ϰ�,�����ϰ�",
		 * "Those who share company data with outside parties will be severely reprimanded."
		 * ); HT[2].add_term("standard", "n.����,ǥ��",
		 * "safety standards\r\nnational standards."); HT[2].add_term("thorughly",
		 * "ad.ö���ϰ�",
		 * "Please read the user manual thoroughly before installing this software.");
		 * HT[2].add_term("violate", "v.�����ϴ�",
		 * "The content of the website may violate copyright laws.");
		 * 
		 * HT[3].add_term("accustomed", "a.~�� �ͼ���",
		 * "All our employees are accustomed to using accounting software.",
		 * "All our employees are accustomed [  ] using accounting software.",
		 * "be accustomed to -ing : -�ϴµ� �ͼ��ϴ�\r\naccustomed�� ��ġ�� to�� ¦�� �̷�� ���ȴ�. to �������� ��������� �ƴ϶� ����簡 �´ٴ� �Ϳ� ��������."
		 * ); HT[3].add_term("acquaint", "v.~���� ~�� ������Ű��,�� �˰� �ϴ�",
		 * "The training program acquaints new employees with company procedures.",
		 * "The training program acquaints new employees [   ] company procedures.",
		 * "with\r\nacquaint A with B : A���� B�� ������Ű��(=familiarize A with B)");
		 * HT[3].add_term("affiliate", "n.�迭��,����",
		 * "The company owns affiliates in several markets.");
		 * HT[3].add_term("attendance", "n.�⼮",
		 * "Staff with outstanding attendance records were awarded bonuses.");
		 * HT[3].add_term("check", "v.�˻��ϴ�,�����ϴ�",
		 * "IT staff check all computers regularly for disk errors.\r\nClick this link to check for the latest updates."
		 * , "IT staff check all computers regularly [   ] disk errors.",
		 * "for\r\ncheck A for B : B�� ������ Ȯ���ϱ� ���� A�� �˻��ϴ�\r\ncheck for A : A�� ���� �˻��ϴ�");
		 * HT[3].add_term("colleague", "n.(��������)����",
		 * "Training programs can help increase the rapport between colleagues.");
		 * HT[3].add_term("concentrate", "v.�����ϴ�,���߽�Ű��",
		 * "The sales team concentrated on developing new strategies.",
		 * "The sales team concentrated [   ] developing new strategies.",
		 * "on\r\nconcentrate on : ~�� �����ϴ�\r\nconcentrate A on B : A�� B�� ���߽�Ű��");
		 * HT[3].add_term("condense", "v.(ǥ����)���߸���,����ϴ�",
		 * "The writer condensed the report into a brief summary.",
		 * "The writer condensed the report [   ] a brief summary.",
		 * "into\r\ncondense A into B : A�� B�� ����ϴ�"); HT[3].add_term("conglomerate",
		 * "n.�Ŵ� ���ձ��", "The company developed into a global conglomerate.");
		 * HT[3].add_term("convey", "v.(�����)�����ϴ�",
		 * "The secretary urgently conveyed the message to the director.",
		 * "The secretary urgently conveyed the message [   ] the director.",
		 * "to\r\nconvey A to B : A�� B���� �����ϴ�"); HT[3].add_term("corporation",
		 * "n.�ֽ�ȸ��,����", "a multinational telecommunications corporation");
		 * HT[3].add_term("delegate", "v.(���� ����)�����ϴ�n.��ǥ",
		 * "Managers must be skilled in delegating responsibilities to subordinates.\r\nDiscussions with the delegate are going better than planned."
		 * ); HT[3].add_term("demanding", "a.�䱸�� ����", "a demanding supervisor");
		 * HT[3].add_term("directly", "ad.��ٷ�",
		 * "All regional branches report directly to our head office in Washington.");
		 * HT[3].add_term("division", "n.�μ�",
		 * "The technician will transfer to the automobile division after training.");
		 * HT[3].add_term("efficiently", "ad.ȿ��������",
		 * "The software helps employees work more efficiently.");
		 * HT[3].add_term("electronically", "ad.�¶�������,��ǻ�� ��Ÿ�����",
		 * "Sending invoices electronically saves time and resources.");
		 * HT[3].add_term("extension", "n.����,����;(��ȭ��)����",
		 * "The manager granted an extension on the deadline.\r\nextension number");
		 * HT[3].add_term("follow up on", "phr.~�� ���� �ļ� ��ġ�ϴ�",
		 * "He followed up on the manager's suggestion."); HT[3].add_term("impending",
		 * "a.�ӹ���,������", "The deadline for the report is impending.");
		 * HT[3].add_term("in one's absence", "phr.~�� ����ÿ�",
		 * "A replacement will work in her absence."); HT[3].add_term("in writing",
		 * "phr.��������", "Please describe the problem in writing.");
		 * HT[3].add_term("instruct", "v.����ġ��,�����ϴ�",
		 * "The organizers instructed participants to pre-read the conference materials."
		 * ); HT[3].add_term("involved", "a.�����,�����",
		 * "Dr.Mair was personally involved in the decision making process.",
		 * "Dr.Mair was personally involved [   ] the decision making process.",
		 * "in\r\nbe involved in : ~�� �����ϴ�"); HT[3].add_term("manage",
		 * "v.~�� �濵�ϴ�;�׷����� ~�ϴ�",
		 * "The boss decided Colleen could manage the new store.\r\nThey managed to do the assighed work in time."
		 * , "They managed [   ] do the assighed work in time.",
		 * "to\r\nmanage to do : �׷����� ~�س���, ���� �س���"); HT[3].add_term("memorandum",
		 * "n.ȸ��",
		 * "Many companies circulate a weekly memorandum summarizing business transactions."
		 * ); HT[3].add_term("notify", "v.~���� �����ϴ�,�˸���",
		 * "Staff applying for leave must notify their supervisor in writing.",
		 * "But did he notify you or any other member [  ] the team?",
		 * "of\r\nnotify ��� + of ����/that�� : ~���� ~�� ���� �����ϴ�\r\nannounce (to ���) that�� : (~����) ~�� ��ǥ�ϴ�\r\nThe director announced to shareholders that he would retire."
		 * ); HT[3].add_term("on one's own", "phr.ȥ�ڼ�,ȥ�� ������",
		 * "Operating factory machinery on one's own is dangerous.");
		 * HT[3].add_term("oversee", "v.�����ϴ�",
		 * "An expert consultant will oversee the installation process.");
		 * HT[3].add_term("proprietor", "n.(����,���� ����)������",
		 * "Hiring decisions are made by the factory's proprietor.");
		 * HT[3].add_term("quarterly", "a.�� �� �� ����", "a quarterly report");
		 * HT[3].add_term("release", "v.�����ϴ�,��ǥ�ϴ�n.�߸�",
		 * "The  company released its annual report.\r\nThe new line of jackets will be ready for release by early next year."
		 * ); HT[3].add_term("remind", "v.~���� ����Ű��,�ϱ����",
		 * "The secretary reminded the director of his lunch meeting.",
		 * "The secretary reminded the director [   ] his lunch meeting.",
		 * "of\r\nremind ��� + of ����/that�� : ~���� ~�� ����Ű��\r\nremind ��� to do : ~���� ~�϶�� �Ϸ��δ�\r\nbe reminded to do : ~�� ���� ���� �ʵ��� ���� �޴�"
		 * ); HT[3].add_term("request", "n.��ûv.��û�ϴ�",
		 * "Factory tours are avaliable upon request.\r\nMike requested a leave of absence for one week."
		 * , "I request that you [    ] it.(read�� ���¸� ����)",
		 * "read\r\nupon request : ��û�ϴ� ���\r\nrequest for : ~�� ���� ��û\r\nrequest that + �־� + ���� ���� : ~�� ~�� �� ���� ��û�ϴ�\r\nbe requested to do : ~�ϵ��� ��û�޴�, ~�Ͻñ� �ٶ��ϴ�\r\n��� request�� ��ġ�� for�� �Բ� ���� ��������, ���� request�� Ÿ�����̹Ƿ� ��ġ�� ���� �ٷ� ����� �´�. ���� request ������ that���� ���� ��� that���� ���� ������ ����ؾ� �Ѵٴ� �͵� �� ����� ����."
		 * ); HT[3].add_term("revision", "n.����,����",
		 * "The team manager will make revisions on the proposal.");
		 * HT[3].add_term("submit", "v.�����ϴ�",
		 * "Applicants should submit a resume to the personnel manager.",
		 * "Applicants should submit a resume [   ] the personnel manager.",
		 * "to\r\nsubmit A to B : A�� B���� �����ϴ�"); HT[3].add_term("subordinate",
		 * "n.���� ����,�ϱ���", "He requested the aid of a few subordinates.");
		 * HT[3].add_term("subsidiary", "n.��ȸ��",
		 * "The acting vice president oversees the subsidiary.");
		 * HT[3].add_term("supervision", "n.����", "Close supervision ensures quality.");
		 * HT[3].add_term("translation", "n.����",
		 * "The company ordered a translation of the contract into Icelandic.");
		 * 
		 * HT[4].add_term("accomplish", "v.�����ϴ�",
		 * "Careful planning is essential for accolplishing goals.");
		 * HT[4].add_term("adjust", "v.�����ϴ�",
		 * "The employees quickly adjusted to their new responsibilities.",
		 * "The employees quickly adjusted [   ] their new responsibilities.",
		 * "to\r\nadjust to : ~�� �����ϴ�\r\nadjust A to B : A�� B�� ���ߴ�, ������Ű��");
		 * HT[4].add_term("agree", "v.�����ϴ�",
		 * "The team agreed on the recommendations of the advisor.",
		 * "The team agreed [   ] the recommendations of the advisor.",
		 * "on\r\nagree on + �ǰ� : (�ǰ�)�� �����ϴ�, ���� ���� �ϴ�\r\nagree to + ����, ���� : (����,����)�� �����ϴ�\r\nagree with + ��� : (���)�� �����ϴ�"
		 * ); HT[4].add_term("aspiration", "n.����,����",
		 * "Steve has aspirations to become a partner in the firm.");
		 * HT[4].add_term("assigh", "v.�����ϴ�,�Ҵ��ϴ�",
		 * "HR assigns a unique security ID to all incoming recruits.");
		 * HT[4].add_term("assist", "v.����,�����ϴ�",
		 * "A consultant assisted with preparing for the conference.",
		 * "A consultant assisted [   ] preparing for the conference.",
		 * "with\r\nassist with : ~�� ����"); HT[4].add_term("assume",
		 * "v.(���Ŵ� ������)����̶�� �����ϴ�;(å��,������)���ô�",
		 * "The management assumes employees are satisfied.\r\nThe marketing department will assume respomsibility for the project."
		 * ); HT[4].add_term("combined", "a.�յ���,���յ�",
		 * "Our combined experience has produced great sales results.");
		 * HT[4].add_term("conduct", "v.(���� ����)�����ϴ�",
		 * "IJMR Ltd. will conduct the research study."); HT[4].add_term("confidential",
		 * "a.�����,������", "Her assignment was highly confidential.");
		 * HT[4].add_term("contrary", "ad.�ݴ��",
		 * "Techworld is in financial trouble, despite claims to the contrary.");
		 * HT[4].add_term("coordinate", "v.�����ϴ�",
		 * "The Chicago office coordinated the planning process.");
		 * HT[4].add_term("count on", "phr.~�� �ϴ�,~�� �����ϴ�",
		 * "We provide outsourcing services that clients can count on.");
		 * HT[4].add_term("creditable", "a.�Ǹ���,Ī���Ҹ���",
		 * "Our Beijing office has established a creditable reputation in China.");
		 * HT[4].add_term("direct", "v.~���� ���� ����Ű��",
		 * "The receptionist directs customers to the product display area.",
		 * "The receptionist directs customers [   ] the product display area.",
		 * "to\r\ndirect A to B : A�� B�� �ȳ��ϴ�"); HT[4].add_term("disturbing", "a.�����ϴ�",
		 * "Listening to loud music in the office could be disturbing to coworkers.");
		 * HT[4].add_term("draw on", "phr.~�� �̿��ϴ�,~�� �����ϴ�",
		 * "In her new position, Sheila had to draw on her experience from past jobs.");
		 * HT[4].add_term("duplicate", "n.�纻",
		 * "Head office ordered a duplicate of the contract.",
		 * "Mr. Yu had his secretary type the memo [   ] duplicate.",
		 * "in\r\nin duplicate : �� ������\r\nmake duplicates of : ~�� �纻�� �����");
		 * HT[4].add_term("eminent", "a.������,Ź����",
		 * "The consultant was an eminent researcher."); HT[4].add_term("endeavor",
		 * "v.����ϴ�,�־���", "We will endeavor to finish the project by Friday.");
		 * HT[4].add_term("engage", "v.�����ϴ�,�����ϴ�",
		 * "Each worker was engaged in at least two projects.",
		 * "Each worker was engaged [   ] at least two projects.",
		 * "in\r\nengage in : ~�� �����ϴ�\r\nbe engaged in : ~�� �����ϴ�, �����ϴ�");
		 * HT[4].add_term("execute", "v.�����ϴ�,�����ϴ�",
		 * "Assigned tasks must be executed promptly and efficiently.");
		 * HT[4].add_term("foster", "v.�����ϴ�,�����ϴ�",
		 * "Staff dinners helped foster better work relations.");
		 * HT[4].add_term("friction", "n.��ȭ,����",
		 * "Competition for performance bonuses caused friction amongst employees.");
		 * HT[4].add_term("get along with", "phr.~�� �������� ������",
		 * "The CEO gets along with his new advisor very well.");
		 * HT[4].add_term("hardly", "ad.���� ~���� �ʴ�",
		 * "She was hardly ever late for her shift.",
		 * "She was hardly [   ] late for her shift.",
		 * "ever\r\nhardly ever : ��ó�� ~���� �ʴ�"); HT[4].add_term("insubordinate",
		 * "a.�����ϴ�,�������� �ʴ�",
		 * "The intern was dismissed on charges of insubordinate behavior.");
		 * HT[4].add_term("intention", "n.����,����",
		 * "She had every intention of attending the conference, but couldn't.",
		 * "She had every intention of [attend + ] the conference, but couldn't.������ ���·�"
		 * , "attending\r\nhave every intention of -ing : �� -�ϰ��� �ϴ�");
		 * HT[4].add_term("lax", "a.(�ൿ ����)������ �� ��ġ��,������",
		 * "As of late, the staff has been rather lax in turning in reports.");
		 * HT[4].add_term("malign", "v.~�� ����,�߻��ϴ�",
		 * "The company accused union activists of maligning its integrity.");
		 * HT[4].add_term("neutrality", "n.�߸�,�߸���",
		 * "His neutrality was called into question."); HT[4].add_term("occasionally",
		 * "ad.������,����", "She occasionally failed to perform critical tasks.");
		 * HT[4].add_term("personnel", "n.(������)����,�ο�",
		 * "We often use an agency to find reliable temporary personnel.");
		 * HT[4].add_term("procrastinate", "v.�ٹ��Ÿ���",
		 * "The director accused his assistant of procrastinating.");
		 * HT[4].add_term("respectful", "a.������,�����ϴ�",
		 * "Salesmen are reminded to be respectful to all clients.",
		 * "We are in great respect [   ] him.",
		 * "for\r\nrespect for : ~�� ���� ����\r\nwith respect : �����Ͽ�");
		 * HT[4].add_term("respective", "a.������,��������",
		 * "The disputing parties explained their respective positions.");
		 * HT[4].add_term("responsible", "a.å���� �ִ�,å������ ��",
		 * "Employees are responsible for their own safety at work.",
		 * "Employees are responsible [   ] their own safety at work.",
		 * "for\r\nbe responsible for : ~�� ���� å���� �ִ�."); HT[4].add_term("routinely",
		 * "ad.����������,�ϻ�������",
		 * "Government workers are routinely required to get health checkups.");
		 * HT[4].add_term("subsequent", "a.�� ������",
		 * "The strategy was so successful that it was used for all subsequent project."
		 * ); HT[4].add_term("transform", "v.�ٲٴ�,�����Ű��",
		 * "Eastel Networks helps transform your business models in innovative ways.");
		 * HT[4].add_term("undertake", "v.(����)���ô�",
		 * "She had to undertake the task at short notice.");
		 * HT[4].add_term("voluntarily", "ad.�ڹ�������",
		 * "He voluntarily took on the arduous task to gain experience.");
		 * HT[4].add_term("widely", "ad.�θ�", "a widely admired business leader");
		 * 
		 * HT[5].add_term("accessible", "a.������ �� �ִ�;�̿��� �� �ִ�",
		 * "The 18th floor is only accessible to executive-level staff.\r\nPlease make the manual accessible to all employees."
		 * ); HT[5].add_term("accidentally", "ad.�쿬��,������ �ʰ�",
		 * "Alison accidentally made some errors in the financial statements.");
		 * HT[5].add_term("advisable", "a.�ٶ�����,�մ���",
		 * "It is advisable to update IT equipment regularly.");
		 * HT[5].add_term("aggravate", "v.��ȭ��Ű��",
		 * "Tensions were aggravated by the recent staff layoffs.");
		 * HT[5].add_term("announcement", "n.����,��ǥ",
		 * "Mr.Dane posted announcement about the general meeting.");
		 * HT[5].add_term("apparently", "ad.���⿡ ~�ѵ���,�ܰ������δ�",
		 * "Apparently, Mr.Jones wasn't aware of today's meeting.");
		 * HT[5].add_term("aspect", "n.����,����",
		 * "The problem must be considered from every aspect."); HT[5].add_term("aware",
		 * "a.�˰� �ִ�,�ν��ϰ� �ִ�", "Workers should be made aware of safety procedures.",
		 * "Workers should be made aware [   ] safety procedures.",
		 * "of\r\nbe aware + of/that�� : ~�� �˰� �ִ�"); HT[5].add_term("compliance",
		 * "n.(���,���Կ���)�ؼ�",
		 * "Government officials will inspect the plant's compliance with safety guidelines."
		 * ,
		 * "Government officials will inspect the plant's compliance [   ] safety guidelines."
		 * , "with\r\nin compliance with : ~�� �ؼ��Ͽ�"); HT[5].add_term("concerned",
		 * "a.�����ϴ�,�����ϴ�;���õ�",
		 * "Management is concerned about security.\r\nThe manual is concerned with the vacation policy."
		 * , "Management is concerned [   ] security.",
		 * "about\r\nbe concerned about : ~�� ���� �����ϴ�, �ٽ��ϴ�\r\nbe concerned with : ~�� ���谡 �ִ�, ~�� ������ �ִ�."
		 * ); HT[5].add_term("contingency", "n.������ ����,����� ��",
		 * "Our team is prepared for all contingencies."); HT[5].add_term("demonstrate",
		 * "v.�����ϴ�;(����,���� ������)�����ϴ�",
		 * "Sales figures demonstrate that the advertising campaign was successful.\r\nOur representative will demonstrate how to use the instrument."
		 * ); HT[5].add_term("divide", "v.������",
		 * "Required overtime will be divided equally amongst employees.",
		 * "At end of cycle, remove dough and divide [   ] halves.",
		 * "into\r\ndivide A into B : A�� B�� ������\r\nbe divided into : ~�� ��������");
		 * HT[5].add_term("embrace", "v.�޾Ƶ��̴�,�����ϴ�",
		 * "The company embraced the new technology."); HT[5].add_term("evacuate",
		 * "v.(��,��ҿ���)�����ϴ�",
		 * "Occupants were told to evacuate the building immediately.");
		 * HT[5].add_term("expertise", "n.������ ���",
		 * "This kind of project falls outside our area of expertise.");
		 * HT[5].add_term("extended", "a.(�Ⱓ ����)������,��Ⱓ�� ��ģ",
		 * "Overtime is avaliable for those willing to work extended hours.");
		 * HT[5].add_term("face", "v.(���� �)�����ϴ�",
		 * "Businesses are faced with the echallenge of foreigh competition.",
		 * "Businesses are faced [   ] the echallenge of foreigh competition.",
		 * "with\r\nbe faced with : (���� �)�����ϴ�"); HT[5].add_term("failure",
		 * "n.(��� ������)����,�ļ�", "A technician is on call to correct system failures.");
		 * HT[5].add_term("feedback", "n.�ǰ�,����",
		 * "Feedback from one's colleagues can be of great assistance.");
		 * HT[5].add_term("follow", "v.~�� ���󰡴�",
		 * "The delegates followed the guide into the exhibition hall.",
		 * "Follow this road [   ] the corner.", "to\r\nfollow A to B : A�� ���� B���� ����");
		 * HT[5].add_term("implement", "v.�����ϴ�,�ǽ��ϴ�",
		 * "Board members voted to implement an innovative marketing campaign.");
		 * HT[5].add_term("inform", "v.~���� �˸���",
		 * "Please inform the director that the meeting is cancelled.",
		 * "Please inform the director [   ] the meeting is cancelled.",
		 * "that\r\ninform ��� + of ����/that�� : ~���� ~�� �˸���\t\nexplain (to ���)that �� : (~����)~�� �����ϴ�"
		 * ); HT[5].add_term("instead of", "phr.~��ſ�",
		 * "Management offered employees stock options instead of wage increases.");
		 * HT[5].add_term("interruption", "n.�ߴ�,����",
		 * "The blackout caused a brief interruption in internet access.");
		 * HT[5].add_term("make sure", "phr.Ȯ���ϴ�",
		 * "Tech support makes sure that the network is functioning.");
		 * HT[5].add_term("matter", "n.����",
		 * "Please deal with personal matters outside the office.");
		 * HT[5].add_term("outstanding", "a.�����;(��ä ����)�̰�����",
		 * "an outstanding busuness plan\r\noutstanding debts");
		 * HT[5].add_term("privilege", "n.Ư��,Ư��",
		 * "Experienced staff may be offered management level privileges.");
		 * HT[5].add_term("promptly", "ad.���;������",
		 * "It is company policy to respond promptly to all inquiries.");
		 * HT[5].add_term("realistically", "ad.����������",
		 * "We cannot realistically expect to have the presentation ready on time.");
		 * HT[5].add_term("remainder", "n.������",
		 * "Audits will continue throughout the remainder of the month.",
		 * "Audits will continue throughout the remainder [   ] the month.",
		 * "of\r\nthroughout the remainder of + �Ⱓ"); HT[5].add_term("rush", "v.���θ���",
		 * "Crews rushed to finish construction ahead of schedule.");
		 * HT[5].add_term("sign out", "phr.�����Ͽ� ������ ����ϴ�",
		 * "All employees must sign out for all breaks.");
		 * HT[5].add_term("sophisticated", "a.(��谡)������,������;���õ�",
		 * "A sophisticated security system was installed.\r\nThe decorator exhibited a sophisticated taste in art."
		 * ); HT[5].add_term("speak", "v.�̾߱��ϴ�",
		 * "Mr.Brooke spoke to his clients about a new venture.",
		 * "Mr.Brooke spoke to his clients [   ] a new venture.",
		 * "about\r\nspeak to ��� about ���� : ~���� ~�� ���� �̾߱��ϴ�\r\nspeak + ��� : (��)���ϴ�\r\nspeak�� '~���� ���ϴ�'�� �ڵ���� ���� ���̸� �̶� ��� ��� �տ��� to�� ��� �Ѵ�. speak English����ó�� '(��)���ϴ�'�� Ÿ����ε� ���ȴ�.\r\ntell ��� that�� : ~���� ~�� �̾߱��ϴ�\r\ntell�� 4���� �����̸� �ڿ� ���������� that���� ���� ���·� ���� ���δ�.\r\nMr.Bennett told reporters that he would retire soon.\r\nsay (to ���)that�� : (~����)~�� �̾߱��ϴ�\r\nsay�� 3���� ����� that���� ������� ���� ���·� ���� ���δ�. ��� ��� �տ��� �� to�� ��� �Ѵ�.\r\nThe customer said to her that he was happy with the purchase."
		 * ); HT[5].add_term("take on", "phr.(����,����)���ô�",
		 * "BMI Construction Ltd.regularly takes on large-scale projects.");
		 * HT[5].add_term("timely", "a.�ñ�������,���� ����",
		 * "The report was completed in a timely manner.",
		 * "The report was completed [   ] a timely manner.",
		 * "in\r\nin a timely manner : �� ����"); HT[5].add_term("trigger", "v.�߱��ϴ�,�����ϴ�",
		 * "The reduction in breaks triggered employee complaints.");
		 * HT[5].add_term("violation", "n.����,����",
		 * "Violation of safety codes may result in dismissal.");
		 * 
		 * HT[6].add_term("abate", "v.���׷�����,��������,�����ϴ�",
		 * "The recent economic crisis will not abate soon.");
		 * HT[6].add_term("adversity", "n.����,�ҿ�",
		 * "The middle class faces the most adversity during depressions.");
		 * HT[6].add_term("ailing", "a.����,���ο��ϴ�",
		 * "An ailing economy has forced the unemployment rates to increase considerably."
		 * ); HT[6].add_term("assert", "v.�ܾ��ϴ�,�����ϴ�",
		 * "The report asserts that economic growth will continue.");
		 * HT[6].add_term("boost", "v.(��⸦)�ξ��ϴ�,��½�Ű��",
		 * "The real estate industry has helped boost the economy.");
		 * HT[6].add_term("brisk", "a.ȣȲ��,Ȱ����",
		 * "A brisk market is developing in online shopping.");
		 * HT[6].add_term("collapse", "n.�ر�",
		 * "To prevent an economic collapse, the president froze prices.");
		 * HT[6].add_term("commerce", "n.���,����",
		 * "The organization promotes international commerce.");
		 * HT[6].add_term("consequence", "n.���",
		 * "Profits grew as a consequence of increased business.");
		 * HT[6].add_term("depression", "n.��Ȳ",
		 * "The entire industry is going through an economic depression.");
		 * HT[6].add_term("deteriorate", "v.��ȭ�Ǵ�,��������",
		 * "Forecasters warned that the economy would deteriorate.");
		 * HT[6].add_term("dramatically", "ad.��������",
		 * "Interest rates climbed dramatically."); HT[6].add_term("dwindle",
		 * "v.�پ���,���ҵǴ�", "The company's economic fortunes dwindled in the 1990s.");
		 * HT[6].add_term("economical", "a.��������,����Ǵ�",
		 * "Companies are searching for economical ways to utilize energy.");
		 * HT[6].add_term("entail", "v.~�� �����ϴ�,~�� �����ϴ�",
		 * "Trade restrictions may entail economic costs."); HT[6].add_term("fairly",
		 * "ad.�����,��", "Concerns over the bankruptcy are fairly widespread.");
		 * HT[6].add_term("fall", "v.(��,��ġ��)�϶��ϴ�",
		 * "The rate of unemployment has fallen steadily this quarter.");
		 * HT[6].add_term("flourish", "v.��â�ϴ�,�����ϴ�",
		 * "The newly-merged firm is flourishing despite organizational weaknesses.");
		 * HT[6].add_term("impede", "v.�����ϴ�,�����ϴ�",
		 * "Natural calamities in the summer will impede national growth.");
		 * HT[6].add_term("implication", "n.����,������ ����",
		 * "The Supreme Court ruling has implications for small businesses.",
		 * "The Supreme Court ruling has implications [   ] small businesses.",
		 * "for\r\nhave implications for : ~�� ������ ��ġ��"); HT[6].add_term("indicator",
		 * "n.��ǥ,����", "Current economic indicators show admirable growth in mining.");
		 * HT[6].add_term("industrial", "a.�����", "an industrial exhibition");
		 * HT[6].add_term("lead", "v.�̲���,�����ϴ�;(� �����)�̸���",
		 * "She helped lead the company to success.\r\nGrowing oil markets will lead to economic improvement."
		 * , "Growing oil markets will lead [   ] economic improvement.",
		 * "to\r\nlead to : (� �����)�̸���"); HT[6].add_term("likely", "a.~�� �� ����",
		 * "The new CEO is likely to confront major challenges.",
		 * "The new CEO is likely [   ] confront major challenges.",
		 * "to\r\nbe likely to do : ~�� �� ����"); HT[6].add_term("overall", "a.��������,��ü����",
		 * "Overal profitability was impacted by the lagging economy.");
		 * HT[6].add_term("promising", "a.������,������ ����",
		 * "a promising global economic outlook"); HT[6].add_term("prospect", "n.����,����",
		 * "Weak industries are facing prospects of inflated interest rates.");
		 * HT[6].add_term("prosperity", "n.����",
		 * "Strong economic growth is a prerequisite for national prosperity.",
		 * "Industrial conflict seems to be more rampant in some countries in times [   ] prosperity."
		 * , "of\r\nin times of prosperity : �����⿡"); HT[6].add_term("rapidly",
		 * "ad.�޼���,����", "Energy demand increased rapidly."); HT[6].add_term("ratio",
		 * "n.����", "The bank calculated the debt ratio of the company.");
		 * HT[6].add_term("remain", "v.������ ~�� �����̴�;���� ~�ؾ� �ϴ�",
		 * "The cost of living should remain stable over the next decade.\r\nIt remains to be seen whether or not the tax cut will be passed."
		 * ); HT[6].add_term("skyrocket", "v.(���� ����)ġ�ڴ�",
		 * "Production costs are expected to skyrocket."); HT[6].add_term("slowdown",
		 * "n.��� ����", "Experts predict a gradual slowdown in the nation's economy.");
		 * HT[6].add_term("soar", "v.(���� ����)�����ϴ�,���� ġ�ڴ�",
		 * "Rates have soared due to inflation."); HT[6].add_term("stagnant",
		 * "a.ħü��,�Ұ����", "the stagnant steel industry"); HT[6].add_term("supplement",
		 * "v.�����ϴ�,�����ϴ�",
		 * "Increased export production will supplement weak domestic sales.");
		 * HT[6].add_term("thrive", "v.�����ϴ�,�����ϴ�",
		 * "The delivery service industry is thriving."); HT[6].add_term("unstable",
		 * "a.�Ҿ�����,���ϱ� ����", "Gas prices have been unstable in recent years.");
		 * HT[6].add_term("volatile", "a.(���� ����)���ϰ� �����ϴ�", "volatile stock markets");
		 * HT[6].add_term("wane", "n.����,����", "Consumer spending is on the wane.",
		 * "Consumer spending is [   ] the wane.",
		 * "on\r\non the wane : �����ϰ� �ִ�, ��������� �ִ�(=on the decline)");
		 * 
		 * HT[7].add_term("admission", "n.����",
		 * "Those wishing to visit the exhibit will be charged an extra admission fee."
		 * ); HT[7].add_term("advocate", "n.��ȣ��",
		 * "The writer is an advocate of public education.",
		 * "The writer is an advocate [   ] public education.",
		 * "of\r\nan advocate of : ~�� ��ȣ��"); HT[7].add_term("alumni", "n.��â����",
		 * "St.John's University alumni were invited to the graduation ceremony.");
		 * HT[7].add_term("anonymous", "a.�͸���,�̸��� �𸣴�",
		 * "The orphanage received $6,000 from an anonymous donor.");
		 * HT[7].add_term("appear", "v.��Ÿ����,�����ϴ�",
		 * "The novelist appeared at the bookstore to sign autographs.");
		 * HT[7].add_term("beneficial", "a.������,�̷ο�",
		 * "The organization's work is beneficial to the community.",
		 * "The organization's work is beneficial [   ] the community.",
		 * "to\r\nbe beneficial to : ~�� ������ �Ǵ�"); HT[7].add_term("care for",
		 * "phr.~�� ������", "He wondered whether he'd have time to care for a pet.");
		 * HT[7].add_term("celebrity", "n.���� �λ�,���",
		 * "Many celebrities attended the city's summer park festival.");
		 * HT[7].add_term("censorship", "n.�˿�",
		 * "The Actors Guild protested the censorship of politically controversial films."
		 * ); HT[7].add_term("collection", "n.������,����ǰ;����,¡��",
		 * "The museum has a unique collection of stamps.\r\nToll collection operates by means of an electronic system."
		 * , "We will collect money [   ] people, present company excepted.",
		 * " from\r\ncollect A from B : B�κ��� A�� �����ϴ�"); HT[7].add_term("come in + ����",
		 * "phr.~���� �Ի��ϴ�", "Amateur planist Andrew Ward came in third.");
		 * HT[7].add_term("contestant", "n.�����,������",
		 * "One of the contestants won an around-the-world ticket.");
		 * HT[7].add_term("contributor", "n.���,������",
		 * "The doctor is a regular contributor to the newspaper.",
		 * "The doctor is a regular contributor [   ] the newspaper.",
		 * "to\r\ncontributor to : ~�� ���� ���"); HT[7].add_term("current", "a.������",
		 * "Current subscribers to the magazine will receive a free supplement.");
		 * HT[7].add_term("defy", "v.�����ϴ�",
		 * "The documentary series defies conventional wisdom about fitness.\r\nThe play defied all description."
		 * ); HT[7].add_term("donation", "n.����,���",
		 * "The library is accepting donations of children's books.");
		 * HT[7].add_term("edition", "n.(���๰��)��",
		 * "A revised edition of ASU will be published soon.");
		 * HT[7].add_term("enlightening", "a.�������,����ħ�� �ִ�",
		 * "The editorial is enlightening."); HT[7].add_term("enthusiastically",
		 * "ad.����������", "The press enthusiastically applauded the persuasive speech.");
		 * HT[7].add_term("exhibition", "n.����ȸ",
		 * "The gallery hosted an exhibition of urban scenic photographs.");
		 * HT[7].add_term("fascinating", "a.��Ȥ����,ȲȦ��",
		 * "Many fascinating pieces of art were on display.",
		 * "Many [fascinate + ] pieces of art were on display.������ ����",
		 * "fascinating\r\nfascinating : ��Ȥ����\r\nfascinated : ��Ȥ��\r\nfascinating�� ����̳� �繰�� ��Ȥ���� ��, fascinated�� ����� ���𰡿� ��Ȥ�Ǿ��� �� ����Ѵ�. ȥ������ �ʵ��� ���̸� ����"
		 * ); HT[7].add_term("have yet to do", "phr.���� ~�ϰ� ���� �ʴ�,���� ~�ؾ� �ϴ�",
		 * "The performance schedule of the jazz festival has yet to be decided.");
		 * HT[7].add_term("improvise", "v.���� ���ָ� �ϴ�,�Ｎ���� �����",
		 * "The performers improvised a jazz melody."); HT[7].add_term("informative",
		 * "a.������,������ �ִ�", "The documentary was informative and interesting.");
		 * HT[7].add_term("issue", "n.(���ǹ���)�� ~ȣ;����,����",
		 * "the April issue of a magazine\r\nThere are many perspectives on the issue of global warming."
		 * ); HT[7].add_term("lend", "v.�����ִ�",
		 * "The library lends a variety of audio-visual materials.");
		 * HT[7].add_term("live", "a.(����,TV��)�������",
		 * "a live broadcast\r\nlive performance"); HT[7].add_term("local", "a.������,������",
		 * "The tournament will be held at the local high school.");
		 * HT[7].add_term("matinee", "n.(����,����ȸ ����)�� ����",
		 * "Tickets for the matinee cost a third of the price of a regular showing.");
		 * HT[7].add_term("memoirs", "n.ȸ���,�ڼ���",
		 * "The memoirs of the financial guru are already a hit.");
		 * HT[7].add_term("municipal", "a.����,������ġ��",
		 * "Municipal elections will be held in two weeks."); HT[7].add_term("must-see",
		 * "n.�� ���� �ϴ� ��", "The play showing at the downtown theater is a must-see.");
		 * HT[7].add_term("note", "v.�ָ��ϴ�",
		 * "Please note the intricate details of the architecture.");
		 * HT[7].add_term("out of print", "phr.���ǵǾ�",
		 * "The old editions are out of print."); HT[7].add_term("periodical",
		 * "n.���� ���๰", "The periodical highlights the most recent developments in IT.");
		 * HT[7].add_term("popular", "a.�α� �ִ�",
		 * "The outdoor movie screenings were very popular."); HT[7].add_term("present",
		 * "v.�����ϴ�a.������;������",
		 * "Please present valid tickets at the door.\r\nThe present owner of the resort intends to renovate it.\r\nYankees star Matt London was present at the game."
		 * , "She received the present [   ] glee.",
		 * "with\r\npresent A with B : A���� B�� �����ϴ�\r\npresent B to A : A���� B�� �����ϴ�\r\n��ġ�� with�ڿ��� �����ϴ� �繰, to �ڿ��� ����� �´�."
		 * ); HT[7].add_term("publication", "n.���๰,���ǹ�",
		 * "A new editorial section will be included in the publication.");
		 * HT[7].add_term("showing", "n.(��ȭ,������)��",
		 * "We attended the premiere showing of the Julie Garner movie.",
		 * "We attended the premiere showing [   ] the Julie Garner movie.",
		 * "of\r\nshowing of : ~�� ��"); HT[7].add_term("subscription", "n.(���� ���๰��)����",
		 * "I want to get a subscription to the Weekly Herald.");
		 * HT[7].add_term("transferable", "a.�絵�� �� �ִ�",
		 * "The ticket is not transferable."); HT[7].add_term("upcoming",
		 * "a.�ٰ�����,������ ��", "A reporter spoke to a candidate in the upcoming election.");
		 * HT[7].add_term("variety", "n.�پ缺,��ȭ",
		 * "The newsstand has a variety of magazines and newspapers.",
		 * "The newsstand has a variety [   ] magazines and newspapers.",
		 * "of\r\na (large/wide) variety of : (�ſ�)�پ���");
		 * 
		 * HT[8].add_term("affect", "v.~�� ������ ��ġ��,�Ҹ��ϰ� �ۿ��ϴ�",
		 * "The frozen food industry can affect the canned goods market.");
		 * HT[8].add_term("analysis", "n.�м�",
		 * "The latest market analysis shows an increase in used car purchases.");
		 * HT[8].add_term("claim", "n.(���,��������)����",
		 * "Macrochips denied claims of copying a competitor's design.");
		 * HT[8].add_term("closely", "ad.�����,������",
		 * "Marketing departments watch the latest trends closely.",
		 * "The cow didn't let people come close [   ] her offspring.",
		 * "to\r\ncome close to + ��� : ~�� ������, ~�� �����ϴ�"); HT[8].add_term("comparison",
		 * "n.��", "Online advertising is cheaper in comparison with television.",
		 * "Online advertising is cheaper in comparison [   ] television.",
		 * "with\r\nin comparison with : ~�� ���� ����"); HT[8].add_term("competition",
		 * "n.����", "Competition in the game software market has increased.",
		 * "They have to compete [   ] their parents' attention.",
		 * "for\r\ncompete for : ~�� �ΰ� �����ϴ�"); HT[8].add_term("consecutive", "a.��������",
		 * "The Barkley Company achieved high sales growth for the third consecutive year."
		 * ); HT[8].add_term("consistently", "ad.�׻�,�ϰ��ǰ�",
		 * "The factory has consistently provided the highest grade products.",
		 * "All of us in public life must be consistent [   ] the application of principle."
		 * , "in\r\nbe consistent in : ~�� �־� ���� �ϰ���"); HT[8].add_term("consolidate",
		 * "v.(�Ƿ�,���� ����)��ȭ�ϴ�",
		 * "Wyman's new products have consolidated its market position.");
		 * HT[8].add_term("contend", "v.(������)��ó�ϴ�,(�����)�ο��",
		 * "The managers met to contend with customer appeals.",
		 * "The managers met to contend [   ] customer appeals.",
		 * "with\r\ncontend with : ~�� ��ó�ϴ�"); HT[8].add_term("demand", "n.����,v.�䱸�ϴ�",
		 * "The company could not meet the increased demand for cell phones.\r\nMr.Hawkesby demanded that the clause be crossed out."
		 * , "The company could not meet the increased demand [   ] cell phones.",
		 * "for\r\ndemand for : ~�� ���� ����, �䱸\r\ndemand that + �־� (+should) + �������");
		 * HT[8].add_term("do one's utmost", "phr.������ ���ϴ�",
		 * "Sun Manufacturing does its utmost to ensure the quality of its products.");
		 * HT[8].add_term("effective", "a.ȿ������;(���� ����)��ȿ��",
		 * "an effective advertising campaign\r\nIncreased tax deductions will be effective as of June 1."
		 * ); HT[8].add_term("especially", "ad.Ư��",
		 * "Big car manufacturers are facing an especially difficult year for sales.");
		 * HT[8].add_term("examine", "v.�����ϴ�",
		 * "R&D will examine food consumption trends in foreign markets.");
		 * HT[8].add_term("expand", "v.������,Ȯ���ϴ�",
		 * "Brahe Optics has expanded its manufacturing division.");
		 * HT[8].add_term("expectation", "n.����,���",
		 * "The expectation is that costs will be cut.",
		 * "Someone who goes [   ] one��s expectations may be considered a hero.",
		 * "beyond\r\nabove/beyond + one's expectations : ��� �̻�����");
		 * HT[8].add_term("extremely", "ad.�ص���,�����",
		 * "Internet service providers struggle to survive in today's extremely competitive market."
		 * ); HT[8].add_term("focus", "v.���߽�Ű��,�����ϴ�",
		 * "Management decided to focus resources on expansion.",
		 * "Management decided to focus resources [   ] expansion.",
		 * "on\r\nfocus A on B : A�� B�� ���߽�Ű��"); HT[8].add_term("gap", "n.����",
		 * "a huge gap between exports and imports",
		 * "a huge gap between exports [   ] imports",
		 * "and\r\ngap between A and B : A�� B���� ����"); HT[8].add_term("gauge", "v.�����ϴ�",
		 * "The survey will gauge consumer reaction to utility price increases.");
		 * HT[8].add_term("impact", "n.���,����",
		 * "Price fluctuations had a major impact on the market.",
		 * "Price fluctuations had a major impact [   ] the market.",
		 * "on\r\nhave an impact on : ~�� ȿ���� ��ġ��, ������ �ִ�");
		 * HT[8].add_term("intervention", "n.����",
		 * "Government intervention in the market causes problems.");
		 * HT[8].add_term("jeopardize", "v.���·Ӱ� �ϴ�,���迡 ���߸���",
		 * "A bad marketing plan could jeopardize our reputation.");
		 * HT[8].add_term("modestly", "ad.����ϰ�",
		 * "Sunshine Media modestly accepted the Best Advertisement Award.");
		 * HT[8].add_term("momentum", "n.������,ź��",
		 * "The accessories market is gaining momentum."); HT[8].add_term("monopoly",
		 * "n.(��ǰ��)����,����",
		 * "Panatronic has a virtual monopoly on the manufacture of digital recorders.",
		 * "Panatronic has a virtual monopoly [   ] the manufacture of digital recorders."
		 * , "on\r\nhave a monopoly on : ~�� ���� �������� ������"); HT[8].add_term("mounting",
		 * "a.�����ϴ�,������",
		 * "There is mounting pressure from management to increase productivity.");
		 * HT[8].add_term("perception", "n.�ν�,����",
		 * "Public perception of the product affects sales.");
		 * HT[8].add_term("persistent", "a.���Ӿ���,��ӵǴ�",
		 * "Persistent trade problems in Asia have weakened the global economy.");
		 * HT[8].add_term("probable", "a.������,������ �ִ�",
		 * "A promotion campaign aimed at probable investors began last week.");
		 * HT[8].add_term("raise", "v.�ø���,���̴�;(�ǹ���)�����ϴ�",
		 * "We used mass mailing methods to raise awareness of our brand.\r\nThe president raised questions about the quality of the new product."
		 * ); HT[8].add_term("randomly", "ad.���Ƿ�,��������",
		 * "Participants for the study were chosen randomly from a list of volunteers."
		 * ); HT[8].add_term("reflective", "a.�ݿ��ϴ�",
		 * "Dwindling sales are reflective of the current state of the company.",
		 * "Dwindling sales are reflective [   ] the current state of the company.",
		 * "of\r\nbe reflective of : ~�� �ݿ��ϴ�"); HT[8].add_term("respondent", "n.������",
		 * "85% of survey respondents evaluated the product highly.");
		 * HT[8].add_term("seasonal", "a.������,��������",
		 * "The sugarcane industry is vulnerable to seasonal variations.");
		 * HT[8].add_term("segment", "n.�κ�,����",
		 * "Advertising needs to target a particular segment of the market.");
		 * HT[8].add_term("survey", "n.���� ����",
		 * "Product surveys help to improve quality."); HT[8].add_term("tool", "n.����",
		 * "Questionnaires are useful tools for product marketing.");
		 * 
		 * HT[9].add_term("adopt", "v.ä���ϴ�",
		 * "Plenty of research must be done before adopting a particular marketing strategy."
		 * ); HT[9].add_term("advantage", "n.����,����",
		 * "One advantage of consumer testing is the development of marketing insight.",
		 * "One advantage of consumer testing is the development [   ] marketing insight."
		 * , "of\r\ntake advantage of : ~�� �̿��ϴ�"); HT[9].add_term("advertisement",
		 * "n.����", "Sales have been propelled by the new advertisement.");
		 * HT[9].add_term("advise", "v.������ �ִ�,����ϴ�",
		 * "Coburn & Johnson Ltd. advises clients on intellectual property matters.",
		 * "Coburn & Johnson Ltd. advises clients [   ] intellectual property matters.",
		 * "on\r\nadvise A to do : A���� ~�϶�� �����ϴ�\r\nadvise A on B : A���� B�� ���� �����ϴ�");
		 * HT[9].add_term("agressively", "ad.����������",
		 * "The best company representatives aggressively seek out potential clients.");
		 * HT[9].add_term("aim", "v.~�� �ܴ���n.��ǥ,����",
		 * "Sport Apparel developed athletic gear aimed at teenagers.\r\nThe division head will outline the aims of the marketing strategy."
		 * , "Sport Apparel developed athletic gear aimed [   ] teenagers.",
		 * "at\r\naim to do : ~�� �����̴�\r\n��ǰ + aimed at : ~�� �ܳ��� ��ǰ");
		 * HT[9].add_term("attract", "v.����,�����ϴ�",
		 * "The automaker is making an effort to attract younger buyers.");
		 * HT[9].add_term("await", "v.��ٸ���",
		 * "Customers eagerly await the opening of the technology showroom.");
		 * HT[9].add_term("cater", "v.�䱸�� ����ִ�",
		 * "The brand now caters to the middle class.",
		 * "The brand now caters [   ] the middle class.",
		 * "to\r\ncater to : ~�� �䱸�� ������Ű��"); HT[9].add_term("confront", "v.~�� �����ϴ�",
		 * "Businesses must be resourceful when confronted with crises.");
		 * HT[9].add_term("consumer", "n.�Һ���",
		 * "The company is working to gain consumers' trust.");
		 * HT[9].add_term("creative", "a.â������,��â����",
		 * "He came up with a creative idea."); HT[9].add_term("customer", "n.��",
		 * "Telephone representatives should make the needs of customers their priority."
		 * ); HT[9].add_term("deliberate", "a.��������",
		 * "The remark was a deliberate attempt to harm the competition.");
		 * HT[9].add_term("diversify", "v.�پ�ȭ�ϴ�",
		 * "We can strengthen product appeal by diversifying packaging designs.");
		 * HT[9].add_term("effort", "n.���",
		 * "Advertisements were run in an effort to broaden consumer awareness of new brands."
		 * ,
		 * "Advertisements were run in an effort [   ] broaden consumer awareness of new brands."
		 * , "to\r\nin an effort to do : ~�غ����� �������\r\nmake an effort : ����ϴ�");
		 * HT[9].add_term("endorse", "v.(�����λ簡 ��ǰ��)���� �����ϴ�,�����ϴ�",
		 * "The product was endorsed by a famous actor."); HT[9].add_term("experiment",
		 * "v.�����ϴ�", "The marketing team experimented with new promotional techniques.",
		 * "The marketing team experimented [   ] new promotional techniques.",
		 * "with\r\nexperiment with : ~�� �����ϴ�"); HT[9].add_term("favorably",
		 * "ad.ȣ��������,�����Ӱ�",
		 * "The product demonstration was favorably received by consumers.\r\nEarnings continue to develop favorably."
		 * ); HT[9].add_term("feasible", "a.���� ������",
		 * "Management wanted to know whether it was feasible to increase production.");
		 * HT[9].add_term("fortify", "v.��ȭ�ϴ�,����ϴ�",
		 * "The TX-100 will fortify MacTech's position in the industry.");
		 * HT[9].add_term("forward", "ad.������",
		 * "Our company's research program has moved forward substantially.",
		 * "I look forward [   ] meeting you in two months time.",
		 * "to\r\nlook forward to -ing : -�� ����ϴ�"); HT[9].add_term("incentive",
		 * "n.����,�����",
		 * "Financial incentives such as coupons may encourage additional purchases.");
		 * HT[9].add_term("indicate", "v.��Ÿ����,�����ִ�",
		 * "Studies indicate that consmers prefer attractively packaged products.");
		 * HT[9].add_term("influence", "v.~�� ������ �ִ�n.����",
		 * "The status of the real estate market influences pricing of housing units.\r\nProduct reviews have a profound influence on sales."
		 * , "Product reviews have a profound influence [   ] sales.",
		 * "on\r\nhave an influence on : ~�� ������ ��ġ��"); HT[9].add_term("instantly",
		 * "ad.�ﰢ������,���", "The brand logo should be instantly recognizable.");
		 * HT[9].add_term("introduce", "v.(����ǰ��)�Ұ��ϴ�,��ǥ�ϴ�",
		 * "ElectroLife introduced a new line of vacuum cleaners.");
		 * HT[9].add_term("largely", "ad.�ֹ�,��κ�",
		 * "Public favor largely determines our success."); HT[9].add_term("less",
		 * "ad.���� ����,����",
		 * "Less competition among insurance companies led to higher premiums.");
		 * HT[9].add_term("majority", "n.��κ�,��ټ�",
		 * "The majority of registered clients pay their dues regularly.",
		 * "Most [   ] the advertising budget is spent on television commercials.",
		 * "of\r\nthe majority of~ : ~�� ��ټ���(majority �տ��� ������ the�� ����.\r\nmost of the ~ : ~�� ��ټ���(most�� ������� ����Ѵ�)"
		 * ); HT[9].add_term("marginal", "a.�ణ��",
		 * "Customers showed only marginal interest in the new product.");
		 * HT[9].add_term("mastermind", "n.(��ȹ ����)�Ծ���,������",
		 * "Mr.Dane is the mastermind behind the innovative design.",
		 * "Mr.Dane is the mastermind [   ] the innovative design.",
		 * "behind\r\nmastermind behind : ~�� ���� �Ծ���, ������"); HT[9].add_term("means",
		 * "n.���,����", "Direct surveys are one means of gatering consumer feedback.",
		 * "Guests will have to enter [   ] means of a phone buzzer system.",
		 * "by\r\nby means of : ~�� ���Ͽ�, ~����"); HT[9].add_term("necessarily", "ad.�ݵ��",
		 * "Increased production does not necessarily lead to greater revenues.");
		 * HT[9].add_term("need", "n.�ʿ�;�屸,�䱸v.~�� �ʿ䰡 �ִ�",
		 * "The company is in need of an untapped market.\r\nWe need to scrutinize each transaction for potential errors."
		 * , "We need [   ] scrutinize each transaction for potential errors.",
		 * "to\r\nneed to do : ~�� �ʿ䰡 �ִ�.\r\nneed�� �������̳� ���ǹ����� ������� ���� need not do ���¸� ���ϱ⵵ ������, ��κ��� ��� �Ϲݵ���� ���Ǹ� �̶��� to������� �Բ� ���ٴ� ���� �� ����� ����."
		 * ) ; HT[9].add_term("repeatedly", "ad.�ŵ�,��Ǯ���Ͽ�",
		 * "Customers have repeatedly requested the new product catalog.");
		 * HT[9].add_term("strategy", "n.����",
		 * "Management's strategy for expansion has been successful.");
		 * 
		 * HT[10].add_term("affordable", "a.(������)�˸���,������ �� �ִ�");
		 * HT[10].add_term("alter", "v.(����,������)��ġ��,�ٲٴ�"); HT[10].add_term("apparel",
		 * "n.�Ǻ�,�Ƿ�"); HT[10].add_term("apply", "v.(�����ϴ�;�����ϴ�"); HT[10].add_term("area",
		 * "n.����"); HT[10].add_term("auction", "n.���"); HT[10].add_term("authentic",
		 * "a.��¥��,��ǰ��"); HT[10].add_term("benefit", "n.����,����v.������ ����,������ ���");
		 * HT[10].add_term("carefully", "ad.���� ���,������"); HT[10].add_term("charge",
		 * "n.���,û���ݾ�;å��,�ǹ�v.~�� û���ϴ�;�ܻ����� �޾Ƴ���"); HT[10].add_term("delivery", "n.���");
		 * HT[10].add_term("description", "n.(��ǰ ����)����,�ؼ�"); HT[10].add_term("dilute",
		 * "v.���ϴ�"); HT[10].add_term("equivalent", "a.~�� ����ϴ�,�¸Դ�");
		 * HT[10].add_term("exactly", "ad.��Ȯ��"); HT[10].add_term("exclusively",
		 * "ad.����������,������"); HT[10].add_term("exquisite", "a.������,�����");
		 * HT[10].add_term("fit", "v.(ġ����)~�� �� �´�,~�� �����ϴ�");
		 * HT[10].add_term("installment", "n.�Һ�"); HT[10].add_term("lately", "ad.�ֱٿ�");
		 * HT[10].add_term("merchandise", "n.��ǰ"); HT[10].add_term("method", "n.���,����");
		 * HT[10].add_term("notice", "n.����"); HT[10].add_term("offer", "v.�����ϴ�n.����,����");
		 * HT[10].add_term("officially", "ad.����������"); HT[10].add_term("price", "n.����");
		 * HT[10].add_term("purchase", "v.�����ϴ�n.����"); HT[10].add_term("readily",
		 * "ad.���,�ս���"); HT[10].add_term("receipt", "n.������");
		 * HT[10].add_term("redeemable", "a.��ȯ�� �� �ִ�,��ã�� �� �ִ�");
		 * HT[10].add_term("refund", "n.ȯ��,ȯ�ұ�"); HT[10].add_term("relatively",
		 * "ad.���������"); HT[10].add_term("scent", "n.���,����"); HT[10].add_term("sturdy",
		 * "a.ưư��"); HT[10].add_term("tax", "n.����"); HT[10].add_term("thrifty",
		 * "a.�˼���,�˾��ϴ�"); HT[10].add_term("valid", "a.��ȿ��"); HT[10].add_term("value",
		 * "n.��ġ;����;(���� ġ�� ��ŭ��)�밡��"); HT[10].add_term("voucher", "n.(���� �����)��ǰ��,��ȯ��");
		 * HT[10].add_term("warranty", "n.(ǰ�� ����)����,������");
		 * 
		 * HT[11].add_term("assemble", "v.�����ϴ�"); HT[11].add_term("attribute",
		 * "v.(������)~�� ������,~�� �������� ������"); HT[11].add_term("automate", "v.�ڵ�ȭ�ϴ�");
		 * HT[11].add_term("capable", "a.~�� �� �� �ִ�,~�� �ɷ��� �ִ�");
		 * HT[11].add_term("capacity", "n.�����,�뷮"); HT[11].add_term("carelessly",
		 * "ad.�������ϰ�"); HT[11].add_term("chemical", "n.ȭ�� ��ǰ");
		 * HT[11].add_term("coming", "a.�ٰ�����"); HT[11].add_term("comparable",
		 * "a.�����ϴ�,�񱳵Ǵ�"); HT[11].add_term("damaged", "a.�ջ��,���ظ� ����");
		 * HT[11].add_term("device", "n.��ġ"); HT[11].add_term("discontinue", "v.�ߴ��ϴ�");
		 * HT[11].add_term("efficiency", "n.ȿ��,�ɷ�"); HT[11].add_term("equipment",
		 * "n.���,����"); HT[11].add_term("evidently", "ad.�и���,�����");
		 * HT[11].add_term("fabricate", "v.�����ϴ�"); HT[11].add_term("facility", "n.�ü�");
		 * HT[11].add_term("fill", "v.~�� ä���"); HT[11].add_term("finished", "a.�ϼ���");
		 * HT[11].add_term("halt", "n.�ߴ�,����"); HT[11].add_term("launch",
		 * "v.(����ǰ��)����ϴ�"); HT[11].add_term("material", "n.���,����");
		 * HT[11].add_term("operate", "v.(��� ����)�۵��ϴ�,�����̴�");
		 * HT[11].add_term("operational", "a.�۵��ϴ�,�۵� ������"); HT[11].add_term("place",
		 * "v.~�� �� ���¿� �δ�;(�ֹ���)�ϴ�"); HT[11].add_term("power", "n.����,����");
		 * HT[11].add_term("precaution", "n.���� ��ġ,����å"); HT[11].add_term("prevent",
		 * "v.~�� ����,~�� �����ϴ�"); HT[11].add_term("processing", "n.ó��,����");
		 * HT[11].add_term("procurement", "n.(�ʼ�ǰ��)����"); HT[11].add_term("produce",
		 * "v.�����ϴ�"); HT[11].add_term("properly", "ad.�����,��Ȯ�ϰ�");
		 * HT[11].add_term("protective", "a.��ȣ�ϴ�"); HT[11].add_term("quota",
		 * "n.�Ҵ緮,�Ҵ�"); HT[11].add_term("safety", "n.����"); HT[11].add_term("separately",
		 * "ad.����������,���ε���"); HT[11].add_term("specification", "n.����,����");
		 * HT[11].add_term("stage", "�ܰ�"); HT[11].add_term("tolerance", "n.����");
		 * HT[11].add_term("utilize", "v.�̿��ϴ�,Ȱ���ϴ�");
		 * 
		 * HT[12].add_term("absolute", "a.������,����������"); HT[12].add_term("accurate",
		 * "a.��Ȯ��"); HT[12].add_term("advance", "n.����,����"); HT[12].add_term("allow",
		 * "v.~�ϰ� �ϴ�,~�� ����ϴ�"); HT[12].add_term("appearance", "n.�ܰ�,�ܾ�");
		 * HT[12].add_term("bewildering", "a.��Ȥ�� �ϴ�"); HT[12].add_term("breakthrough",
		 * "n.(���� ����)����� ����"); HT[12].add_term("broaden", "v.������");
		 * HT[12].add_term("compatible", "a.ȣȯ����,�縳�� �� �ִ�");
		 * HT[12].add_term("complement", "v.�����ϴ�"); HT[12].add_term("concurrently",
		 * "ad.���ÿ�"); HT[12].add_term("control", "v.�����ϴ�,�����ϴ�");
		 * HT[12].add_term("corrosion", "n.�ν�"); HT[12].add_term("development",
		 * "n.����;����"); HT[12].add_term("devise", "v.����ϴ�,�߸��ϴ�");
		 * HT[12].add_term("disruption", "n.�ߴ�,ȥ��"); HT[12].add_term("durable",
		 * "a.������ �ִ�,ưư��"); HT[12].add_term("envision", "v.(�巡�� �� ����)����ϴ�,��ȹ�ϴ�");
		 * HT[12].add_term("feature", "n.Ư¡,Ư��"); HT[12].add_term("following",
		 * "prep.~�Ŀ�a.������,������ ����"); HT[12].add_term("grant",
		 * "v.(�����Ͽ� ��������)�ִ�,�����ϴ�n.������(������,���б� ��)"); HT[12].add_term("hold",
		 * "v.~�� ���,~�� �����ϴ�"); HT[12].add_term("improve", "v.�����ϴ�,����Ű��");
		 * HT[12].add_term("increasingly", "ad.����,���� ��"); HT[12].add_term("indication",
		 * "n.¡��,����"); HT[12].add_term("innovative", "a.��������");
		 * HT[12].add_term("inspect", "v.~�� �����ϴ�,�˻��ϴ�"); HT[12].add_term("inspiration",
		 * "n.����"); HT[12].add_term("interpretation", "n.�ؼ�,����");
		 * HT[12].add_term("manufacturer", "n.����ȸ��,��������"); HT[12].add_term("obsolete",
		 * "a.�ô뿡 �ڶ�����,������"); HT[12].add_term("patent", "n.Ư���,Ư��ǰ");
		 * HT[12].add_term("patronize", "v.~�� �ܰ�� ���,~�� �ŷ��ϴ�");
		 * HT[12].add_term("quality", "n.ǰ��,��"); HT[12].add_term("reliable",
		 * "a.���� ����,�ŷ��� �� �ִ�"); HT[12].add_term("research", "n.����,����");
		 * HT[12].add_term("revolutionary", "a.��������"); HT[12].add_term("sleek",
		 * "a.���õ�"); HT[12].add_term("state-of-the-art", "a.�ֽŽ���");
		 * HT[12].add_term("streamline", "v.(�� ����)�ɷ������� �ϴ�,�ո�ȭ�ϴ�");
		 * HT[12].add_term("sufficiently", "ad.�����"); HT[12].add_term("superior",
		 * "a.�����,�����"); HT[12].add_term("technical", "a.�������");
		 * HT[12].add_term("vulnerable", "a.�����");
		 * 
		 * HT[13].add_term("apologize", "v.����ϴ�"); HT[13].add_term("appropriately",
		 * "ad.�����ϰ�"); HT[13].add_term("argumentative", "a.��������,������ �����ϴ�");
		 * HT[13].add_term("blemish", "n.��,����"); HT[13].add_term("cause",
		 * "v.~�� �߱��ϴ�,~�� ������ �Ǵ�n.����"); HT[13].add_term("commitment", "n.���,����");
		 * HT[13].add_term("complaint", "n.����"); HT[13].add_term("complete",
		 * "v.�Ϸ��ϴ�,�ϼ��ϴ� a.�Ϸ��,�ϼ���"); HT[13].add_term("compliment", "n.Ī��");
		 * HT[13].add_term("confident", "a.�ڽ� �ִ�"); HT[13].add_term("courteous",
		 * "a.���� �ٸ�"); HT[13].add_term("critical", "a.��������"); HT[13].add_term("deal",
		 * "v.ó���ϴ�;�ŷ��ϴ�;�й��ϴ�, n.�ŷ�"); HT[13].add_term("defective", "a.������ �ִ�");
		 * HT[13].add_term("disclose", "v.�����ϴ�,�巯����"); HT[13].add_term("escort",
		 * "v.~�� �ٷ��� �ִ�,������Ʈ�ϴ�"); HT[13].add_term("evaluation", "n.��");
		 * HT[13].add_term("fix", "v.�����ϴ�"); HT[13].add_term("for free", "phr.�����");
		 * HT[13].add_term("further", "a.�� �̻���"); HT[13].add_term("genuine",
		 * "a.��¥��,��ǰ��"); HT[13].add_term("guarantee", "v.�����ϴ�, n.����");
		 * HT[13].add_term("hesitate", "v.�����ϴ�"); HT[13].add_term("inconvenience",
		 * "n.����"); HT[13].add_term("infuriate", "v.�ݺн�Ű��,ȭ���� �ϴ�");
		 * HT[13].add_term("inquire", "v.�����ϴ�"); HT[13].add_term("insert", "v.�����ϴ�");
		 * HT[13].add_term("mistakenly", "ad.�߸��ǰ�,Ʋ����"); HT[13].add_term("notification",
		 * "n.����"); HT[13].add_term("politely", "ad.���� �ٸ���"); HT[13].add_term("rebate",
		 * "v.ȯ���ϴ�,������Ʈ�ϴ�"); HT[13].add_term("replace", "v.~�� ��ü�ϴ�,��ü�ϴ�");
		 * HT[13].add_term("respond", "v.�����ϴ�"); HT[13].add_term("return",
		 * "v.��ȯ�ϴ�,�ݼ��ϴ�"); HT[13].add_term("satisfaction", "n.����");
		 * HT[13].add_term("seriously", "ad.�����ϰ�"); HT[13].add_term("specific",
		 * "a.��ü����,��Ȯ��"); HT[13].add_term("unwavering", "a.Ȯ����,�������� �ʴ�");
		 * 
		 * HT[14].add_term("accumulate", "v.�����ϴ�"); HT[14].add_term("allowance",
		 * "n.���ġ;����,Ư���� ���"); HT[14].add_term("approximately", "ad.�뷫");
		 * HT[14].add_term("attraction", "n.���� ���"); HT[14].add_term("away", "ad.��������");
		 * HT[14].add_term("baggage", "n.��ȭ��"); HT[14].add_term("beforehand",
		 * "ad.(������ ������)������,�̸�"); HT[14].add_term("board", "v.ž���ϴ�,n.�̻�ȸ");
		 * HT[14].add_term("brochure", "n.(ȫ����)��å��,��μ�"); HT[14].add_term("customs",
		 * "n.����"); HT[14].add_term("declare", "v.(��������)�Ű��ϴ�");
		 * HT[14].add_term("depart", "v.����ϴ�"); HT[14].add_term("destination", "n.������");
		 * HT[14].add_term("diverse", "a.�پ���"); HT[14].add_term("dramatic", "a.������,����");
		 * HT[14].add_term("duty", "n.����,����;�ǹ�"); HT[14].add_term("embassy", "n.����");
		 * HT[14].add_term("emergency", "n.������"); HT[14].add_term("exotic",
		 * "a.�̱�����,��Ȥ����"); HT[14].add_term("fill out/in", "phr.(������)���� �ִ�");
		 * HT[14].add_term("hospitality", "n.ȯ��,ģ��"); HT[14].add_term("indulge",
		 * "v.Ž���ϴ�,������"); HT[14].add_term("international", "a.��������");
		 * HT[14].add_term("itinerary", "n.���� ����"); HT[14].add_term("jet lag",
		 * "phr.������(����� ������ ���� �Ƿ�)"); HT[14].add_term("laundry", "n.��Ź��");
		 * HT[14].add_term("locate", "v.(~�� ��ġ��)ã�Ƴ���;~�� ��ġ��Ű��");
		 * HT[14].add_term("missing", "a.��� �Ҹ���,�����"); HT[14].add_term("overhead",
		 * "a.�Ӹ� ����"); HT[14].add_term("precisely", "ad.��Ȯ��");
		 * HT[14].add_term("prior to", "prep.~������"); HT[14].add_term("proximity",
		 * "n.�����,������"); HT[14].add_term("remittance", "n.�۱�");
		 * HT[14].add_term("round trip", "phr.�պ� ����"); HT[14].add_term("seating",
		 * "n.(������)�¼� ����;�¼� �迭"); HT[14].add_term("superb", "a.�پ,�ְ���");
		 * HT[14].add_term("swap", "v.�¹ٲٴ�,��ȯ�ϴ�"); HT[14].add_term("touch down",
		 * "phr.�����ϴ�"); HT[14].add_term("tour", "n.(����, �ü� ����)����,ª�� ����");
		 * HT[14].add_term("unavailable", "a.���� �� ����, �̿��� �� ����");
		 * HT[14].add_term("unique", "a.��Ư��"); HT[14].add_term("unlimited", "a.��������");
		 * 
		 * HT[15].add_term("agreement", "n.���,����;����"); HT[15].add_term("alliance",
		 * "n.����,����"); HT[15].add_term("annotated", "a.(å ����)�ּ��� �޸�");
		 * HT[15].add_term("annulment", "n.��ȿȭ,���"); HT[15].add_term("arbitration",
		 * "n.����"); HT[15].add_term("bid", "n.����"); HT[15].add_term("challenging",
		 * "a.��������,����"); HT[15].add_term("collaborate", "v.�������� ���ϴ�,�����ϴ�");
		 * HT[15].add_term("compromise", "n.Ÿ��,ȭ��"); HT[15].add_term("contract",
		 * "n.��� v.����ϴ�;�����ϴ�"); HT[15].add_term("cooperatively", "ad.�����Ͽ�,����������");
		 * HT[15].add_term("deadlock", "n.���� ����"); HT[15].add_term("dispute",
		 * "n.����,����"); HT[15].add_term("embark", "v.�����ϴ�,������");
		 * HT[15].add_term("expire", "v.(��� ����)���Ⱑ �Ǵ�"); HT[15].add_term("foundation",
		 * "n.���,����"); HT[15].add_term("impartially", "ad.��������ϰ�,ġ��ġ�� �ʰ�");
		 * HT[15].add_term("imperative", "a.�ݵ�� �ؾ� �ϴ�,�ʼ�����");
		 * HT[15].add_term("impression", "n.�λ�"); HT[15].add_term("initially",
		 * "ad.ó����, �ʱ⿡"); HT[15].add_term("mediation", "n.����,����");
		 * HT[15].add_term("moderator", "n.(��� ����)��ȸ��, ������"); HT[15].add_term("modify",
		 * "v.�Ϻ� �����ϴ�,�����ϴ�"); HT[15].add_term("narrow", "v.(���� ����)������");
		 * HT[15].add_term("negotiation", "n.����,����"); HT[15].add_term("opposing",
		 * "a.�븳�ϴ�,�ݴ��ϴ�"); HT[15].add_term("originally", "ad.����,ó������");
		 * HT[15].add_term("preamble", "n.����,����"); HT[15].add_term("proceed",
		 * "v.(����)��������,��ô�Ǵ�"); HT[15].add_term("proposal", "n.��ȹ,��");
		 * HT[15].add_term("provision", "n.(������)����"); HT[15].add_term("renew",
		 * "v.(��� ����)�����ϴ�"); HT[15].add_term("review", "v.�����ϴ�,�������ϴ�");
		 * HT[15].add_term("rigid", "a.������,�ϰ���"); HT[15].add_term("settle",
		 * "v.�ذ��ϴ�,ó���ϴ�"); HT[15].add_term("solicit", "v.��û�ϴ�,��û�ϴ�");
		 * HT[15].add_term("stipulation", "n.��� ����"); HT[15].add_term("surely",
		 * "ad.Ʋ������,��"); HT[15].add_term("term", "n.����;�ӱ�,����");
		 * HT[15].add_term("terminate", "v.������, �����Ű��");
		 * 
		 * HT[16].add_term("acclaim", "n.����,ȣ��"); HT[16].add_term("antitrust",
		 * "a.���� ������"); HT[16].add_term("assure", "v.~���� �����ϴ�,~�� �Ƚɽ�Ű��");
		 * HT[16].add_term("at the latest", "phr.�ʾ"); HT[16].add_term("attain",
		 * "v.(��ǥ��)�޼��ϴ�"); HT[16].add_term("bulk", "a.�뷮��");
		 * HT[16].add_term("capitalize on", "phr.~�� �̿��ϴ�,��ȸ�� ���");
		 * HT[16].add_term("commodity", "n.��ǰ,�깰"); HT[16].add_term("completely",
		 * "ad.��������,������"); HT[16].add_term("confirmation", "n.Ȯ��,Ȯ��");
		 * HT[16].add_term("consignment", "n.��Ź �Ǹ�"); HT[16].add_term("contact",
		 * "~�� ������ ���ϴ�, n.(����� ��������)�����ϰ� �ִ� ���"); HT[16].add_term("cultivation",
		 * "n.��ȣ ����,�缺"); HT[16].add_term("dealer", "n.�Ǹž���,����");
		 * HT[16].add_term("depot", "n.â��,�����"); HT[16].add_term("diminish", "v.�����ϴ�");
		 * HT[16].add_term("distribute", "v.�����ϴ�,����ϴ�"); HT[16].add_term("diversified",
		 * "a.�پ�ȭ,���� ������"); HT[16].add_term("do business with", "phr.~�� �ŷ��ϴ�");
		 * HT[16].add_term("encompass", "v.�����ϴ�,�ѷ��δ�"); HT[16].add_term("engrave",
		 * "v.(����, ���� ����)~�� �����"); HT[16].add_term("enviable", "a.�η����� ����, ������");
		 * HT[16].add_term("inevitable", "a.�Ұ�����"); HT[16].add_term("inventory",
		 * "n.���ǰ, �����"); HT[16].add_term("invoice", "n.����,�κ��̽�");
		 * HT[16].add_term("keep track of", "phr.~�� ��� �˰� �ִ�,~�� ���� ���Ӿ��� ������ ����");
		 * HT[16].add_term("order", "v.�ֹ��ϴ�"); HT[16].add_term("provide",
		 * "v.�����ϴ�,�����ϴ�"); HT[16].add_term("quota", "n.������"); HT[16].add_term("refuse",
		 * "v.�����ϴ�"); HT[16].add_term("represent", "v.~�� ��ǥ�ϴ�");
		 * HT[16].add_term("retail", "n.�Ҹ�"); HT[16].add_term("satisfactory",
		 * "a.����������"); HT[16].add_term("selection", "n.���õ� ��,����ǰ");
		 * HT[16].add_term("short", "a.������"); HT[16].add_term("shortly",
		 * "ad.��, �� �� �־�"); HT[16].add_term("stock", "n.���;�ֽ�");
		 * HT[16].add_term("subject", "a.~�� ������ �ޱ� ����;(���� ����)�������� �ϴ� v.~���� (~��) �ް� �ϴ�");
		 * HT[16].add_term("supply", "v.�����ϴ� n.����;(-s)��ǰ, �Ҹ�ǰ");
		 * HT[16].add_term("temporarily", "ad.�Ͻ�������"); HT[16].add_term("unable",
		 * "a.~�� �� ����");
		 * 
		 * 
		 * HT[17].add_term("accelerate", "v.�����ϴ�,����ȭ�ϴ�"); HT[17].add_term("acknowledge",
		 * "v.�����ϴ�;(���� ����)������ �˸���"); HT[17].add_term("address",
		 * "n.�ּ� v.(����� ���� ����)�ٷ��,ó���ϴ�"); HT[17].add_term("adequately", "ad.������");
		 * HT[17].add_term("affix", "v.(��ǥ ����)���̴�"); HT[17].add_term("attach",
		 * "v.���̴�,�����ϴ�"); HT[17].add_term("bilateral", "a.�ֹ���");
		 * HT[17].add_term("by hand", "phr.��������,������"); HT[17].add_term("carton",
		 * "n.(ū)���� ����"); HT[17].add_term("caution", "n.����,����");
		 * HT[17].add_term("convenlence", "n.����,��"); HT[17].add_term("correspondence",
		 * "n.����,��Ź�"); HT[17].add_term("courier", "n.�޼� �ù�");
		 * HT[17].add_term("deliver", "v.����ϴ�;(������)�ϴ�"); HT[17].add_term("detach",
		 * "v.����"); HT[17].add_term("efficient", "a.(���,��� ����)�ɷ�����,ȿ������");
		 * HT[17].add_term("embargo", "n.(Ư�� ��ǰ��)���� ����,��� ����"); HT[17].add_term("enact",
		 * "v.�����ϴ�"); HT[17].add_term("enclose", "v.~�� �����ϴ�;~�� �����δ�");
		 * HT[17].add_term("ensure", "v.�����ϴ�,Ȯ���ϰ� �ϴ�"); HT[17].add_term("envelope",
		 * "n.����"); HT[17].add_term("expedite", "v.�ż��� ó���ϴ�,��ô��Ű��");
		 * HT[17].add_term("fragile", "a.������ ����"); HT[17].add_term("handle",
		 * "v.�ٷ��,����ϴ�"); HT[17].add_term("impose", "v.(���� ����)�ΰ��ϴ�");
		 * HT[17].add_term("inaugurate", "v.�������� ~�� �����ϴ�"); HT[17].add_term("incorrect",
		 * "a.����Ȯ��"); HT[17].add_term("oblige", "v.~���� �����ϴ�,�� �� ���� ~�ϰ� �ϴ�");
		 * HT[17].add_term("particularly", "ad.Ư��"); HT[17].add_term("perishable",
		 * "a.�����ϱ� ����"); HT[17].add_term("postage", "n.���� ���");
		 * HT[17].add_term("recipient", "n.������"); HT[17].add_term("reciprocal",
		 * "a.��ȣ��,������"); HT[17].add_term("remarkable", "a.������,�ε巯��");
		 * HT[17].add_term("retaliation", "n.����"); HT[17].add_term("shipment",
		 * "n.����,(ȭ����)�߼�;Ź��ȭ��"); HT[17].add_term("step", "n.�ܰ�;��ġ,����");
		 * HT[17].add_term("surplus", "n.�׿�,����");
		 * 
		 * HT[18].add_term("accommodate", "v.(�ǹ� ����)~�� �����ϴ�,���ڽ�Ű��");
		 * HT[18].add_term("agreeably", "ad.�����ϰ�,��� ����"); HT[18].add_term("ahead",
		 * "ad.�̸�,�ռ���"); HT[18].add_term("amenity", "n.���� �ü�");
		 * HT[18].add_term("assorted", "a.���� ���� ������,��ä�ο�");
		 * HT[18].add_term("atmosphere", "n.������,ȯ��"); HT[18].add_term("available",
		 * "a.(�繰��)�̿� ������;(�����)�ð��� �ִ�"); HT[18].add_term("belongings", "n.����ǰ,������");
		 * HT[18].add_term("check in", "phr.üũ���ϴ�,���ڼ����� �ϴ�"); HT[18].add_term("chef",
		 * "n.�ֹ���"); HT[18].add_term("choice", "n.���ù�,���û���,����");
		 * HT[18].add_term("compensate", "v.~���� �����ϴ�"); HT[18].add_term("complication",
		 * "n.������ ����"); HT[18].add_term("complimentary", "a.������,�����");
		 * HT[18].add_term("confirm", "v.Ȯ���ϴ�"); HT[18].add_term("connoisseur",
		 * "n.������,���İ�"); HT[18].add_term("container", "n.�׸�,���");
		 * HT[18].add_term("conveniently", "ad.���ϰ�"); HT[18].add_term("cuisine",
		 * "n.(��Ư��)�丮"); HT[18].add_term("dignitary", "n.���� ����");
		 * HT[18].add_term("elegant", "a.�����,�����"); HT[18].add_term("entirely",
		 * "ad.������"); HT[18].add_term("extensive", "a.��������,����");
		 * HT[18].add_term("flavor", "n.��,ǳ��"); HT[18].add_term("forfeit",
		 * "v.(���μ� �Ǹ�,��� ����)�Ҵ�,�������ϴ�"); HT[18].add_term("freshness", "n.�ż���");
		 * HT[18].add_term("indigenous", "a.���� ������,������"); HT[18].add_term("make",
		 * "v.~�� �ϴ�,~�� �����"); HT[18].add_term("occupancy", "n.(ȣ�� ����)�̿��");
		 * HT[18].add_term("polish", "v.~�� �۴�,~�� ���� ����"); HT[18].add_term("rate",
		 * "n.���"); HT[18].add_term("reception", "n.ȯ��ȸ;(ȣ����)����ó");
		 * HT[18].add_term("recipe", "n.�丮��,������"); HT[18].add_term("reservation",
		 * "n.����"); HT[18].add_term("retain", "v.�����ϴ�,�����ϴ�"); HT[18].add_term("stir",
		 * "v.������,�ڼ���"); HT[18].add_term("taste", "v.~�� ���� ����,�ý��ϴ�");
		 * HT[18].add_term("utensil", "n.(�ξ����� ����)����,�ⱸ");
		 * 
		 * HT[19].add_term("anticipate", "v.����ϴ�,�����ϴ�"); HT[19].add_term("decline",
		 * "n.����,�϶� v.(�ʴ�,��û��)�����ϴ�"); HT[19].add_term("decrease", "v.�����ϴ�");
		 * HT[19].add_term("demoralize", "v.~�� ��⸦ ����"); HT[19].add_term("depend",
		 * "v.~�� ���� �����Ǵ�,~�� �޷� �ִ�"); HT[19].add_term("deviate", "v.��������, ��Ż�ϴ�");
		 * HT[19].add_term("disappointing", "a.�Ǹ�������, �Ǹ���Ű��");
		 * HT[19].add_term("encouraging", "a.��⸦ �ϵ����ִ�"); HT[19].add_term("exceed",
		 * "v.~�� �ʰ��ϴ�"); HT[19].add_term("factor", "n.���, ����");
		 * HT[19].add_term("figure", "n.�հ� ��, �Ѿ�"); HT[19].add_term("growth",
		 * "n.����, ����"); HT[19].add_term("illustrate", "v.�����ϴ�, �����ϴ�");
		 * HT[19].add_term("impressive", "a.������, �λ�����"); HT[19].add_term("inaccurate",
		 * "a.����Ȯ��"); HT[19].add_term("increase", "n.���� v.�����ϴ�");
		 * HT[19].add_term("incur", "v.(�ս���)�Դ�, (����)����"); HT[19].add_term("indicative",
		 * "a.��Ÿ����, �Ͻ��ϴ�"); HT[19].add_term("infusion", "n.����, ȥ��");
		 * HT[19].add_term("make up for", "phr.~�� ��ȸ�ϴ�, �����ϴ�");
		 * HT[19].add_term("markedly", "ad.�����ϰ�, ���� ���"); HT[19].add_term("meagerly",
		 * "ad.����ϰ�, ������ϰ�"); HT[19].add_term("minimally", "ad.���� �۰�, �ּ�������");
		 * HT[19].add_term("offset", "v.����ϴ�, �����ϴ�"); HT[19].add_term("percentage",
		 * "n.�����"); HT[19].add_term("production", "n.����, ���귮");
		 * HT[19].add_term("profit", "n.����, ����"); HT[19].add_term("projection",
		 * "n.����, ����ġ"); HT[19].add_term("proportion", "n.�κ�, ��");
		 * HT[19].add_term("recent", "a.�ֱ���"); HT[19].add_term("reduce",
		 * "v.���̴�, ���ҽ�Ű��"); HT[19].add_term("regular", "a.��������; �ܰ���");
		 * HT[19].add_term("representative", "n.�Ǹ� �븮��, �������; ��ǥ��");
		 * HT[19].add_term("revenue", "n.����"); HT[19].add_term("sale",
		 * "n.(-s)�����, �Ż��; ��� ���� �Ǹ�"); HT[19].add_term("significantly",
		 * "ad.�����, �ε巯����"); HT[19].add_term("slightly", "ad.�ణ");
		 * HT[19].add_term("substantial", "a.�����"); HT[19].add_term("summarize",
		 * "v.����ϴ�"); HT[19].add_term("tend", "v.~�ϴ� ������ �ִ�, ~�ϱ� ����");
		 * HT[19].add_term("unusually", "ad.������, ������������");
		 * 
		 * HT[20].add_term("accountant", "n.ȸ���"); HT[20].add_term("accurately",
		 * "ad.��Ȯ�ϰ�"); HT[20].add_term("allocate", "v.�Ҵ��ϴ�, ����ϴ�");
		 * HT[20].add_term("amend", "v.�����ϴ�"); HT[20].add_term("audit", "n.ȸ�� ����, �ɻ�");
		 * HT[20].add_term("barely", "ad.�����, ���� ~���� �ʴ�"); HT[20].add_term("budget",
		 * "n.����"); HT[20].add_term("calculate", "v.����ϴ�"); HT[20].add_term("committee",
		 * "n.����ȸ"); HT[20].add_term("compare", "v.���ϴ�"); HT[20].add_term("curtail",
		 * "v.~�� ���̴�, �谨�ϴ�"); HT[20].add_term("deduct", "v.�����ϴ�, ����");
		 * HT[20].add_term("deficient", "a.������, �������"); HT[20].add_term("deficit",
		 * "n.����, ������"); HT[20].add_term("discrepancy", "n.����ġ, ����");
		 * HT[20].add_term("excess", "n.�ʰ�, �ʰ���"); HT[20].add_term("exempt",
		 * "a.������, ~�� ����"); HT[20].add_term("expenditure", "n.����, ���");
		 * HT[20].add_term("financial", "a.������, ��������"); HT[20].add_term("fiscal",
		 * "a.ȸ����, ��������"); HT[20].add_term("fund", "n.�ڱ� v.�ڱ��� �����ϴ�");
		 * HT[20].add_term("generate", "v.â���ϴ�, �߱��ϴ�"); HT[20].add_term("in the red",
		 * "phr.���� ������"); HT[20].add_term("incidental", "a.�μ�����");
		 * HT[20].add_term("inconsistency", "n.����ġ"); HT[20].add_term("inflation",
		 * "n.���÷��̼�, �������, ��ȭ��â"); HT[20].add_term("ledger", "n.ȸ�� ���");
		 * HT[20].add_term("liable", "a.å������ ��; ~�ϱ� ����"); HT[20].add_term("liability",
		 * "n.å��; (-ties)��ä, ä��"); HT[20].add_term("monetary", "a.������, ��������");
		 * HT[20].add_term("outlay", "n.����, ���"); HT[20].add_term("overcome", "v.�غ��ϴ�");
		 * HT[20].add_term("preferred", "a.�켱��, ��ȣ�Ǵ�"); HT[20].add_term("recently",
		 * "ad.�ֱٿ�"); HT[20].add_term("reimburse", "v.�����ϴ�, ��ȯ�ϴ�");
		 * HT[20].add_term("rigorously", "ad.������"); HT[20].add_term("spend",
		 * "v.~�� ����, �Һ��ϴ�"); HT[20].add_term("stringently", "ad.������, �����ϰ�");
		 * HT[20].add_term("substantially", "ad.ũ��, �����"); HT[20].add_term("total",
		 * "a.�Ѱ���, ������"); HT[20].add_term("turnover", "n.�� �Ż��, �ŷ���; ������");
		 * HT[20].add_term("worth", "a.~�� ��ġ�� �ִ� n.��ġ, (��)��ġ");
		 * 
		 * HT[21].add_term("accept", "v.�����ϴ�, �³��ϴ�"); HT[21].add_term("acquire",
		 * "v.�����ϴ�, ����ϴ�"); HT[21].add_term("active", "a.��������, Ȱ����");
		 * HT[21].add_term("allegedly", "ad.�����ϴ� �ٿ� ������"); HT[21].add_term("announce",
		 * "v.��ǥ�ϴ�"); HT[21].add_term("asset", "n.�ڻ�"); HT[21].add_term("authority",
		 * "n.����; �籹, ����"); HT[21].add_term("clout", "n.�����");
		 * HT[21].add_term("considerable", "a.(������ ����)�����");
		 * HT[21].add_term("contingent", "a.~�� ���� �����Ǵ�, ~���Ͽ� �޸�");
		 * HT[21].add_term("contribute", "v.�⿩�ϴ�, �����ϴ�"); HT[21].add_term("dedicated",
		 * "a.(��ǥ �)�Ͻ��� ��ģ, �������"); HT[21].add_term("emerge", "v.�ΰ��ϴ�, ��Ÿ����");
		 * HT[21].add_term("enhance", "v.(�� ����)���̴�, ��ȭ�ϴ�"); HT[21].add_term("establish",
		 * "v.�����ϴ�"); HT[21].add_term("established", "a.Ȯ����, ������ �ִ�");
		 * HT[21].add_term("expansion", "n.Ȯ��, ��â"); HT[21].add_term("force", "n.����");
		 * HT[21].add_term("foresee", "v.�����ϴ�, �����ϴ�"); HT[21].add_term("go through",
		 * "phr.(��, ������)�޴�"); HT[21].add_term("independent", "a.������, ��������");
		 * HT[21].add_term("informed", "a.������ �ٰ���"); HT[21].add_term("initiate",
		 * "v.(��� ����)�����ϴ�, �����ϴ�"); HT[21].add_term("interested", "a.���� �ִ�; ������ �ִ�");
		 * HT[21].add_term("liquidate", "v.(ȸ�縦)�����ϴ�, �ػ��ϴ�"); HT[21].add_term("merge",
		 * "v.�պ��ϴ�, �����ϴ�"); HT[21].add_term("premier", "a.������, ù°��");
		 * HT[21].add_term("productivity", "n.���꼺"); HT[21].add_term("progressive",
		 * "a.��������"); HT[21].add_term("relocate", "v.(���� ����)�����ϴ�");
		 * HT[21].add_term("reveal", "v.������, �����ϴ�"); HT[21].add_term("run",
		 * "v.~�� �濵�ϴ�"); HT[21].add_term("simultaneously", "ad.���ÿ�");
		 * HT[21].add_term("stance", "n.�µ�, ����"); HT[21].add_term("strategic",
		 * "a.��������"); HT[21].add_term("strike", "n.���� �ľ�, �뵿 ����");
		 * HT[21].add_term("struggle", "v.�־���, �����ϴ�"); HT[21].add_term("subsidize",
		 * "v.~�� �������� �����ϴ�"); HT[21].add_term("surpass", "v.~�� �ɰ��ϴ�, �Ѿ��");
		 * HT[21].add_term("takeover", "n.�μ�"); HT[21].add_term("uncertain",
		 * "a.Ȯ���� ����, ��Ȯ����"); HT[21].add_term("waive", "v.(�Ǹ�, û�� ����)�����ϴ�");
		 * 
		 * HT[22].add_term("aid", "n.����"); HT[22].add_term("chance", "n.���ɼ�");
		 * HT[22].add_term("clear", "���� ��"); HT[22].add_term("conserve",
		 * "v.�����ϴ�, �����ϴ�"); HT[22].add_term("contaminate", "v.������Ű��");
		 * HT[22].add_term("continually", "ad.����ؼ�"); HT[22].add_term("damage",
		 * "n.����, ���� v.(���ǿ�)���ظ� ������"); HT[22].add_term("deciduous", "a.��������");
		 * HT[22].add_term("deplete", "v.����Ű��"); HT[22].add_term("disaster", "n.�糭");
		 * HT[22].add_term("discharge", "v.�����ϴ�"); HT[22].add_term("dispose",
		 * "v.ó���ϴ�, ó���ϴ�"); HT[22].add_term("drought", "n.����");
		 * HT[22].add_term("ecology", "n.�ڿ� ȯ��, ����"); HT[22].add_term("emission",
		 * "n.����, ���Ⱑ��"); HT[22].add_term("endangered", "a.���� ���⿡ ó��");
		 * HT[22].add_term("environmental", "a.ȯ������"); HT[22].add_term("extinction",
		 * "n.����"); HT[22].add_term("flood", "n.ȫ��"); HT[22].add_term("forecast",
		 * "n.(������)����"); HT[22].add_term("fumes", "n.����, ����");
		 * HT[22].add_term("habitat", "n.(��, �Ĺ���)������"); HT[22].add_term("ideal",
		 * "a.�̻�����"); HT[22].add_term("inclement", "a.(������)����, Ȥ����");
		 * HT[22].add_term("inflict", "v.(����, ����)�� ���ϴ�, ������");
		 * HT[22].add_term("meteorological", "a.�����, ����л���");
		 * HT[22].add_term("migration", "n.�̵�, ����"); HT[22].add_term("mining",
		 * "n.ä��, ä��"); HT[22].add_term("occur", "v.(����)�߻��ϴ�, �����");
		 * HT[22].add_term("organization", "n.��ü"); HT[22].add_term("pollutant",
		 * "n.���� ����"); HT[22].add_term("precipitation", "n.������, ���췮");
		 * HT[22].add_term("prominent", "a.������, �ε巯��"); HT[22].add_term("purify",
		 * "v.��ȭ��Ű��"); HT[22].add_term("recycling", "n.��Ȱ��");
		 * HT[22].add_term("resource", "n.�ڿ�"); HT[22].add_term("sewage", "n.�ϼ�, ����");
		 * HT[22].add_term("shower", "n.�ҳ���"); HT[22].add_term("solution", "n.�ذ�å");
		 * HT[22].add_term("southern", "a.������"); HT[22].add_term("vague", "a.��ȣ��, �ָ���");
		 * HT[22].add_term("waste", "n.������");
		 * 
		 * HT[23].add_term("account", "n.���; ���� v.(~�� ������)������, �����ϴ�;(~�� ������)�����ϴ�");
		 * HT[23].add_term("accrue", "v.�����ϴ�, ������"); HT[23].add_term("amount",
		 * "n.�׼�, ��"); HT[23].add_term("balance", "n.���� �ܾ�, �ܰ�");
		 * HT[23].add_term("belatedly", "ad.�ڴʰ�"); HT[23].add_term("bill",
		 * "v.~���� û������ ������ n.û����, ��꼭"); HT[23].add_term("bounce",
		 * "v.(��ǥ ����)�ε��� �� �ǵ��ƿ���"); HT[23].add_term("cash", "�������� �ٲٴ�");
		 * HT[23].add_term("collateral", "n.�㺸, ���繰"); HT[23].add_term("confiscate",
		 * "v.�м��ϴ�, �����ϴ�"); HT[23].add_term("convert", "v.��ȯ�ϴ�, ��ȯ�ϴ�");
		 * HT[23].add_term("counterfeit", "n.��¥, ����ǰ"); HT[23].add_term("curb",
		 * "v.�����ϴ�"); HT[23].add_term("delinquent", "a.(���� ����)��ü��, �̺���");
		 * HT[23].add_term("deposit", "v.�Ա��ϴ�, �����ϴ�"); HT[23].add_term("deterrent",
		 * "n.���ع�, ������"); HT[23].add_term("document", "n.����, ���� v.����ϴ�, ������ �ۼ��ϴ�");
		 * HT[23].add_term("due", "a.���Ⱑ ��, ���ұ����� ��; (���� ����)~���� ������ ���޵Ǿ�� ��");
		 * HT[23].add_term("expect", "v.�����ϴ�, ����ϴ�"); HT[23].add_term("heavily",
		 * "ad.����, ���ϰ�"); HT[23].add_term("identification", "n.�ź� ����");
		 * HT[23].add_term("in common", "phr.��������, ��������"); HT[23].add_term("interest",
		 * "n.����; ����; ����"); HT[23].add_term("investigation", "n.����");
		 * HT[23].add_term("loan", "n.���, ��α�"); HT[23].add_term("lower",
		 * "v.(��, ������)���̴�"); HT[23].add_term("mortgage", "n.���� ����, ���� ���ڱ�");
		 * HT[23].add_term("overdue", "a.�̳���, ���ұ����� ����"); HT[23].add_term("owe",
		 * "v.������ �ִ�"); HT[23].add_term("owing to", "phr.~�� ���Ͽ�");
		 * HT[23].add_term("payable", "a.�����ؾ� �ϴ�"); HT[23].add_term("personal",
		 * "a.������"); HT[23].add_term("previously", "ad.������");
		 * HT[23].add_term("regrettably", "ad.���������Ե�"); HT[23].add_term("relation",
		 * "n.����"); HT[23].add_term("scrutinize", "v.������ �����ϴ�");
		 * HT[23].add_term("statement", "n.����, ����"); HT[23].add_term("study", "n.����");
		 * HT[23].add_term("sustain", "v.�����ϴ�"); HT[23].add_term("transaction",
		 * "n.�ŷ�, ����"); HT[23].add_term("turn down", "phr.�����ϴ�");
		 * HT[23].add_term("unexpected", "a.����ġ ����"); HT[23].add_term("withdrawal",
		 * "n.(������)����");
		 * 
		 * HT[24].add_term("bond", "n.ä��"); HT[24].add_term("cautiously", "ad.���ɽ�����");
		 * HT[24].add_term("confusion", "n.ȥ��"); HT[24].add_term("consent", "n.����");
		 * HT[24].add_term("consider", "v.����ϴ�"); HT[24].add_term("controversy",
		 * "n.���"); HT[24].add_term("depreciation", "n.��ġ �϶�, ȭ���� ���ŷ� ����");
		 * HT[24].add_term("devastate", "v.Ȳ���Ű��"); HT[24].add_term("dividend",
		 * "n.����"); HT[24].add_term("entrepreneur", "n.�����");
		 * HT[24].add_term("eventually", "ad.�ᱹ, ��ħ��"); HT[24].add_term("foreseeable",
		 * "a.������ �� �ִ�"); HT[24].add_term("increasing", "a.�����ϴ�");
		 * HT[24].add_term("inherently", "ad.����������"); HT[24].add_term("innate",
		 * "a.Ÿ��"); HT[24].add_term("insecure", "a.�Ҿ���, Ȯ���� �� ����");
		 * HT[24].add_term("investor", "n.���ڰ�"); HT[24].add_term("justify", "v.����ȭ�ϴ�");
		 * HT[24].add_term("legacy", "n.����, ����"); HT[24].add_term("lucrative",
		 * "a.���ͼ� �ִ�, �����̰� �Ǵ�"); HT[24].add_term("manipulation", "n.����, ���� ����");
		 * HT[24].add_term("nearly", "ad.����, �뷫"); HT[24].add_term("on behalf of",
		 * "phr.~�� ����ؼ�"); HT[24].add_term("outlook", "n.����");
		 * HT[24].add_term("outweigh", "v.(��ġ, �߿伺��)~���� ũ��"); HT[24].add_term("pitfall",
		 * "n.����ġ ���� ����, ���"); HT[24].add_term("plummet", "v.�����ϴ�");
		 * HT[24].add_term("portfolio", "n.��Ʈ������, ���� �ڻ� ����");
		 * HT[24].add_term("possible", "a.������, ��������"); HT[24].add_term("prevalent",
		 * "a.�θ� ����, �����ϰ� �ִ�"); HT[24].add_term("property", "n.���");
		 * HT[24].add_term("rapid", "a.����, �ż���"); HT[24].add_term("shareholder",
		 * "n.����"); HT[24].add_term("solely", "ad.��������"); HT[24].add_term("somewhat",
		 * "ad.�ټ�, �󸶰�"); HT[24].add_term("speculation", "n.����");
		 * HT[24].add_term("stability", "n.����, ������"); HT[24].add_term("unbiased",
		 * "a.���԰� ����, ��� ����"); HT[24].add_term("unprecedented", "a.���� ����");
		 * HT[24].add_term("unwillingness", "n.��Ű�� �ʾ� ��"); HT[24].add_term("yield",
		 * "v.(������)��������");
		 */
    }
}
