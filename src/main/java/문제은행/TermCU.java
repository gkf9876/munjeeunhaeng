package 문제은행;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JTextField;

import 문제은행.AppContext.AppContext;
import 문제은행.Concept.dao.ConceptDao;
import 문제은행.Concept.vo.ConceptVo;
import 문제은행.Term.dao.TermDao;
import 문제은행.Term.vo.TermVo;
import 문제은행.모델.Question_bank;

public class TermCU extends JDialog{
	private Question_bank questionBank;
	
	public TermCU(Frame frame, AppContext appContext, String name) {
		questionBank = appContext.questionBank();
		this.setLayout(new FlowLayout());
		
		JTextField dialogWord = new JTextField(10);
		this.add(dialogWord);
		JTextField dialogTranslate = new JTextField(10);
		this.add(dialogTranslate);
		JTextField dialogType = new JTextField(10);
		this.add(dialogType);
		JTextField dialogChapter = new JTextField(10);
		this.add(dialogChapter);
		JButton dialogOkButton = new JButton("OK");
		dialogOkButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				TermDao termDao = appContext.termDao();
				TermVo termVo = new TermVo();
				termVo.setWord(dialogWord.getText().trim());
				termVo.setTranslate(dialogWord.getText().trim());
				termVo.setExercise("");
				termVo.setGrammarQuestion("");
				termVo.setGrammarAnswer("");
				termVo.setType(dialogType.getText().trim());
				termVo.setChapter(dialogChapter.getText().trim());
				termDao.add(termVo);
			}
		});
		
		this.add(dialogOkButton);
	}
}
