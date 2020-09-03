package kr.co.sourcecake.munjeeunhaeng;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import kr.co.sourcecake.munjeeunhaeng.appcontext.AppContext;

public class Test
{
	public static int count = 0;					  //개념 문제 낼때 사용.
	
	public static void main(String[] args)
	{
		AppContext appContext = new AppContext();
		Controller con = new Controller();
		con.setQuestionBank(appContext.questionBank());
		
		JFrame f = new JFrame("문제은행");
		f.setSize(550, 620);
		f.setLayout(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JMenuBar mb = new JMenuBar(); 
		JMenu screenMenu = new JMenu("메뉴");
		
		JMenuItem item1 = new JMenuItem("단어추가");
		TermCU dialog1 = new TermCU(f, appContext, "단어추가");
		
		item1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dialog1.setSize(300, 200);
				dialog1.setVisible(true);
			}
		}); // 메뉴아이템에 Action 리스너 설정screenMenu.add(item);
		
		screenMenu.add(item1);

		JMenuItem item2 = new JMenuItem("개념추가");
		ConceptCU dialog2 = new ConceptCU(f, appContext, "개념추가");
		
		item2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dialog2.setSize(500, 600);
				dialog2.setVisible(true);
			}
		}); // 메뉴아이템에 Action 리스너 설정screenMenu.add(item);
		
		screenMenu.add(item2);
		mb.add(screenMenu);
		f.setJMenuBar(mb);
		
		JLabel typeName = new JLabel("타입");
		typeName.setSize(100, 40);
		typeName.setLocation(20, 20);
		JComboBox<String> type = new JComboBox<String>();
		type.setSize(150, 20);
		type.setLocation(80, 30);
		type.addItem("TERM");
		type.addItem("CONCEPT");
		
		JLabel subjectName = new JLabel("과목");
		subjectName.setSize(40, 40);
		subjectName.setLocation(20, 60);
		JComboBox<String> subject = new JComboBox<String>(new String[]{"JAPAN_VOCA", "ENGLISH_VOCA", "POWER_ELECTRONICS"});
		subject.setSize(150, 20);
		subject.setLocation(80, 70);
		
		JLabel chapterName = new JLabel("챕터");
		chapterName.setSize(40, 40);
		chapterName.setLocation(20, 100);
		JComboBox<String> chapter = new JComboBox<String>();
		chapter.setSize(150, 20);
		chapter.setLocation(80, 110);
		for(int i=0; i<con.pb.getMap().get("JAPAN_VOCA").getChapterList().size(); i++)
		{
			chapter.addItem((String)con.pb.getMap().get("JAPAN_VOCA").getChapterList().get(i));
		}
		chapter.addItem("all");
		
		JLabel formName = new JLabel("유형");
		formName.setSize(40, 40);
		formName.setLocation(20, 140);
		JComboBox<String> form = new JComboBox<String>();
		form.setSize(150, 20);
		form.setLocation(80, 150);
		form.addItem("WORDTOTRANSLATE");
		form.addItem("TRANSLATETOWORD");
		form.addItem("RANDOM");
		form.addItem("EXAMPLE_SENTENCE");
		form.addItem("GRAMMAR");
		
		
		JButton solve = new JButton("문제풀기");
		solve.setSize(100, 40);
		solve.setLocation(250,  140);
		f.add(solve);
		
		JButton marking = new JButton("채점");
		marking.setSize(100, 40);
		marking.setLocation(370,  140);
		f.add(marking);
		
		f.add(typeName);
		f.add(type);
		f.add(subjectName);
		f.add(subject);
		f.add(chapterName);
		f.add(chapter);
		f.add(formName);
		f.add(form);
		
		JTextArea question = new JTextArea("", 10, 50);
		question.setSize(500, 300);
		question.setLocation(20, 180);
		question.setLineWrap(true);

		Font font = new Font("arian", Font.PLAIN, 20);
		question.setFont(font);
		
		JScrollPane scrollPane = new JScrollPane(question, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setSize(500, 300);
		scrollPane.setLocation(20, 180);
		f.add(scrollPane);
		
		JTextField input = new JTextField();
		input.setSize(380, 40);
		input.setLocation(20, 500);
		f.add(input);
		
		JButton input_button = new JButton("입력");
		input_button.setSize(100, 40);
		input_button.setLocation(420,  500);
		f.add(input_button);
		
		type.addItemListener(new ItemListener()
		{
			public void itemStateChanged(ItemEvent e)
			{
				switch (e.getItem().toString())
				{
					case "TERM":
						subject.removeAllItems();
						subject.addItem("ENGLISH_VOCA");
						subject.addItem("POWER_ELECTRONICS");
						subject.addItem("JAPAN_VOCA");

						form.removeAllItems();
						form.addItem("WORDTOTRANSLATE");
						form.addItem("TRANSLATETOWORD");
						form.addItem("RANDOM");
						form.addItem("EXAMPLE_SENTENCE");
						form.addItem("GRAMMAR");
						break;
					case "CONCEPT":
						subject.removeAllItems();
						subject.addItem("ENGINEER_INFORMATION_PROCESSING");
						subject.addItem("PROFESSIONAL_ENGINEER_INFORMATION_MANAGEMENT");

						form.removeAllItems();
						form.addItem("INTERPRET");
						form.addItem("INFERENCE");
						form.addItem("RANDOM");
						break;
				}
				
				question.setText("");
				input.setText("");
			}
		});
		
		subject.addItemListener(new ItemListener()
				{
					public void itemStateChanged(ItemEvent e)
					{
						switch (e.getItem().toString())
						{
							case "ENGLISH_VOCA":
								chapter.removeAllItems();
								for(int i=0; i<con.pb.getMap().get("ENGLISH_VOCA").getChapterList().size(); i++)
									chapter.addItem((String)con.pb.getMap().get("ENGLISH_VOCA").getChapterList().get(i));
								chapter.addItem("all");
								break;
							case "ENGINEER_INFORMATION_PROCESSING":
								chapter.removeAllItems();
								for(int i=0; i<con.pb.getMap().get("ENGINEER_INFORMATION_PROCESSING").getChapterList().size(); i++)
									chapter.addItem((String)con.pb.getMap().get("ENGINEER_INFORMATION_PROCESSING").getChapterList().get(i));
								chapter.addItem("all");
								break;
							case "POWER_ELECTRONICS":
								chapter.removeAllItems();
								for(int i=0; i<con.pb.getMap().get("POWER_ELECTRONICS").getChapterList().size(); i++)
									chapter.addItem((String)con.pb.getMap().get("POWER_ELECTRONICS").getChapterList().get(i));
								chapter.addItem("all");
								break;
							case "JAPAN_VOCA":
								chapter.removeAllItems();
								for(int i=0; i<con.pb.getMap().get("JAPAN_VOCA").getChapterList().size(); i++)
									chapter.addItem((String)con.pb.getMap().get("JAPAN_VOCA").getChapterList().get(i));
								chapter.addItem("all");
								break;
							case "PROFESSIONAL_ENGINEER_INFORMATION_MANAGEMENT":
								chapter.removeAllItems();
								for(int i=0; i<con.pb.getMap().get("PROFESSIONAL_ENGINEER_INFORMATION_MANAGEMENT").getChapterList().size(); i++)
									chapter.addItem((String)con.pb.getMap().get("PROFESSIONAL_ENGINEER_INFORMATION_MANAGEMENT").getChapterList().get(i));
								chapter.addItem("all");
								break;
						}
						question.setText("");
						input.setText("");
					}
				});
		
		solve.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						question.setText("");
						if(type.getSelectedItem().toString().equals("TERM")) {
							question.append(con.termSolveStart(subject.getSelectedItem().toString(), chapter.getSelectedItem().toString(), form.getSelectedItem().toString()));
						}else if(type.getSelectedItem().toString().equals("CONCEPT")){
							String imsi = con.conceptSolveStart(subject.getSelectedItem().toString(), chapter.getSelectedItem().toString(), form.getSelectedItem().toString());
							
							if(con.pb.conceptQuestion.get(con.count).getQuestion() != null) {
								ConceptView dialog3 = new ConceptView(f, "개념문제 풀기");
								dialog3.setQuestion(con.pb.conceptQuestion.get(con.count));
								dialog3.setSize(720, 1000);
								dialog3.setVisible(true);
								con.count++;
							}else {
								question.append(imsi);
							}
						}
					}
				});
		marking.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						question.setText("");
						question.append(con.marking((String)type.getSelectedItem()));
					}
				});
		input_button.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						if (type.getSelectedItem().toString() == "TERM")
						{
							question.append(con.answerInput(type.getSelectedItem().toString(), input.getText()));
							question.append(con.setQuestion(type.getSelectedItem().toString()));
						}
						else
						{
							//개념문제에 맞게 답을 적으면 바로 답이 맞는지 확인할 수 있게 했다.
							if (count == 0)
							{
								question.append(con.answerInput(type.getSelectedItem().toString(), input.getText()));
								count++;
							}
							else
							{
								question.setText("");
								
								if(con.count < con.pb.conceptQuestion.size()) {
									if(con.pb.conceptQuestion.get(con.count).getQuestion() != null) {
										ConceptView dialog3 = new ConceptView(f, "개념문제 풀기");
										dialog3.setQuestion(con.pb.conceptQuestion.get(con.count));
										dialog3.setSize(720, 1000);
										dialog3.setVisible(true);
										con.count++;
										count = 1;
									}else {
										question.append(con.setQuestion(type.getSelectedItem().toString()));
										count = 0;
									}
								}else {
									question.setText("시험 종료");
								}
							}
						}
						
						input.setText("");
					}
				});
		
		input.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						if (type.getSelectedItem() == "TERM")
						{
							question.append(con.answerInput(type.getSelectedItem().toString(), input.getText()));
							question.append(con.setQuestion(type.getSelectedItem().toString()));
						}
						else
						{
							//개념문제에 맞게 답을 적으면 바로 답이 맞는지 확인할 수 있게 했다.
							if (count == 0)
							{
								question.append(con.answerInput(type.getSelectedItem().toString(), input.getText()));
								count++;
							}
							else
							{
								question.setText("");
								
								if(con.count < con.pb.conceptQuestion.size()) {
									if(con.pb.conceptQuestion.get(con.count).getQuestion() != null) {
										ConceptView dialog3 = new ConceptView(f, "개념문제 풀기");
										dialog3.setQuestion(con.pb.conceptQuestion.get(con.count));
										dialog3.setSize(720, 1000);
										dialog3.setVisible(true);
										con.count++;
										count = 1;
									}else {
										question.append(con.setQuestion(type.getSelectedItem().toString()));
										count = 0;
									}
								}else {
									question.setText("시험 종료");
								}
							}
						}
						
						input.setText("");
					}
				});
		
		f.setVisible(true);
	}
}