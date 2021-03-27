
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
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JSeparator;


public class Result extends JFrame {

	private JPanel Qpage8;
	private JTextField textField;
	private JLabel lblNewLabel;
	private JLabel lblEasy1;
	private JLabel lblIntermediate1;
	private JLabel lblAdvanced1;
	private JLabel e1;
	private JLabel i1;
	private JLabel a1;
	private JLabel lblJava;
	private JLabel lblEasy2;
	private JLabel e2;
	private JLabel lblIntermediate2;
	private JLabel i2;
	private JLabel lblAdvanced2;
	private JLabel a2;
	private JLabel lblDataStructure;
	private JLabel lblEasy3;
	private JLabel e3;
	private JLabel lblIntermediate3;
	private JLabel i3;
	private JLabel lblAdvanced3;
	private JLabel a3;
	private JLabel lblAlgorithm;
	private JLabel lblEasy4;
	private JLabel e4;
	private JLabel lblIntermediate4;
	private JLabel i4;
	private JLabel lblAdvanced4;
	private JLabel a4;
	private JLabel lblResult;
	private JSeparator separator;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Result frame = new Result();
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
	public Result() {
		setBackground(Color.DARK_GRAY);
		setTitle("QuizPage");
		setForeground(Color.DARK_GRAY);
		setFont(new Font("Arial Black", Font.PLAIN, 12));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1000, 700);
		Qpage8 = new JPanel();
		Qpage8.setForeground(SystemColor.textHighlight);
		Qpage8.setBackground(Color.DARK_GRAY);
		Qpage8.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Qpage8);
		
		textField = new JTextField();
		textField.setBounds(758, 11, 216, 34);
		Qpage8.setLayout(null);
		textField.setText(QuizHome.name);
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setForeground(Color.BLACK);
		textField.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 16));
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBackground(new Color(154, 205, 50));
		Qpage8.add(textField);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(10, 11, 89, 32);
		btnBack.setForeground(Color.BLACK);
		btnBack.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		btnBack.setBackground(UIManager.getColor("Button.highlight"));
		Qpage8.add(btnBack);
		btnBack.setActionCommand("back");
		
		lblNewLabel = new JLabel("C programming");
		lblNewLabel.setBackground(new Color(32, 178, 170));
		lblNewLabel.setForeground(new Color(32, 178, 170));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel.setBounds(53, 200, 176, 46);
		Qpage8.add(lblNewLabel);
		
		lblEasy1 = new JLabel("Beginner = ");
		lblEasy1.setForeground(new Color(173, 255, 47));
		lblEasy1.setHorizontalAlignment(SwingConstants.LEFT);
		lblEasy1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblEasy1.setBounds(53, 288, 89, 34);
		Qpage8.add(lblEasy1);
		
		lblIntermediate1 = new JLabel("Intermediate = ");
		lblIntermediate1.setForeground(new Color(255, 165, 0));
		lblIntermediate1.setHorizontalAlignment(SwingConstants.LEFT);
		lblIntermediate1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblIntermediate1.setBounds(53, 349, 121, 34);
		Qpage8.add(lblIntermediate1);
		
		lblAdvanced1 = new JLabel("Advanced = ");
		lblAdvanced1.setForeground(new Color(255, 69, 0));
		lblAdvanced1.setHorizontalAlignment(SwingConstants.LEFT);
		lblAdvanced1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAdvanced1.setBounds(53, 411, 108, 34);
		Qpage8.add(lblAdvanced1);
		
		e1 = new JLabel();
		e1.setForeground(Color.WHITE);
		e1.setHorizontalAlignment(SwingConstants.CENTER);
		e1.setFont(new Font("Tahoma", Font.BOLD, 15));
		e1.setBounds(152, 293, 66, 26);
		Qpage8.add(e1);
		
		i1 = new JLabel();
		i1.setForeground(Color.WHITE);
		i1.setHorizontalAlignment(SwingConstants.CENTER);
		i1.setFont(new Font("Tahoma", Font.BOLD, 15));
		i1.setBounds(152, 349, 66, 26);
		Qpage8.add(i1);
		
		a1 = new JLabel();
		a1.setForeground(Color.WHITE);
		a1.setHorizontalAlignment(SwingConstants.CENTER);
		a1.setFont(new Font("Tahoma", Font.BOLD, 15));
		a1.setBounds(152, 419, 66, 26);
		Qpage8.add(a1);
		
		lblJava = new JLabel("Java");
		lblJava.setForeground(new Color(255, 140, 0));
		lblJava.setHorizontalAlignment(SwingConstants.CENTER);
		lblJava.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblJava.setBounds(285, 200, 176, 46);
		Qpage8.add(lblJava);
		
		lblEasy2 = new JLabel("Beginner = ");
		lblEasy2.setForeground(new Color(173, 255, 47));
		lblEasy2.setHorizontalAlignment(SwingConstants.LEFT);
		lblEasy2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblEasy2.setBounds(297, 288, 89, 34);
		Qpage8.add(lblEasy2);
		
		e2 = new JLabel();
		e2.setForeground(Color.WHITE);
		e2.setHorizontalAlignment(SwingConstants.CENTER);
		e2.setFont(new Font("Tahoma", Font.BOLD, 15));
		e2.setBounds(396, 293, 66, 26);
		Qpage8.add(e2);
		
		lblIntermediate2 = new JLabel("Intermediate = ");
		lblIntermediate2.setForeground(new Color(255, 165, 0));
		lblIntermediate2.setHorizontalAlignment(SwingConstants.LEFT);
		lblIntermediate2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblIntermediate2.setBounds(297, 349, 126, 34);
		Qpage8.add(lblIntermediate2);
		
		i2 = new JLabel();
		i2.setForeground(Color.WHITE);
		i2.setHorizontalAlignment(SwingConstants.CENTER);
		i2.setFont(new Font("Tahoma", Font.BOLD, 15));
		i2.setBounds(396, 349, 66, 26);
		Qpage8.add(i2);
		
		lblAdvanced2 = new JLabel("Advanced = ");
		lblAdvanced2.setForeground(new Color(255, 69, 0));
		lblAdvanced2.setHorizontalAlignment(SwingConstants.LEFT);
		lblAdvanced2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAdvanced2.setBounds(297, 411, 108, 34);
		Qpage8.add(lblAdvanced2);
		
		a2 = new JLabel();
		a2.setForeground(Color.WHITE);
		a2.setHorizontalAlignment(SwingConstants.CENTER);
		a2.setFont(new Font("Tahoma", Font.BOLD, 15));
		a2.setBounds(396, 419, 66, 26);
		Qpage8.add(a2);
		
		lblDataStructure = new JLabel("Data Structure");
		lblDataStructure.setForeground(new Color(255, 215, 0));
		lblDataStructure.setHorizontalAlignment(SwingConstants.CENTER);
		lblDataStructure.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblDataStructure.setBounds(530, 200, 177, 46);
		Qpage8.add(lblDataStructure);
		
		lblEasy3 = new JLabel("Beginner = ");
		lblEasy3.setForeground(new Color(173, 255, 47));
		lblEasy3.setHorizontalAlignment(SwingConstants.LEFT);
		lblEasy3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblEasy3.setBounds(542, 288, 89, 34);
		Qpage8.add(lblEasy3);
		
		e3 = new JLabel();
		e3.setForeground(Color.WHITE);
		e3.setHorizontalAlignment(SwingConstants.CENTER);
		e3.setFont(new Font("Tahoma", Font.BOLD, 15));
		e3.setBounds(641, 293, 66, 26);
		Qpage8.add(e3);
		
		lblIntermediate3 = new JLabel("Intermediate = ");
		lblIntermediate3.setForeground(new Color(255, 165, 0));
		lblIntermediate3.setHorizontalAlignment(SwingConstants.LEFT);
		lblIntermediate3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblIntermediate3.setBounds(542, 349, 121, 34);
		Qpage8.add(lblIntermediate3);
		
		i3 = new JLabel();
		i3.setForeground(Color.WHITE);
		i3.setHorizontalAlignment(SwingConstants.CENTER);
		i3.setFont(new Font("Tahoma", Font.BOLD, 15));
		i3.setBounds(641, 349, 66, 26);
		Qpage8.add(i3);
		
		lblAdvanced3 = new JLabel("Advanced = ");
		lblAdvanced3.setForeground(new Color(255, 69, 0));
		lblAdvanced3.setHorizontalAlignment(SwingConstants.LEFT);
		lblAdvanced3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAdvanced3.setBounds(542, 411, 108, 34);
		Qpage8.add(lblAdvanced3);
		
		a3 = new JLabel();
		a3.setForeground(Color.WHITE);
		a3.setHorizontalAlignment(SwingConstants.CENTER);
		a3.setFont(new Font("Tahoma", Font.BOLD, 15));
		a3.setBounds(641, 419, 66, 26);
		Qpage8.add(a3);
		
		lblAlgorithm = new JLabel("Algorithm");
		lblAlgorithm.setForeground(new Color(127, 255, 0));
		lblAlgorithm.setHorizontalAlignment(SwingConstants.CENTER);
		lblAlgorithm.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblAlgorithm.setBounds(758, 200, 183, 46);
		Qpage8.add(lblAlgorithm);
		
		lblEasy4 = new JLabel("Beginner = ");
		lblEasy4.setForeground(new Color(173, 255, 47));
		lblEasy4.setHorizontalAlignment(SwingConstants.LEFT);
		lblEasy4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblEasy4.setBounds(776, 288, 89, 34);
		Qpage8.add(lblEasy4);
		
		e4 = new JLabel();
		e4.setForeground(Color.WHITE);
		e4.setHorizontalAlignment(SwingConstants.CENTER);
		e4.setFont(new Font("Tahoma", Font.BOLD, 15));
		e4.setBounds(875, 293, 66, 26);
		Qpage8.add(e4);
		
		lblIntermediate4 = new JLabel("Intermediate = ");
		lblIntermediate4.setForeground(new Color(255, 165, 0));
		lblIntermediate4.setHorizontalAlignment(SwingConstants.LEFT);
		lblIntermediate4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblIntermediate4.setBounds(776, 349, 121, 34);
		Qpage8.add(lblIntermediate4);
		
		i4 = new JLabel();
		i4.setForeground(Color.WHITE);
		i4.setHorizontalAlignment(SwingConstants.CENTER);
		i4.setFont(new Font("Tahoma", Font.BOLD, 15));
		i4.setBounds(875, 349, 66, 26);
		Qpage8.add(i4);
		
		lblAdvanced4 = new JLabel("Advanced = ");
		lblAdvanced4.setForeground(new Color(255, 69, 0));
		lblAdvanced4.setHorizontalAlignment(SwingConstants.LEFT);
		lblAdvanced4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAdvanced4.setBounds(776, 411, 108, 34);
		Qpage8.add(lblAdvanced4);
		
		a4 = new JLabel();
		a4.setForeground(Color.WHITE);
		a4.setHorizontalAlignment(SwingConstants.CENTER);
		a4.setFont(new Font("Tahoma", Font.BOLD, 15));
		a4.setBounds(875, 419, 66, 26);
		Qpage8.add(a4);
		
		lblResult = new JLabel("Result");
		lblResult.setHorizontalAlignment(SwingConstants.CENTER);
		lblResult.setForeground(Color.WHITE);
		lblResult.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblResult.setBounds(240, 54, 467, 101);
		Qpage8.add(lblResult);
		
		separator = new JSeparator();
		separator.setBackground(Color.WHITE);
		separator.setBounds(40, 256, 901, 9);
		Qpage8.add(separator);
		btnBack.addActionListener(new ButtonClickListener());
		
		
		try
        { 
			String Cez = QuizHome.name+"cproAnseasy"+".txt";
			String Cmd = QuizHome.name+"cproAnsmid"+".txt";
			String Chd = QuizHome.name+"cproAnshard"+".txt";
			String Jez = QuizHome.name+"javaAnseasy"+".txt";
			String Jmd= QuizHome.name+"javaAnsmid"+".txt";
			String Jhd = QuizHome.name+"javaAnshard"+".txt";
			String Dez = QuizHome.name+"dsAnseasy"+".txt";
			String Dmd = QuizHome.name+"dsAnsmid"+".txt";
			String Dhd= QuizHome.name+"dsAnshard"+".txt";
			String Aez = QuizHome.name+"algoAnseasy"+".txt";
			String Amd = QuizHome.name+"algoAnsmid"+".txt";
			String Ahd= QuizHome.name+"algoAnshard"+".txt";
			BufferedReader br1 = new BufferedReader(new FileReader (Cez));	
			BufferedReader br2 = new BufferedReader(new FileReader (Cmd));	
			BufferedReader br3 = new BufferedReader(new FileReader (Chd));	
			BufferedReader br4 = new BufferedReader(new FileReader (Jez));	
			BufferedReader br5 = new BufferedReader(new FileReader (Jmd));	
			BufferedReader br6 = new BufferedReader(new FileReader (Jhd));	
			BufferedReader br7 = new BufferedReader(new FileReader (Dez));	
			BufferedReader br8 = new BufferedReader(new FileReader (Dmd));	
			BufferedReader br9 = new BufferedReader(new FileReader (Dhd));	
			BufferedReader br10 = new BufferedReader(new FileReader (Aez));	
			BufferedReader br11 = new BufferedReader(new FileReader (Amd));	
			BufferedReader br12 = new BufferedReader(new FileReader (Ahd));	
			String a,b,c,d,e,f,g,h,i,j,k,l;
           while((a = br1.readLine()) != null)
           {
           	String[] s=a.split("/");
           	e1.setText(s[0]);
           	break;
           }
           while((b = br2.readLine()) != null)
           {
           	String[] s=b.split("/");
           	i1.setText(s[0]);
           	break;
           }
           while((c = br3.readLine()) != null)
           {
           	String[] s=c.split("/");
           	a1.setText(s[0]);
           	break;
           }
           while((d = br4.readLine()) != null)
           {
           	String[] s=d.split("/");
           	e2.setText(s[0]);
           	break;
           }
           while((e = br5.readLine()) != null)
           {
           	String[] s=e.split("/");
           	i2.setText(s[0]);
           	break;
           }
           while((f = br6.readLine()) != null)
           {
           	String[] s=f.split("/");
           	a2.setText(s[0]);
           	break;
           }
           while((g = br7.readLine()) != null)
           {
           	String[] s=g.split("/");
           	e3.setText(s[0]);
           	break;
           }
           while((h = br8.readLine()) != null)
           {
           	String[] s=h.split("/");
           	i3.setText(s[0]);
           	break;
           }
           while((i = br9.readLine()) != null)
           {
           	String[] s=i.split("/");
           	a3.setText(s[0]);
           	break;
           }
           while((j = br10.readLine()) != null)
           {
           	String[] s=j.split("/");
           	e4.setText(s[0]);
           	break;
           }
           while((k = br11.readLine()) != null)
           {
           	String[] s=k.split("/");
           	i4.setText(s[0]);
           	break;
           }
           while((l = br12.readLine()) != null)
           {
           	String[] s=l.split("/");
           	a4.setText(s[0]);
           	break;
           }
        }
		catch (Exception ex)
		{
			//System.out.print("file missing ");
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
