import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.DebugGraphics;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.FileReader;


public class QuizHome {

	JFrame frmCpquiz;
	JTextField txtEnterName;
	JTextField txtEnterId;
	static String name,id;
	private JLabel lblNewLabel_2;
	private String passwordTyped,pass="";
	private int numOfCharactersInt;
	private String numOfCharactersString;
	//KeyHandler keyH ;
	//MouseHandler mouseH ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuizHome window = new QuizHome();
					window.frmCpquiz.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public QuizHome() {
		initialize();
	}
	
	private void initialize() {
		
		
		frmCpquiz = new JFrame();
		frmCpquiz.setTitle("CPQuiz");
		frmCpquiz.getContentPane().setForeground(Color.ORANGE);
		frmCpquiz.getContentPane().setBackground(Color.GRAY);
		frmCpquiz.setForeground(Color.DARK_GRAY);
		frmCpquiz.setFont(new Font("Arial Black", Font.PLAIN, 14));
		frmCpquiz.setBackground(Color.DARK_GRAY);
		frmCpquiz.setBounds(0, 0, 1000, 700);
		frmCpquiz.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCpquiz.getContentPane().setLayout(null);
		
		JButton btnSignUp = new JButton("Sign Up");
		btnSignUp.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 11));
		btnSignUp.setBackground(new Color(154, 205, 50));
		btnSignUp.setBounds(885, 11, 89, 30);
		frmCpquiz.getContentPane().add(btnSignUp);
		btnSignUp.setActionCommand("signup");
		btnSignUp.addActionListener(new ButtonClickListener());
		

		lblNewLabel_2 = new JLabel("Competitive Programming Knowledge Test");
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel_2.setBounds(92, 89, 806, 71);
		frmCpquiz.getContentPane().add(lblNewLabel_2);
		JLabel lblEnterId = new JLabel("Password");
		lblEnterId.setBackground(Color.WHITE);
		lblEnterId.setForeground(Color.BLACK);
		lblEnterId.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblEnterId.setBounds(333, 339, 146, 30);
		frmCpquiz.getContentPane().add(lblEnterId);
		
		JLabel lblEnterName = new JLabel("User Name");
		lblEnterName.setBackground(Color.WHITE);
		lblEnterName.setForeground(Color.BLACK);
		lblEnterName.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblEnterName.setBounds(333, 250, 98, 29);
		frmCpquiz.getContentPane().add(lblEnterName);
		
		JButton btnStartQuize = new JButton("Start Quiz");
		btnStartQuize.setBackground(new Color(154, 205, 50));
		btnStartQuize.setForeground(new Color(0, 0, 0));
		btnStartQuize.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		btnStartQuize.setBounds(420, 446, 116, 38);
		frmCpquiz.getContentPane().add(btnStartQuize);
		btnStartQuize.setActionCommand("start");
		btnStartQuize.addActionListener(new ButtonClickListener());
		
		txtEnterName = new JTextField();
		txtEnterName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtEnterName.setDebugGraphicsOptions(DebugGraphics.NONE_OPTION);
		txtEnterName.setToolTipText("");
		txtEnterName.setForeground(Color.BLACK);
		txtEnterName.setBounds(333, 290, 286, 38);
		frmCpquiz.getContentPane().add(txtEnterName);
		txtEnterName.setColumns(10);
		
		txtEnterId = new JTextField();
		txtEnterId.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtEnterId.setForeground(Color.BLACK);
		txtEnterId.setColumns(10);
		txtEnterId.setBounds(333, 380, 286, 39);
		frmCpquiz.getContentPane().add(txtEnterId);
		//keyH = new KeyHandler();
		//mouseH = new MouseHandler();
		
		//txtEnterId.addKeyListener(keyH);		
		//txtEnterId.addMouseListener(mouseH);
		
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBackground(new Color(154, 205, 50));
		lblNewLabel.setToolTipText("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon("JavaLearning\\BG.jpg"));
		lblNewLabel.setBounds(0, 11, 984, 577);
		frmCpquiz.getContentPane().add(lblNewLabel);
		

	}
