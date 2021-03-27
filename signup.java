import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.UIManager;

public class signup extends JFrame {
	
	private JPanel contentPane;
	private JTextField Fname;
	private JTextField name;
	private JTextField id;
	private JTextField mob;
	private JTextField email;
	private JTextField addr;
	private JTextField pass1;
	private JTextField pass2;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					signup frame = new signup();
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
	public signup() {
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 10, 1000, 700);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SignUp");
		lblNewLabel.setBounds(291, 25, 368, 121);
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 49));
		contentPane.add(lblNewLabel);
		
		JLabel lblFullName = new JLabel("Full Name");
		lblFullName.setForeground(Color.BLACK);
		lblFullName.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		lblFullName.setHorizontalAlignment(SwingConstants.LEFT);
		lblFullName.setBounds(187, 150, 88, 42);
		contentPane.add(lblFullName);
		
		JLabel lblUserName = new JLabel("User Name");
		lblUserName.setForeground(Color.BLACK);
		lblUserName.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		lblUserName.setHorizontalAlignment(SwingConstants.LEFT);
		lblUserName.setBounds(187, 200, 88, 42);
		contentPane.add(lblUserName);
		
		JLabel lblNewLabel_1 = new JLabel("Id");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setBounds(187, 261, 88, 33);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Contact no.");
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2.setBounds(187, 315, 88, 33);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setForeground(Color.BLACK);
		lblEmail.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		lblEmail.setHorizontalAlignment(SwingConstants.LEFT);
		lblEmail.setBounds(187, 377, 88, 33);
		contentPane.add(lblEmail);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setForeground(Color.BLACK);
		lblAddress.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		lblAddress.setHorizontalAlignment(SwingConstants.LEFT);
		lblAddress.setBounds(187, 438, 88, 32);
		contentPane.add(lblAddress);
		
		JLabel lblNewLabel_3 = new JLabel("New Pass.");
		lblNewLabel_3.setForeground(Color.BLACK);
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3.setBounds(187, 481, 126, 42);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblConfurmPass = new JLabel("Confirm Pass.");
		lblConfurmPass.setForeground(Color.BLACK);
		lblConfurmPass.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		lblConfurmPass.setBounds(183, 534, 115, 42);
		contentPane.add(lblConfurmPass);
		
		Fname = new JTextField();
		Fname.setFont(new Font("Tahoma", Font.BOLD, 14));
		Fname.setForeground(Color.BLACK);
		Fname.setBounds(341, 157, 346, 33);
		contentPane.add(Fname);
		Fname.setColumns(10);
		
		name = new JTextField();
		name.setFont(new Font("Tahoma", Font.BOLD, 14));
		name.setForeground(Color.BLACK);
		name.setBounds(341, 208, 267, 33);
		contentPane.add(name);
		name.setColumns(10);
		
		id = new JTextField();
		id.setFont(new Font("Tahoma", Font.BOLD, 14));
		id.setForeground(Color.BLACK);
		id.setBounds(341, 269, 267, 33);
		contentPane.add(id);
		id.setColumns(10);
		
		mob = new JTextField();
		mob.setFont(new Font("Tahoma", Font.BOLD, 14));
		mob.setForeground(Color.BLACK);
		mob.setBounds(341, 323, 267, 32);
		contentPane.add(mob);
		mob.setColumns(10);
		
		email = new JTextField();
		email.setFont(new Font("Tahoma", Font.BOLD, 14));
		email.setForeground(Color.BLACK);
		email.setBounds(341, 385, 267, 33);
		contentPane.add(email);
		email.setColumns(10);
		
		addr = new JTextField();
		addr.setFont(new Font("Tahoma", Font.BOLD, 14));
		addr.setForeground(Color.BLACK);
		addr.setBounds(341, 438, 381, 37);
		contentPane.add(addr);
		addr.setColumns(10);
		
		pass1 = new JTextField();
		pass1.setFont(new Font("Tahoma", Font.BOLD, 14));
		pass1.setForeground(Color.BLACK);
		pass1.setBounds(341, 494, 267, 29);
		contentPane.add(pass1);
		pass1.setColumns(10);
		
		pass2 = new JTextField();
		pass2.setFont(new Font("Tahoma", Font.BOLD, 14));
		pass2.setForeground(Color.BLACK);
		pass2.setBounds(341, 547, 267, 29);
		contentPane.add(pass2);
		pass2.setColumns(10);
		
		JButton btnBack = new JButton("Back");
		btnBack.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		btnBack.setBackground(UIManager.getColor("Button.highlight"));
		btnBack.setBounds(10, 11, 80, 33);
		contentPane.add(btnBack);
		btnBack.setActionCommand("back"); 					// Action
		btnBack.addActionListener(new ButtonClickListener()); //Action
		
		
		JButton btnSumbit = new JButton("SUMBIT");
		btnSumbit.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		btnSumbit.setBackground(new Color(154, 205, 50));
		btnSumbit.setBounds(425, 605, 99, 33);
		contentPane.add(btnSumbit);
		btnSumbit.setActionCommand("submit"); 					// Action
		btnSumbit.addActionListener(new ButtonClickListener());
	}

	private class ButtonClickListener implements ActionListener{ //Main Action
	      public ButtonClickListener() {
			// TODO Auto-generated constructor stub
		}

		public void actionPerformed(ActionEvent e) {
	         String command = e.getActionCommand();  
	         
	         if( command.equals( "back" ))  {
	        	 dispose();
	        	 QuizHome pg0 =new QuizHome();
	        	 pg0.frmCpquiz.setVisible(true);

	         }
	         else if( command.equals( "submit" ) ) 
	         {
	        	 if(name.getText().equals("") || id.getText().equals("") || email.getText().equals("") || pass1.getText().equals("") || pass2.getText().equals(""))
	     		{	
	     				JOptionPane optionPane = new JOptionPane("Fill Up the Form Correctly", JOptionPane.WARNING_MESSAGE);
	     	        	JDialog dialog = optionPane.createDialog("Error!");      
	     	        	dialog.setAlwaysOnTop(true);
	     	        	dialog.setVisible(true);
	     	    }
	     		else {	
	     			
	     		try
	     		    { 
	     				try {
	     				BufferedReader br = new BufferedReader(new FileReader(name.getText()+".txt"));
	     				JOptionPane optionPane = new JOptionPane("Already Registerd", JOptionPane.WARNING_MESSAGE);
	     	        	JDialog dialog = optionPane.createDialog("Error!");      
	     	        	dialog.setAlwaysOnTop(true);
	     	        	dialog.setVisible(true);
	     				
	     				}
	     				catch  (Exception ex1) {
	     					
	     				if(pass1.getText().equals(pass2.getText())) {
	     				
		     				File file= new File (name.getText()+".txt");
		     		        FileWriter w = new FileWriter(file,true);
		     		        BufferedWriter bf = new BufferedWriter(w);
		     		        bf.write(name.getText()+"/"+pass1.getText()+"/"+Fname.getText()+"/"+id.getText()+"/"+mob.getText()+"/"+addr.getText()+"/"+email.getText());
		     		        bf.newLine();		   
			     		     bf.close();
			     		   	 dispose();
			     		   	 QuizHome pg0 =new QuizHome();
				        	 pg0.frmCpquiz.setVisible(true);
	     					}
		     				else 
		     				{
		     					JOptionPane optionPane = new JOptionPane("Password didn't Matched", JOptionPane.WARNING_MESSAGE);
			     	        	JDialog dialog = optionPane.createDialog("Error!");      
			     	        	dialog.setAlwaysOnTop(true);
			     	        	dialog.setVisible(true);
		     				}
	     				}
	     		    } 
	     		catch (Exception ex) 
	     		    {
	     		       // System.out.println("ERROR !! ");
	     		        
	     		    } 
	            
	     		}
	         }
	        
	      }		
	   }
}

