package 문제은행;

import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;

import 문제은행.AppContext.AppContext;
import 문제은행.Concept.dao.ConceptDao;
import 문제은행.Concept.vo.ConceptVo;
import 문제은행.모델.Question_bank;

public class ConceptCU extends JDialog implements ActionListener{
	private ConceptDao conceptDao;
	private Question_bank questionBank;
	
	private JLabel questionFileName;
	private JLabel answerFileName;

	private JButton questionFileButton;
	private JButton answerFileButton;
	private JButton dialogOkButton;
	
	public ConceptCU(Frame frame, AppContext appContext, String name) {
		this.conceptDao = appContext.conceptDao();
		this.questionBank = appContext.questionBank();
		this.setLayout(null);
		
		JLabel subjectName = new JLabel("과목");
		subjectName.setSize(40, 40);
		subjectName.setLocation(20, 10);
		JComboBox<String> subject = new JComboBox<String>();
		subject.addItem("ENGINEER_INFORMATION_PROCESSING");
		subject.addItem("PROFESSIONAL_ENGINEER_INFORMATION_MANAGEMENT");
		subject.setSize(150, 20);
		subject.setLocation(80, 20);
		
		this.add(subjectName);
		this.add(subject);
		
		JLabel chapterName = new JLabel("챕터");
		chapterName.setSize(40, 40);
		chapterName.setLocation(20, 50);
		JComboBox<String> chapter = new JComboBox<String>();
		chapter.setSize(150, 20);
		chapter.setLocation(80, 60);
		for(int i=0; i<appContext.questionBank().getSj().get("ENGINEER_INFORMATION_PROCESSING").chapterList.size(); i++)
		{
			chapter.addItem(questionBank.getSj().get("ENGINEER_INFORMATION_PROCESSING").chapterList.get(i));
		}
		this.add(chapterName);
		this.add(chapter);

		subject.addItemListener(new ItemListener()
				{
					public void itemStateChanged(ItemEvent e)
					{
						switch (e.getItem().toString())
						{
							case "ENGINEER_INFORMATION_PROCESSING":
								chapter.removeAllItems();
								for(int i=0; i<questionBank.getSj().get("ENGINEER_INFORMATION_PROCESSING").chapterList.size(); i++)
									chapter.addItem(questionBank.getSj().get("ENGINEER_INFORMATION_PROCESSING").chapterList.get(i));
								break;
							case "PROFESSIONAL_ENGINEER_INFORMATION_MANAGEMENT":
								chapter.removeAllItems();
								for(int i=0; i<questionBank.getSj().get("PROFESSIONAL_ENGINEER_INFORMATION_MANAGEMENT").chapterList.size(); i++)
									chapter.addItem(questionBank.getSj().get("PROFESSIONAL_ENGINEER_INFORMATION_MANAGEMENT").chapterList.get(i));
								break;
						}
					}
				});

		JLabel questionName = new JLabel("문제파일");
		questionName.setSize(100, 40);
		questionName.setLocation(20, 90);

		questionFileName = new JLabel("");
		questionFileName.setSize(250, 40);
		questionFileName.setLocation(80, 90);
		
		questionFileButton = new JButton("찾아보기");
		questionFileButton.setSize(100, 20);
		questionFileButton.setLocation(350, 100);
		questionFileButton.addActionListener(this);
		
		this.add(questionFileButton);
		this.add(questionName);
		this.add(questionFileName);

		JLabel answerName = new JLabel("답안파일");
		answerName.setSize(100, 40);
		answerName.setLocation(20, 130);

		answerFileName = new JLabel("");
		answerFileName.setSize(250, 40);
		answerFileName.setLocation(80, 130);
		
		answerFileButton = new JButton("찾아보기");
		answerFileButton.setSize(100, 20);
		answerFileButton.setLocation(350, 140);
		answerFileButton.addActionListener(this);
		
		this.add(answerFileButton);
		this.add(answerName);
		this.add(answerFileName);
		
		dialogOkButton = new JButton("OK");
		dialogOkButton.setSize(100, 20);
		dialogOkButton.setLocation(350, 200);
		dialogOkButton.addActionListener(this);
		
		this.add(dialogOkButton);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == questionFileButton) {
			FileDialog dlg = new FileDialog(this, "FileDialog", FileDialog.LOAD);
			dlg.setSize(300, 200);
			dlg.show();
			
			questionFileName.setText(dlg.getDirectory() + dlg.getFile());
		}else if(e.getSource() == answerFileButton) {
			FileDialog dlg = new FileDialog(this, "FileDialog", FileDialog.LOAD);
			dlg.setSize(300, 200);
			dlg.show();
			
			answerFileName.setText(dlg.getDirectory() + dlg.getFile());
		}else if(e.getSource() == dialogOkButton) {
			ConceptVo conceptVo = new ConceptVo();
			conceptDao.add(conceptVo);
		}
	}
}
