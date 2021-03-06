package kr.co.sourcecake.munjeeunhaeng;

import java.awt.Frame;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
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
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.TitledBorder;
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
	
	private JTextField word;
	
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
		for(int i=0; i<appContext.questionBank().getMap().get(subject.getItemAt(0)).getChapterList().size(); i++){
			chapter.addItem((String)questionBank.getMap().get(subject.getItemAt(0)).getChapterList().get(i));
		}
		this.add(chapterName);
		this.add(chapter);

		subject.addItemListener(new ItemListener(){
				public void itemStateChanged(ItemEvent e){
					chapter.removeAllItems();
					
					for(int i=0; i<questionBank.getMap().get(e.getItem().toString()).getChapterList().size(); i++)
						chapter.addItem((String)questionBank.getMap().get(e.getItem().toString()).getChapterList().get(i));
				}
			});

		dlg = new JFileChooser();
		FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG Images", "jpg", "PNG");
		dlg.setFileFilter(filter);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "문제", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setToolTipText("");
		panel.setLayout(null);
		panel.setBounds(10, 100, 465, 140);
		this.add(panel);
		
		JLabel wordName = new JLabel("이름");
		wordName.setSize(100, 40);
		wordName.setLocation(20, 10);
		
		word = new JTextField();
		word.setSize(350, 25);
		word.setLocation(80, 20);
		panel.add(wordName);
		panel.add(word);
		
		JLabel questionName = new JLabel("문제파일");
		questionName.setSize(100, 40);
		questionName.setLocation(20, 50);

		questionFileName = new JLabel("");
		questionFileName.setSize(250, 40);
		questionFileName.setLocation(80, 50);
		
		questionFileButton = new JButton("찾아보기");
		questionFileButton.setSize(100, 20);
		questionFileButton.setLocation(350, 60);
		questionFileButton.addActionListener(this);
		
		panel.add(questionFileButton);
		panel.add(questionName);
		panel.add(questionFileName);

		JLabel answerName = new JLabel("답안파일");
		answerName.setSize(100, 40);
		answerName.setLocation(20, 90);

		answerFileName = new JLabel("");
		answerFileName.setSize(250, 40);
		answerFileName.setLocation(80, 90);
		
		answerFileButton = new JButton("찾아보기");
		answerFileButton.setSize(100, 20);
		answerFileButton.setLocation(350, 100);
		answerFileButton.addActionListener(this);
		
		panel.add(answerFileButton);
		panel.add(answerName);
		panel.add(answerFileName);

		imageLabel = new JLabel("", SwingUtilities.CENTER);
		this.add(imageLabel);
		
		dialogOkButton = new JButton("OK");
		dialogOkButton.setSize(100, 20);
		dialogOkButton.setLocation(350, 520);
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
					imageLabel.setBounds(10, 300, (int)w, (int)h);
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
					imageLabel.setBounds(10, 300, (int)w, (int)h);
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
				
				try {
					FileInputStream questionInputStream = new FileInputStream(questionFile);
					ByteArrayOutputStream questionOutputStream = new ByteArrayOutputStream();
					byte[] buffer = new byte[1024];
					
					int length;
					while ((length = questionInputStream.read(buffer)) > 0){
						questionOutputStream.write(buffer, 0, length);
					}
					conceptVo.setQuestion(questionOutputStream.toByteArray());
					
					questionInputStream.close();
					questionOutputStream.close();
					
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			
			//답안 파일 복사
			if(answerFileName.getText() != null && !answerFileName.getText().trim().equals("")) {
				
				File answerFile = new File(answerFileName.getText());
				SimpleDateFormat format = new SimpleDateFormat ("yyyyMMddHHmmss");
				Calendar time = Calendar.getInstance();
				String formatTime = format.format(time.getTime());
				
				try {
					FileInputStream answerInputStream = new FileInputStream(answerFile);
					ByteArrayOutputStream answerOutputStream = new ByteArrayOutputStream();
					byte[] buffer = new byte[1024];
					
					int length;
					while ((length = answerInputStream.read(buffer)) > 0){
						answerOutputStream.write(buffer, 0, length);
					}
					conceptVo.setAnswer(answerOutputStream.toByteArray());
					
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
			
			conceptVo.setWord(word.getText());
			conceptVo.setSubject(subject.getSelectedItem().toString());
			conceptVo.setChapter(chapter.getSelectedItem().toString());
			this.conceptDao.add(conceptVo);
		}
	}
}
