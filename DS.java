import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import javax.swing.JDialog;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Enumeration;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import javax.swing.JRadioButton;

public class DS extends JFrame {
	private JPanel Qpage4;
	private JTextField textField;
	private String File="",File1="",File2="",AN="";	
	private int page=0,list=0,ans=0;
	private JLabel QS;
	private JRadioButton rdbtnOp_3;
	private JRadioButton rdbtnOp_2;
	private JRadioButton rdbtnOp_1;
	private JRadioButton rdbtnOp;
	private ButtonGroup  btngroup;
	private JButton btnSubmit;
	private JLabel Point;
	double Score=0;
	private JLabel lblDataStructureTest;
	public static void main(String[] args) {
		

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DS frame = new DS();
					frame.setVisible(true);
									
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
		
	
	public DS() {
		
		
		
		setBackground(Color.DARK_GRAY);
		setTitle("QuizPage");
		setForeground(Color.DARK_GRAY);
		setFont(new Font("Arial Black", Font.PLAIN, 12));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1000, 700);
		Qpage4 = new JPanel();
		Qpage4.setForeground(SystemColor.textHighlight);
		Qpage4.setBackground(Color.GRAY);
		Qpage4.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Qpage4);
		Qpage4.setLayout(null);
		
		
		 btnSubmit = new JButton("Finish");
		btnSubmit.setForeground(UIManager.getColor("Button.foreground"));
		btnSubmit.setBackground(new Color(154, 205, 50));
		btnSubmit.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 20));
		btnSubmit.setBounds(426, 616, 106, 34);
		btnSubmit.setActionCommand("submit");
		btnSubmit.addActionListener(new ButtonClickListener()); 
		
		Point = new JLabel();
		Point.setHorizontalAlignment(SwingConstants.CENTER);
		Point.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		Point.setBackground(Color.RED);
		Point.setToolTipText("Score");
		Point.setBounds(880, 195, 83, 23);
		Qpage4.add(Point);
		
		JButton btnNewButton_3 = new JButton("Next");
		btnNewButton_3.setBounds(874, 146, 89, 23);
		Qpage4.add(btnNewButton_3);
		btnNewButton_3.setActionCommand("nxt");
		btnNewButton_3.addActionListener(new ButtonClickListener());
		
		
		QS = new JLabel();
		QS.setFont(new Font("Times New Roman", Font.BOLD, 20));
		QS.setBounds(92, 148, 778, 221);
		Qpage4.add(QS);
		
		rdbtnOp_3 = new JRadioButton();
		rdbtnOp_3.setBounds(652, 515, 109, 23);
		Qpage4.add(rdbtnOp_3);
		
		rdbtnOp_2 = new JRadioButton();
		rdbtnOp_2.setBounds(652, 432, 109, 23);
		Qpage4.add(rdbtnOp_2);
		
		rdbtnOp_1 = new JRadioButton();
		rdbtnOp_1.setBounds(179, 515, 109, 23);
		Qpage4.add(rdbtnOp_1);
		
		rdbtnOp = new JRadioButton();
		rdbtnOp.setBounds(179, 432, 109, 23);
		Qpage4.add(rdbtnOp);
				
		btngroup = new ButtonGroup();
		btngroup.add(rdbtnOp);
		btngroup.add(rdbtnOp_1);
		btngroup.add(rdbtnOp_2);
		btngroup.add(rdbtnOp_3);

	
	
		JSeparator separator = new JSeparator();
		separator.setBackground(Color.BLACK);
		separator.setBounds(10, 380, 964, 9);
		Qpage4.add(separator);
		
		
		JButton button = new JButton("My Profile");
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 10));
		button.setBackground(new Color(51, 51, 51));
		button.setActionCommand("profile");
		button.setBounds(836, 58, 121, 34);
		Qpage4.add(button);
		
		JButton btnBack = new JButton("Back");
		btnBack.setForeground(Color.BLACK);
		btnBack.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		btnBack.setBackground(UIManager.getColor("Button.highlight"));
		btnBack.setBounds(10, 13, 78, 34);
		Qpage4.add(btnBack);
		btnBack.setActionCommand("back");
		btnBack.addActionListener(new ButtonClickListener()); 
		
		JButton btnNewButton = new JButton("Beginner");
		btnNewButton.setBackground(new Color(144, 238, 144));
		btnNewButton.setFont(new Font("SansSerif", Font.BOLD | Font.ITALIC, 13));
		btnNewButton.setBounds(298, 22, 100, 23);
		Qpage4.add(btnNewButton);
		btnNewButton.setActionCommand("easy");
		btnNewButton.addActionListener(new ButtonClickListener()); 

		JButton btnNewButton_1 = new JButton("Intermediate");
		btnNewButton_1.setBackground(new Color(255, 165, 0));
		btnNewButton_1.setFont(new Font("SansSerif", Font.BOLD | Font.ITALIC, 13));
		btnNewButton_1.setBounds(426, 22, 121, 23);
		Qpage4.add(btnNewButton_1);
		btnNewButton_1.setActionCommand("mid");
		btnNewButton_1.addActionListener(new ButtonClickListener()); 
		
		JButton btnNewButton_2 = new JButton("Advanced");
		btnNewButton_2.setBackground(new Color(255, 69, 0));
		btnNewButton_2.setFont(new Font("SansSerif", Font.BOLD | Font.ITALIC, 13));
		btnNewButton_2.setBounds(575, 22, 100, 23);
		Qpage4.add(btnNewButton_2);
		btnNewButton_2.setActionCommand("hard");
		
		JLabel bg = new JLabel("");
		bg.setIcon(new ImageIcon("G:\\Code Bucket II\\JavaLearning\\BG.jpg"));
		bg.setHorizontalAlignment(SwingConstants.CENTER);
		bg.setForeground(Color.BLACK);
		bg.setBackground(Color.GRAY);
		bg.setBounds(10, 127, 964, 464);
		Qpage4.add(bg);
		
		textField = new JTextField();
		textField.setText(QuizHome.name);
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setForeground(Color.BLACK);
		textField.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 16));
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBackground(new Color(154, 205, 50));
		textField.setBounds(741, 13, 216, 34);
		Qpage4.add(textField);
		
		lblDataStructureTest = new JLabel("Data Structure Test");
		lblDataStructureTest.setHorizontalAlignment(SwingConstants.CENTER);
		lblDataStructureTest.setForeground(Color.BLACK);
		lblDataStructureTest.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblDataStructureTest.setBackground(new Color(154, 205, 50));
		lblDataStructureTest.setBounds(298, 74, 377, 42);
		Qpage4.add(lblDataStructureTest);
		btnNewButton_2.addActionListener(new ButtonClickListener());
		
	}
	
	void fini()
	{

		Qpage4.add(btnSubmit);

	}
	
	String getSelectedButtonText(ButtonGroup btngroup) {
	    for (Enumeration buttons = btngroup.getElements(); buttons.hasMoreElements();) {
	        AbstractButton button = (AbstractButton) buttons.nextElement();

	        if (button.isSelected()) {
	            return button.getText();
	        }
	    }
	    return null;
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
		         else if(command.equals("easy"))
		         {
		        	 AN="easy";
		        	  page=0;
		        	  list=0;
		        	  ans=-1;
		        	  File="G:\\Code Bucket II\\JavaLearning\\ds\\easy.txt";
		        	  File1="G:\\Code Bucket II\\JavaLearning\\ds\\easy-op.txt";
		        	  File2="G:\\Code Bucket II\\JavaLearning\\ds\\easy-ans.txt";
		        	  dispose();
			          setVisible(true);
			          try
			             {     	   
			         	    BufferedReader br = new BufferedReader(new FileReader(File));	 	            	 
			                String  input;
			                while((input = br.readLine()) != null)
			                {
			                    String[] str=input.split("/");	
			                    QS.setText(str[page++]);
			                    break;
			                } 
			                BufferedReader br1 = new BufferedReader(new FileReader(File1));	 	            	 
			                String  input1;
			                while((input1 = br1.readLine()) != null)
			                {
			                    String[] str1=input1.split("/");
			                    rdbtnOp.setText(str1[list]);
			                    rdbtnOp_1.setText(str1[list+1]);
			                    rdbtnOp_2.setText(str1[list+2]);
			                    rdbtnOp_3.setText(str1[list+3]);
			                    list+=4;
			                    break;
			                }  
			             }
			          catch(Exception ec)
			          {
			        	  
			          }
		         }	
		         else if(command.equals("mid"))
		         {
		        	 AN="mid";
		        	 	  page=0;
		        	 	  list=0;
		        	 	  ans=-1;
			        	  File="G:\\Code Bucket II\\JavaLearning\\ds\\mid.txt";
			        	  File1="G:\\Code Bucket II\\JavaLearning\\ds\\mid-op.txt";
			        	  File2="G:\\Code Bucket II\\JavaLearning\\ds\\mid-ans.txt";	
			        	  dispose();
				          setVisible(true);
				          try
				             {     	   
				         	    BufferedReader br = new BufferedReader(new FileReader(File));	 	            	 
				                String  input;
				                while((input = br.readLine()) != null)
				                {
				                    String[] str=input.split("/");	
				                    QS.setText(str[page++]);
				                    break;
				                } 
				                BufferedReader br1 = new BufferedReader(new FileReader(File1));	 	            	 
				                String  input1;
				                while((input1 = br1.readLine()) != null)
				                {
				                    String[] str1=input1.split("/");
				                    rdbtnOp.setText(str1[list]);
				                    rdbtnOp_1.setText(str1[list+1]);
				                    rdbtnOp_2.setText(str1[list+2]);
				                    rdbtnOp_3.setText(str1[list+3]);
				                    list+=4;
				                    break;
				                }  
				             }
				          catch(Exception ec)
				          {
				        	  
				          }
		         }	
		         else if(command.equals("hard"))
		         {
		        	 AN="hard";
		        	 	page=0;
		        	 	list=0;
		        	 	ans=-1;
			        	File="G:\\Code Bucket II\\JavaLearning\\ds\\hard.txt";
			        	File1="G:\\Code Bucket II\\JavaLearning\\ds\\hard-op.txt";
			        	File2="G:\\Code Bucket II\\JavaLearning\\ds\\hard-ans.txt";
		        		dispose();
			        	setVisible(true);  
			        	try
			             {     	   
			         	    BufferedReader br = new BufferedReader(new FileReader(File));	 	            	 
			                String  input;
			                while((input = br.readLine()) != null)
			                {
			                    String[] str=input.split("/");	
			                    QS.setText(str[page++]);
			                    break;
			                } 
			                BufferedReader br1 = new BufferedReader(new FileReader(File1));	 	            	 
			                String  input1;
			                while((input1 = br1.readLine()) != null)
			                {
			                    String[] str1=input1.split("/");
			                    rdbtnOp.setText(str1[list]);
			                    rdbtnOp_1.setText(str1[list+1]);
			                    rdbtnOp_2.setText(str1[list+2]);
			                    rdbtnOp_3.setText(str1[list+3]);
			                    list+=4;
			                    break;
			                }  
			             }
			          catch(Exception ec)
			          {
			        	  
			          }
		         }	
		         else if(command.equals("nxt"))
		         {
		        	 //System.out.println(page+" "+list+" "+ans);
		        	 
		        	if(page>=5 && list>=20 && ans>=5) {
		        		page=0;list=0;ans=-1;
		        		fini();
		        		dispose();
				        setVisible(true);
		        		    JOptionPane optionPane = new JOptionPane("Now Click Submit  !", JOptionPane.INFORMATION_MESSAGE);
		     	            JDialog dialog = optionPane.createDialog("Complete!");      
		     	            dialog.setAlwaysOnTop(true);
		     	            dialog.setVisible(true);
		     	           return ;
			        		
		        	}
		  					  	
		        	 try
		             {    		        		    
		         	    BufferedReader br = new BufferedReader(new FileReader(File));	 	            	 
		                String  input;
		                while((input = br.readLine()) != null)
		                {
		                    String[] str=input.split("/");	
		                    QS.setText(str[page++]);
		                    break;
		                } 
		             }
		        	 catch (Exception qs)
		        	 {
		        		    JOptionPane optionPane = new JOptionPane("Please Select Question The Level !", JOptionPane.INFORMATION_MESSAGE);
		     	            JDialog dialog = optionPane.createDialog("Question File Not Found !");      
		     	            dialog.setAlwaysOnTop(true);
		     	            dialog.setVisible(true);
		        	 }
		                
		                try {
		                 BufferedReader br2 = new BufferedReader(new FileReader(File2));	 	            	 
			              String  input2;
			              ans++;
				          while((input2 = br2.readLine()) != null)
				            {
				                String[] str2=input2.split("/");
				                //System.out.println(str2[ans]+" "+getSelectedButtonText(btngroup));System.out.println("ok");
				              
				                    if(getSelectedButtonText(btngroup).equals(str2[ans])) {Score+=10;Point.setText(Double.toString(Score));}
				                    else
				                    {
				                    	JOptionPane optionPane = new JOptionPane("Wrong Answer !", JOptionPane.INFORMATION_MESSAGE);
					     	            JDialog dialog = optionPane.createDialog("Error!");      
					     	            dialog.setAlwaysOnTop(true);
					     	            dialog.setVisible(true);	
				                    }
				                   
				                    break; 
				            }
		                 btngroup.clearSelection();
		                }
		                catch(Exception li)
		                {
		                	JOptionPane optionPane = new JOptionPane("Select Correct Option !", JOptionPane.INFORMATION_MESSAGE);
		     	            JDialog dialog = optionPane.createDialog("Warning!");      
		     	            dialog.setAlwaysOnTop(true);
		     	            dialog.setVisible(true);
		     	            page--;
		     	            list-=4;
		     	            ans--;
		                }
		                
		                try {
		                BufferedReader br1 = new BufferedReader(new FileReader(File1));	 	            	 
		                String  input1;
		                while((input1 = br1.readLine()) != null)
		                {
		                	
		                    String[] str1=input1.split("/");
		                    rdbtnOp.setText(str1[list]);
		                    rdbtnOp_1.setText(str1[list+1]);
		                    rdbtnOp_2.setText(str1[list+2]);
		                    rdbtnOp_3.setText(str1[list+3]);
		                    list+=4;
		                    break;
		                }  

		             } 
		             catch(Exception extry)
		             {
//		            	    JOptionPane optionPane = new JOptionPane("Please Select Question The Level !", JOptionPane.INFORMATION_MESSAGE);
//		     	            JDialog dialog = optionPane.createDialog("Question File Not Found !");      
//		     	            dialog.setAlwaysOnTop(true);
//		     	            dialog.setVisible(true);
		             }
		        	 
		         }
		         else if(command.equals("submit"))
		         {
		        	 try
		     		    { 

		     				File file= new File (QuizHome.name+"dsAns"+AN+".txt");
		     		        FileWriter w = new FileWriter(file,true);
		     		        BufferedWriter bf = new BufferedWriter(w);
		     		        bf.write(Point.getText()+"/");
		     		        bf.newLine();
		   
			     		     bf.close();
			     		   	 dispose();		     			
		     		    } 
		     		catch (Exception ex) 
		     		    {
		     		       
		     		        
		     		    } 
		        	 dispose();
		        	 TestAns ts = new TestAns("dsAns",AN,"ds");
		        	 ts.setVisible(true);
		         }
		         
	         }
	      }		
}
