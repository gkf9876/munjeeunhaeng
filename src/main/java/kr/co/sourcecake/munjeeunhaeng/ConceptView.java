package kr.co.sourcecake.munjeeunhaeng;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

import kr.co.sourcecake.munjeeunhaeng.concept.vo.ConceptVo;

public class ConceptView extends JDialog implements ActionListener{
	private ConceptVo question;
	
	private JLabel questionLabel;
	private JLabel answerLabel;
	
	private JButton dialogShowSolveButton;
	private JButton dialogCloseButton;
	
	public ConceptView(Frame frame, String name) {
		this.setName(name);
		this.setTitle(name);
		this.setLayout(null);

		dialogShowSolveButton = new JButton("답");
		dialogShowSolveButton.setSize(80, 20);
		dialogShowSolveButton.setLocation(600, 920);
		dialogShowSolveButton.addActionListener(this);
		this.add(dialogShowSolveButton);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == dialogCloseButton) {
			this.dispose();
		}else if(e.getSource() == dialogShowSolveButton) {
			
			dialogCloseButton = new JButton("닫기");
			dialogCloseButton.setSize(80, 20);
			dialogCloseButton.setLocation(600, 920);
			dialogCloseButton.addActionListener(this);
			this.add(dialogCloseButton);
			
			if(questionLabel != null) {
				questionLabel.setVisible(false);
				this.remove(questionLabel);
			}
			
			if(dialogShowSolveButton != null) {
				dialogShowSolveButton.setVisible(false);
				this.remove(dialogShowSolveButton);
			}
			
			BufferedImage img;
			try {
				ByteArrayInputStream inputStream = new ByteArrayInputStream(question.getAnswer());
				img = ImageIO.read(inputStream);
				float W = img.getWidth();
				float H = img.getHeight();
				float w = 700;
				float h = H * w / W;
				Image dimg = img.getScaledInstance((int)w, (int)h, Image.SCALE_SMOOTH);
				ImageIcon imageIcon = new ImageIcon(dimg);
				questionLabel = new JLabel("", imageIcon, SwingUtilities.CENTER);
				questionLabel.setBounds(0, 0, (int)w, (int)h);
				this.add(questionLabel);
			} catch (IOException except) {
				// TODO Auto-generated catch block
				except.printStackTrace();
			}
		}
	}

	public ConceptVo getQuestion() {
		return question;
	}

	public void setQuestion(ConceptVo question) {
		this.question = question;
		
		if(answerLabel != null) {
			answerLabel.setVisible(false);
			this.remove(answerLabel);
		}
		
		BufferedImage img;
		try {
			ByteArrayInputStream inputStream = new ByteArrayInputStream(question.getQuestion());
			img = ImageIO.read(inputStream);
			float W = img.getWidth();
			float H = img.getHeight();
			float w = 700;
			float h = H * w / W;
			Image dimg = img.getScaledInstance((int)w, (int)h, Image.SCALE_SMOOTH);
			ImageIcon imageIcon = new ImageIcon(dimg);
			questionLabel = new JLabel("", imageIcon, SwingUtilities.CENTER);
			questionLabel.setBounds(0, 0, (int)w, (int)h);
			this.add(questionLabel);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
