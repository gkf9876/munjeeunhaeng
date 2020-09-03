package kr.co.sourcecake.munjeeunhaeng;

import java.awt.Frame;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.FileNameExtensionFilter;

import kr.co.sourcecake.munjeeunhaeng.appcontext.AppContext;
import kr.co.sourcecake.munjeeunhaeng.concept.dao.ConceptDao;
import kr.co.sourcecake.munjeeunhaeng.concept.vo.ConceptVo;
import kr.co.sourcecake.munjeeunhaeng.model.QuestionBank;

public class ConceptCU extends JDialog implements ActionListener{
	private ConceptDao conceptDao;
	private QuestionBank questionBank;
	
	private JComboBox<String> subject;
	private JComboBox<String> chapter;
	
	private JFileChooser dlg;
	
	private JLabel questionFileName;
	private JLabel answerFileName;

	private JButton questionFileButton;
	private JButton answerFileButton;
	private JButton dialogOkButton;
	
	private JLabel imageLabel = null;
	
	public ConceptCU(Frame frame, AppContext appContext, String name) {
		this.conceptDao = appContext.conceptDao();
		this.questionBank = appContext.questionBank();
		this.setName(name);
		this.setTitle(name);
		this.setLayout(null);
		
		JLabel subjectName = new JLabel("과목");
		subjectName.setSize(40, 40);
		subjectName.setLocation(20, 10);
		subject = new JComboBox<String>();
		subject.addItem("ENGINEER_INFORMATION_PROCESSING");
		subject.addItem("PROFESSIONAL_ENGINEER_INFORMATION_MANAGEMENT");
		subject.setSize(150, 20);
		subject.setLocation(80, 20);
		
		this.add(subjectName);
		this.add(subject);
		
		JLabel chapterName = new JLabel("챕터");
		chapterName.setSize(40, 40);
		chapterName.setLocation(20, 50);
		chapter = new JComboBox<String>();
		chapter.setSize(150, 20);
		chapter.setLocation(80, 60);
		for(int i=0; i<appContext.questionBank().getMap().get("ENGINEER_INFORMATION_PROCESSING").getChapterList().size(); i++)
		{
			chapter.addItem((String)questionBank.getMap().get("ENGINEER_INFORMATION_PROCESSING").getChapterList().get(i));
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
								for(int i=0; i<questionBank.getMap().get("ENGINEER_INFORMATION_PROCESSING").getChapterList().size(); i++)
									chapter.addItem((String)questionBank.getMap().get("ENGINEER_INFORMATION_PROCESSING").getChapterList().get(i));
								break;
							case "PROFESSIONAL_ENGINEER_INFORMATION_MANAGEMENT":
								chapter.removeAllItems();
								for(int i=0; i<questionBank.getMap().get("PROFESSIONAL_ENGINEER_INFORMATION_MANAGEMENT").getChapterList().size(); i++)
									chapter.addItem((String)questionBank.getMap().get("PROFESSIONAL_ENGINEER_INFORMATION_MANAGEMENT").getChapterList().get(i));
								break;
						}
					}
				});

		dlg = new JFileChooser();
		FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG Images", "jpg", "PNG");
		dlg.setFileFilter(filter);
		
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

		imageLabel = new JLabel("", SwingUtilities.CENTER);
		this.add(imageLabel);
		
		dialogOkButton = new JButton("OK");
		dialogOkButton.setSize(100, 20);
		dialogOkButton.setLocation(350, 400);
		dialogOkButton.addActionListener(this);
		
		this.add(dialogOkButton);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == questionFileButton) {
			dlg.setCurrentDirectory(dlg.getCurrentDirectory());
			
			int returnVal = dlg.showSaveDialog(null);
			if(returnVal == 0) {
				File file = dlg.getSelectedFile();
				questionFileName.setText(file.getPath());
				
				BufferedImage img;
				try {
					img = ImageIO.read(new File(file.getPath()));
					float W = img.getWidth();
					float H = img.getHeight();
					float h = 200;
					float w = W * h / H;
					Image dimg = img.getScaledInstance((int)w, (int)h, Image.SCALE_SMOOTH);
					ImageIcon imageIcon = new ImageIcon(dimg);
					imageLabel.setBounds(50, 200, (int)w, (int)h);
					imageLabel.setIcon(imageIcon);
				} catch (IOException except) {
					// TODO Auto-generated catch block
					except.printStackTrace();
				}
			}
		}else if(e.getSource() == answerFileButton) {
			dlg.setCurrentDirectory(dlg.getCurrentDirectory());
			
			int returnVal = dlg.showSaveDialog(null);
			if(returnVal == 0) {
				File file = dlg.getSelectedFile();
				answerFileName.setText(file.getPath());
				
				BufferedImage img;
				try {
					img = ImageIO.read(new File(file.getPath()));
					float W = img.getWidth();
					float H = img.getHeight();
					float h = 200;
					float w = W * h / H;
					Image dimg = img.getScaledInstance((int)w, (int)h, Image.SCALE_SMOOTH);
					ImageIcon imageIcon = new ImageIcon(dimg);
					imageLabel.setBounds(50, 200, (int)w, (int)h);
					imageLabel.setIcon(imageIcon);
				} catch (IOException except) {
					// TODO Auto-generated catch block
					except.printStackTrace();
				}
			}
		}else if(e.getSource() == dialogOkButton) {
			ConceptVo conceptVo = new ConceptVo();
			
			if(questionFileName.getText() != null && !questionFileName.getText().trim().equals("")) {
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
				conceptVo.setQuestion(formatTime + "_Q");
			}
			
			//답안 파일 복사
			if(answerFileName.getText() != null && !answerFileName.getText().trim().equals("")) {
				
				File answerFile = new File(answerFileName.getText());
				SimpleDateFormat format = new SimpleDateFormat ("yyyyMMddHHmmss");
				Calendar time = Calendar.getInstance();
				String formatTime = format.format(time.getTime());
				
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
				conceptVo.setAnswer(formatTime + "_A");
			}
			
			conceptVo.setSubject(subject.getSelectedItem().toString());
			conceptVo.setChapter(chapter.getSelectedItem().toString());
			this.conceptDao.add(conceptVo);
		}
	}
}
