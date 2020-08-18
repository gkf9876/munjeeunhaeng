﻿package 문제은행.모델;

import java.util.List;

import 문제은행.모델.Question_bank.Keyword;

public class Power_Electronics extends Subject
{
    public Power_Electronics(String name, Keyword code, List<String> chapterList)
    {
    	super(name, code, chapterList);

		/*
		 * HT[1].add_term("φ/i 는 뭐?", "인덕턴스 L");
		 * HT[1].add_term("0.1[s] 동안에 몇 [Wb]의 자속이 변할 때 1[V]의 전압이 인덕턴스에 유기되는가?",
		 * "0.1[Wb], e = dφ/dt");
		 * HT[1].add_term("0.1[H]인 코일의 리액턴스가 377[옴]일 때 주파수[Hz]는?",
		 * "600[Hz], Xl = 2파fL"); HT[1].
		 * add_term("자기 인덕턴스 0.1[H]인 코일에 실효값 100[V], 60[Hz], 위상각 0인 전압을 인가했을 때 흐르는 전류의 실효값[A]은?"
		 * , "2.65[A], I=V/Xl = V/(2파이fL)"); HT[1].
		 * add_term("정격 주파수 50[Hz]인 변압기를 일정 전압 60[Hz]의 전원에 접속하면 리액턴스는?(단, 여자 전류와 철손은 5/6로 감소한다.)"
		 * , "6/5배 증가, X1:X2 = f1:f2 -> X2 = f1/f2 * X1 = 60/50 * X1"); HT[1].
		 * add_term("어떤 회로에 전압 v(t) = Vmcoswt를 가했더니 흐르는 전류는 i(t)=Imsinwt였다. 이 회로가 한 개의 회로 소자로 구성되어 있다면 이 소자의 종류는?(단, Vm > 0, Im > 0이다.)"
		 * , "인덕턴스, Vmcoswt = Vmsin(wt + 파이/2)로 전압이 전류보다 파이/2만큼 앞서므로 인덕턴스이다."); HT[1].
		 * add_term("자기 인덕턴스 0.1[H]인 코일에 실효값 100[V], 60[Hz], 위상각 0인 전압을 가했을때 흐르는 전류의 순시값[A]은?"
		 * ,"약 3.7sin(377t-파이/2)[A], i=(2^0.5) * V * sin(wt - 파이/2)");
		 * HT[1].add_term("어떤 회로에 전압을 인가하니 90도 위상이 뒤진 전류가 흘렀다. 이 회로는?", "유도성"); HT[1].
		 * add_term("4[H]의 인덕터에 V = 8/-50도[V]의 전압을 가하였을때 흐르는 전류의 순시값[A]은?(단, w는 100[rad/s]이다.)"
		 * , "0.02sin(100t-140도), i = (2^0.5)V/wL * sin(wt + 세타 - 90도)");
		 * HT[1].add_term("L = 2[H]인 인덕턴스에 i(t)=20e^-2t[A]의 전류가 흐를때 L의 단자 전압[V]은?",
		 * "-8e^-2t, v = L*di(t)/dt"); HT[1].
		 * add_term("30[mH]인 코일에 흐르는 전류를 20[mA/ms]의 비율로 증가시킬때 코일 양단에 나타나는 전압의 크기(절대값)[V]는?"
		 * , "0.6[V], v = L*di/dt"); HT[1].
		 * add_term("어떤 코일에 흐르는 전류가 0.01[s] 사이에 일정하게 50[A]에서 10[A]로 변할 때 20[V]의 기전력이 발생한다고 하면 자기 인덕턴스[mH]는?"
		 * , "5[mH], e = L*di/dt"); HT[1].
		 * add_term("어떤 코일에 흐르는 전류를 0.5[ms] 동안에 5[A] 변화시키면 20[V]의 전압이 생긴다. 자기 인덕턴스[mH]는?"
		 * , "2"); HT[1].
		 * add_term("자기 인덕턴스 L[H]인 코일에 1,000[V], 60[Hz]의 교류 전압을 인가하면 1.5[A]의 전류가 흘렀다. 코일의 자기 인덕턴스[H]는?"
		 * , "1.75"); HT[1].add_term("i(t) = I0e^(st)로 주어지는 전류가 L에 흐르는 경우 임피던스는?",
		 * "sL, v = L * di/dt"); HT[1].
		 * add_term("인덕턴스 L=20[mH]인 코일에 실효값 V=50[V], 주파수 f=60[Hz]인 정현파 전압을 인가했을때 코일에 축적되는 평균 자기 에너지 Wl[J]은?"
		 * ,
		 * "0.44[J], Wl = LI^2/2 = L/2 * (V/(2파이fL)^2 = 50^2 / (8파이^2 * 60^2 * 20 * 10^(-3))"
		 * );
		 * HT[1].add_term("인덕턴스가 L인 유도기에 i=2^0.5Isinwt[A]의 전류가 흐를때 유도기에 축적되는 에너지[J]는?",
		 * "0.LI^2(1-cos2wt), wl = 0.5LI^2 = 0.5L(2^0.5Isinwt)^2");
		 * HT[1].add_term("인덕턴스 L인 코일에 전류 i=Imsinwt가 흐르고 있다. L에 축적된 에너지의 첨두(peak)값은?",
		 * "Wm = 0.5LI^2, Wl = 0.5LI^2 = 0.5LIm^2(sinwt)^2 = 0.25LIm^2(1-cos2wt)이므로 cos2wt=-1인 경우 Wm = 0.5LIm^2"
		 * ); HT[1].
		 * add_term("인덕터의 특성을 요약하면 다음과 같다. 옳지 않은 것은?\n가.인덕터는 직류에 대해서 단락 회로 작용한다.\n나.일정한 전류가 흐를때 전압은 무한대이지만 일정량의 에너지가 축적된다.\n다.인덕터의 전류는 불연속적으로 급격히 변화하면 전압이 무한대가 되어야 하므로 인덕터의 전류는 불연속적으로 변할 수 없다.\n라.인덕터는 에너지를 축적하지만 소모하지 않는다."
		 * , "나"); HT[1].add_term("인덕턴스 L에서 급격히 변할 수 없는 것은?", "전류"); HT[1].
		 * add_term("반지름 30[cm]인 원판 전극의 간격이 0.2[cm]인 평행한 콘덴서의 정전 용량[uF]은?(단, 유전체의 비유전율은 8.0이다.)\n가.0.04\n나.0.01\n다.0.02\n라.0.03"
		 * , "나, C=ε0ε1A/d = (8.855*10^-12 * 8 * 파이 * 0.3^2)/(0.2 * 10^(-2))"); HT[1].
		 * add_term("콘덴서와 코일에서 실제적으로 급격히 변화할 수 없는 것이 있다. 그것은 다음 중 어느 것인가?\n가.코일에서 전압, 콘덴서에서 전류\n나.코일에서 전류, 콘덴서에서 전압\n다.코일, 콘덴서 모두 전압\n라.코일,콘덴서 모두 전류"
		 * ,
		 * "나, Vl = Ldi/dt에서 i가 급격히(t=0인 순간) 변화하면 Vl이 무한대가 되는 모순이 생기고, ic=Cdv/dt에서 v가 급격히 변화하면 ic가 무한대가 되는 모순이 생긴다."
		 * ); HT[1].add_term("커패시턴스 C에서 급격히 변할 수 없는 것은?", "전압"); HT[1].
		 * add_term("100[uF]인 콘덴서의 양단에 전압을 30[V/ms]의 비율로 변화시킬때 콘덴서에 흐르는 전류의 크기[A]는?",
		 * "3[A], i=Cdv/dt");
		 * HT[1].add_term("정전 용량 C[F]의 회로에 기전력 e=Emsinwt[V]를 인가할 때 흐르는 전류 i[A]는?",
		 * "wCEmsin(wt+90)"); HT[1].
		 * add_term("0.1[uF]의 정전 용량을 가지는 콘덴서에 실효값 1.414[V], 주파수 1[kHz], 위상각 0인 전압을 가했을때 순시값 전류[A]는?"
		 * , "1.26sin(wt+90도), v=1.414*2^0.5 * sinwt[V]라 하면, i=Cdv/dt");
		 * HT[1].add_term("0.1[uF]인 콘덴서에 v=2sin2파이100t의 전압을 인가했을때 t=0에서의 전류[mA]는?",
		 * "0.1256, i=Cdv/dt"); HT[1].
		 * add_term("t=0에서의 초기 전압이 10[V], 0.5[F]인 커페시턴스가 있다. 지금 이 커패시턴스에 10sinwt인 전류원을 인가할때 시간 t에서의 단자 전압[V]은?"
		 * , "2*적분(0-t)(10sinwt) + 10");
		 * HT[1].add_term("1[uF]인 콘덴서가 60[Hz]인 전원에 대한 용량 리액턴스의 값[옴]은?",
		 * "2.653, Xc = 1/(2파이fC)");
		 * HT[1].add_term("3[uF]인 커패시턴스를 50[옴]의 용량 리액턴스로 사용하면 주파수는 몇[Hz]인가?",
		 * "1.06*10^3[Hz], Xc = 1/(2파이fC)");
		 * HT[1].add_term("60[Hz]에서 3[옴]의 리액턴스를 갖는 정전 용량[uF]은?",
		 * "884.6, Xc = 1/(2파이fC)");
		 */
        //HT[1].add_term("", "");
    }
}