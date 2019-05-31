package 문제은행.모델;

import 문제은행.모델.Question_bank.Keyword;

class Engineer_Information_Processing extends Subject
{
    public Engineer_Information_Processing(String name, Keyword engineerInformationProcessing)
    {
    	super(name, engineerInformationProcessing);
        this.CT = new Concept[7];                     //행은 챕터, 열은 섹션
        CT[1] = new Concept("데이터베이스 - 데이터베이스 개념");
        CT[2] = new Concept("데이터베이스 - 데이터 모델 및 데이터베이스 설계");
        CT[3] = new Concept("데이터베이스 - 관계형 데이터베이스");
        CT[4] = new Concept("데이터베이스 - 데이터베이스 고급 기법");
        CT[5] = new Concept("데이터베이스 - 자료 구조의 기본");
        CT[6] = new Concept("전자계산기");

		/*
		 * CT[1].add_concept("정보 시스템(IS : Information System)",
		 * "필요한 자료를 수집, 분배하여 저장했다가 필요로 할 때 저장된 자료를 처리하여 의사 결정에 필요한 정보를 제공하는 시스템을 의미한다."
		 * ); CT[1].add_concept("자료의 의미",
		 * "- 자료란 현실 세계에서 어떤 측정을 통해 얻은 단순한 값이다\r\n- 현실 세계에 대한 관찰을 통해서 얻은 사실이다.\r\n처리되지 않은 데이터이다."
		 * ); CT[1].add_concept("정보의 의미",
		 * "- 자료를 처리하여 얻은 값이다.\r\n- 자료에 대한 분석을 통해 얻은 지식이다.");
		 * CT[1].add_concept("자료를 처리하여 정보를 얻어내는 과정",
		 * "자료(Data) -> 처리(Processing) -> 정보(Information).\r\n제어(Control) -> 자료(Data), 정보(Information).\r\n정보(Information) -> 피드백(Feed Back)"
		 * ); CT[1].add_concept("일괄 처리 시스템(Batch Processing System)",
		 * "발생되는 자료를 수집해서 분류해 놓았다가 유사한 트랜잭션들을 한 데 모아 일정한 시점에 일괄적으로 처리하는 방식의 시스템을 의미한다."
		 * ); CT[1].add_concept("일괄 처리 시스템(Batch Processing System)의 특징",
		 * "- 시스템 중심의 자료 처리 방법이다.\r\n- 테이프와 같은 순차 접근 방법을 사용하는 업무에 적합하다.\r\n- 단위 시간당 처리하는 작업수가 많으므로 시스템 성능은 높다.\r\n- 트랜잭션당 처리 비용이 적다.\r\n- 사전 작업 및 결과가 나올 때까지 많은 시간이 필요하다.\r\n- 예 : 전화 요금, 급여 계산, 세무 처리, 연말 결산 등 순차 접근 방법의 업무 형태에 적합하다."
		 * ); CT[1].add_concept("온라인 실시간 처리 시스템(On-Line Real Time Processing System)",
		 * "데이터가 발생하게 되면 데이터를 즉시 컴퓨터에 전달하여 처리하는 방식의 시스템을 의미한다.");
		 * CT[1].add_concept("온라인 실시간 처리 시스템(On-Line Real Time Processing System)의 특징",
		 * "- 사용자 중심 처리 방식이다.\r\n- 오류 수정이 쉽다.\r\n- 구축 비용이 많이 들고 구조가 복잡하다.\r\n- 응답 시간에 대한 제약 요소가 많다.\r\n- 작업량이 많지 않은 경우 시스템 사용 효율이 떨어지게 된다.\r\n- 트랜잭션당 처리 비용이 높다.\r\n- 유지보수나 회복이 복잡하다.\r\n- 예 : 좌석 예약, 은행 입출금 업무, 우주선 운행이나 레이더 추적기, 전화 교환 장치의 제어 등 실시간 처리 업무 형태에 적합하다."
		 * ); CT[1].add_concept("분산 처리 시스템(Distributed Processing System)",
		 * "다양한 지역 처리를 위해서 지리적으로 분산되어 있는 처리기를 통신 네트워크로 연결하여, 논리적으로 하나의 시스템을 사용하는 것처럼 운영하는 방식이다. 지역에서 처리하지 못하는 것은 중앙 컴퓨터에서 처리한다."
		 * ); CT[1].add_concept("분산 처리 시스템(Distributed Processing System)의 특징",
		 * "- 지리적으로 분산되어 있는 업무를 효과적으로 처리할 수 있다.\r\n- 시스템에 대한 장애 발생 시 다른 처리기로 신뢰성을 증진할 수 있다.\r\n- 각 지역의 특색에 맞는 자원을 이용하여 하드웨어나 소프트웨어를 구축할 수 있으므로 적응성, 융통성 등이 뛰어나다.\r\n다양한 자원에 따른 구축 비용이 증가된다.\r\n통신망에 따른 제약사항이 있다."
		 * ); CT[1].add_concept("트랜잭션(Transaction)", "하나의 논리적 기능을 수행하기 위한 작업의 단위이다.");
		 * CT[1].add_concept("데이터웨어 하우스(DataWare House)",
		 * "사용자의 의사 결정에 도움을 주기 위하여 다양한 운영 시스템에서 추출, 변환, 통합, 요약된 데이터베이스를 말한다. 원시 데이터 계층, 데이터웨어 하우스 계층, 클라이언트 계층으로 구성되며 데이터의 추출, 저장, 조회 등의 활동을 한다."
		 * );
		 * 
		 * CT[1].add_concept("데이터베이스(DB : DataBase)의 정의",
		 * "응용 시스템들이 데이터를 공유할 수 있도록 운영에 필요한 모든 데이터를 통합하여 컴퓨터에 저장한 데이터를 의미한다.");
		 * CT[1].add_concept("데이터베이스에서 공용 데이터(Shared Data)",
		 * "다양한 사용자들이 필요한 정보를 공동으로 이용할 목적으로 만들어진 자료이다.");
		 * CT[1].add_concept("데이터베이스에서 운영 데이터(Operational Data)",
		 * "한 조직체가 유지되고 운영되는 데 필요한 모든 개체데이터와 관계 데이터의 집합이다.");
		 * CT[1].add_concept("데이터베이스에서 통합 데이터(Integrated Data)",
		 * "데이터 집단에서 자료의 중복이나 군더더기를 제거하여 최적화시킨 데이터의 집합이다.");
		 * CT[1].add_concept("데이터베이스에서 저장 데이터(Stored Data)",
		 * "컴퓨터 시스템이 접근 가능한 저장 매체에 저장된 데이터의 집합이다."); CT[1].add_concept("데이터베이스의 특징 6가지",
		 * "- 데이터 중복의 최소화(Redun Dancy Minimize)\r\n- 계속적인 변화(Continuous Evolution)\r\n- 실시간 접근(Real Time Accessibility)\r\n- 동시 공유(Concurrent Sharing)\r\n- 내용에 의한 접근(Content Reference)\r\n- 뛰어난 자료 간 연계성(Superb Data Combination)"
		 * ); CT[1].add_concept("데이터베이스의 등장배경",
		 * "- 최신의 정확한 정보를 신속하게 이용할 필요가 생겼다.\r\n- 많은 양의 자료와 정보를 간소화할 필요성이 대두되었다.\r\n- 여러 사용자가 데이터를 공유해야 할 필요가 생겼다.\r\n- 현실 세계를 빠르게 반영하기 위해 삽입, 삭제, 갱신 등을 통해서 현재의 데이터를 동적으로 유지하고 싶었다.\r\n- 데이터의 가용성 증대를 위해 중복을 최대한 배제하고 싶었다.\r\n- 물리적인 주소가 아닌 데이터 값에 의한 직접적인 검색을 수행하고 싶었다."
		 * ); CT[1].add_concept("데이터베이스의 구성 요소 3가지",
		 * "속성(Attribute), 개체(Entity), 관계(Relationship)");
		 * CT[1].add_concept("데이터베이스에서 속성(Attribute)",
		 * "- 데이터베이스를 구축하는 가장 작은 논리적 단위로 파일 시스템의 필드 개념에 해당한다.\r\n- 자체만으로는 정보를 표현할 수 없고 정보를 표현하는 단위인 개체나 관계의 특성을 설명하는 도구의 의미로 사용된다."
		 * ); CT[1].add_concept("데이터베이스에서 개체(Entity)",
		 * "- 정보를 나타내는 눈리적 단위로서 파일 시스템의 레코드에 해당한다.\r\n- 개체는 하나 이상의 속성을 조합하여 구성된다.\r\n- 현실 세계의 표현 단위 역할을 하게 된다.\r\n- 개체는 단독으로 존재할 수 있다.\r\n- 모든 개체는 구별 가능하다."
		 * ); CT[1].add_concept("데이터베이스에서 개체 타입(Entity Type)",
		 * "개체 스키마(Entity Schema)라고도 하며 개체 이름과 이 개체의 속성들로 구성하여 만든 논리적인 정의, 즉 성계에 해당하는 개념이다."
		 * ); CT[1].add_concept("데이터베이스에서 개체 어커런스(Entity Occurrence)",
		 * "개체 인스턴스(Entity Instance)라고도 하며 개체 타입의 연산에 의해 실제적인 개체 값이 들어가 있는 상태를 의미한다.");
		 * CT[1].add_concept("데이터베이스에서 개체 집합(Entity Set)",
		 * "개체 어커런스들의 집합을 개체 집합이라고 한다.");
		 * CT[1].add_concept("데이터베이스에서 속성 관계(Attribute Relationship)",
		 * "개체를 기술하기 위해 그 개체가 가지고 있는 성질이나 특징을 파악하여 속성으로 구성한 후 속성과 속성 사이의 관계를 가지고 개체를 기술하게 되는데 이것을 속성 관계 또는 개체내 관계(Intra-Entity Relationship)라고 한다."
		 * ); CT[1].add_concept("데이터베이스에서 개체 관계(Entity Relationship)",
		 * "개체와 개체 사이의 관계를 의미하는 것으로 개체 간 관계(Inter-Entity Relationship)라고도 한다.");
		 * CT[1].add_concept("데이터베이스의 논리적 구조",
		 * "사용자나 응용 프로그래머가 데이터베이스를 바라보는 관점에서 데이터 배치 형태를 의미하는 것으로 논리적 레코드를 가지고 사용자나 응용 프로그래머의 상상에 따라 논리적으로 전개한 모양을 의미한다."
		 * ); CT[1].add_concept("데이터베이스의 물리적 구조",
		 * "데이터가 실제적인 물리적 저장 장치에 배치되어 있는 형태를 의미하는 것으로 저장 레코드를 이용하여 실제 물리적 저장 장치 위에 전개한 모양을 의미한다."
		 * ); CT[1].add_concept("데이터베이스의 3단계", "외부 단계 -> 개념 단계 -> 내부 단계");
		 * CT[1].add_concept("데이터베이스의 외부 단계",
		 * "사용자의 관점에서 데이터베이스를 바라보는 관점이다. 즉 사용자가 쉽게 접근하여 데이터를 사용할 수 있도록 여러 개의 외부 스키마가 마련되어 있는 단계이다."
		 * ); CT[1].add_concept("데이터베이스의 개념 단계",
		 * "사용자와 물리적인 데이터베이스 사이의 단계로서 데이터베이스 전체의 정보를 표현하는 단계이다.");
		 * CT[1].add_concept("데이터베이스의 내부 단계",
		 * "실제적으로 데이터베이스가 저장되는 저장 장치에 대한 물리적 형태를 표현하는 단계로서 하나의 내부 스키마를 갖게 되는 단계이다.");
		 * CT[1].add_concept("데이터베이스의 응용 인터페이스(사상(Mapping))",
		 * "외부 스키마와 개념 스키마 간의 사상 관계를 나타내는 인터페이스이다.");
		 * CT[1].add_concept("데이터베이스의 저장 인터페이스(사상(Mapping))",
		 * "개념 스키마와 내부 스키마 간의 사상 관계를 나타내는 인터페이스이다."); CT[1].add_concept("스키마의 개념",
		 * "- 데이터베이스의 전체적인 논리적 설계를 의미하는 것으로 데이터 객체, 이들의 성질, 이들 간의 관계, 데이터 관계들이 갖는 제약 조건에 관한 정의를 총칭하는 개념이다.\r\n- 시간에 따라 불변의 특성을 갖는다.\r\n- 스키마는 데이터의 구조적 특성을 의미하며 인스턴스(Instance)에 의해 규정된다"
		 * ); CT[1].add_concept("스키마의 3층 구조",
		 * "외부 스키마(External Schema), 개념 스키마(Conceptual Schema), 내부 스키마(Internal Schema)"
		 * ); CT[1].add_concept("외부 스키마(External Schema)",
		 * "- 각각의 사용자 그룹이 원하는 형태의 논리적 구조를 정의한다.\r\n- 조직 전체가 아니라 일부분을 정의한다\r\n- 외부 스키마는 각각의 사용자 그룹을 위해서 만들어져야 하므로 여러 개가 존재하게 된다.\r\n- 응용 프로그래머나 사용자들이 가장 관심을 갖는 부분이다.\r\n- 응용 프로그래머나 사용자와 관련된 개체\r\n- 응용 프로그래머나 사용자와 관련된 개체들의 관계 및 제약 조건"
		 * ); CT[1].add_concept("개념 스키마(Conceptual Schema)",
		 * "- 모든 응용 시스템과 사용자들이 필요로 하는 데이터를 통합한 조직 전체의 데이터베이스 구조를 논리적으로 정의하는 개념으로 하나만 존재한다.\r\n- 범 기관적 입장에서 데이터베이스 전체를 정의한 것이다.\r\n- 한 기관 전체에서 필요로 하는 모든 개체\r\n- 모든 개체들의 관계\r\n- 유지해야 될 제약 사항\r\n- 데이터베이스의 접근 권한, 보안, 무결성 규칙"
		 * ); CT[1].add_concept("내부 스키마(Internal Schema)",
		 * "- 전체 데이터베이스의 물리적 저장 형태를 기술하는 개념이다.\r\n- 개념 스키마의 물리적 저장 형태를 정의하는 개념으로 하나만 존재한다.\r\n- 저장될 내부 레코드(저장 레코드)의 형식\r\n- 인덱스(Index)의 유무\r\n- 저장 데이터 항목의 표현 방법\r\n- 내부 레코드의 물리적 순서"
		 * ); CT[1].add_concept("데이터베이스의 논리적 데이터의 독립성",
		 * "데이터의 논리 구조를 변경할 필요성이 있을 때 기존 프로그램은 그것을 사용하는 응용 프로그램도 변경해야 했지만 데이터베이스에서는 사용자의 데이터 연산을 지원하는 응용 프로그램의 수정 없이 논리적 데이터 스키마(Schema)를 변경할 수 있다."
		 * ); CT[1].add_concept("데이터베이스의 물리적 데이터의 독립성",
		 * "물리적 저장 장치를 바구어야 하는 경우 물리적 구조의 변경이 필요하다. 이런 경우 이 데이터베이스를 사용하는 모든 응용 프로그램의 변경 없이 물리적 데이터 구조를 변경할 수 있다."
		 * );
		 * 
		 * CT[1].add_concept("데이터베이스 관리 시스템(DBMS : DataBase Management System)",
		 * "데이터 집단과 데이터를 관리하는 프로그램의 집합체로서 운영체제 위에서 작동되며, 데이터베이스의 생성과 조작을 담당하는 소프트웨어 그룹으로 소프트웨어 시스템에 해당한다."
		 * ); CT[1].add_concept("데이터베이스 관리 시스템에서 질의 처리기(Query Process)",
		 * "사용자가 요청한 질의어를 데이터베이스 관리 프로그램들이 이해할 수 있는 하위 레벨의 명령어 형태로 변환하는 처리기이다.");
		 * CT[1].add_concept("데이터베이스 관리 시스템에서 예비 컴파일러(Precompiler)",
		 * "응용 프로그램에 삽입되어 있는 데이터 조작어(DML)를 추출하는 처리기를 의미한다.");
		 * CT[1].add_concept("데이터베이스 관리 시스템에서 DML 컴파일러(DML Compiler)",
		 * "예비 컴파일러에 의해 추출된 DML을 목적 코드로 변환하는 처리기이다."); CT[1].
		 * add_concept("데이터베이스 관리 시스템에서 런타임 데이터베이스 처리기(Run Time Database Processor)",
		 * "병렬적으로 데이터베이스 접근을 실행시키는 프로세서이다.");
		 * CT[1].add_concept("데이터베이스 관리 시스템에서 저장 데이터 관리기(Stored Data Manager)",
		 * "디스크에 있는 파일과 데이터 사전을 관리한다."); CT[1].add_concept("데이터베이스 관리 시스템의 필수 기능 3가지",
		 * "데이터 정의 기능(Definition Facility), 데이터 조작 기능(Manipulation Facility), 데이터 제어 기능(Control Facility)"
		 * ); CT[1].add_concept("데이터베이스 관리 시스템의 데이터 정의 기능(Definition Facility)",
		 * "- 데이터베이스의 논리적 구조 및 물리적 구조를 정의하는 기능이다.\r\n- 데이터베이스와 응용 프로그램이 서로 인터페이스 할 수 있는 방법을 제공하는 기능이다."
		 * ); CT[1].add_concept("데이터베이스 관리 시스템의 정의 기능이 갖추어야 할 요건",
		 * "- 데이터의 논리적 구조를 정의할 수 있어야 한다.\r\n- 데이터의 물리적 구조를 정의할 수 있어야 한다.\r\n- 물리적 구조와 논리적 구조 사이의 접속 사상(Mapping)을 정의할 수 있어야 한다."
		 * ); CT[1].add_concept("데이터베이스 관리 시스템의 데이터 조작 기능(Manipulation Facility)",
		 * "- 사용자로 하여금 데이터를 처리할 수 있게 하는 도구로서 사용자(응용 프로그램)와 데이터베이스 사이의 인터페이스 수단을 제공하는 기능이다.\r\n- 데이터 검색, 삽입, 삭제, 변경 등의 작업을 수행한다."
		 * ); CT[1].add_concept("데이터베이스 관리 시스템의 데이터 조작 기능이 갖추어야 할 요건",
		 * "- 사용하기 쉽고 자연어 형식에 가까워야 하며 단순해야 한다.\r\n- 정확하고 명확하게 명시할 수 있어야 한다.\r\n- 데이터의 접근 방법이 효율적이어야 한다."
		 * ); CT[1].add_concept("데이터베이스 관리 시스템의 데이터 제어기능(Control Facility)",
		 * "데이터베이스의 무결성 유지, 보안 및 권한 제어, 시스템 장애에 대비한 데이터 회복과 병행제어 등을 하기 위한 언어이다.");
		 * CT[1].add_concept("데이터베이스 관리 시스템의 제어 기능이 갖추어야 할 요건",
		 * "동시성 제어(Concurrency Control) 기능, 보안(Security)과 권한(Authority) 검사 기능, 무결성(Integrity) 및 제약 조건 유지 기능"
		 * ); CT[1].add_concept("데이터베이스 관리 시스템의 장점",
		 * "- 데이터의 중복을 최소화시켜 관리할 수 있다.\r\n- 데이터를 공유할 수 있다.\r\n- 데이터를 표준화시켜 관리할 수 있다.\r\n데이터 보안을 유지시킬 수 있다.\r\n- 데이터의 무결성을 유지시킬 수 있다.\r\n- 통합적 데이터 관리로 일관성 유지가 용이하다."
		 * ); CT[1].add_concept("데이터베이스 관리 시스템의 단점",
		 * "- 규모가 방대하고 복잡한 관리 체계를 유지해야 하므로 구축이 복잡하다.\r\n- 구축 비용이 많이 든다.\r\n- 예비와 회복 절차 수립이 어렵다(데이터 파괴에 대한 회복이 어렵다).\r\n- 한 부분에 장애 요인이 생겼을 때 전체 시스템에 영향을 주는 취약성이 있다."
		 * ); CT[1].add_concept("데이터베이스 관리 시스템과 파일 시스템의 가장 큰 차이점",
		 * "데이터의 종속 문제와 데이터의 중복 문제"); CT[1].add_concept("데이터의 종속성",
		 * "- 논리적 데이터 구조와 응용 프로그램 간의 종속 관계를 의미한다.\r\n- 데이터의 논리적 구조나 접근 방법이 변경되면 응용 프로그램도 변경해야 된다는 성질이다."
		 * ); CT[1].add_concept("데이터의 중복성", "같은 내용이라 하더라도 구조가 다르면 중복 저장, 관리되어야 한다.");
		 * CT[1].add_concept("데이터 종속성에 따른 문제점",
		 * "- 새로운 응용의 경우 액세스 상의 난점이 발생한다.\r\n- 데이터의 고립이 발생한다.");
		 * CT[1].add_concept("데이터의 중복성에 따른 문제점",
		 * "- 데이터의 일관성 유지가 어렵다.\r\n- 데이터의 무결성 유지가 어렵다.\r\n- 데이터에 대한 중복 저장으로 기억 장소가 낭비된다.\r\n- 같은 데이터에 대한 같은 수준의 보안 유지가 어렵다."
		 * );
		 * 
		 * CT[1].add_concept("데이터베이스 시스템(DBS : Database System)",
		 * "발생되는 데이터를 데이터베이스에서 유지 관리하다가 필요한 시점에서 그 데이터를 조작, 변경, 획득하여 어떤 목적에 이용하는 시스템을 의미한다."
		 * ); CT[1].add_concept("데이터베이스 언어(DBL)",
		 * "- 데이터베이스 언어는 데이터베이스 관리 시스템과 사용자 간의 통신 수단이다.\r\n- 데이터 언어는 사용자가 원하는 어떤 객체도 데이터베이스에서 추출할 수 있고 처리할 수 있으며 어떤 관계도 표현할 수 있는 언어의 완전성(Completeness of Data Language)을 갖추고 있어야 한다."
		 * ); CT[1].add_concept("데이터 정의어(DDL : Data Definition Language)",
		 * "- 데이터베이스의 구조를 생성하거나 수정, 삭제하기 위하여 사용되는 언어이다.\r\n- 데이터베이스의 스키마를 정의하는 언어이다.\r\n- 데이터 정의어로 작성된 명령어를 해독한 결과는 메타 데이터 형태로 데이터 사전이라는 특별한 파일에 기록된다.\r\n- 데이터베이스 시스템이 정확하게 3단계를 지원하는 시스템이라면 외부 스키마 정의어, 개념 스키마 정의어, 내부 스키마 정의어가 따로따로 존재하게 된다."
		 * ); CT[1].add_concept("DDL의 기능",
		 * "- 논리적, 물리적 데이터의 구조를 정의한다.\r\n- 논리적, 물리적 데이터 구조 간의 사상 관계를 정의한다.\r\n- 데이터의 물리적인 순서를 정의한다."
		 * ); CT[1].add_concept("데이터 조작어(DML : Data Manipulation Languuage)",
		 * "- 구축된 데이터를 액세스하거나 조작하도록 하는 언어이다.\r\n- 데이터베이스에 접근해서 검색하고, 삽입하고, 삭제하고, 갱신할 수 있도록 지원하는 언어이다.\r\n- 사용자(응용 프로그램)와 DBMS 사이의 인터페이스를 제공하는 언어이다."
		 * ); CT[1].add_concept("절차적 데이터 조작어(Procedural)",
		 * "어떤 데이터가 필요할 때 사용자가 필요한 데이터를 어떻게 구하는지 절차에 맞게 구체적으로 명시하는 언어이다.");
		 * CT[1].add_concept("비절차적 데이터 조작어(Non-Procedural)",
		 * "어떤 데이터가 필요한지를 명시하며 질의어(QL : Query Language)가 여기에 속한다. 이 조작어는 배우기 쉽고 사용하기 쉽지만 데이터를 구하는 절차가 명시되어 있지 않기 때문에 효율적인 처리 면에서는 절차적 언어에 비해 떨어지므로 최적화 기법에 의해서 코드의 효율성을 기하여야 한다."
		 * ); CT[1].add_concept("질의어(QL : Query Language)",
		 * "마지막 사용자(End User)가 대화식으로 사용하는 언어로 독자적이고 상호 작용 형태로 터미널에서 데이터베이스를 주로 검색하기 위해 사용되는 독립 언어이다. 이 언어는 주로 검색을 위해 고안되었지만 검색에 대한 한정된 의미로 사용되기보다는 갱신, 삽입, 삭제뿐 아니라 데이터 정의 등의 광범위한 기능을 가지고 있다."
		 * ); CT[1].add_concept("데이터 제어어(DCL : Data Control Language)",
		 * "데이터베이스의 여러 사용자가 데이터를 공용하고, 무결성을 유지시키면서 사용할 수 있도록 내부적으로 여러 가지 규정이나 제약 조건 등을 기술하기 위해 사용되는 언어. 보안, 무결성, 회복, 병행수행 등의 역할을 수행"
		 * ); CT[1].add_concept("데이터베이스 관리자(Database Administrator : DBA)",
		 * "데이터베이스 시스템 도입의 주된 이유는 데이터 관리를 중앙 통제식으로 하여 데이터의 일관성을 유지하는 데 목적이 있다. 데이터베이스 관리자는 이러한 중앙 통제를 위하여 데이터베이스의 생성과 모든 관리 및 운영에 대한 책임과 권한을 가지고 있는 사람 또는 집단을 말한다."
		 * ); CT[1].add_concept("DBA의 데이터베이스의 설계와 운영 측면에서의 역할",
		 * "- 데이터베이스의 구성 요소를 결정한다.\r\n- 예비와 회복 절차를 마련한다.\r\n- 데이터 사전의 작성과 무결성 제약조건을 지정한다.\r\n- 스키마를 정의한다.\r\n- 저장 구조와 접근 방법을 설정한다.\r\n- 보안 정책의 수립과 데이터 유효성 검사 방법을 수립한다.\r\n- 요구사항의 변화에 따라 데이터베이스를 재구성한다."
		 * ); CT[1].add_concept("DBA의 행정 관리 측면에서의 역할",
		 * "- DBA는 데이터의 표현과 시스템 문서화의 표준화를 기한다.\r\n- 사용자의 요구와 불평을 해소한다.");
		 * CT[1].add_concept("DBA의 시스템 관리 측면에서의 역할",
		 * "- 운영 스케줄을 작성하고, 시스템의 성능을 감시 감독하며 필요에 따라 성능을 개선시킨다.\r\n- 컴퓨터 설치 장비의 선택과 사용자와의 대화를 통해 개선점을 모색한다."
		 * ); CT[1].add_concept("응용 프로그래머(Application Programmer)",
		 * "데이터베이스 조작어(DML)를 호스트 언어(C, COBOL 등)에 포함하여 일반 사용자에 대한 인터페이스를 제공할 목적으로 데이터베이스에 접근하는 사용자를 의미한다."
		 * ); CT[1].add_concept("일반 사용자(End User)",
		 * "터미널을 통해 응용 프로그램이나 질의어를 가지고 데이터베이스에 있는 자원을 활용할 목적으로 접근하는 사용자를 의미한다.");
		 * 
		 * CT[2].add_concept("데이터 모델링(Data Modeling)",
		 * "현실 시계에 존재하는 개체를 찾아내서 그 개체에 대한 특성과 특징을 파악하여 특성화를 시키고, 그 개체들 사이의 관계성을 파악해서 어떤 구조에서 어떤 연산이 가장 적합할 것인가를 구체화시켜 나가는 과정을 의미한다."
		 * ); CT[2].add_concept("데이터 모델링 과정",
		 * "개체 정의 -> 식별자 정의 -> 상세화 -> 통합 -> 검증\r\n\r\n- 개체 정의 : 현실 세계에서 개체를 찾아내어 정의하는 단계이다.\r\n- 식별자 정의 : 각각의 개체를 식별하기 위해 특성화하는 단계이다.\r- 상세화 : 각각의 개체를 구체화하는 단계이다.\r\n- 통합 : 개체와 개체 사이의 관련성을 파악하여 전체를 통합하는 단계이다.\r\n- 검증 : 실제 맞는지를 검증하는 단계이다."
		 * ); CT[2].add_concept("정보 모델링(Information Modeling)",
		 * "현실 세계에서 개체 요소를 찾아 추상화시켜 개체 타입을 만든 다음, 이 개체 타입과 개체 타입의 관련성을 가지고 현실 세계에 있는 그대로 사람이 이해할 수 있는 형태의 정보구조(Information Structure)로 만들어 가는 과정을 의미한다."
		 * ); CT[2].add_concept("데이터 모델링(Data Modeling)",
		 * "정보 모델링 과정에서 생성된 정보 구조를 컴퓨터가 이해할 수 있는 형태의 논리적 구조(데이터 구조)로 만들어 가는 과정을 의미한다.");
		 * CT[2].add_concept("모델링 3단계",
		 * "현실단계, 개념적 단계, 논리적 단계\r\n\r\n- 현실 단계 : 변환되는 현실세계에서 사람이 감지할 수 있는 실체(Reality)를 가지고 그대로 구성되는 단계를 의미한다.\r\n- 개념적 단계 : 현실 세계를 추상화(특성화)시켜 개체 타입을 표현하고 그 개체 타입들 사이에 어떤 관계가 있으며, 어떤 대응 관계를 가지고 있는지 파악하여 사람이 이해할 수 있는 형태의 추상적 개념으로 표현하는 단계이다.\r\n- 논리적 단계 : 개념적 단계에서 파악된 개체를 어떤 구조로 컴퓨터에 기억시키고, 그 개체들 사이의 관계성을 파악하여 어떠한 모델이 적합하며, 개체의 속성들은 어떤 도메인을 적용할 것인가, 이 개체들은 어떤 제약 사항이 따르는가, 또한 어떤 연산에 의해서 정보를 이용할 것인가를 전반적으로 파악하여 구성하는 단계이다."
		 * ); CT[2].add_concept("데이터 모델링에서 추상화 방법",
		 * "- 일반화(Generalization) : 여러 개체들의 공통점을 찾아 더 포괄적이고 일반적인 개념의 개체로 만들어 가는 과정으로 상향식 개념이다.\r\n- 집단화(Aggregation) : 여러 어트리뷰트를 집단화해서 하나의 개체를 구성하는 경우 또는 어떤 개체 인스턴스를 집단화하여 개체 집합을 만들어 가는 과정으로 IS-PART-OF 관계라고도 한다.\r\n- 세분화(Specialization) : 일반적인 개념의 개체를 좀 더 세분화하여 구체적인 개체를 만들어 가는 과정으로 하향식 설계 개념이다.\r\n- 연관화(Association) : 여러 개의 개체들로부터 연관되는 개념을 간추려 상위 레벨의 개체로 추상화하는 개념으로 IS-ASSOCIATED-WITH라고 한다."
		 * ); CT[2].add_concept("데이터 모델의 개념",
		 * "현실 세계를 데이터베이스에 표현하는 중간 과정, 즉 데이터베이스 설계 과정에서 데이터의 구조를 표현하기 위해 사용되는 도구이다.");
		 * CT[2].add_concept("개념적 데이터 모델(Conceptual Data Model, High-Level Data Model)",
		 * "속성들로 기술된 개체 타입과 이 개체 타입들 간의 관계를 이용하여 현실 세계를 표현하는 방법이다.");
		 * CT[2].add_concept("논리적 데이터 모델(Logical Data Model)",
		 * "필드로 기술된 데이터 타입들 간의 관계를 이용하여 현실 세계를 표현하는 방법이다.");
		 * 
		 * CT[6].add_concept("조합 논리 회로(Combinational Logic Circuit)",
		 * "논리 게이트의 조합으로 만들어지는 회로로 입력에 의해서만 출력이 결정되는 회로를 의미한다.\r\n현재의 입력 변화에 의해서만 출력이 결정되는 회로이다."
		 * ); CT[6].add_concept("반가산기(Half Adder)",
		 * "2개의 2진 입력 변수 A와 B를 더한 합 S와 자리 올림 수 C를 얻는 회로이다.\r\n하나의 AND 게이트와 XOR게이트를 조합해서 만들어진다."
		 * ); CT[6].add_concept("반감산기(Half Subtracter)",
		 * "2개의 2진 입력 변수 X에서 Y를 뺀 차 D와 빌려온 수(자리 내림 수)B를 얻는 회로이다.\r\n하나의 NOT 게이트 및 AND게이트와 XOR게이트를 조합해서 만들어진다."
		 * ); CT[6].add_concept("전가산기(Full Adder)",
		 * "2진수 가산을 완전히 하기 위하여 아래 자리로부터 자리 올림된 수도 고려하여 3개의 2진수를 더할 수 있게 만든 회로이다.\r\n반가산기 2개와 OR게이트 1개를 연결하여 구성한다."
		 * ); CT[6].add_concept("전감산기(Full Subtracter)",
		 * "2진수 감산을 완전히 하기 위하여 아래 자리로 부터 자리 내림수도 고려하여 3개의 2진수를 감산할 수 있게 만든 회로이다.\r\n반감산기 2개와 OR게이트 1개를 연결하여 구성한다"
		 * ); CT[6].add_concept("병렬 가산기(Parallel Adder)",
		 * "여러 비트를 가산하기 위한 회로이다.\r\n반가산기 또는 전가산기를 여러 개 합쳐서 만들어진다.\r\nn비트 병렬 가산기를 만들기 위해서는 전가산기를 가지고 만들 경우 전가산기 n개가 필요하고, 반가산기를 가지고 만드는 경우는 (2n-1)개의 반가산기와 (n-1)개의 OR게이트가 필요하다."
		 * ); CT[6].add_concept("디코더(Decoder)",
		 * "디코더는 컴퓨터 내부에서 2진수로 코드화된 데이터를 해독하여 대응되는 한 개의 신호로 바꾸어 주기 때문에 해독기라 한다.\r\nn개의 입력으로 최대 2^n개의 출력을 얻을 수 있다.\r\nAND게이트로 만들어 진다"
		 * ); CT[6].add_concept("인코더(Encoder)",
		 * "입력 정보를 여러 자리의 2진수로 코드화하여 전달하는 회로이다.\r\n해독기(Decoder)와 정반대의 동작을 나타낸다");
		 * CT[6].add_concept("멀티플렉서(Multiplexor)",
		 * "2^n개의 입력선에서 n개의 선택선을 가지고 하나의 출력을 얻도록 구성된다.\r\n여러 개의 입력 회선이 들어가서 하나의 특정 회선을 선택하도록 하므로 선택기라고도 한다.\r\n공통적인 버스(Bus)라인을 구성하는데 많이 사용한다."
		 * ); CT[6].add_concept("디멀티플렉서(Demultiplexor)",
		 * "하나의 입력 정보를 n개의 선택선을 가지고 2^n개의 출력을 얻도록 구성된다.\r\n중앙 처리 장치에서 어떤 내용을 특정 장치로 출력시킬 때 많이 사용된다"
		 * ); CT[6].add_concept("비교기(Comparator)",
		 * "논리적으로 두 수를 비교한다면 '같다'와 '같지 않다'만 판별하면 되므로 두 수 A와 B를 Exclusive NOR게이트로 연결하여 1이 얻어지면 '같다'고 판별할 수 있다.\r\nn비트 논리 비교기를 만들기 위해서는 Exclusive NOR게이트 n개가 필요하다"
		 * ); CT[6].add_concept("3-상태 버퍼(Tri-state Buffer)",
		 * "세 가지 상태 중 1의 상태는 전기적으로 하이 레벨(H)이고, 0의 상태는 로우 레벨(L)이며, 또 하나의 상태는 고 임피던스(회로가 끊어진 상태)상태를 말한다. 3-상태 버퍼 회로는 인에이블(1) 또는 디스에이블(0)단자에 의하여 데이터의 전송 방향을 하드웨어적으로 제어하는데 사용하게 된다."
		 * ); CT[6].add_concept("순서 논리 회로(Sequential Logic Circuit)",
		 * "입력과 내부 상태의 조합에 의해 출력이 결정되는 회로이다.\r\n플립플롭이나 레지스터 장치로 구성되는 회로이다.\r\n기억 능력을 가지고 있는 회로이다."
		 * ); CT[6].add_concept("플립플롭(Flip-Flop)",
		 * "플립플롭은 순서 논리 회로를 구성하는 기본 기억 소자로 1비트를 기억할 수 있는 2진 Cell을 의미한다.\r\n플립플롭은 1비트 기억 소자이다.\r\n플립플롭의 저장 상태를 바꾸어서 회로의 기능을 변경할 수 있다."
		 * ); CT[6].add_concept("RS 플립플롭",
		 * "보통 NAND게이트를 이용해서 구성한다.\r\nSET(S)단자와 RESET(R)단자를 갖게 된다.\r\nSET(S)단자와 RESET(R)단자가 모두 1인 경우는 허용되지 않는다."
		 * ); CT[6].add_concept("JK 플립플롭",
		 * "JK플립플롭은 RS플립플롭에서 S와 R이 각각 1일 때 허용되지 않는 것을 보완해서 이것이 허용되도록 고안된 플립플롭이다.\r\nRS플립플롭의 내부 상태와 입력 상태를 AND게이트로 처리하여 입력하는 플립플롭이다."
		 * ); CT[6].add_concept("D 플립플롭",
		 * "RS나 JK플립플롭에서 서로 배타적인 경우만 이용되도록 고안된 플립플롭이다. 즉, S가 0이면 R은 1이 되고, S가 1이면 R은 0이 되도록 고안된 플립플롭이다.\r\nD 플립플롭은 1비트 지연 소자로 사용된다."
		 * ); CT[6].add_concept("T 플립플롭",
		 * "T플립플롭은 JK플립플롭에서 J, K가 같은 값이 입력될 떄만 이용할 수 있도록 고안된 플립플롭이다. 즉, J가 0이면 K도 0이 되고 J가 1이면 K도 1이 되도록 고안된 플립플롭이다.\r\n토글(Toggle)기능을 이용하고자 할 때 사용된다."
		 * ); CT[6].add_concept("마스터 슬래이브(Master-Slave) 플립플롭",
		 * "Race 현상을 해결하기 위해서 고안된 플립플롭이다.\r\n하나의 플립플롭이 주인 역할을 하고, 다른 하나의 플립플롭이 종속되어 동작하도록 두 개 이상의 플립플롭 회로를 결합한 것이다.\r\n주종 플립플롭에서 앞의 것을 주 플립플롭, 뒤의 것을 종 플립플롭이라 하며 주 플립플롭은 시간 펄스가 상승할 때 동작하고, 종 플립플롭은 시간 펄스가 하강할 때 동작한다."
		 * ); CT[6].add_concept("Race 현상",
		 * "출력이 입력에 Feedback되어 플립플롭의 내부 상태가 변화되도록 하면 출력 상태가 변할 때 입력도 변하게 되므로 오동작이 발생하게 된다. 이러한 현상을 Race현상이라 한다."
		 * ); CT[6].add_concept("카운터(Counter)",
		 * "카운터(Counter)는 시간 펄스의 수를 카운트하거나 제어 장치에서 각종 회로의 동작을 제어하는데 사용한다.");
		 * CT[6].add_concept("레지스터(Register)",
		 * "레지스터는 연산에 사용될 데이터가 대기하거나 연산된 결과 데이터가 임시적으로 대기한다.");
		 * CT[6].add_concept("리플 카운터(Ripple Counter)",
		 * "가장 기본이 되는 비동기형 카운터(Asynchronous Counter)이다.");
		 * CT[6].add_concept("모드 카운터(MOD Counter)",
		 * "리플 카운트는 플립플롭의 수를 n이라 한다면 2^n개까지의 독립된 수 전부를 표현하지만 MOD카운터는 임의의 수로 나눈 나머지만 표현할 수 있도록 개선한 카운터이다."
		 * ); CT[6].add_concept("시프트 레지스터(Shift Register)",
		 * "현재 레지스터에 있는 내용을 왼쪽이나 오른쪽의 연결된 플립플롭으로 1비트씩 이동시켜 밀어내기와 같은 동작을 수행하는 레지스터이다.");
		 * CT[6].add_concept("병렬 시프트 레지스터(Parallel Shift Register)",
		 * "n개의 비트로 구성된 레지스터의 내용을 연결된 다른 레지스터로 한 번에 이동시킬 수 있는 레지스터이다.");
		 */
    }
}