//	
//	private class MouseHandler implements MouseListener
//    
//    {
//        //clears the textbox when clicked
//        public void mouseClicked(MouseEvent e)
//        {
//            if(e.getSource() == txtEnterId)
//            {
//            	txtEnterId.setText("");
//            	pass="";
//            }
//        }
//         
//                public void mouseEntered(MouseEvent e)
//        {
// 
//        }
//         
//                public void mouseExited(MouseEvent e)
//        {
// 
//        }
//         
//                public void mousePressed(MouseEvent e)
//        {
// 
//        }
//         
//                public void mouseReleased(MouseEvent e)
//        {
// 
//        }
//    }
//	private class KeyHandler implements KeyListener
//    {
//        public void keyPressed(KeyEvent e)
//        {
//             
//        }
//         
//        public void keyReleased(KeyEvent e)
//        {	String star="";
//        	 if(e.getSource() == txtEnterId)
//             {
//                 passwordTyped = txtEnterId.getText();//whatever the user types 
//                 //if()pass += passwordTyped;
//                 int t=passwordTyped.length(),i=1;
////                 while(i<=t) {
////                  star=star+"*";
////                 t--;}
//               // System.out.println(passwordTyped+" "+pass);
//                 //passwordTyped=(passwordTyped.hashCode();
//                
//                 //numOfCharactersInt = passwordTyped.length();//length of the string
//                 //numOfCharactersString = Integer.toString(numOfCharactersInt);//converts the int to string
//             }
//               
//             
//        }
//         
//        public void keyTyped(KeyEvent e)
//        {
//        	 
//        		
//	            
//           
//        }
//         
//    }
	
	 public class ButtonClickListener implements ActionListener{
	      public void actionPerformed(ActionEvent e) {
	         String command = e.getActionCommand();  
	         
	         if( command.equals( "start" ))  
	         {
	        	 passwordTyped = txtEnterId.getText();

	        	 if(txtEnterName.getText().equals("") && passwordTyped.equals(""))
		 	        {
		 	            JOptionPane optionPane = new JOptionPane("Fill Up the Form Correctly", JOptionPane.INFORMATION_MESSAGE);
		 	            JDialog dialog = optionPane.createDialog("ERROR!");      
		 	            dialog.setAlwaysOnTop(true);
		 	            dialog.setVisible(true);
		 	        }
		 	        else
		 	        {    
		 	           try
		 	            { 
		 	        	   
		 	        	   BufferedReader br = new BufferedReader(new FileReader(txtEnterName.getText()+".txt"));
		 	        	   
		 	               String Name = txtEnterName.getText();
		 	               String Pass = passwordTyped;
		 	               String  a;
		 	               name=Name;
		 	               while((a = br.readLine()) != null)
		 	               {
		 	                   String[] s=a.split("/");	                  
		 	                   if(Name.equals(s[0]) && Pass.equals(s[1]))
		 	                   {
		 	
		 	                	frmCpquiz.dispose();
		 	     	        	QuizPage pg1 = new QuizPage();
		 	     	        	pg1.setVisible(true);
		 	                   }
		 	                   else 
		 	                   {
		 	                	JOptionPane optionPane = new JOptionPane("Password/Username is incorrect !", JOptionPane.INFORMATION_MESSAGE);
		 	 	 	            JDialog dialog = optionPane.createDialog("ERROR!");      
		 	 	 	            dialog.setAlwaysOnTop(true);
		 	 	 	            dialog.setVisible(true);
		 	                   }
		 	               }
		 	                
		 	            }
		 	            catch(Exception extry)
		 	            {
		 	                
		 	            }
		 	            
		 	        
	        	 
		 	        }
	         }
	         else if(command.equals("signup")) 
	        {
	        	 frmCpquiz.dispose();
	        	 signup qp2 = new signup();
	        	 qp2.setVisible(true);
	        } 
	     }
	 }
}
