package 문제은행;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.filechooser.FileNameExtensionFilter;

import 문제은행.AppContext.AppContext;
import 문제은행.Concept.dao.ConceptDao;
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
			JFileChooser dlg = new JFileChooser();
			FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG Images", "jpg");
			dlg.setFileFilter(filter);
			
			int returnVal = dlg.showSaveDialog(null);
			if(returnVal == 0) {
				File file = dlg.getSelectedFile();
				questionFileName.setText(file.getPath());
			}
		}else if(e.getSource() == answerFileButton) {
			JFileChooser dlg = new JFileChooser();
			FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG Images", "jpg");
			dlg.setFileFilter(filter);
			
			int returnVal = dlg.showSaveDialog(null);
			if(returnVal == 0) {
				File file = dlg.getSelectedFile();
				answerFileName.setText(file.getPath());
			}
		}else if(e.getSource() == dialogOkButton) {
			//문제 파일 복사
			File questionFile = new File(questionFileName.getText());
			SimpleDateFormat format = new SimpleDateFormat ("yyyyMMddHHmmss");
			Calendar time = Calendar.getInstance();
			String formatTime = format.format(time.getTime());
			
			File copyQuestionFile = new File(formatTime + "_Q");
			try {
				FileInputStream questionInputStream = new FileInputStream(questionFile);
				FileOutputStream questionOutputStream = new FileOutputStream(copyQuestionFile);
				byte[] buffer = new byte[1024];
				
				int length;
				while ((length = questionInputStream.read(buffer)) > 0){
					questionOutputStream.write(buffer, 0, length);
				}
				questionInputStream.close();
				questionOutputStream.close();
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			//답안 파일 복사
			File answerFile = new File(answerFileName.getText());
			time = Calendar.getInstance();
			formatTime = format.format(time.getTime());
			
			File copyAnswerFile = new File(formatTime + "_A");
			try {
				FileInputStream answerInputStream = new FileInputStream(answerFile);
				FileOutputStream answerOutputStream = new FileOutputStream(copyAnswerFile);
				byte[] buffer = new byte[1024];
				
				int length;
				while ((length = answerInputStream.read(buffer)) > 0){
					answerOutputStream.write(buffer, 0, length);
				}
				answerInputStream.close();
				answerOutputStream.close();
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
}
