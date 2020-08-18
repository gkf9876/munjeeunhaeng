package 문제은행.모델;

import java.util.List;

import 문제은행.모델.Question_bank.Keyword;

class English_voca extends Subject
{
    public English_voca(String name, Keyword code, List<String> chapterList)
    {
    	super(name, code, chapterList);

		/*
		 * HT[1].add_term("applicant", "n.지원자, 신청자",
		 * "Each applicant is required to submit a resume.");
		 * HT[1].add_term("apprehensive", "a.걱정하는, 염려하는",
		 * "Most people feel apprehensive before an important job interview.");
		 * HT[1].add_term("aptitude", "n.재능, 소질",
		 * "The applicant should demonstarte aptitude in the following areas.");
		 * HT[1].add_term("associate", "v.관련시키다",
		 * "Two of the applicants were associated with a rival firm.",
		 * "Two of the applicants were associated [    ] a rival firm.",
		 * "with\r\nbe associated with : ~와 관련되다 \r\nin association with : ~와 제휴하여");
		 * HT[1].add_term("bilingual", "a.2개 국어를 구사하는",
		 * "Avid Pharmaceuticals is seeking a bilingual call center manager.");
		 * HT[1].add_term("broad", "a.폭넓은",
		 * "a broad knowledge of marketing strategies."); HT[1].add_term("candidate",
		 * "n.지원, 후보자", "Five candidates will be selected for final interviews.");
		 * HT[1].add_term("certification", "n.증명서, 증명", "accounting certification");
		 * HT[1].add_term("commensurate", "a.비례한, 액수가 상응하는",
		 * "Wages will be commensurate with experience and qualifications.",
		 * "Wages will be commensurate [    ] experience and qualifications.",
		 * "with\r\nbe commensurate with : ~에 비례하다"); HT[1].add_term("confidence",
		 * "n.확신, 자신;신임",
		 * "We have confidence that she can handle the position.\r\nThe recommendations showed confidence in his abilities."
		 * , "The recommendations showed confidence [  ] his abilities.",
		 * "in\r\nconfidence in : ~에 대한 확신, 신임\r\nin confidence : 비밀로");
		 * HT[1].add_term("consultant", "n.고문, 컨설턴트",
		 * "Emma currently works in London as an interior design consultant.",
		 * "I'll have to consult [    ] Mr.Long first.",
		 * "with\r\nconsult + 전문가 : ~와 상담하다\r\nconsult with + 대등한 상대 : ~와 상의하다");
		 * HT[1].add_term("degree", "n.학위", "a bachelor's degree \na master's degree");
		 * HT[1].add_term("eligible", "a.자격이 잇는, 적격의",
		 * "The part time workers are also eligible for paid holidays.",
		 * "The part time workers are also eligible [    ] paid holidays.",
		 * "for\r\nbe eligible + membership/compensation/position : 회원이 될/보상을 받을/직위에 오를 자격이 있다.\r\nbe eligible to do : ~할 자격이 있다"
		 * ); HT[1].add_term("employment", "n.고용",
		 * "The company announced employment opprtunities in its accounts department.");
		 * HT[1].add_term("entitle", "v.~에게 ~할 자격을 주다",
		 * "Executive level staff are entitled to additional benefits.",
		 * "Executive level staff are entitled [  ] additional benefits.",
		 * "to\r\nbe entitled to + 명사 : ~에 대한 자격이 주어지다\r\nbe entitled to do : ~할 자격이 주어지다"
		 * ); HT[1].add_term("get through", "phr.(시험 등에)합격하다, ~을 무사히 마치다",
		 * "Twelve people got through the first round of interviews.");
		 * HT[1].add_term("highly", "ad.매우, 몹시", "highly qualified candidates");
		 * HT[1].add_term("increment", "n.증가,인상",
		 * "Employees with good records will receive wage increments as an incentive.");
		 * HT[1].add_term("lag", "v.뒤쳐지다,뒤떨어지다",
		 * "Wage increases lag considerably behind current inflation rates.",
		 * "Wage increases lag considerably [    ] current inflation rates.",
		 * "behind\r\nlag behind : (속도 등이)~보다 뒤쳐지다, 뒤떨어지다");
		 * HT[1].add_term("managerial", "관리의",
		 * "I am seeking a managerial position in the accounting field.");
		 * HT[1].add_term("match", "~에 어울리다, 조화되다",
		 * "The candidate's qualifications match the job description.");
		 * HT[1].add_term("meet", "v.(필요,요구 등을)만족시키다",
		 * "Applicants must meet all the requirements for the job.");
		 * HT[1].add_term("minimum", "n.최소한도", "a minimum of three years'experience");
		 * HT[1].add_term("occupation", "n.직업",
		 * "Journalism is an interesting and challenging occupation.");
		 * HT[1].add_term("opening", "n.공석,결원;개시,개장",
		 * "job openings \nthe opening of a new branch"); HT[1].add_term("otherwise",
		 * "ad.달리,다른방법으로;그렇지 않다면",
		 * "Applicants must apply in person unless otherwise indicated. \nApplications must be turned in before the deadline; otherwise they won't be processed in time."
		 * ); HT[1].add_term("paycheck", "n.급료,급료 지불 수표",
		 * "Paychecks are mailed out each month."); HT[1].add_term("payroll",
		 * "n.임금 대장, 급료 명부",
		 * "Fifteen new employees were added to the payroll last month.",
		 * "[ ] the payroll", "on\r\non the payroll : 고용되어"); HT[1].add_term("pension",
		 * "n.연금", "All new employees must sign up for the national pension plan.");
		 * HT[1].add_term("probationary", "a.견습중의,가채용의",
		 * "The company will offer contracts on completion of a probationary period.");
		 * HT[1].add_term("professional", "a.직업의,전문적인n.전문가",
		 * "Compliance with the principles of professional ethics is mandatory. \nMerseyside Hospital is looking to hire a certified health professional."
		 * ); HT[1].add_term("proficiency", "n.숙달,능숙",
		 * "proof of proficiency in a second language"); HT[1].add_term("prospective",
		 * "a.장래의,미래의", "prospective employees"); HT[1].add_term("qualified",
		 * "a.자격 있는,적격의", "qualified applicants",
		 * "Unfortunately, I'm not qualified [    ] this sort of thing.",
		 * "for\r\nbe qualified for : ~에 자격이 있다\r\nqualifications for : ~에 대한 자격");
		 * HT[1].add_term("recruit", "v.(신입 사원 등을)모집하다",
		 * "The firm recruits promising graduates on a yearly basis.");
		 * HT[1].add_term("reference", "n.추천서;참고",
		 * "Philippa asked her ex-boss to write a reference for her. \n This database contains reference material on all aspects of labor law."
		 * ); HT[1].add_term("regardless of", "phr.~에 관계없이",
		 * "All applicants will be considered regardless of age, gender, or race.");
		 * HT[1].add_term("requirement", "n.필요조건",
		 * "Frequent travel is a requirement of this position.");
		 * HT[1].add_term("resume", "n.이력서",
		 * "Fax your resume and cover letter to the above address.");
		 * HT[1].add_term("wage", "n.임금,급료",
		 * "Uncertified workers earn lower wages than certified staff.");
		 * 
		 * HT[2].add_term("abolish", "v.(제도,법률 등을)폐지하다",
		 * "Congress decided to abolish taxes on imported fruit.");
		 * HT[2].add_term("access", "n.이용 권한, 접근;통로, v.~에 접근하다,도달하다",
		 * "Only authorized personnel may request access to client files.\r\nOur new office has direct access to the subway.\r\nClick on the link to access the detailed job description."
		 * , "Our new office has direct access [  ] the subway.",
		 * "to\r\nhave access to : ~에 접근 권한을 가지고 있다.\r\n명사 access는 전치사 to와 어구를 이루어 자주 출제된다. 하지만 동사 access는 타동사이므로 뒤에 전치사 to가 올 수 없다는 것을 꼭 기억해두자."
		 * ); HT[2].add_term("accordance", "n.일치,조화",
		 * "We strive to operate in accordance with local customs.",
		 * "We strive to operate [  ] accordance [    ] local customs.",
		 * "in,with\r\nin accordance with : ~에 따라서, ~대로\r\naccordance는 in accordance with 형태로 사용되므로 꼭 기억해 둬야 한다. with 다음에는 '따라야 할 규칙'이나 '희망 사항'등이 온다."
		 * ); HT[2].add_term("according to", "phr.~에 따라",
		 * "All transactions must be handled according to the guidelines.");
		 * HT[2].add_term("accuse", "v.비난하다,고소하다",
		 * "The director accused his secretary of leaking classified information.",
		 * "The director accused his secretary [  ] leaking classified information.",
		 * "of\r\naccuse A of B : B에 대해 A를 비난하다"); HT[2].add_term("adhere",
		 * "v.고수하다,지키다", "It is difficult to adhere to all the policies.",
		 * "It is difficult to adhere [  ] all the policies.",
		 * "to\r\nadhere to + policies/rules/standards : 정책/규칙/기준을 고수하다\r\nadhere는 '~을 고수하다'란 의미일 때 자동사이므로 전치사 to를 같이 써야한다."
		 * ); HT[2].add_term("approval", "n.승인,인가",
		 * "Please obtain the supervisor's approval before purchasing supplies.");
		 * HT[2].add_term("at all times", "phr.항상,언제나",
		 * "Employees must have security cards at all times."); HT[2].add_term("attire",
		 * "n.복장,옷차림새",
		 * "Professional business attire is required from all presentation participants."
		 * ); HT[2].add_term("attorney", "n.변호사",
		 * "The attorney advised his client to remain silent.");
		 * HT[2].add_term("authorize", "v.~을 인가하다",
		 * "Allocations of funds must be authorized by management");
		 * HT[2].add_term("circumscribe", "v.~을 제한하다",
		 * "The new legislation will circumscribe the use of animals in product testing."
		 * ); HT[2].add_term("code", "n.규범,관례;암호", "dress code\r\nemployee code");
		 * HT[2].add_term("comply", "v.따르다,준수하다",
		 * "Employees must comply with the regulations governing computer use.");
		 * HT[2].add_term("concern", "n.우려,걱정",
		 * "Employees voiced concerns about safety at the meeting",
		 * "Employees voiced concerns [  ] safety at the meeting",
		 * "about\r\nconcern about/over : ~에 대한 우려,걱정\r\nconcern과 함께 쓰이는 전치사 about,over를 묶어서 알아두자.\r\nquestions concerning : ~에 관한 질문\r\nquestion과 어울리는 전치사 concerning(~에 관한)을 묻는 문제가 출제된다. concerning은 about, regarding과 같은 의미이다."
		 * ); HT[2].add_term("custody", "n.감금,구류",
		 * "The suspect was kept in custody for three days."); HT[2].add_term("effect",
		 * "n.효과,영향,(볍률 등의)효력,v.결과로서 ~을 가져오다",
		 * "The tardiness policy will be in effect starting next week.\r\nHe effected a sudden change in the company's direction."
		 * , "The tardiness policy will be [   ] effect starting next week.",
		 * "in\r\nin effect : (볍률 등이)실시된, 효력 있는\r\ncome into effect : 실시되다,발효되다\r\nhave an effect on : ~에 영향을 미치다\r\nsecondary effect : 부수적 효과"
		 * ); HT[2].add_term("enforce", "v.(볍률의)시행하다,집행하다",
		 * "All departments must enforce the no smoking policy.");
		 * HT[2].add_term("exception", "n.예외",
		 * "Management decided not to make exceptions to the rules.",
		 * "[   ] very few exceptions, private schools get the best exam results.",
		 * "with\r\nwith the exception of : ~을 제외하고\r\nwith very few exceptions : 거의 예외 없이"
		 * ); HT[2].add_term("form", "n.유형,양식",
		 * "Visitors are required to present a form of identification to security guards."
		 * ); HT[2].add_term("fraud", "n.사기",
		 * "The company's owners will be charged with tax fraud.");
		 * HT[2].add_term("habit", "n.버릇,습관",
		 * "Setting goals should be a regular habit."); HT[2].add_term("immediately",
		 * "ad.즉시,곧",
		 * "Effective immediately, pension installments will be automatically deducted from each paycheck."
		 * ); HT[2].add_term("infringement", "n.침해",
		 * "An infringement of copyright led to the cancellation of production.");
		 * HT[2].add_term("legislation", "n.법률,법규",
		 * "The committee unanimously voted for the new export limitation legislation."
		 * ); HT[2].add_term("legitimate", "a.합법적인,적법한",
		 * "All legitimate business expenses will be reimbursed.");
		 * HT[2].add_term("litigation", "n.소송,기소",
		 * "We will pursue litigation against all delinquent debtors.");
		 * HT[2].add_term("observance", "n.준수",
		 * "We will close tomorrow in observance of the national holiday.",
		 * "We will close tomorrow [  ] observance [  ] the national holiday.",
		 * "in,of\r\nin observance of : ~을 준수하여"); HT[2].add_term("petition",
		 * "n.진정서,탄원서",
		 * "Employees circulated a petition to ban smoking in the building.");
		 * HT[2].add_term("policy", "n.규정;보험 증권",
		 * "the company policy regarding absenteeism\r\na life insurance policy");
		 * HT[2].add_term("procedure", "n.절차",
		 * "The procedure for patent applications is outlined on the APTO website.");
		 * HT[2].add_term("prohibit", "v.금지하다",
		 * "The museum prohibits visitors from taking pictures.",
		 * "The museum prohibits visitors from take + [   ] pictures.",
		 * "ing\r\nprohibit A from -ing : A가 -하는 것을 금하다\r\nforbid A to do : A가 ~하는 것을 금하다"
		 * ); HT[2].add_term("prosecute", "v.기소하다",
		 * "The government may prosecute journalists for publishing classified information."
		 * ); HT[2].add_term("refrain", "v.자제하다,삼가다",
		 * "Guards should refrain from talking on shift.",
		 * "Guards should refrain [   ] talking on shift.",
		 * "from\r\nrefrain from : ~을 자제하다\r\nrefrain은 자동사이므로 전치사 from이 있어야 목적어가 올 수 있다."
		 * ); HT[2].add_term("regulation", "n.규정",
		 * "Regulations regarding lunch breaks were established.");
		 * HT[2].add_term("restrict", "v.제한하다,한정하다",
		 * "Access is restricted to authorized personnel.",
		 * "Access is restricted [  ] authorized personnel.",
		 * "to\r\nrestrict A to B : A를 B로 한정하다"); HT[2].add_term("severely",
		 * "ad.심하게,엄격하게",
		 * "Those who share company data with outside parties will be severely reprimanded."
		 * ); HT[2].add_term("standard", "n.기준,표준",
		 * "safety standards\r\nnational standards."); HT[2].add_term("thorughly",
		 * "ad.철저하게",
		 * "Please read the user manual thoroughly before installing this software.");
		 * HT[2].add_term("violate", "v.위반하다",
		 * "The content of the website may violate copyright laws.");
		 * 
		 * HT[3].add_term("accustomed", "a.~에 익숙한",
		 * "All our employees are accustomed to using accounting software.",
		 * "All our employees are accustomed [  ] using accounting software.",
		 * "be accustomed to -ing : -하는데 익숙하다\r\naccustomed는 전치사 to와 짝을 이루어 사용된다. to 다음에는 동사원형이 아니라 동명사가 온다는 것에 주의하자."
		 * ); HT[3].add_term("acquaint", "v.~에게 ~을 숙지시키다,잘 알게 하다",
		 * "The training program acquaints new employees with company procedures.",
		 * "The training program acquaints new employees [   ] company procedures.",
		 * "with\r\nacquaint A with B : A에게 B를 숙지시키다(=familiarize A with B)");
		 * HT[3].add_term("affiliate", "n.계열사,지부",
		 * "The company owns affiliates in several markets.");
		 * HT[3].add_term("attendance", "n.출석",
		 * "Staff with outstanding attendance records were awarded bonuses.");
		 * HT[3].add_term("check", "v.검사하다,조사하다",
		 * "IT staff check all computers regularly for disk errors.\r\nClick this link to check for the latest updates."
		 * , "IT staff check all computers regularly [   ] disk errors.",
		 * "for\r\ncheck A for B : B의 유무를 확인하기 위해 A를 검사하다\r\ncheck for A : A에 대해 검사하다");
		 * HT[3].add_term("colleague", "n.(직업상의)동료",
		 * "Training programs can help increase the rapport between colleagues.");
		 * HT[3].add_term("concentrate", "v.집중하다,집중시키다",
		 * "The sales team concentrated on developing new strategies.",
		 * "The sales team concentrated [   ] developing new strategies.",
		 * "on\r\nconcentrate on : ~에 집중하다\r\nconcentrate A on B : A를 B에 집중시키다");
		 * HT[3].add_term("condense", "v.(표현을)간추리다,요약하다",
		 * "The writer condensed the report into a brief summary.",
		 * "The writer condensed the report [   ] a brief summary.",
		 * "into\r\ncondense A into B : A를 B로 요약하다"); HT[3].add_term("conglomerate",
		 * "n.거대 복합기업", "The company developed into a global conglomerate.");
		 * HT[3].add_term("convey", "v.(용건을)전달하다",
		 * "The secretary urgently conveyed the message to the director.",
		 * "The secretary urgently conveyed the message [   ] the director.",
		 * "to\r\nconvey A to B : A를 B에게 전달하다"); HT[3].add_term("corporation",
		 * "n.주식회사,법인", "a multinational telecommunications corporation");
		 * HT[3].add_term("delegate", "v.(권한 등을)위임하다n.대표",
		 * "Managers must be skilled in delegating responsibilities to subordinates.\r\nDiscussions with the delegate are going better than planned."
		 * ); HT[3].add_term("demanding", "a.요구가 많은", "a demanding supervisor");
		 * HT[3].add_term("directly", "ad.곧바로",
		 * "All regional branches report directly to our head office in Washington.");
		 * HT[3].add_term("division", "n.부서",
		 * "The technician will transfer to the automobile division after training.");
		 * HT[3].add_term("efficiently", "ad.효율적으로",
		 * "The software helps employees work more efficiently.");
		 * HT[3].add_term("electronically", "ad.온라인으로,컴퓨터 통신망으로",
		 * "Sending invoices electronically saves time and resources.");
		 * HT[3].add_term("extension", "n.연장,연기;(전화의)내선",
		 * "The manager granted an extension on the deadline.\r\nextension number");
		 * HT[3].add_term("follow up on", "phr.~에 대해 후속 조치하다",
		 * "He followed up on the manager's suggestion."); HT[3].add_term("impending",
		 * "a.임박한,절박한", "The deadline for the report is impending.");
		 * HT[3].add_term("in one's absence", "phr.~의 부재시에",
		 * "A replacement will work in her absence."); HT[3].add_term("in writing",
		 * "phr.서면으로", "Please describe the problem in writing.");
		 * HT[3].add_term("instruct", "v.가르치다,지시하다",
		 * "The organizers instructed participants to pre-read the conference materials."
		 * ); HT[3].add_term("involved", "a.관계된,연루된",
		 * "Dr.Mair was personally involved in the decision making process.",
		 * "Dr.Mair was personally involved [   ] the decision making process.",
		 * "in\r\nbe involved in : ~에 관여하다"); HT[3].add_term("manage",
		 * "v.~을 경영하다;그럭저럭 ~하다",
		 * "The boss decided Colleen could manage the new store.\r\nThey managed to do the assighed work in time."
		 * , "They managed [   ] do the assighed work in time.",
		 * "to\r\nmanage to do : 그럭저럭 ~해내다, 용케 해내다"); HT[3].add_term("memorandum",
		 * "n.회람",
		 * "Many companies circulate a weekly memorandum summarizing business transactions."
		 * ); HT[3].add_term("notify", "v.~에게 통지하다,알리다",
		 * "Staff applying for leave must notify their supervisor in writing.",
		 * "But did he notify you or any other member [  ] the team?",
		 * "of\r\nnotify 사람 + of 내용/that절 : ~에게 ~에 대해 통지하다\r\nannounce (to 사람) that절 : (~에게) ~을 발표하다\r\nThe director announced to shareholders that he would retire."
		 * ); HT[3].add_term("on one's own", "phr.혼자서,혼자 힘으로",
		 * "Operating factory machinery on one's own is dangerous.");
		 * HT[3].add_term("oversee", "v.감독하다",
		 * "An expert consultant will oversee the installation process.");
		 * HT[3].add_term("proprietor", "n.(상점,토지 등의)소유자",
		 * "Hiring decisions are made by the factory's proprietor.");
		 * HT[3].add_term("quarterly", "a.한 해 네 번의", "a quarterly report");
		 * HT[3].add_term("release", "v.공개하다,발표하다n.발매",
		 * "The  company released its annual report.\r\nThe new line of jackets will be ready for release by early next year."
		 * ); HT[3].add_term("remind", "v.~에게 상기시키다,일깨우다",
		 * "The secretary reminded the director of his lunch meeting.",
		 * "The secretary reminded the director [   ] his lunch meeting.",
		 * "of\r\nremind 사람 + of 내용/that절 : ~에게 ~을 상기시키다\r\nremind 사람 to do : ~에게 ~하라고 일러두다\r\nbe reminded to do : ~할 것을 잊지 않도록 주지 받다"
		 * ); HT[3].add_term("request", "n.요청v.요청하다",
		 * "Factory tours are avaliable upon request.\r\nMike requested a leave of absence for one week."
		 * , "I request that you [    ] it.(read의 형태를 적기)",
		 * "read\r\nupon request : 요청하는 대로\r\nrequest for : ~에 대한 요청\r\nrequest that + 주어 + 동사 원형 : ~가 ~해 줄 것을 요청하다\r\nbe requested to do : ~하도록 요청받다, ~하시기 바랍니다\r\n명사 request는 전치사 for오 함께 자주 사용되지만, 동사 request는 타동사이므로 전치사 없이 바로 목적어가 온다. 동사 request 다음에 that절이 오는 경우 that절에 동사 원형을 사용해야 한다는 것도 꼭 기억해 두자."
		 * ); HT[3].add_term("revision", "n.수정,개정",
		 * "The team manager will make revisions on the proposal.");
		 * HT[3].add_term("submit", "v.제출하다",
		 * "Applicants should submit a resume to the personnel manager.",
		 * "Applicants should submit a resume [   ] the personnel manager.",
		 * "to\r\nsubmit A to B : A를 B에게 제출하다"); HT[3].add_term("subordinate",
		 * "n.부하 직원,하급자", "He requested the aid of a few subordinates.");
		 * HT[3].add_term("subsidiary", "n.자회사",
		 * "The acting vice president oversees the subsidiary.");
		 * HT[3].add_term("supervision", "n.감독", "Close supervision ensures quality.");
		 * HT[3].add_term("translation", "n.번역",
		 * "The company ordered a translation of the contract into Icelandic.");
		 * 
		 * HT[4].add_term("accomplish", "v.성취하다",
		 * "Careful planning is essential for accolplishing goals.");
		 * HT[4].add_term("adjust", "v.적응하다",
		 * "The employees quickly adjusted to their new responsibilities.",
		 * "The employees quickly adjusted [   ] their new responsibilities.",
		 * "to\r\nadjust to : ~에 적응하다\r\nadjust A to B : A를 B에 맞추다, 적응시키다");
		 * HT[4].add_term("agree", "v.동의하다",
		 * "The team agreed on the recommendations of the advisor.",
		 * "The team agreed [   ] the recommendations of the advisor.",
		 * "on\r\nagree on + 의견 : (의견)에 동의하다, 뜻을 같이 하다\r\nagree to + 제안, 조건 : (제안,조건)에 찬성하다\r\nagree with + 사람 : (사람)에 동의하다"
		 * ); HT[4].add_term("aspiration", "n.포부,열망",
		 * "Steve has aspirations to become a partner in the firm.");
		 * HT[4].add_term("assigh", "v.배정하다,할당하다",
		 * "HR assigns a unique security ID to all incoming recruits.");
		 * HT[4].add_term("assist", "v.돕다,조력하다",
		 * "A consultant assisted with preparing for the conference.",
		 * "A consultant assisted [   ] preparing for the conference.",
		 * "with\r\nassist with : ~을 돕다"); HT[4].add_term("assume",
		 * "v.(증거는 없으나)사실이라고 생각하다;(책임,역할을)떠맡다",
		 * "The management assumes employees are satisfied.\r\nThe marketing department will assume respomsibility for the project."
		 * ); HT[4].add_term("combined", "a.합동의,결합된",
		 * "Our combined experience has produced great sales results.");
		 * HT[4].add_term("conduct", "v.(업무 등을)수행하다",
		 * "IJMR Ltd. will conduct the research study."); HT[4].add_term("confidential",
		 * "a.기밀의,내밀한", "Her assignment was highly confidential.");
		 * HT[4].add_term("contrary", "ad.반대로",
		 * "Techworld is in financial trouble, despite claims to the contrary.");
		 * HT[4].add_term("coordinate", "v.조정하다",
		 * "The Chicago office coordinated the planning process.");
		 * HT[4].add_term("count on", "phr.~을 믿다,~에 의지하다",
		 * "We provide outsourcing services that clients can count on.");
		 * HT[4].add_term("creditable", "a.훌륭한,칭찬할만한",
		 * "Our Beijing office has established a creditable reputation in China.");
		 * HT[4].add_term("direct", "v.~에게 길을 가리키다",
		 * "The receptionist directs customers to the product display area.",
		 * "The receptionist directs customers [   ] the product display area.",
		 * "to\r\ndirect A to B : A를 B로 안내하다"); HT[4].add_term("disturbing", "a.방해하는",
		 * "Listening to loud music in the office could be disturbing to coworkers.");
		 * HT[4].add_term("draw on", "phr.~을 이용하다,~에 의지하다",
		 * "In her new position, Sheila had to draw on her experience from past jobs.");
		 * HT[4].add_term("duplicate", "n.사본",
		 * "Head office ordered a duplicate of the contract.",
		 * "Mr. Yu had his secretary type the memo [   ] duplicate.",
		 * "in\r\nin duplicate : 두 통으로\r\nmake duplicates of : ~의 사본을 만들다");
		 * HT[4].add_term("eminent", "a.저명한,탁월한",
		 * "The consultant was an eminent researcher."); HT[4].add_term("endeavor",
		 * "v.노력하다,애쓰다", "We will endeavor to finish the project by Friday.");
		 * HT[4].add_term("engage", "v.관여하다,종사하다",
		 * "Each worker was engaged in at least two projects.",
		 * "Each worker was engaged [   ] at least two projects.",
		 * "in\r\nengage in : ~에 종사하다\r\nbe engaged in : ~에 종사하다, 관여하다");
		 * HT[4].add_term("execute", "v.수행하다,실행하다",
		 * "Assigned tasks must be executed promptly and efficiently.");
		 * HT[4].add_term("foster", "v.촉진하다,육성하다",
		 * "Staff dinners helped foster better work relations.");
		 * HT[4].add_term("friction", "n.불화,마찰",
		 * "Competition for performance bonuses caused friction amongst employees.");
		 * HT[4].add_term("get along with", "phr.~와 사이좋게 지내다",
		 * "The CEO gets along with his new advisor very well.");
		 * HT[4].add_term("hardly", "ad.거의 ~하지 않다",
		 * "She was hardly ever late for her shift.",
		 * "She was hardly [   ] late for her shift.",
		 * "ever\r\nhardly ever : 좀처럼 ~하지 않다"); HT[4].add_term("insubordinate",
		 * "a.반항하는,복종하지 않는",
		 * "The intern was dismissed on charges of insubordinate behavior.");
		 * HT[4].add_term("intention", "n.의지,의향",
		 * "She had every intention of attending the conference, but couldn't.",
		 * "She had every intention of [attend + ] the conference, but couldn't.적당한 형태로"
		 * , "attending\r\nhave every intention of -ing : 꼭 -하고자 하다");
		 * HT[4].add_term("lax", "a.(행동 등이)규율에 못 미치는,느슨한",
		 * "As of late, the staff has been rather lax in turning in reports.");
		 * HT[4].add_term("malign", "v.~을 헐뜯다,중상하다",
		 * "The company accused union activists of maligning its integrity.");
		 * HT[4].add_term("neutrality", "n.중립,중립성",
		 * "His neutrality was called into question."); HT[4].add_term("occasionally",
		 * "ad.때때로,가끔", "She occasionally failed to perform critical tasks.");
		 * HT[4].add_term("personnel", "n.(집합적)직원,인원",
		 * "We often use an agency to find reliable temporary personnel.");
		 * HT[4].add_term("procrastinate", "v.꾸물거리다",
		 * "The director accused his assistant of procrastinating.");
		 * HT[4].add_term("respectful", "a.정중한,존중하는",
		 * "Salesmen are reminded to be respectful to all clients.",
		 * "We are in great respect [   ] him.",
		 * "for\r\nrespect for : ~에 대한 존경\r\nwith respect : 존중하여");
		 * HT[4].add_term("respective", "a.각각의,저마다의",
		 * "The disputing parties explained their respective positions.");
		 * HT[4].add_term("responsible", "a.책임이 있는,책임져야 할",
		 * "Employees are responsible for their own safety at work.",
		 * "Employees are responsible [   ] their own safety at work.",
		 * "for\r\nbe responsible for : ~에 대해 책임이 있다."); HT[4].add_term("routinely",
		 * "ad.정기적으로,일상적으로",
		 * "Government workers are routinely required to get health checkups.");
		 * HT[4].add_term("subsequent", "a.그 이후의",
		 * "The strategy was so successful that it was used for all subsequent project."
		 * ); HT[4].add_term("transform", "v.바꾸다,변모시키다",
		 * "Eastel Networks helps transform your business models in innovative ways.");
		 * HT[4].add_term("undertake", "v.(일을)떠맡다",
		 * "She had to undertake the task at short notice.");
		 * HT[4].add_term("voluntarily", "ad.자발적으로",
		 * "He voluntarily took on the arduous task to gain experience.");
		 * HT[4].add_term("widely", "ad.널리", "a widely admired business leader");
		 * 
		 * HT[5].add_term("accessible", "a.출입할 수 있는;이용할 수 있는",
		 * "The 18th floor is only accessible to executive-level staff.\r\nPlease make the manual accessible to all employees."
		 * ); HT[5].add_term("accidentally", "ad.우연히,뜻하지 않게",
		 * "Alison accidentally made some errors in the financial statements.");
		 * HT[5].add_term("advisable", "a.바람직한,합당한",
		 * "It is advisable to update IT equipment regularly.");
		 * HT[5].add_term("aggravate", "v.악화시키다",
		 * "Tensions were aggravated by the recent staff layoffs.");
		 * HT[5].add_term("announcement", "n.공고,발표",
		 * "Mr.Dane posted announcement about the general meeting.");
		 * HT[5].add_term("apparently", "ad.보기에 ~한듯한,외관상으로는",
		 * "Apparently, Mr.Jones wasn't aware of today's meeting.");
		 * HT[5].add_term("aspect", "n.관점,국면",
		 * "The problem must be considered from every aspect."); HT[5].add_term("aware",
		 * "a.알고 있는,인식하고 있는", "Workers should be made aware of safety procedures.",
		 * "Workers should be made aware [   ] safety procedures.",
		 * "of\r\nbe aware + of/that절 : ~을 알고 있다"); HT[5].add_term("compliance",
		 * "n.(명령,법규에의)준수",
		 * "Government officials will inspect the plant's compliance with safety guidelines."
		 * ,
		 * "Government officials will inspect the plant's compliance [   ] safety guidelines."
		 * , "with\r\nin compliance with : ~을 준수하여"); HT[5].add_term("concerned",
		 * "a.염려하는,걱정하는;관련된",
		 * "Management is concerned about security.\r\nThe manual is concerned with the vacation policy."
		 * , "Management is concerned [   ] security.",
		 * "about\r\nbe concerned about : ~에 대해 염려하다, 근심하다\r\nbe concerned with : ~와 관계가 있다, ~에 관심이 있다."
		 * ); HT[5].add_term("contingency", "n.불의의 사태,뜻밖의 일",
		 * "Our team is prepared for all contingencies."); HT[5].add_term("demonstrate",
		 * "v.증명하다;(모형,실험 등으로)설명하다",
		 * "Sales figures demonstrate that the advertising campaign was successful.\r\nOur representative will demonstrate how to use the instrument."
		 * ); HT[5].add_term("divide", "v.나누다",
		 * "Required overtime will be divided equally amongst employees.",
		 * "At end of cycle, remove dough and divide [   ] halves.",
		 * "into\r\ndivide A into B : A를 B로 나누다\r\nbe divided into : ~로 나눠지다");
		 * HT[5].add_term("embrace", "v.받아들이다,포용하다",
		 * "The company embraced the new technology."); HT[5].add_term("evacuate",
		 * "v.(집,장소에서)대피하다",
		 * "Occupants were told to evacuate the building immediately.");
		 * HT[5].add_term("expertise", "n.전문직 기술",
		 * "This kind of project falls outside our area of expertise.");
		 * HT[5].add_term("extended", "a.(기간 등을)연장한,장기간에 걸친",
		 * "Overtime is avaliable for those willing to work extended hours.");
		 * HT[5].add_term("face", "v.(문제 등에)직면하다",
		 * "Businesses are faced with the echallenge of foreigh competition.",
		 * "Businesses are faced [   ] the echallenge of foreigh competition.",
		 * "with\r\nbe faced with : (문제 등에)직면하다"); HT[5].add_term("failure",
		 * "n.(기계 따위의)고장,파손", "A technician is on call to correct system failures.");
		 * HT[5].add_term("feedback", "n.의견,반응",
		 * "Feedback from one's colleagues can be of great assistance.");
		 * HT[5].add_term("follow", "v.~을 따라가다",
		 * "The delegates followed the guide into the exhibition hall.",
		 * "Follow this road [   ] the corner.", "to\r\nfollow A to B : A를 따라 B까지 가다");
		 * HT[5].add_term("implement", "v.실행하다,실시하다",
		 * "Board members voted to implement an innovative marketing campaign.");
		 * HT[5].add_term("inform", "v.~에게 알리다",
		 * "Please inform the director that the meeting is cancelled.",
		 * "Please inform the director [   ] the meeting is cancelled.",
		 * "that\r\ninform 사람 + of 내용/that절 : ~에게 ~을 알리다\t\nexplain (to 사람)that 절 : (~에게)~을 설명하다"
		 * ); HT[5].add_term("instead of", "phr.~대신에",
		 * "Management offered employees stock options instead of wage increases.");
		 * HT[5].add_term("interruption", "n.중단,방해",
		 * "The blackout caused a brief interruption in internet access.");
		 * HT[5].add_term("make sure", "phr.확인하다",
		 * "Tech support makes sure that the network is functioning.");
		 * HT[5].add_term("matter", "n.문제",
		 * "Please deal with personal matters outside the office.");
		 * HT[5].add_term("outstanding", "a.우수한;(부채 등이)미결제된",
		 * "an outstanding busuness plan\r\noutstanding debts");
		 * HT[5].add_term("privilege", "n.특권,특전",
		 * "Experienced staff may be offered management level privileges.");
		 * HT[5].add_term("promptly", "ad.즉시;정각에",
		 * "It is company policy to respond promptly to all inquiries.");
		 * HT[5].add_term("realistically", "ad.현실적으로",
		 * "We cannot realistically expect to have the presentation ready on time.");
		 * HT[5].add_term("remainder", "n.나머지",
		 * "Audits will continue throughout the remainder of the month.",
		 * "Audits will continue throughout the remainder [   ] the month.",
		 * "of\r\nthroughout the remainder of + 기간"); HT[5].add_term("rush", "v.서두르다",
		 * "Crews rushed to finish construction ahead of schedule.");
		 * HT[5].add_term("sign out", "phr.서명하여 외출을 기록하다",
		 * "All employees must sign out for all breaks.");
		 * HT[5].add_term("sophisticated", "a.(기계가)정교한,복잡한;세련된",
		 * "A sophisticated security system was installed.\r\nThe decorator exhibited a sophisticated taste in art."
		 * ); HT[5].add_term("speak", "v.이야기하다",
		 * "Mr.Brooke spoke to his clients about a new venture.",
		 * "Mr.Brooke spoke to his clients [   ] a new venture.",
		 * "about\r\nspeak to 사람 about 내용 : ~에게 ~에 대해 이야기하다\r\nspeak + 언어 : (언어를)말하다\r\nspeak는 '~에게 말하다'란 자동사로 많이 쓰이며 이때 듣는 사람 앞에는 to를 써야 한다. speak English에서처럼 '(언어를)말하다'란 타동사로도 사용된다.\r\ntell 사람 that절 : ~에게 ~을 이야기하다\r\ntell은 4형식 동사이며 뒤에 사람목적어와 that절이 오는 형태로 많이 쓰인다.\r\nMr.Bennett told reporters that he would retire soon.\r\nsay (to 사람)that절 : (~에게)~을 이야기하다\r\nsay는 3형식 동사로 that절이 목적어로 오는 형태로 많이 쓰인다. 듣는 사람 앞에는 꼭 to를 써야 한다.\r\nThe customer said to her that he was happy with the purchase."
		 * ); HT[5].add_term("take on", "phr.(역할,일을)떠맡다",
		 * "BMI Construction Ltd.regularly takes on large-scale projects.");
		 * HT[5].add_term("timely", "a.시기적절한,때를 맞춘",
		 * "The report was completed in a timely manner.",
		 * "The report was completed [   ] a timely manner.",
		 * "in\r\nin a timely manner : 때 맞춰"); HT[5].add_term("trigger", "v.야기하다,유발하다",
		 * "The reduction in breaks triggered employee complaints.");
		 * HT[5].add_term("violation", "n.위반,위배",
		 * "Violation of safety codes may result in dismissal.");
		 * 
		 * HT[6].add_term("abate", "v.누그러지다,약해지다,감소하다",
		 * "The recent economic crisis will not abate soon.");
		 * HT[6].add_term("adversity", "n.역경,불운",
		 * "The middle class faces the most adversity during depressions.");
		 * HT[6].add_term("ailing", "a.병든,괴로워하는",
		 * "An ailing economy has forced the unemployment rates to increase considerably."
		 * ); HT[6].add_term("assert", "v.단언하다,주장하다",
		 * "The report asserts that economic growth will continue.");
		 * HT[6].add_term("boost", "v.(경기를)부양하다,상승시키다",
		 * "The real estate industry has helped boost the economy.");
		 * HT[6].add_term("brisk", "a.호황의,활발한",
		 * "A brisk market is developing in online shopping.");
		 * HT[6].add_term("collapse", "n.붕괴",
		 * "To prevent an economic collapse, the president froze prices.");
		 * HT[6].add_term("commerce", "n.통상,교역",
		 * "The organization promotes international commerce.");
		 * HT[6].add_term("consequence", "n.결과",
		 * "Profits grew as a consequence of increased business.");
		 * HT[6].add_term("depression", "n.불황",
		 * "The entire industry is going through an economic depression.");
		 * HT[6].add_term("deteriorate", "v.악화되다,나빠지다",
		 * "Forecasters warned that the economy would deteriorate.");
		 * HT[6].add_term("dramatically", "ad.극적으로",
		 * "Interest rates climbed dramatically."); HT[6].add_term("dwindle",
		 * "v.줄어들다,감소되다", "The company's economic fortunes dwindled in the 1990s.");
		 * HT[6].add_term("economical", "a.경제적인,절약되는",
		 * "Companies are searching for economical ways to utilize energy.");
		 * HT[6].add_term("entail", "v.~을 수반하다,~을 유발하다",
		 * "Trade restrictions may entail economic costs."); HT[6].add_term("fairly",
		 * "ad.상당히,꽤", "Concerns over the bankruptcy are fairly widespread.");
		 * HT[6].add_term("fall", "v.(값,가치가)하락하다",
		 * "The rate of unemployment has fallen steadily this quarter.");
		 * HT[6].add_term("flourish", "v.번창하다,융성하다",
		 * "The newly-merged firm is flourishing despite organizational weaknesses.");
		 * HT[6].add_term("impede", "v.저해하다,방해하다",
		 * "Natural calamities in the summer will impede national growth.");
		 * HT[6].add_term("implication", "n.영향,밀접한 관계",
		 * "The Supreme Court ruling has implications for small businesses.",
		 * "The Supreme Court ruling has implications [   ] small businesses.",
		 * "for\r\nhave implications for : ~에 영향을 미치다"); HT[6].add_term("indicator",
		 * "n.지표,지수", "Current economic indicators show admirable growth in mining.");
		 * HT[6].add_term("industrial", "a.산업의", "an industrial exhibition");
		 * HT[6].add_term("lead", "v.이끌다,지휘하다;(어떤 결과에)이르다",
		 * "She helped lead the company to success.\r\nGrowing oil markets will lead to economic improvement."
		 * , "Growing oil markets will lead [   ] economic improvement.",
		 * "to\r\nlead to : (어떤 결과에)이르다"); HT[6].add_term("likely", "a.~할 것 같은",
		 * "The new CEO is likely to confront major challenges.",
		 * "The new CEO is likely [   ] confront major challenges.",
		 * "to\r\nbe likely to do : ~할 것 같다"); HT[6].add_term("overall", "a.전반적인,총체적인",
		 * "Overal profitability was impacted by the lagging economy.");
		 * HT[6].add_term("promising", "a.유망한,전망이 좋은",
		 * "a promising global economic outlook"); HT[6].add_term("prospect", "n.전망,예상",
		 * "Weak industries are facing prospects of inflated interest rates.");
		 * HT[6].add_term("prosperity", "n.번영",
		 * "Strong economic growth is a prerequisite for national prosperity.",
		 * "Industrial conflict seems to be more rampant in some countries in times [   ] prosperity."
		 * , "of\r\nin times of prosperity : 번영기에"); HT[6].add_term("rapidly",
		 * "ad.급속히,빨리", "Energy demand increased rapidly."); HT[6].add_term("ratio",
		 * "n.비율", "The bank calculated the debt ratio of the company.");
		 * HT[6].add_term("remain", "v.여전히 ~한 상태이다;아직 ~해야 하다",
		 * "The cost of living should remain stable over the next decade.\r\nIt remains to be seen whether or not the tax cut will be passed."
		 * ); HT[6].add_term("skyrocket", "v.(가격 등이)치솟다",
		 * "Production costs are expected to skyrocket."); HT[6].add_term("slowdown",
		 * "n.경기 후퇴", "Experts predict a gradual slowdown in the nation's economy.");
		 * HT[6].add_term("soar", "v.(물가 등이)폭등하다,높이 치솟다",
		 * "Rates have soared due to inflation."); HT[6].add_term("stagnant",
		 * "a.침체된,불경기의", "the stagnant steel industry"); HT[6].add_term("supplement",
		 * "v.보완하다,보충하다",
		 * "Increased export production will supplement weak domestic sales.");
		 * HT[6].add_term("thrive", "v.번영하다,성공하다",
		 * "The delivery service industry is thriving."); HT[6].add_term("unstable",
		 * "a.불안정한,변하기 쉬운", "Gas prices have been unstable in recent years.");
		 * HT[6].add_term("volatile", "a.(가격 등이)심하게 변동하는", "volatile stock markets");
		 * HT[6].add_term("wane", "n.감소,쇠퇴", "Consumer spending is on the wane.",
		 * "Consumer spending is [   ] the wane.",
		 * "on\r\non the wane : 감소하고 있는, 쇠약해지고 있는(=on the decline)");
		 * 
		 * HT[7].add_term("admission", "n.입장",
		 * "Those wishing to visit the exhibit will be charged an extra admission fee."
		 * ); HT[7].add_term("advocate", "n.옹호자",
		 * "The writer is an advocate of public education.",
		 * "The writer is an advocate [   ] public education.",
		 * "of\r\nan advocate of : ~의 옹호자"); HT[7].add_term("alumni", "n.동창생들",
		 * "St.John's University alumni were invited to the graduation ceremony.");
		 * HT[7].add_term("anonymous", "a.익명의,이름을 모르는",
		 * "The orphanage received $6,000 from an anonymous donor.");
		 * HT[7].add_term("appear", "v.나타나다,출현하다",
		 * "The novelist appeared at the bookstore to sign autographs.");
		 * HT[7].add_term("beneficial", "a.유익한,이로운",
		 * "The organization's work is beneficial to the community.",
		 * "The organization's work is beneficial [   ] the community.",
		 * "to\r\nbe beneficial to : ~에 이익이 되다"); HT[7].add_term("care for",
		 * "phr.~을 돌보다", "He wondered whether he'd have time to care for a pet.");
		 * HT[7].add_term("celebrity", "n.유명 인사,명사",
		 * "Many celebrities attended the city's summer park festival.");
		 * HT[7].add_term("censorship", "n.검열",
		 * "The Actors Guild protested the censorship of politically controversial films."
		 * ); HT[7].add_term("collection", "n.수집물,소장품;수금,징수",
		 * "The museum has a unique collection of stamps.\r\nToll collection operates by means of an electronic system."
		 * , "We will collect money [   ] people, present company excepted.",
		 * " from\r\ncollect A from B : B로부터 A를 수집하다"); HT[7].add_term("come in + 서수",
		 * "phr.~위로 입상하다", "Amateur planist Andrew Ward came in third.");
		 * HT[7].add_term("contestant", "n.경기자,경쟁자",
		 * "One of the contestants won an around-the-world ticket.");
		 * HT[7].add_term("contributor", "n.기고가,공헌자",
		 * "The doctor is a regular contributor to the newspaper.",
		 * "The doctor is a regular contributor [   ] the newspaper.",
		 * "to\r\ncontributor to : ~에 대한 기고가"); HT[7].add_term("current", "a.현재의",
		 * "Current subscribers to the magazine will receive a free supplement.");
		 * HT[7].add_term("defy", "v.저항하다",
		 * "The documentary series defies conventional wisdom about fitness.\r\nThe play defied all description."
		 * ); HT[7].add_term("donation", "n.기증,기부",
		 * "The library is accepting donations of children's books.");
		 * HT[7].add_term("edition", "n.(간행물의)판",
		 * "A revised edition of ASU will be published soon.");
		 * HT[7].add_term("enlightening", "a.계몽적인,가르침을 주는",
		 * "The editorial is enlightening."); HT[7].add_term("enthusiastically",
		 * "ad.열광적으로", "The press enthusiastically applauded the persuasive speech.");
		 * HT[7].add_term("exhibition", "n.전시회",
		 * "The gallery hosted an exhibition of urban scenic photographs.");
		 * HT[7].add_term("fascinating", "a.매혹적인,황홀한",
		 * "Many fascinating pieces of art were on display.",
		 * "Many [fascinate + ] pieces of art were on display.적당한 형태",
		 * "fascinating\r\nfascinating : 매혹적인\r\nfascinated : 매혹된\r\nfascinating은 사람이나 사물이 매혹적일 떄, fascinated는 사람이 무언가에 매혹되었을 때 사용한다. 혼동하지 않도록 차이를 구별"
		 * ); HT[7].add_term("have yet to do", "phr.아직 ~하고 있지 않다,아직 ~해야 하다",
		 * "The performance schedule of the jazz festival has yet to be decided.");
		 * HT[7].add_term("improvise", "v.즉흥 연주를 하다,즉석에서 만들다",
		 * "The performers improvised a jazz melody."); HT[7].add_term("informative",
		 * "a.유익한,정보를 주는", "The documentary was informative and interesting.");
		 * HT[7].add_term("issue", "n.(출판물의)제 ~호;문제,쟁점",
		 * "the April issue of a magazine\r\nThere are many perspectives on the issue of global warming."
		 * ); HT[7].add_term("lend", "v.빌려주다",
		 * "The library lends a variety of audio-visual materials.");
		 * HT[7].add_term("live", "a.(라디오,TV가)생방송인",
		 * "a live broadcast\r\nlive performance"); HT[7].add_term("local", "a.지방의,고장의",
		 * "The tournament will be held at the local high school.");
		 * HT[7].add_term("matinee", "n.(연극,음악회 등의)낮 공연",
		 * "Tickets for the matinee cost a third of the price of a regular showing.");
		 * HT[7].add_term("memoirs", "n.회고록,자서전",
		 * "The memoirs of the financial guru are already a hit.");
		 * HT[7].add_term("municipal", "a.시의,지방자치의",
		 * "Municipal elections will be held in two weeks."); HT[7].add_term("must-see",
		 * "n.꼭 봐야 하는 것", "The play showing at the downtown theater is a must-see.");
		 * HT[7].add_term("note", "v.주목하다",
		 * "Please note the intricate details of the architecture.");
		 * HT[7].add_term("out of print", "phr.절판되어",
		 * "The old editions are out of print."); HT[7].add_term("periodical",
		 * "n.정기 간행물", "The periodical highlights the most recent developments in IT.");
		 * HT[7].add_term("popular", "a.인기 있는",
		 * "The outdoor movie screenings were very popular."); HT[7].add_term("present",
		 * "v.제시하다a.현재의;참석한",
		 * "Please present valid tickets at the door.\r\nThe present owner of the resort intends to renovate it.\r\nYankees star Matt London was present at the game."
		 * , "She received the present [   ] glee.",
		 * "with\r\npresent A with B : A에게 B를 제공하다\r\npresent B to A : A에게 B를 제공하다\r\n전치사 with뒤에는 제공하는 사물, to 뒤에는 사람이 온다."
		 * ); HT[7].add_term("publication", "n.간행물,출판물",
		 * "A new editorial section will be included in the publication.");
		 * HT[7].add_term("showing", "n.(영화,연극의)상영",
		 * "We attended the premiere showing of the Julie Garner movie.",
		 * "We attended the premiere showing [   ] the Julie Garner movie.",
		 * "of\r\nshowing of : ~의 상영"); HT[7].add_term("subscription", "n.(정기 발행물의)구독",
		 * "I want to get a subscription to the Weekly Herald.");
		 * HT[7].add_term("transferable", "a.양도할 수 있는",
		 * "The ticket is not transferable."); HT[7].add_term("upcoming",
		 * "a.다가오는,앞으로 올", "A reporter spoke to a candidate in the upcoming election.");
		 * HT[7].add_term("variety", "n.다양성,변화",
		 * "The newsstand has a variety of magazines and newspapers.",
		 * "The newsstand has a variety [   ] magazines and newspapers.",
		 * "of\r\na (large/wide) variety of : (매우)다양한");
		 * 
		 * HT[8].add_term("affect", "v.~에 영향을 미치다,불리하게 작용하다",
		 * "The frozen food industry can affect the canned goods market.");
		 * HT[8].add_term("analysis", "n.분석",
		 * "The latest market analysis shows an increase in used car purchases.");
		 * HT[8].add_term("claim", "n.(사실,소유권의)주장",
		 * "Macrochips denied claims of copying a competitor's design.");
		 * HT[8].add_term("closely", "ad.면밀히,엄밀히",
		 * "Marketing departments watch the latest trends closely.",
		 * "The cow didn't let people come close [   ] her offspring.",
		 * "to\r\ncome close to + 명사 : ~에 가깝다, ~에 육박하다"); HT[8].add_term("comparison",
		 * "n.비교", "Online advertising is cheaper in comparison with television.",
		 * "Online advertising is cheaper in comparison [   ] television.",
		 * "with\r\nin comparison with : ~와 비교해 볼때"); HT[8].add_term("competition",
		 * "n.경쟁", "Competition in the game software market has increased.",
		 * "They have to compete [   ] their parents' attention.",
		 * "for\r\ncompete for : ~을 두고 경쟁하다"); HT[8].add_term("consecutive", "a.연속적인",
		 * "The Barkley Company achieved high sales growth for the third consecutive year."
		 * ); HT[8].add_term("consistently", "ad.항상,일관되게",
		 * "The factory has consistently provided the highest grade products.",
		 * "All of us in public life must be consistent [   ] the application of principle."
		 * , "in\r\nbe consistent in : ~에 있어 시종 일관된"); HT[8].add_term("consolidate",
		 * "v.(권력,지위 등을)강화하다",
		 * "Wyman's new products have consolidated its market position.");
		 * HT[8].add_term("contend", "v.(문제에)대처하다,(곤란과)싸우다",
		 * "The managers met to contend with customer appeals.",
		 * "The managers met to contend [   ] customer appeals.",
		 * "with\r\ncontend with : ~에 대처하다"); HT[8].add_term("demand", "n.수요,v.요구하다",
		 * "The company could not meet the increased demand for cell phones.\r\nMr.Hawkesby demanded that the clause be crossed out."
		 * , "The company could not meet the increased demand [   ] cell phones.",
		 * "for\r\ndemand for : ~에 대한 수요, 요구\r\ndemand that + 주어 (+should) + 동사원형");
		 * HT[8].add_term("do one's utmost", "phr.전력을 다하다",
		 * "Sun Manufacturing does its utmost to ensure the quality of its products.");
		 * HT[8].add_term("effective", "a.효과적인;(법률 등이)유효한",
		 * "an effective advertising campaign\r\nIncreased tax deductions will be effective as of June 1."
		 * ); HT[8].add_term("especially", "ad.특히",
		 * "Big car manufacturers are facing an especially difficult year for sales.");
		 * HT[8].add_term("examine", "v.조사하다",
		 * "R&D will examine food consumption trends in foreign markets.");
		 * HT[8].add_term("expand", "v.넓히다,확대하다",
		 * "Brahe Optics has expanded its manufacturing division.");
		 * HT[8].add_term("expectation", "n.예상,기대",
		 * "The expectation is that costs will be cut.",
		 * "Someone who goes [   ] one’s expectations may be considered a hero.",
		 * "beyond\r\nabove/beyond + one's expectations : 기대 이상으로");
		 * HT[8].add_term("extremely", "ad.극도로,대단히",
		 * "Internet service providers struggle to survive in today's extremely competitive market."
		 * ); HT[8].add_term("focus", "v.집중시키다,집중하다",
		 * "Management decided to focus resources on expansion.",
		 * "Management decided to focus resources [   ] expansion.",
		 * "on\r\nfocus A on B : A를 B에 집중시키다"); HT[8].add_term("gap", "n.격차",
		 * "a huge gap between exports and imports",
		 * "a huge gap between exports [   ] imports",
		 * "and\r\ngap between A and B : A와 B간의 격차"); HT[8].add_term("gauge", "v.측정하다",
		 * "The survey will gauge consumer reaction to utility price increases.");
		 * HT[8].add_term("impact", "n.충격,영향",
		 * "Price fluctuations had a major impact on the market.",
		 * "Price fluctuations had a major impact [   ] the market.",
		 * "on\r\nhave an impact on : ~에 효과를 미치다, 영향을 주다");
		 * HT[8].add_term("intervention", "n.간섭",
		 * "Government intervention in the market causes problems.");
		 * HT[8].add_term("jeopardize", "v.위태롭게 하다,위험에 빠뜨리다",
		 * "A bad marketing plan could jeopardize our reputation.");
		 * HT[8].add_term("modestly", "ad.겸손하게",
		 * "Sunshine Media modestly accepted the Best Advertisement Award.");
		 * HT[8].add_term("momentum", "n.추진력,탄성",
		 * "The accessories market is gaining momentum."); HT[8].add_term("monopoly",
		 * "n.(상품의)전매,독점",
		 * "Panatronic has a virtual monopoly on the manufacture of digital recorders.",
		 * "Panatronic has a virtual monopoly [   ] the manufacture of digital recorders."
		 * , "on\r\nhave a monopoly on : ~에 대한 독점권을 가지다"); HT[8].add_term("mounting",
		 * "a.증가하는,오르는",
		 * "There is mounting pressure from management to increase productivity.");
		 * HT[8].add_term("perception", "n.인식,지각",
		 * "Public perception of the product affects sales.");
		 * HT[8].add_term("persistent", "a.끊임없는,계속되는",
		 * "Persistent trade problems in Asia have weakened the global economy.");
		 * HT[8].add_term("probable", "a.유망한,가망성 있는",
		 * "A promotion campaign aimed at probable investors began last week.");
		 * HT[8].add_term("raise", "v.올리다,높이다;(의문을)제기하다",
		 * "We used mass mailing methods to raise awareness of our brand.\r\nThe president raised questions about the quality of the new product."
		 * ); HT[8].add_term("randomly", "ad.임의로,무작위로",
		 * "Participants for the study were chosen randomly from a list of volunteers."
		 * ); HT[8].add_term("reflective", "a.반영하는",
		 * "Dwindling sales are reflective of the current state of the company.",
		 * "Dwindling sales are reflective [   ] the current state of the company.",
		 * "of\r\nbe reflective of : ~을 반영하다"); HT[8].add_term("respondent", "n.응답자",
		 * "85% of survey respondents evaluated the product highly.");
		 * HT[8].add_term("seasonal", "a.계절의,계절적인",
		 * "The sugarcane industry is vulnerable to seasonal variations.");
		 * HT[8].add_term("segment", "n.부분,조각",
		 * "Advertising needs to target a particular segment of the market.");
		 * HT[8].add_term("survey", "n.설문 조사",
		 * "Product surveys help to improve quality."); HT[8].add_term("tool", "n.도구",
		 * "Questionnaires are useful tools for product marketing.");
		 * 
		 * HT[9].add_term("adopt", "v.채택하다",
		 * "Plenty of research must be done before adopting a particular marketing strategy."
		 * ); HT[9].add_term("advantage", "n.이점,강점",
		 * "One advantage of consumer testing is the development of marketing insight.",
		 * "One advantage of consumer testing is the development [   ] marketing insight."
		 * , "of\r\ntake advantage of : ~을 이용하다"); HT[9].add_term("advertisement",
		 * "n.광고", "Sales have been propelled by the new advertisement.");
		 * HT[9].add_term("advise", "v.조언해 주다,충고하다",
		 * "Coburn & Johnson Ltd. advises clients on intellectual property matters.",
		 * "Coburn & Johnson Ltd. advises clients [   ] intellectual property matters.",
		 * "on\r\nadvise A to do : A에게 ~하라고 조언하다\r\nadvise A on B : A에게 B에 관해 조언하다");
		 * HT[9].add_term("agressively", "ad.적극적으로",
		 * "The best company representatives aggressively seek out potential clients.");
		 * HT[9].add_term("aim", "v.~을 겨누다n.목표,목적",
		 * "Sport Apparel developed athletic gear aimed at teenagers.\r\nThe division head will outline the aims of the marketing strategy."
		 * , "Sport Apparel developed athletic gear aimed [   ] teenagers.",
		 * "at\r\naim to do : ~할 작정이다\r\n제품 + aimed at : ~을 겨냥한 제품");
		 * HT[9].add_term("attract", "v.끌다,유인하다",
		 * "The automaker is making an effort to attract younger buyers.");
		 * HT[9].add_term("await", "v.기다리다",
		 * "Customers eagerly await the opening of the technology showroom.");
		 * HT[9].add_term("cater", "v.요구를 들어주다",
		 * "The brand now caters to the middle class.",
		 * "The brand now caters [   ] the middle class.",
		 * "to\r\ncater to : ~의 요구를 만족시키다"); HT[9].add_term("confront", "v.~에 직면하다",
		 * "Businesses must be resourceful when confronted with crises.");
		 * HT[9].add_term("consumer", "n.소비자",
		 * "The company is working to gain consumers' trust.");
		 * HT[9].add_term("creative", "a.창조적인,독창적인",
		 * "He came up with a creative idea."); HT[9].add_term("customer", "n.고객",
		 * "Telephone representatives should make the needs of customers their priority."
		 * ); HT[9].add_term("deliberate", "a.고의적인",
		 * "The remark was a deliberate attempt to harm the competition.");
		 * HT[9].add_term("diversify", "v.다양화하다",
		 * "We can strengthen product appeal by diversifying packaging designs.");
		 * HT[9].add_term("effort", "n.노력",
		 * "Advertisements were run in an effort to broaden consumer awareness of new brands."
		 * ,
		 * "Advertisements were run in an effort [   ] broaden consumer awareness of new brands."
		 * , "to\r\nin an effort to do : ~해보려는 노력으로\r\nmake an effort : 노력하다");
		 * HT[9].add_term("endorse", "v.(유명인사가 상품을)보증 선전하다,지지하다",
		 * "The product was endorsed by a famous actor."); HT[9].add_term("experiment",
		 * "v.실험하다", "The marketing team experimented with new promotional techniques.",
		 * "The marketing team experimented [   ] new promotional techniques.",
		 * "with\r\nexperiment with : ~을 실험하다"); HT[9].add_term("favorably",
		 * "ad.호의적으로,순조롭게",
		 * "The product demonstration was favorably received by consumers.\r\nEarnings continue to develop favorably."
		 * ); HT[9].add_term("feasible", "a.실행 가능한",
		 * "Management wanted to know whether it was feasible to increase production.");
		 * HT[9].add_term("fortify", "v.강화하다,장려하다",
		 * "The TX-100 will fortify MacTech's position in the industry.");
		 * HT[9].add_term("forward", "ad.앞으로",
		 * "Our company's research program has moved forward substantially.",
		 * "I look forward [   ] meeting you in two months time.",
		 * "to\r\nlook forward to -ing : -을 고대하다"); HT[9].add_term("incentive",
		 * "n.혜택,장려금",
		 * "Financial incentives such as coupons may encourage additional purchases.");
		 * HT[9].add_term("indicate", "v.나타내다,보여주다",
		 * "Studies indicate that consmers prefer attractively packaged products.");
		 * HT[9].add_term("influence", "v.~에 영향을 주다n.영향",
		 * "The status of the real estate market influences pricing of housing units.\r\nProduct reviews have a profound influence on sales."
		 * , "Product reviews have a profound influence [   ] sales.",
		 * "on\r\nhave an influence on : ~에 영향을 끼치다"); HT[9].add_term("instantly",
		 * "ad.즉각적으로,즉시", "The brand logo should be instantly recognizable.");
		 * HT[9].add_term("introduce", "v.(신제품을)소개하다,발표하다",
		 * "ElectroLife introduced a new line of vacuum cleaners.");
		 * HT[9].add_term("largely", "ad.주문,대부분",
		 * "Public favor largely determines our success."); HT[9].add_term("less",
		 * "ad.보다 적은,덜한",
		 * "Less competition among insurance companies led to higher premiums.");
		 * HT[9].add_term("majority", "n.대부분,대다수",
		 * "The majority of registered clients pay their dues regularly.",
		 * "Most [   ] the advertising budget is spent on television commercials.",
		 * "of\r\nthe majority of~ : ~의 대다수는(majority 앞에는 정관사 the를 쓴다.\r\nmost of the ~ : ~의 대다수는(most는 무관사로 사용한다)"
		 * ); HT[9].add_term("marginal", "a.약간의",
		 * "Customers showed only marginal interest in the new product.");
		 * HT[9].add_term("mastermind", "n.(계획 등의)입안자,지도자",
		 * "Mr.Dane is the mastermind behind the innovative design.",
		 * "Mr.Dane is the mastermind [   ] the innovative design.",
		 * "behind\r\nmastermind behind : ~의 배후 입안자, 지도자"); HT[9].add_term("means",
		 * "n.방법,수단", "Direct surveys are one means of gatering consumer feedback.",
		 * "Guests will have to enter [   ] means of a phone buzzer system.",
		 * "by\r\nby means of : ~에 의하여, ~으로"); HT[9].add_term("necessarily", "ad.반드시",
		 * "Increased production does not necessarily lead to greater revenues.");
		 * HT[9].add_term("need", "n.필요;욕구,요구v.~할 필요가 있다",
		 * "The company is in need of an untapped market.\r\nWe need to scrutinize each transaction for potential errors."
		 * , "We need [   ] scrutinize each transaction for potential errors.",
		 * "to\r\nneed to do : ~할 필요가 있다.\r\nneed는 부정문이나 조건문에서 조동사로 쓰여 need not do 형태를 취하기도 하지만, 대부분의 경우 일반동사로 사용되며 이때는 to부정사와 함께 쓴다는 것을 꼭 기억해 두자."
		 * ) ; HT[9].add_term("repeatedly", "ad.거듭,되풀이하여",
		 * "Customers have repeatedly requested the new product catalog.");
		 * HT[9].add_term("strategy", "n.전략",
		 * "Management's strategy for expansion has been successful.");
		 * 
		 * HT[10].add_term("affordable", "a.(가격이)알맞은,감당할 수 있는");
		 * HT[10].add_term("alter", "v.(성질,형상을)고치다,바꾸다"); HT[10].add_term("apparel",
		 * "n.의복,의류"); HT[10].add_term("apply", "v.(적용하다;지원하다"); HT[10].add_term("area",
		 * "n.지역"); HT[10].add_term("auction", "n.경매"); HT[10].add_term("authentic",
		 * "a.진짜의,진품의"); HT[10].add_term("benefit", "n.혜택,이익v.혜택을 보다,이익을 얻다");
		 * HT[10].add_term("carefully", "ad.주의 깊게,신중한"); HT[10].add_term("charge",
		 * "n.요금,청구금액;책임,의무v.~을 청구하다;외상으로 달아놓다"); HT[10].add_term("delivery", "n.배달");
		 * HT[10].add_term("description", "n.(제품 등의)설명서,해설"); HT[10].add_term("dilute",
		 * "v.희석하다"); HT[10].add_term("equivalent", "a.~에 상당하는,맞먹는");
		 * HT[10].add_term("exactly", "ad.정확히"); HT[10].add_term("exclusively",
		 * "ad.독점적으로,오로지"); HT[10].add_term("exquisite", "a.정교한,우아한");
		 * HT[10].add_term("fit", "v.(치수가)~에 꼭 맞다,~에 적합하다");
		 * HT[10].add_term("installment", "n.할부"); HT[10].add_term("lately", "ad.최근에");
		 * HT[10].add_term("merchandise", "n.상품"); HT[10].add_term("method", "n.방법,형식");
		 * HT[10].add_term("notice", "n.통지"); HT[10].add_term("offer", "v.제공하다n.제공,오퍼");
		 * HT[10].add_term("officially", "ad.공식적으로"); HT[10].add_term("price", "n.가격");
		 * HT[10].add_term("purchase", "v.구매하다n.구매"); HT[10].add_term("readily",
		 * "ad.즉시,손쉽게"); HT[10].add_term("receipt", "n.영수증");
		 * HT[10].add_term("redeemable", "a.상환할 수 있는,되찾을 수 있는");
		 * HT[10].add_term("refund", "n.환불,환불금"); HT[10].add_term("relatively",
		 * "ad.상대적으로"); HT[10].add_term("scent", "n.향기,냄새"); HT[10].add_term("sturdy",
		 * "a.튼튼한"); HT[10].add_term("tax", "n.세금"); HT[10].add_term("thrifty",
		 * "a.검소한,검약하는"); HT[10].add_term("valid", "a.유효한"); HT[10].add_term("value",
		 * "n.가치;가격;(돈을 치른 만큼의)대가물"); HT[10].add_term("voucher", "n.(현금 대용의)상품권,인환권");
		 * HT[10].add_term("warranty", "n.(품질 등의)보증,보증서");
		 * 
		 * HT[11].add_term("assemble", "v.조립하다"); HT[11].add_term("attribute",
		 * "v.(원인을)~에 돌리다,~의 덕분으로 돌리다"); HT[11].add_term("automate", "v.자동화하다");
		 * HT[11].add_term("capable", "a.~을 할 수 있는,~할 능력이 있는");
		 * HT[11].add_term("capacity", "n.수용력,용량"); HT[11].add_term("carelessly",
		 * "ad.부주의하게"); HT[11].add_term("chemical", "n.화학 제품");
		 * HT[11].add_term("coming", "a.다가오는"); HT[11].add_term("comparable",
		 * "a.필적하는,비교되는"); HT[11].add_term("damaged", "a.손상된,손해를 입은");
		 * HT[11].add_term("device", "n.장치"); HT[11].add_term("discontinue", "v.중단하다");
		 * HT[11].add_term("efficiency", "n.효율,능률"); HT[11].add_term("equipment",
		 * "n.장비,설비"); HT[11].add_term("evidently", "ad.분명히,명백히");
		 * HT[11].add_term("fabricate", "v.제작하다"); HT[11].add_term("facility", "n.시설");
		 * HT[11].add_term("fill", "v.~을 채우다"); HT[11].add_term("finished", "a.완성된");
		 * HT[11].add_term("halt", "n.중단,정지"); HT[11].add_term("launch",
		 * "v.(신제품을)출시하다"); HT[11].add_term("material", "n.재료,물질");
		 * HT[11].add_term("operate", "v.(기계 등이)작동하다,움직이다");
		 * HT[11].add_term("operational", "a.작동하는,작동 가능한"); HT[11].add_term("place",
		 * "v.~을 한 상태에 두다;(주문을)하다"); HT[11].add_term("power", "n.전력,전기");
		 * HT[11].add_term("precaution", "n.예방 조치,예방책"); HT[11].add_term("prevent",
		 * "v.~을 막다,~을 예방하다"); HT[11].add_term("processing", "n.처리,가공");
		 * HT[11].add_term("procurement", "n.(필수품의)조달"); HT[11].add_term("produce",
		 * "v.생산하다"); HT[11].add_term("properly", "ad.제대로,정확하게");
		 * HT[11].add_term("protective", "a.보호하는"); HT[11].add_term("quota",
		 * "n.할당량,할당"); HT[11].add_term("safety", "n.안전"); HT[11].add_term("separately",
		 * "ad.개별적으로,따로따로"); HT[11].add_term("specification", "n.명세서,설명서");
		 * HT[11].add_term("stage", "단계"); HT[11].add_term("tolerance", "n.관용");
		 * HT[11].add_term("utilize", "v.이용하다,활용하다");
		 * 
		 * HT[12].add_term("absolute", "a.완전한,완전무결한"); HT[12].add_term("accurate",
		 * "a.정확한"); HT[12].add_term("advance", "n.진보,전진"); HT[12].add_term("allow",
		 * "v.~하게 하다,~을 허락하다"); HT[12].add_term("appearance", "n.외관,외양");
		 * HT[12].add_term("bewildering", "a.당혹케 하는"); HT[12].add_term("breakthrough",
		 * "n.(과학 등의)비약적 발전"); HT[12].add_term("broaden", "v.넓히다");
		 * HT[12].add_term("compatible", "a.호환성의,양립할 수 있는");
		 * HT[12].add_term("complement", "v.보완하다"); HT[12].add_term("concurrently",
		 * "ad.동시에"); HT[12].add_term("control", "v.관리하다,통제하다");
		 * HT[12].add_term("corrosion", "n.부식"); HT[12].add_term("development",
		 * "n.개발;발전"); HT[12].add_term("devise", "v.고안하다,발명하다");
		 * HT[12].add_term("disruption", "n.중단,혼란"); HT[12].add_term("durable",
		 * "a.내구성 있는,튼튼한"); HT[12].add_term("envision", "v.(장래의 일 등을)상상하다,계획하다");
		 * HT[12].add_term("feature", "n.특징,특색"); HT[12].add_term("following",
		 * "prep.~후에a.다음의,다음에 오는"); HT[12].add_term("grant",
		 * "v.(인정하여 정식으로)주다,수여하다n.보조금(연구비,장학금 등)"); HT[12].add_term("hold",
		 * "v.~을 담다,~을 수용하다"); HT[12].add_term("improve", "v.개선하다,향상시키다");
		 * HT[12].add_term("increasingly", "ad.점점,더욱 더"); HT[12].add_term("indication",
		 * "n.징후,조짐"); HT[12].add_term("innovative", "a.혁신적인");
		 * HT[12].add_term("inspect", "v.~을 조사하다,검사하다"); HT[12].add_term("inspiration",
		 * "n.영감"); HT[12].add_term("interpretation", "n.해석,설명");
		 * HT[12].add_term("manufacturer", "n.제조회사,제조업자"); HT[12].add_term("obsolete",
		 * "a.시대에 뒤떨어진,구식의"); HT[12].add_term("patent", "n.특허권,특허품");
		 * HT[12].add_term("patronize", "v.~을 단골로 삼다,~와 거래하다");
		 * HT[12].add_term("quality", "n.품질,질"); HT[12].add_term("reliable",
		 * "a.믿을 만한,신뢰할 수 있는"); HT[12].add_term("research", "n.연구,조사");
		 * HT[12].add_term("revolutionary", "a.혁명적인"); HT[12].add_term("sleek",
		 * "a.세련된"); HT[12].add_term("state-of-the-art", "a.최신식의");
		 * HT[12].add_term("streamline", "v.(일 등을)능률적으로 하다,합리화하다");
		 * HT[12].add_term("sufficiently", "ad.충분히"); HT[12].add_term("superior",
		 * "a.우수한,상급의"); HT[12].add_term("technical", "a.기술적인");
		 * HT[12].add_term("vulnerable", "a.취약한");
		 * 
		 * HT[13].add_term("apologize", "v.사과하다"); HT[13].add_term("appropriately",
		 * "ad.적절하게"); HT[13].add_term("argumentative", "a.논쟁적인,논쟁을 좋아하는");
		 * HT[13].add_term("blemish", "n.흠,결점"); HT[13].add_term("cause",
		 * "v.~을 야기하다,~의 원인이 되다n.원인"); HT[13].add_term("commitment", "n.헌신,전념");
		 * HT[13].add_term("complaint", "n.불평"); HT[13].add_term("complete",
		 * "v.완료하다,완성하다 a.완료된,완성된"); HT[13].add_term("compliment", "n.칭찬");
		 * HT[13].add_term("confident", "a.자신 있는"); HT[13].add_term("courteous",
		 * "a.예의 바른"); HT[13].add_term("critical", "a.비판적인"); HT[13].add_term("deal",
		 * "v.처리하다;거래하다;분배하다, n.거래"); HT[13].add_term("defective", "a.결함이 있는");
		 * HT[13].add_term("disclose", "v.공개하다,드러내다"); HT[13].add_term("escort",
		 * "v.~을 바래다 주다,에스코트하다"); HT[13].add_term("evaluation", "n.평가");
		 * HT[13].add_term("fix", "v.수리하다"); HT[13].add_term("for free", "phr.무료로");
		 * HT[13].add_term("further", "a.그 이상의"); HT[13].add_term("genuine",
		 * "a.진짜의,진품의"); HT[13].add_term("guarantee", "v.보장하다, n.보장");
		 * HT[13].add_term("hesitate", "v.주저하다"); HT[13].add_term("inconvenience",
		 * "n.불편"); HT[13].add_term("infuriate", "v.격분시키다,화나게 하다");
		 * HT[13].add_term("inquire", "v.질문하다"); HT[13].add_term("insert", "v.삽입하다");
		 * HT[13].add_term("mistakenly", "ad.잘못되게,틀리게"); HT[13].add_term("notification",
		 * "n.통지"); HT[13].add_term("politely", "ad.예의 바르게"); HT[13].add_term("rebate",
		 * "v.환불하다,리베이트하다"); HT[13].add_term("replace", "v.~을 교체하다,대체하다");
		 * HT[13].add_term("respond", "v.응답하다"); HT[13].add_term("return",
		 * "v.반환하다,반송하다"); HT[13].add_term("satisfaction", "n.만족");
		 * HT[13].add_term("seriously", "ad.진지하게"); HT[13].add_term("specific",
		 * "a.구체적인,명확한"); HT[13].add_term("unwavering", "a.확고한,동요하지 않는");
		 * 
		 * HT[14].add_term("accumulate", "v.축적하다"); HT[14].add_term("allowance",
		 * "n.허용치;참작,특별한 고려"); HT[14].add_term("approximately", "ad.대략");
		 * HT[14].add_term("attraction", "n.관광 명소"); HT[14].add_term("away", "ad.떨어져서");
		 * HT[14].add_term("baggage", "n.수화물"); HT[14].add_term("beforehand",
		 * "ad.(정해진 때보다)이전에,미리"); HT[14].add_term("board", "v.탑승하다,n.이사회");
		 * HT[14].add_term("brochure", "n.(홍보용)소책자,브로셔"); HT[14].add_term("customs",
		 * "n.세관"); HT[14].add_term("declare", "v.(세관에서)신고하다");
		 * HT[14].add_term("depart", "v.출발하다"); HT[14].add_term("destination", "n.목적지");
		 * HT[14].add_term("diverse", "a.다양한"); HT[14].add_term("dramatic", "a.극적인,멋진");
		 * HT[14].add_term("duty", "n.관세,세금;의무"); HT[14].add_term("embassy", "n.대사관");
		 * HT[14].add_term("emergency", "n.비상사태"); HT[14].add_term("exotic",
		 * "a.이국적인,매혹적인"); HT[14].add_term("fill out/in", "phr.(서류에)적어 넣다");
		 * HT[14].add_term("hospitality", "n.환대,친절"); HT[14].add_term("indulge",
		 * "v.탐닉하다,빠지다"); HT[14].add_term("international", "a.국제적인");
		 * HT[14].add_term("itinerary", "n.여행 일정"); HT[14].add_term("jet lag",
		 * "phr.시차중(여행시 시차로 인한 피로)"); HT[14].add_term("laundry", "n.세탁물");
		 * HT[14].add_term("locate", "v.(~의 위치를)찾아내다;~을 위치시키다");
		 * HT[14].add_term("missing", "a.행방 불명의,사라진"); HT[14].add_term("overhead",
		 * "a.머리 위의"); HT[14].add_term("precisely", "ad.정확히");
		 * HT[14].add_term("prior to", "prep.~이전에"); HT[14].add_term("proximity",
		 * "n.가까움,근접한"); HT[14].add_term("remittance", "n.송금");
		 * HT[14].add_term("round trip", "phr.왕복 여행"); HT[14].add_term("seating",
		 * "n.(집합적)좌석 설비;좌석 배열"); HT[14].add_term("superb", "a.뛰어난,최고의");
		 * HT[14].add_term("swap", "v.맞바꾸다,교환하다"); HT[14].add_term("touch down",
		 * "phr.착륙하다"); HT[14].add_term("tour", "n.(공장, 시설 등의)견학,짧은 여행");
		 * HT[14].add_term("unavailable", "a.구할 수 없는, 이용할 수 없는");
		 * HT[14].add_term("unique", "a.독특한"); HT[14].add_term("unlimited", "a.무제한의");
		 * 
		 * HT[15].add_term("agreement", "n.계약,협정;합의"); HT[15].add_term("alliance",
		 * "n.동맹,제휴"); HT[15].add_term("annotated", "a.(책 등이)주석이 달린");
		 * HT[15].add_term("annulment", "n.무효화,취소"); HT[15].add_term("arbitration",
		 * "n.중재"); HT[15].add_term("bid", "n.입찰"); HT[15].add_term("challenging",
		 * "a.도전적인,힘든"); HT[15].add_term("collaborate", "v.공동으로 일하다,협동하다");
		 * HT[15].add_term("compromise", "n.타협,화해"); HT[15].add_term("contract",
		 * "n.계약 v.계약하다;수축하다"); HT[15].add_term("cooperatively", "ad.협력하여,협조적으로");
		 * HT[15].add_term("deadlock", "n.교착 상태"); HT[15].add_term("dispute",
		 * "n.논쟁,분쟁"); HT[15].add_term("embark", "v.착수하다,나서다");
		 * HT[15].add_term("expire", "v.(계약 등이)만기가 되다"); HT[15].add_term("foundation",
		 * "n.토대,기초"); HT[15].add_term("impartially", "ad.고명정대하게,치우치지 않게");
		 * HT[15].add_term("imperative", "a.반드시 해야 하는,필수적인");
		 * HT[15].add_term("impression", "n.인상"); HT[15].add_term("initially",
		 * "ad.처음에, 초기에"); HT[15].add_term("mediation", "n.조정,중재");
		 * HT[15].add_term("moderator", "n.(토론 등의)사회자, 중재자"); HT[15].add_term("modify",
		 * "v.일부 변경하다,수정하다"); HT[15].add_term("narrow", "v.(범위 등을)좁히다");
		 * HT[15].add_term("negotiation", "n.교섭,협상"); HT[15].add_term("opposing",
		 * "a.대립하는,반대하는"); HT[15].add_term("originally", "ad.원래,처음에는");
		 * HT[15].add_term("preamble", "n.서론,서문"); HT[15].add_term("proceed",
		 * "v.(일이)행해지다,진척되다"); HT[15].add_term("proposal", "n.계획,안");
		 * HT[15].add_term("provision", "n.(조약의)조항"); HT[15].add_term("renew",
		 * "v.(계약 등을)갱신하다"); HT[15].add_term("review", "v.검토하다,재조사하다");
		 * HT[15].add_term("rigid", "a.엄격한,완고한"); HT[15].add_term("settle",
		 * "v.해결하다,처리하다"); HT[15].add_term("solicit", "v.요청하다,간청하다");
		 * HT[15].add_term("stipulation", "n.계약 조건"); HT[15].add_term("surely",
		 * "ad.틀림없이,꼭"); HT[15].add_term("term", "n.조건;임기,기한");
		 * HT[15].add_term("terminate", "v.끝내다, 종결시키다");
		 * 
		 * HT[16].add_term("acclaim", "n.찬사,호평"); HT[16].add_term("antitrust",
		 * "a.독점 금지의"); HT[16].add_term("assure", "v.~에게 보장하다,~을 안심시키다");
		 * HT[16].add_term("at the latest", "phr.늦어도"); HT[16].add_term("attain",
		 * "v.(목표를)달성하다"); HT[16].add_term("bulk", "a.대량의");
		 * HT[16].add_term("capitalize on", "phr.~을 이용하다,기회로 삼다");
		 * HT[16].add_term("commodity", "n.상품,산물"); HT[16].add_term("completely",
		 * "ad.전적으로,완전히"); HT[16].add_term("confirmation", "n.확인,확증");
		 * HT[16].add_term("consignment", "n.위탁 판매"); HT[16].add_term("contact",
		 * "~와 연락을 취하다, n.(상업적 목적으로)교섭하고 있는 사람"); HT[16].add_term("cultivation",
		 * "n.우호 증진,양성"); HT[16].add_term("dealer", "n.판매업자,상인");
		 * HT[16].add_term("depot", "n.창고,저장소"); HT[16].add_term("diminish", "v.감소하다");
		 * HT[16].add_term("distribute", "v.배포하다,배급하다"); HT[16].add_term("diversified",
		 * "a.다양화,여러 가지의"); HT[16].add_term("do business with", "phr.~와 거래하다");
		 * HT[16].add_term("encompass", "v.포함하다,둘러싸다"); HT[16].add_term("engrave",
		 * "v.(문자, 도안 등을)~에 세기다"); HT[16].add_term("enviable", "a.부러워할 만한, 샘나는");
		 * HT[16].add_term("inevitable", "a.불가피한"); HT[16].add_term("inventory",
		 * "n.재고품, 재고목록"); HT[16].add_term("invoice", "n.송장,인보이스");
		 * HT[16].add_term("keep track of", "phr.~을 계속 알고 있다,~에 대해 끊임없이 정보를 얻어내다");
		 * HT[16].add_term("order", "v.주문하다"); HT[16].add_term("provide",
		 * "v.공급하다,제공하다"); HT[16].add_term("quota", "n.견적액"); HT[16].add_term("refuse",
		 * "v.거절하다"); HT[16].add_term("represent", "v.~을 대표하다");
		 * HT[16].add_term("retail", "n.소매"); HT[16].add_term("satisfactory",
		 * "a.만족스러운"); HT[16].add_term("selection", "n.선택된 것,정선품");
		 * HT[16].add_term("short", "a.부족한"); HT[16].add_term("shortly",
		 * "ad.곧, 얼마 안 있어"); HT[16].add_term("stock", "n.재고;주식");
		 * HT[16].add_term("subject", "a.~의 영향을 받기 쉬운;(동의 등을)조건으로 하는 v.~에게 (~을) 받게 하다");
		 * HT[16].add_term("supply", "v.공급하다 n.공급;(-s)비품, 소모품");
		 * HT[16].add_term("temporarily", "ad.일시적으로"); HT[16].add_term("unable",
		 * "a.~할 수 없는");
		 * 
		 * 
		 * HT[17].add_term("accelerate", "v.촉진하다,가속화하다"); HT[17].add_term("acknowledge",
		 * "v.인정하다;(편지 등의)수령을 알리다"); HT[17].add_term("address",
		 * "n.주소 v.(어려운 문제 등을)다루다,처리하다"); HT[17].add_term("adequately", "ad.적절히");
		 * HT[17].add_term("affix", "v.(우표 등을)붙이다"); HT[17].add_term("attach",
		 * "v.붙이다,접착하다"); HT[17].add_term("bilateral", "a.쌍방의");
		 * HT[17].add_term("by hand", "phr.인편으로,손으로"); HT[17].add_term("carton",
		 * "n.(큰)판지 상자"); HT[17].add_term("caution", "n.주의,조심");
		 * HT[17].add_term("convenlence", "n.편의,편리"); HT[17].add_term("correspondence",
		 * "n.편지,통신문"); HT[17].add_term("courier", "n.급송 택배");
		 * HT[17].add_term("deliver", "v.배달하다;(연설을)하다"); HT[17].add_term("detach",
		 * "v.떼다"); HT[17].add_term("efficient", "a.(기계,방법 등이)능률적인,효과적인");
		 * HT[17].add_term("embargo", "n.(특정 상품의)무역 금지,통상 정지"); HT[17].add_term("enact",
		 * "v.제정하다"); HT[17].add_term("enclose", "v.~을 동봉하다;~을 에워싸다");
		 * HT[17].add_term("ensure", "v.보증하다,확실하게 하다"); HT[17].add_term("envelope",
		 * "n.봉투"); HT[17].add_term("expedite", "v.신속히 처리하다,진척시키다");
		 * HT[17].add_term("fragile", "a.깨지기 쉬운"); HT[17].add_term("handle",
		 * "v.다루다,취급하다"); HT[17].add_term("impose", "v.(세금 등을)부과하다");
		 * HT[17].add_term("inaugurate", "v.정식으로 ~을 개시하다"); HT[17].add_term("incorrect",
		 * "a.부정확한"); HT[17].add_term("oblige", "v.~에게 강요하다,할 수 없이 ~하게 하다");
		 * HT[17].add_term("particularly", "ad.특히"); HT[17].add_term("perishable",
		 * "a.부패하기 쉬운"); HT[17].add_term("postage", "n.우편 요금");
		 * HT[17].add_term("recipient", "n.수신자"); HT[17].add_term("reciprocal",
		 * "a.상호의,서로의"); HT[17].add_term("remarkable", "a.현저한,두드러진");
		 * HT[17].add_term("retaliation", "n.보복"); HT[17].add_term("shipment",
		 * "n.선적,(화물의)발송;탁송화물"); HT[17].add_term("step", "n.단계;조치,수단");
		 * HT[17].add_term("surplus", "n.잉여,흑자");
		 * 
		 * HT[18].add_term("accommodate", "v.(건물 등이)~을 수용하다,숙박시키다");
		 * HT[18].add_term("agreeably", "ad.쾌적하게,기분 좋게"); HT[18].add_term("ahead",
		 * "ad.미리,앞서서"); HT[18].add_term("amenity", "n.편의 시설");
		 * HT[18].add_term("assorted", "a.여러 가지 종류의,다채로운");
		 * HT[18].add_term("atmosphere", "n.분위기,환경"); HT[18].add_term("available",
		 * "a.(사물이)이용 가능한;(사람이)시간이 있는"); HT[18].add_term("belongings", "n.소지품,소유물");
		 * HT[18].add_term("check in", "phr.체크인하다,숙박수속을 하다"); HT[18].add_term("chef",
		 * "n.주방장"); HT[18].add_term("choice", "n.선택물,선택사항,선택");
		 * HT[18].add_term("compensate", "v.~에게 보상하다"); HT[18].add_term("complication",
		 * "n.복잡한 문제"); HT[18].add_term("complimentary", "a.무료의,우대의");
		 * HT[18].add_term("confirm", "v.확인하다"); HT[18].add_term("connoisseur",
		 * "n.감정가,감식가"); HT[18].add_term("container", "n.그릇,용기");
		 * HT[18].add_term("conveniently", "ad.편리하게"); HT[18].add_term("cuisine",
		 * "n.(독특한)요리"); HT[18].add_term("dignitary", "n.고위 관리");
		 * HT[18].add_term("elegant", "a.우아한,고상한"); HT[18].add_term("entirely",
		 * "ad.완전히"); HT[18].add_term("extensive", "a.광범위한,넓은");
		 * HT[18].add_term("flavor", "n.맛,풍미"); HT[18].add_term("forfeit",
		 * "v.(벌로서 권리,재산 등을)잃다,몰수당하다"); HT[18].add_term("freshness", "n.신선함");
		 * HT[18].add_term("indigenous", "a.지역 고유의,토착의"); HT[18].add_term("make",
		 * "v.~을 하다,~을 만들다"); HT[18].add_term("occupancy", "n.(호텔 등의)이용률");
		 * HT[18].add_term("polish", "v.~을 닦다,~의 윤을 내다"); HT[18].add_term("rate",
		 * "n.요금"); HT[18].add_term("reception", "n.환영회;(호텔의)접수처");
		 * HT[18].add_term("recipe", "n.요리법,조리법"); HT[18].add_term("reservation",
		 * "n.예약"); HT[18].add_term("retain", "v.보유하다,유지하다"); HT[18].add_term("stir",
		 * "v.휘젓다,뒤섞다"); HT[18].add_term("taste", "v.~의 맛을 보다,시식하다");
		 * HT[18].add_term("utensil", "n.(부엌에서 쓰는)도구,기구");
		 * 
		 * HT[19].add_term("anticipate", "v.기대하다,예상하다"); HT[19].add_term("decline",
		 * "n.감소,하락 v.(초대,신청을)거절하다"); HT[19].add_term("decrease", "v.감소하다");
		 * HT[19].add_term("demoralize", "v.~의 사기를 꺾다"); HT[19].add_term("depend",
		 * "v.~에 따라 결정되다,~에 달려 있다"); HT[19].add_term("deviate", "v.빗나가다, 일탈하다");
		 * HT[19].add_term("disappointing", "a.실망스러운, 실망시키는");
		 * HT[19].add_term("encouraging", "a.용기를 북돋워주는"); HT[19].add_term("exceed",
		 * "v.~을 초과하다"); HT[19].add_term("factor", "n.요소, 원인");
		 * HT[19].add_term("figure", "n.합계 수, 총액"); HT[19].add_term("growth",
		 * "n.성장, 발전"); HT[19].add_term("illustrate", "v.설명하다, 예증하다");
		 * HT[19].add_term("impressive", "a.굉장한, 인상적인"); HT[19].add_term("inaccurate",
		 * "a.부정확한"); HT[19].add_term("increase", "n.증가 v.증가하다");
		 * HT[19].add_term("incur", "v.(손실을)입다, (빚을)지다"); HT[19].add_term("indicative",
		 * "a.나타내는, 암시하는"); HT[19].add_term("infusion", "n.주입, 혼합");
		 * HT[19].add_term("make up for", "phr.~을 만회하다, 보상하다");
		 * HT[19].add_term("markedly", "ad.현저하게, 눈에 띄게"); HT[19].add_term("meagerly",
		 * "ad.빈약하게, 불충분하게"); HT[19].add_term("minimally", "ad.극히 작게, 최소한으로");
		 * HT[19].add_term("offset", "v.상쇄하다, 벌충하다"); HT[19].add_term("percentage",
		 * "n.백분율"); HT[19].add_term("production", "n.생산, 생산량");
		 * HT[19].add_term("profit", "n.이익, 수익"); HT[19].add_term("projection",
		 * "n.예상, 예상치"); HT[19].add_term("proportion", "n.부분, 몫");
		 * HT[19].add_term("recent", "a.최근의"); HT[19].add_term("reduce",
		 * "v.줄이다, 감소시키다"); HT[19].add_term("regular", "a.정기적인; 단골의");
		 * HT[19].add_term("representative", "n.판매 대리인, 세일즈맨; 대표자");
		 * HT[19].add_term("revenue", "n.수입"); HT[19].add_term("sale",
		 * "n.(-s)매출액, 매상고; 재고 정리 판매"); HT[19].add_term("significantly",
		 * "ad.상당히, 두드러지게"); HT[19].add_term("slightly", "ad.약간");
		 * HT[19].add_term("substantial", "a.상당한"); HT[19].add_term("summarize",
		 * "v.요약하다"); HT[19].add_term("tend", "v.~하는 경향이 있다, ~하기 쉽다");
		 * HT[19].add_term("unusually", "ad.유난히, 비정상적으로");
		 * 
		 * HT[20].add_term("accountant", "n.회계사"); HT[20].add_term("accurately",
		 * "ad.정확하게"); HT[20].add_term("allocate", "v.할당하다, 배분하다");
		 * HT[20].add_term("amend", "v.수정하다"); HT[20].add_term("audit", "n.회계 감사, 심사");
		 * HT[20].add_term("barely", "ad.가까스로, 거의 ~하지 않는"); HT[20].add_term("budget",
		 * "n.예산"); HT[20].add_term("calculate", "v.계산하다"); HT[20].add_term("committee",
		 * "n.위원회"); HT[20].add_term("compare", "v.비교하다"); HT[20].add_term("curtail",
		 * "v.~을 줄이다, 삭감하다"); HT[20].add_term("deduct", "v.공제하다, 빼다");
		 * HT[20].add_term("deficient", "a.부족한, 불충분한"); HT[20].add_term("deficit",
		 * "n.적자, 부족액"); HT[20].add_term("discrepancy", "n.불일치, 차이");
		 * HT[20].add_term("excess", "n.초과, 초과량"); HT[20].add_term("exempt",
		 * "a.면제된, ~이 없는"); HT[20].add_term("expenditure", "n.지출, 비용");
		 * HT[20].add_term("financial", "a.재정의, 금전상의"); HT[20].add_term("fiscal",
		 * "a.회계의, 재정상의"); HT[20].add_term("fund", "n.자금 v.자금을 공급하다");
		 * HT[20].add_term("generate", "v.창출하다, 야기하다"); HT[20].add_term("in the red",
		 * "phr.적자 상태인"); HT[20].add_term("incidental", "a.부수적인");
		 * HT[20].add_term("inconsistency", "n.불일치"); HT[20].add_term("inflation",
		 * "n.인플레이션, 물가상승, 통화팽창"); HT[20].add_term("ledger", "n.회계 장부");
		 * HT[20].add_term("liable", "a.책임져야 할; ~하기 쉬운"); HT[20].add_term("liability",
		 * "n.책임; (-ties)부채, 채무"); HT[20].add_term("monetary", "a.금전의, 재정적인");
		 * HT[20].add_term("outlay", "n.지출, 경비"); HT[20].add_term("overcome", "v.극복하다");
		 * HT[20].add_term("preferred", "a.우선의, 선호되는"); HT[20].add_term("recently",
		 * "ad.최근에"); HT[20].add_term("reimburse", "v.변제하다, 상환하다");
		 * HT[20].add_term("rigorously", "ad.엄격히"); HT[20].add_term("spend",
		 * "v.~을 쓰다, 소비하다"); HT[20].add_term("stringently", "ad.엄격히, 엄중하게");
		 * HT[20].add_term("substantially", "ad.크게, 상당히"); HT[20].add_term("total",
		 * "a.총계의, 전부의"); HT[20].add_term("turnover", "n.총 매상고, 거래액; 이직률");
		 * HT[20].add_term("worth", "a.~의 가치가 있는 n.가치, (얼마)어치");
		 * 
		 * HT[21].add_term("accept", "v.수락하다, 승낙하다"); HT[21].add_term("acquire",
		 * "v.매입하다, 취득하다"); HT[21].add_term("active", "a.적극적인, 활발한");
		 * HT[21].add_term("allegedly", "ad.주장하는 바에 따르면"); HT[21].add_term("announce",
		 * "v.발표하다"); HT[21].add_term("asset", "n.자산"); HT[21].add_term("authority",
		 * "n.권한; 당국, 관헌"); HT[21].add_term("clout", "n.영향력");
		 * HT[21].add_term("considerable", "a.(정도나 양이)상당한");
		 * HT[21].add_term("contingent", "a.~에 따라 결정되는, ~여하에 달린");
		 * HT[21].add_term("contribute", "v.기여하다, 공헌하다"); HT[21].add_term("dedicated",
		 * "a.(목표 등에)일신을 바친, 헌신적인"); HT[21].add_term("emerge", "v.부각하다, 나타나다");
		 * HT[21].add_term("enhance", "v.(질 등을)높이다, 강화하다"); HT[21].add_term("establish",
		 * "v.설립하다"); HT[21].add_term("established", "a.확고한, 정평이 있는");
		 * HT[21].add_term("expansion", "n.확장, 팽창"); HT[21].add_term("force", "n.세력");
		 * HT[21].add_term("foresee", "v.예견하다, 예감하다"); HT[21].add_term("go through",
		 * "phr.(고난, 경험을)겪다"); HT[21].add_term("independent", "a.독립의, 독자적인");
		 * HT[21].add_term("informed", "a.정보에 근거한"); HT[21].add_term("initiate",
		 * "v.(사업 등을)시작하다, 착수하다"); HT[21].add_term("interested", "a.관련 있는; 관심이 있는");
		 * HT[21].add_term("liquidate", "v.(회사를)정리하다, 해산하다"); HT[21].add_term("merge",
		 * "v.합병하다, 병합하다"); HT[21].add_term("premier", "a.으뜸의, 첫째의");
		 * HT[21].add_term("productivity", "n.생산성"); HT[21].add_term("progressive",
		 * "a.진보적인"); HT[21].add_term("relocate", "v.(공장 등을)이전하다");
		 * HT[21].add_term("reveal", "v.밝히다, 누설하다"); HT[21].add_term("run",
		 * "v.~을 경영하다"); HT[21].add_term("simultaneously", "ad.동시에");
		 * HT[21].add_term("stance", "n.태도, 입장"); HT[21].add_term("strategic",
		 * "a.전략적인"); HT[21].add_term("strike", "n.동맹 파업, 노동 쟁의");
		 * HT[21].add_term("struggle", "v.애쓰다, 분투하다"); HT[21].add_term("subsidize",
		 * "v.~에 보조금을 지급하다"); HT[21].add_term("surpass", "v.~을 능가하다, 넘어서다");
		 * HT[21].add_term("takeover", "n.인수"); HT[21].add_term("uncertain",
		 * "a.확신이 없는, 불확실한"); HT[21].add_term("waive", "v.(권리, 청구 등을)포기하다");
		 * 
		 * HT[22].add_term("aid", "n.원조"); HT[22].add_term("chance", "n.가능성");
		 * HT[22].add_term("clear", "맑게 갠"); HT[22].add_term("conserve",
		 * "v.보존하다, 유지하다"); HT[22].add_term("contaminate", "v.오염시키다");
		 * HT[22].add_term("continually", "ad.계속해서"); HT[22].add_term("damage",
		 * "n.손해, 피해 v.(물건에)손해를 입히다"); HT[22].add_term("deciduous", "a.낙엽성의");
		 * HT[22].add_term("deplete", "v.고갈시키다"); HT[22].add_term("disaster", "n.재난");
		 * HT[22].add_term("discharge", "v.방출하다"); HT[22].add_term("dispose",
		 * "v.처분하다, 처리하다"); HT[22].add_term("drought", "n.가뭄");
		 * HT[22].add_term("ecology", "n.자연 환경, 생태"); HT[22].add_term("emission",
		 * "n.방출, 배출가스"); HT[22].add_term("endangered", "a.멸종 위기에 처한");
		 * HT[22].add_term("environmental", "a.환경적인"); HT[22].add_term("extinction",
		 * "n.멸종"); HT[22].add_term("flood", "n.홍수"); HT[22].add_term("forecast",
		 * "n.(날씨의)예보"); HT[22].add_term("fumes", "n.가스, 연기");
		 * HT[22].add_term("habitat", "n.(동, 식물의)서식지"); HT[22].add_term("ideal",
		 * "a.이상적인"); HT[22].add_term("inclement", "a.(날씨가)궂은, 혹독한");
		 * HT[22].add_term("inflict", "v.(고통, 피해)를 가하다, 입히다");
		 * HT[22].add_term("meteorological", "a.기상의, 기상학상의");
		 * HT[22].add_term("migration", "n.이동, 이주"); HT[22].add_term("mining",
		 * "n.채굴, 채광"); HT[22].add_term("occur", "v.(일이)발생하다, 생기다");
		 * HT[22].add_term("organization", "n.단체"); HT[22].add_term("pollutant",
		 * "n.오염 물질"); HT[22].add_term("precipitation", "n.강수량, 강우량");
		 * HT[22].add_term("prominent", "a.저명한, 두드러진"); HT[22].add_term("purify",
		 * "v.정화시키다"); HT[22].add_term("recycling", "n.재활용");
		 * HT[22].add_term("resource", "n.자원"); HT[22].add_term("sewage", "n.하수, 오수");
		 * HT[22].add_term("shower", "n.소나기"); HT[22].add_term("solution", "n.해결책");
		 * HT[22].add_term("southern", "a.남쪽의"); HT[22].add_term("vague", "a.모호한, 애매한");
		 * HT[22].add_term("waste", "n.쓰레기");
		 * 
		 * HT[23].add_term("account", "n.고려; 계좌 v.(~의 이유를)밝히다, 설명하다;(~의 비율을)차지하다");
		 * HT[23].add_term("accrue", "v.축적하다, 모으다"); HT[23].add_term("amount",
		 * "n.액수, 양"); HT[23].add_term("balance", "n.차감 잔액, 잔고");
		 * HT[23].add_term("belatedly", "ad.뒤늦게"); HT[23].add_term("bill",
		 * "v.~에게 청구서를 보내다 n.청구서, 계산서"); HT[23].add_term("bounce",
		 * "v.(수표 등이)부도가 나 되돌아오다"); HT[23].add_term("cash", "현금으로 바꾸다");
		 * HT[23].add_term("collateral", "n.담보, 저당물"); HT[23].add_term("confiscate",
		 * "v.압수하다, 몰수하다"); HT[23].add_term("convert", "v.전환하다, 변환하다");
		 * HT[23].add_term("counterfeit", "n.가짜, 모조품"); HT[23].add_term("curb",
		 * "v.억제하다"); HT[23].add_term("delinquent", "a.(세금 등이)연체된, 미불의");
		 * HT[23].add_term("deposit", "v.입금하다, 예금하다"); HT[23].add_term("deterrent",
		 * "n.방해물, 억지물"); HT[23].add_term("document", "n.서류, 문서 v.기록하다, 문서를 작성하다");
		 * HT[23].add_term("due", "a.만기가 된, 지불기일이 된; (금전 등이)~에게 마땅히 지급되어야 할");
		 * HT[23].add_term("expect", "v.예상하다, 기대하다"); HT[23].add_term("heavily",
		 * "ad.몹시, 심하게"); HT[23].add_term("identification", "n.신분 증명서");
		 * HT[23].add_term("in common", "phr.공동으로, 공통으로"); HT[23].add_term("interest",
		 * "n.관심; 관리; 이자"); HT[23].add_term("investigation", "n.조사");
		 * HT[23].add_term("loan", "n.대부, 대부금"); HT[23].add_term("lower",
		 * "v.(양, 가격을)줄이다"); HT[23].add_term("mortgage", "n.주택 융자, 저당 융자금");
		 * HT[23].add_term("overdue", "a.미납의, 지불기한이 넘은"); HT[23].add_term("owe",
		 * "v.빚지고 있다"); HT[23].add_term("owing to", "phr.~로 인하여");
		 * HT[23].add_term("payable", "a.지불해야 하는"); HT[23].add_term("personal",
		 * "a.개인의"); HT[23].add_term("previously", "ad.이전에");
		 * HT[23].add_term("regrettably", "ad.유감스럽게도"); HT[23].add_term("relation",
		 * "n.관계"); HT[23].add_term("scrutinize", "v.세밀히 조사하다");
		 * HT[23].add_term("statement", "n.명세서, 성명서"); HT[23].add_term("study", "n.연구");
		 * HT[23].add_term("sustain", "v.지속하다"); HT[23].add_term("transaction",
		 * "n.거래, 업무"); HT[23].add_term("turn down", "phr.거절하다");
		 * HT[23].add_term("unexpected", "a.예기치 않은"); HT[23].add_term("withdrawal",
		 * "n.(예금의)인출");
		 * 
		 * HT[24].add_term("bond", "n.채권"); HT[24].add_term("cautiously", "ad.조심스럽게");
		 * HT[24].add_term("confusion", "n.혼란"); HT[24].add_term("consent", "n.동의");
		 * HT[24].add_term("consider", "v.고려하다"); HT[24].add_term("controversy",
		 * "n.논란"); HT[24].add_term("depreciation", "n.가치 하락, 화폐의 구매력 저하");
		 * HT[24].add_term("devastate", "v.황폐시키다"); HT[24].add_term("dividend",
		 * "n.배당금"); HT[24].add_term("entrepreneur", "n.사업가");
		 * HT[24].add_term("eventually", "ad.결국, 마침내"); HT[24].add_term("foreseeable",
		 * "a.예견할 수 있는"); HT[24].add_term("increasing", "a.증가하는");
		 * HT[24].add_term("inherently", "ad.본질적으로"); HT[24].add_term("innate",
		 * "a.타고난"); HT[24].add_term("insecure", "a.불안한, 확신이 안 가는");
		 * HT[24].add_term("investor", "n.투자가"); HT[24].add_term("justify", "v.정당화하다");
		 * HT[24].add_term("legacy", "n.유산, 유물"); HT[24].add_term("lucrative",
		 * "a.수익성 있는, 돈벌이가 되는"); HT[24].add_term("manipulation", "n.조작, 시장 조작");
		 * HT[24].add_term("nearly", "ad.거의, 대략"); HT[24].add_term("on behalf of",
		 * "phr.~을 대신해서"); HT[24].add_term("outlook", "n.전망");
		 * HT[24].add_term("outweigh", "v.(가치, 중요성이)~보다 크다"); HT[24].add_term("pitfall",
		 * "n.생각치 못한 위험, 장애"); HT[24].add_term("plummet", "v.폭락하다");
		 * HT[24].add_term("portfolio", "n.포트폴리오, 투자 자산 구성");
		 * HT[24].add_term("possible", "a.가능한, 있음직한"); HT[24].add_term("prevalent",
		 * "a.널리 퍼진, 유행하고 있는"); HT[24].add_term("property", "n.재산");
		 * HT[24].add_term("rapid", "a.빠른, 신속한"); HT[24].add_term("shareholder",
		 * "n.주주"); HT[24].add_term("solely", "ad.전적으로"); HT[24].add_term("somewhat",
		 * "ad.다소, 얼마간"); HT[24].add_term("speculation", "n.추측");
		 * HT[24].add_term("stability", "n.안정, 안정성"); HT[24].add_term("unbiased",
		 * "a.선입견 없는, 편견 없는"); HT[24].add_term("unprecedented", "a.전례 없는");
		 * HT[24].add_term("unwillingness", "n.내키지 않아 함"); HT[24].add_term("yield",
		 * "v.(이윤을)가져오다");
		 */
    }
}
