package 문제은행;

import java.awt.Button;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JTextArea;

import 문제은행.모델.Question_bank;

public class Test
{
    public static int count = 0;                      //개념 문제 낼때 사용.
	
	public static void main(String[] args)
	{
		Controller con = new Controller();
		
		Frame f = new Frame("문제은행");
		f.setSize(550, 580);
		f.setLayout(null);
		
		Label typeName = new Label("타입");
		typeName.setSize(40, 40);
		typeName.setLocation(20, 20);
		Choice type = new Choice();
		type.setSize(100, 40);
		type.setLocation(80, 20);
		type.add("TERM");
		type.add("CONCEPT");
		
		Label subjectName = new Label("과목");
		subjectName.setSize(40, 40);
		subjectName.setLocation(20, 60);
		Choice subject = new Choice();
		subject.setSize(100, 40);
		subject.setLocation(80, 60);
		subject.add("ENGLISH_VOCA");
		subject.add("POWER_ELECTRONICS");
		
		Label chapterName = new Label("챕터");
		chapterName.setSize(40, 40);
		chapterName.setLocation(20, 100);
		Choice chapter = new Choice();
		chapter.setSize(100, 40);
		chapter.setLocation(80, 100);
		for(int i=0; i<con.pb.getSj()[0].HT.length; i++)
		{
			chapter.add(String.format("%d", i+1));
		}
		chapter.add("all");
		
		Label formName = new Label("유형");
		formName.setSize(40, 40);
		formName.setLocation(20, 140);
		Choice form = new Choice();
		form.setSize(100, 40);
		form.setLocation(80, 140);
        form.add("WORDTOTRANSLATE");
        form.add("TRANSLATETOWORD");
        form.add("RANDOM");
        form.add("EXAMPLE_SENTENCE");
        form.add("GRAMMAR");
		
		
		Button solve = new Button("문제풀기");
		solve.setSize(100, 40);
		solve.setLocation(200,  140);
		f.add(solve);
		
		Button marking = new Button("채점");
		marking.setSize(100, 40);
		marking.setLocation(320,  140);
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
		f.add(question);
		
		TextField input = new TextField();
		input.setSize(380, 40);
		input.setLocation(20, 500);
		f.add(input);
		
		Button input_button = new Button("입력");
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
	                    subject.removeAll();
	                    subject.add("ENGLISH_VOCA");
	                    subject.add("POWER_ELECTRONICS");

	                    form.removeAll();
	                    form.add("WORDTOTRANSLATE");
	                    form.add("TRANSLATETOWORD");
	                    form.add("RANDOM");
	                    form.add("EXAMPLE_SENTENCE");
	                    form.add("GRAMMAR");
	                    break;
	                case "CONCEPT":
	                    subject.removeAll();
	                    subject.add("ENGINEER_INFORMATION_PROCESSING");

	                    form.removeAll();
	                    form.add("INTERPRET");
	                    form.add("INFERENCE");
	                    form.add("RANDOM");
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
			                    chapter.removeAll();
			                    for(int i=1; i< (con.pb.getSubject(Question_bank.Keyword.ENGLISH_VOCA)).HT.length; i++)
			                        chapter.add((con.pb.getSubject(Question_bank.Keyword.ENGLISH_VOCA)).HT[i].name);
			
			                    chapter.add("all");
			                    break;
			                case "ENGINEER_INFORMATION_PROCESSING":
			                    chapter.removeAll();
			                    for (int i = 1; i < (con.pb.getSubject(Question_bank.Keyword.ENGINEER_INFORMATION_PROCESSING)).CT.length; i++)
			                        chapter.add((con.pb.getSubject(Question_bank.Keyword.ENGINEER_INFORMATION_PROCESSING)).CT[i].name);
			
			                    chapter.add("all");
			                    break;
			                case "POWER_ELECTRONICS":
			                	chapter.removeAll();
			                	for(int i=1; i<(con.pb.getSubject(Question_bank.Keyword.POWER_ELECTRONICS)).HT.length; i++)
			                		chapter.add((con.pb.getSubject(Question_bank.Keyword.POWER_ELECTRONICS)).HT[i].name);
			                	
			                	chapter.add("all");
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
			            
			            question.append(con.solve_start(type.getSelectedItem(), subject.getSelectedItem(), chapter.getSelectedItem(), form.getSelectedItem()));
					}
				});
		marking.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						question.setText("");

			            question.append(con.marking(type.getSelectedItem()));
					}
				});
		input_button.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						if (type.getSelectedItem() == "TERM")
			            {
			                question.append(con.Answer_input(type.getSelectedItem(), input.getText()));
			                question.append(con.set_question(type.getSelectedItem()));
			            }
			            else
			            {
			                //개념문제에 맞게 답을 적으면 바로 답이 맞는지 확인할 수 있게 했다.
			                if (count == 0)
			                {
			                    question.append(con.Answer_input(type.getSelectedItem(), input.getText()));
			                    count++;
			                }
			                else
			                {
			                	question.setText("");
			                    question.append(con.set_question(type.getSelectedItem()));
			                    //count = 0;
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
			                question.append(con.Answer_input(type.getSelectedItem(), input.getText()));
			                question.append(con.set_question(type.getSelectedItem()));
			            }
			            else
			            {
			                //개념문제에 맞게 답을 적으면 바로 답이 맞는지 확인할 수 있게 했다.
			                if (count == 0)
			                {
			                    question.append(con.Answer_input(type.getSelectedItem(), input.getText()));
			                    count++;
			                }
			                else
			                {
			                	question.setText("");
			                    question.append(con.set_question(type.getSelectedItem()));
			                    count = 0;
			                }
			            }
			            
						input.setText("");
					}
				});
		
		f.setVisible(true);
	}
}