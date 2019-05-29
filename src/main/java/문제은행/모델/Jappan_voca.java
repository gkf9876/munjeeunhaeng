package 문제은행.모델;

import 문제은행.모델.Question_bank.Keyword;

class Jappan_voca extends Subject
{
    public Jappan_voca(String name, Keyword code)
    {
    	super(name, code);
        this.HT = new Term[3];
        HT[1] = new Term("1");
        
        HT[1].add_term("あ", "아");
        HT[1].add_term("い", "이");
        HT[1].add_term("う", "우");
        HT[1].add_term("え", "에");
        HT[1].add_term("お", "오");
        HT[1].add_term("か", "카");
        HT[1].add_term("き", "키");
        HT[1].add_term("く", "크");
        HT[1].add_term("け", "케");
        HT[1].add_term("こ", "코");
        HT[1].add_term("さ", "사");
        HT[1].add_term("し", "시");
        HT[1].add_term("す", "스");
        HT[1].add_term("せ", "세");
        HT[1].add_term("そ", "소");
        HT[1].add_term("た", "타");
        HT[1].add_term("ち", "치");
        HT[1].add_term("つ", "츠");
        HT[1].add_term("て", "테");
        HT[1].add_term("と", "토");
        HT[1].add_term("な", "나");
        HT[1].add_term("に", "니");
        HT[1].add_term("ぬ", "누");
        HT[1].add_term("ね", "네");
        HT[1].add_term("の", "노");
        HT[1].add_term("は", "하");
        HT[1].add_term("ひ", "히");
        HT[1].add_term("ふ", "후");
        HT[1].add_term("へ", "헤");
        HT[1].add_term("ほ", "호");
        HT[1].add_term("ま", "마");
        HT[1].add_term("み", "미");
        HT[1].add_term("む", "무");
        HT[1].add_term("め", "메");
        HT[1].add_term("も", "모");
        HT[1].add_term("や", "야");
        HT[1].add_term("ゆ", "유");
        HT[1].add_term("よ", "요");
        HT[1].add_term("ら", "라");
        HT[1].add_term("り", "리");
        HT[1].add_term("る", "루");
        HT[1].add_term("れ", "레");
        HT[1].add_term("ろ", "로");
        HT[1].add_term("わ", "와");
        HT[1].add_term("ん", "응");
        HT[1].add_term("を", "오");

        HT[2] = new Term("2");
        HT[2].add_term("ア", "아");
        HT[2].add_term("イ", "이");
        HT[2].add_term("ゥ", "우");
        HT[2].add_term("ェ", "에");
        HT[2].add_term("ォ", "오");
        HT[2].add_term("カ", "카");
        HT[2].add_term("キ", "키");
        HT[2].add_term("ク", "크");
        HT[2].add_term("ケ", "케");
        HT[2].add_term("コ", "코");
        HT[2].add_term("サ", "사");
        HT[2].add_term("シ", "시");
        HT[2].add_term("ス", "스");
        HT[2].add_term("セ", "세");
        HT[2].add_term("ソ", "소");
        HT[2].add_term("タ", "타");
        HT[2].add_term("チ", "치");
        HT[2].add_term("ツ", "츠");
        HT[2].add_term("テ", "테");
        HT[2].add_term("ト", "토");
        HT[2].add_term("ナ", "나");
        HT[2].add_term("ニ", "니");
        HT[2].add_term("ヌ", "누");
        HT[2].add_term("ネ", "네");
        HT[2].add_term("ノ", "노");
        HT[2].add_term("ハ", "하");
        HT[2].add_term("ヒ", "히");
        HT[2].add_term("フ", "후");
        HT[2].add_term("ヘ", "헤");
        HT[2].add_term("ホ", "호");
        HT[2].add_term("マ", "마");
        HT[2].add_term("ミ", "미");
        HT[2].add_term("ム", "무");
        HT[2].add_term("メ", "메");
        HT[2].add_term("モ", "모");
        HT[2].add_term("ヤ", "야");
        HT[2].add_term("ユ", "유");
        HT[2].add_term("ヨ", "요");
        HT[2].add_term("ラ", "라");
        HT[2].add_term("リ", "리");
        HT[2].add_term("ル", "루");
        HT[2].add_term("レ", "레");
        HT[2].add_term("ロ", "로");
        HT[2].add_term("ワ", "와");
        HT[2].add_term("ン", "응");
        HT[2].add_term("ヲ", "오");
    }
}