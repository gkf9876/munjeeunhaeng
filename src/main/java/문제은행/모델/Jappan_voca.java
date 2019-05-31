package 문제은행.모델;

import java.util.ArrayList;

import 문제은행.Term.vo.TermVo;
import 문제은행.모델.Question_bank.Keyword;

class Jappan_voca extends Subject
{
    public Jappan_voca(String name, Keyword code)
    {
    	super(name, code);
        this.HT = new Term[4];
        HT[1] = new Term("1");
        
        ArrayList<TermVo> list = new ArrayList<TermVo>();
        list.add(new TermVo("あ", "아"));
        list.add(new TermVo("い", "이"));
        list.add(new TermVo("う", "우"));
        list.add(new TermVo("え", "에"));
        list.add(new TermVo("お", "오"));
        list.add(new TermVo("か", "카"));
        list.add(new TermVo("き", "키"));
        list.add(new TermVo("く", "크"));
        list.add(new TermVo("け", "케"));
        list.add(new TermVo("こ", "코"));
        list.add(new TermVo("さ", "사"));
        list.add(new TermVo("し", "시"));
        list.add(new TermVo("す", "스"));
        list.add(new TermVo("せ", "세"));
        list.add(new TermVo("そ", "소"));
        list.add(new TermVo("た", "타"));
        list.add(new TermVo("ち", "치"));
        list.add(new TermVo("つ", "츠"));
        list.add(new TermVo("て", "테"));
        list.add(new TermVo("と", "토"));
        list.add(new TermVo("な", "나"));
        list.add(new TermVo("に", "니"));
        list.add(new TermVo("ぬ", "누"));
        list.add(new TermVo("ね", "네"));
        list.add(new TermVo("の", "노"));
        list.add(new TermVo("は", "하"));
        list.add(new TermVo("ひ", "히"));
        list.add(new TermVo("ふ", "후"));
        list.add(new TermVo("へ", "헤"));
        list.add(new TermVo("ほ", "호"));
        list.add(new TermVo("ま", "마"));
        list.add(new TermVo("み", "미"));
        list.add(new TermVo("む", "무"));
        list.add(new TermVo("め", "메"));
        list.add(new TermVo("も", "모"));
        list.add(new TermVo("や", "야"));
        list.add(new TermVo("ゆ", "유"));
        list.add(new TermVo("よ", "요"));
        list.add(new TermVo("ら", "라"));
        list.add(new TermVo("り", "리"));
        list.add(new TermVo("る", "루"));
        list.add(new TermVo("れ", "레"));
        list.add(new TermVo("ろ", "로"));
        list.add(new TermVo("わ", "와"));
        list.add(new TermVo("ん", "응"));
        list.add(new TermVo("を", "오"));
        HT[1].setTermList(list);

        HT[2] = new Term("2");
        
        ArrayList<TermVo> list2 = new ArrayList<TermVo>();
        list2.add(new TermVo("ア", "아"));
        list2.add(new TermVo("イ", "이"));
        list2.add(new TermVo("ゥ", "우"));
        list2.add(new TermVo("ェ", "에"));
        list2.add(new TermVo("ォ", "오"));
        list2.add(new TermVo("カ", "카"));
        list2.add(new TermVo("キ", "키"));
        list2.add(new TermVo("ク", "크"));
        list2.add(new TermVo("ケ", "케"));
        list2.add(new TermVo("コ", "코"));
        list2.add(new TermVo("サ", "사"));
        list2.add(new TermVo("シ", "시"));
        list2.add(new TermVo("ス", "스"));
        list2.add(new TermVo("セ", "세"));
        list2.add(new TermVo("ソ", "소"));
        list2.add(new TermVo("タ", "타"));
        list2.add(new TermVo("チ", "치"));
        list2.add(new TermVo("ツ", "츠"));
        list2.add(new TermVo("テ", "테"));
        list2.add(new TermVo("ト", "토"));
        list2.add(new TermVo("ナ", "나"));
        list2.add(new TermVo("ニ", "니"));
        list2.add(new TermVo("ヌ", "누"));
        list2.add(new TermVo("ネ", "네"));
        list2.add(new TermVo("ノ", "노"));
        list2.add(new TermVo("ハ", "하"));
        list2.add(new TermVo("ヒ", "히"));
        list2.add(new TermVo("フ", "후"));
        list2.add(new TermVo("ヘ", "헤"));
        list2.add(new TermVo("ホ", "호"));
        list2.add(new TermVo("マ", "마"));
        list2.add(new TermVo("ミ", "미"));
        list2.add(new TermVo("ム", "무"));
        list2.add(new TermVo("メ", "메"));
        list2.add(new TermVo("モ", "모"));
        list2.add(new TermVo("ヤ", "야"));
        list2.add(new TermVo("ユ", "유"));
        list2.add(new TermVo("ヨ", "요"));
        list2.add(new TermVo("ラ", "라"));
        list2.add(new TermVo("リ", "리"));
        list2.add(new TermVo("ル", "루"));
        list2.add(new TermVo("レ", "레"));
        list2.add(new TermVo("ロ", "로"));
        list2.add(new TermVo("ワ", "와"));
        list2.add(new TermVo("ン", "응"));
        list2.add(new TermVo("ヲ", "오"));
        HT[2].setTermList(list2);

        HT[3] = new Term("3");
        ArrayList<TermVo> list3 = new ArrayList<TermVo>();
        list3.add(new TermVo("ヲ", "오"));
        HT[3].setTermList(list3);
    }
}