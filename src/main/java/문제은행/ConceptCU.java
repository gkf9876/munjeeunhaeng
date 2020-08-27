package 문제은행;

import java.awt.FlowLayout;
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

public class ConceptCU extends JDialog{
	private Question_bank questionBank;
	
	public ConceptCU(Frame frame, AppContext appContext, String name) {
		questionBank = appContext.questionBank();
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
		
		JButton dialogOkButton = new JButton("OK");
		dialogOkButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ConceptDao conceptDao = appContext.conceptDao();
				ConceptVo conceptVo = new ConceptVo();
				conceptDao.add(conceptVo);
			}
		});
		
		this.add(dialogOkButton);
	}
}
