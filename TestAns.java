
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.JSeparator;


public class TestAns extends JFrame {

	private JPanel Qpage7;
	private JTextField textField;
	private JLabel lblTopicName;
	private JLabel lblTotalScore;
	private JLabel lblQuestionNo;
	private JLabel lblAnswer;
	private JTextField totscore;
	private JTextField q1;
	private JTextField q2;
	private JTextField q3;
	private JTextField q4;
	private JTextField q5;
	private JSeparator separator_2;
	private JSeparator separator;
	private JTextField an1;
	private JTextField an2;
	private JTextField an3;
	private JTextField an4;
	private JTextField an5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestAns frame = new TestAns("","","");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TestAns(String scr,String an,String topic) {	
		setBackground(Color.DARK_GRAY);
		setTitle("QuizPage");
		setForeground(Color.DARK_GRAY);
		setFont(new Font("Arial Black", Font.PLAIN, 12));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1000, 700);
		Qpage7 = new JPanel();
		Qpage7.setForeground(SystemColor.textHighlight);
		Qpage7.setBackground(Color.GRAY);
		Qpage7.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Qpage7);
		
	
		
		textField = new JTextField();
		textField.setBounds(758, 11, 216, 34);
		Qpage7.setLayout(null);
		textField.setText(QuizHome.name);
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setForeground(Color.BLACK);
		textField.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 16));
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBackground(new Color(154, 205, 50));
		Qpage7.add(textField);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(10, 11, 89, 32);
		btnBack.setForeground(Color.BLACK);
		btnBack.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		btnBack.setBackground(UIManager.getColor("Button.highlight"));
		Qpage7.add(btnBack);
		btnBack.setActionCommand("back");
		
		lblTopicName = new JLabel("Topic Name");
		lblTopicName.setForeground(Color.WHITE);
		lblTopicName.setHorizontalAlignment(SwingConstants.CENTER);
		lblTopicName.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblTopicName.setBounds(246, 11, 467, 55);
		Qpage7.add(lblTopicName);
		
		lblTotalScore = new JLabel("Total Score = ");
		lblTotalScore.setForeground(Color.WHITE);
		lblTotalScore.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTotalScore.setBounds(208, 100, 160, 32);
		Qpage7.add(lblTotalScore);
		
		lblQuestionNo = new JLabel("Question No");
		lblQuestionNo.setForeground(Color.WHITE);
		lblQuestionNo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblQuestionNo.setBounds(38, 169, 103, 32);
		Qpage7.add(lblQuestionNo);
		
		lblAnswer = new JLabel("Answer");
		lblAnswer.setForeground(Color.WHITE);
		lblAnswer.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAnswer.setBounds(178, 170, 108, 31);
		Qpage7.add(lblAnswer);
		
		totscore = new JTextField();
		totscore.setBounds(335, 100, 203, 28);
		Qpage7.add(totscore);
		totscore.setColumns(10);
		
		q1 = new JTextField();
		q1.setFont(new Font("Tahoma", Font.BOLD, 14));
		q1.setHorizontalAlignment(SwingConstants.CENTER);
		q1.setText("1");
		q1.setBounds(38, 242, 86, 20);
		Qpage7.add(q1);
		q1.setColumns(10);
		
		q2 = new JTextField();
		q2.setText("2");
		q2.setHorizontalAlignment(SwingConstants.CENTER);
		q2.setFont(new Font("Tahoma", Font.BOLD, 14));
		q2.setColumns(10);
		q2.setBounds(38, 305, 86, 20);
		Qpage7.add(q2);
		
		q3 = new JTextField();
		q3.setText("3");
		q3.setHorizontalAlignment(SwingConstants.CENTER);
		q3.setFont(new Font("Tahoma", Font.BOLD, 14));
		q3.setColumns(10);
		q3.setBounds(38, 371, 86, 20);
		Qpage7.add(q3);
		
		q4 = new JTextField();
		q4.setText("4");
		q4.setHorizontalAlignment(SwingConstants.CENTER);
		q4.setFont(new Font("Tahoma", Font.BOLD, 14));
		q4.setColumns(10);
		q4.setBounds(38, 434, 86, 20);
		Qpage7.add(q4);
		
		q5 = new JTextField();
		q5.setText("5");
		q5.setHorizontalAlignment(SwingConstants.CENTER);
		q5.setFont(new Font("Tahoma", Font.BOLD, 14));
		q5.setColumns(10);
		q5.setBounds(38, 511, 86, 20);
		Qpage7.add(q5);
		
		separator_2 = new JSeparator();
		separator_2.setBackground(Color.BLACK);
		separator_2.setBounds(0, 149, 984, 9);
		Qpage7.add(separator_2);
		
		separator = new JSeparator();
		separator.setBackground(Color.BLACK);
		separator.setBounds(20, 209, 901, 9);
		Qpage7.add(separator);
		
		an1 = new JTextField();
		an1.setHorizontalAlignment(SwingConstants.CENTER);
		an1.setFont(new Font("Tahoma", Font.BOLD, 14));
		an1.setColumns(10);
		an1.setBounds(161, 236, 497, 34);
		Qpage7.add(an1);
		
		an2 = new JTextField();
		an2.setHorizontalAlignment(SwingConstants.CENTER);
		an2.setFont(new Font("Tahoma", Font.BOLD, 14));
		an2.setColumns(10);
		an2.setBounds(161, 299, 497, 34);
		Qpage7.add(an2);
		
		an3 = new JTextField();
		an3.setHorizontalAlignment(SwingConstants.CENTER);
		an3.setFont(new Font("Tahoma", Font.BOLD, 14));
		an3.setColumns(10);
		an3.setBounds(161, 365, 497, 34);
		Qpage7.add(an3);
		
		an4 = new JTextField();
		an4.setHorizontalAlignment(SwingConstants.CENTER);
		an4.setFont(new Font("Tahoma", Font.BOLD, 14));
		an4.setColumns(10);
		an4.setBounds(161, 428, 497, 34);
		Qpage7.add(an4);
		
		an5 = new JTextField();
		an5.setHorizontalAlignment(SwingConstants.CENTER);
		an5.setFont(new Font("Tahoma", Font.BOLD, 14));
		an5.setColumns(10);
		an5.setBounds(161, 505, 497, 34);
		Qpage7.add(an5);
		btnBack.addActionListener(new ButtonClickListener());
		
		
		try
        { 
			String file = QuizHome.name+scr+an+".txt";
			BufferedReader br = new BufferedReader(new FileReader (file));	 	            	 
			String a;
           while((a = br.readLine()) != null)
           {
           	String[] s=a.split("/");
           	totscore.setText(s[0]);
           	break;
           }
           
           String file2 ="G:\\Code Bucket II\\JavaLearning\\"+topic+"\\"+an+"-ans.txt";
           //String file2="G:\\Code Bucket II\\JavaLearning\\algo\\easy-ans.txt";
           BufferedReader br1 = new BufferedReader(new FileReader (file2));	 
           String x;
           while((x = br1.readLine()) != null)
           {
           	String[] s=x.split("/");
           //	System.out.print(s[0]);
           	an1.setText(s[0]);
           	an2.setText(s[1]);
           	an3.setText(s[2]);
           	an4.setText(s[3]);
          	an5.setText(s[4]);
           	
           	break;
           }
           
        }
		catch (Exception ex)
		{
			System.out.print("error");
		}
		
		
	}
	 public class ButtonClickListener implements ActionListener{
	      public void actionPerformed(ActionEvent e) {
	         String command = e.getActionCommand();  
	         
	         if( command.equals( "back" ))  
	         {
	        	 dispose();
	        	 QuizPage qp1 = new QuizPage();
	        	 qp1.setVisible(true);
	         } 
	        
	      }		
	   }
}
