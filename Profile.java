import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;

public class Profile extends JFrame {

	private JPanel Qpage6;
	private JTextField textField;
	private JTextField fullname;
	private JTextField username;
	private JTextField id;
	private JTextField mob;
	private JTextField email;
	private JTextField addr;
	String Fname,Uname,Uid,Umob,Uemail,Uaddr;
	private JTextField cgpa;


	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Profile frame = new Profile();
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
	public Profile() {
		setBackground(Color.DARK_GRAY);
		setTitle("QuizPage");
		setForeground(Color.DARK_GRAY);
		setFont(new Font("Arial Black", Font.PLAIN, 12));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1000, 700);
		Qpage6 = new JPanel();
		Qpage6.setForeground(SystemColor.textHighlight);
		Qpage6.setBackground(Color.DARK_GRAY);
		Qpage6.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Qpage6);
		
		textField = new JTextField();
		textField.setBounds(758, 11, 216, 34);
		Qpage6.setLayout(null);
		textField.setText(QuizHome.name);
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setForeground(Color.BLACK);
		textField.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 16));
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBackground(new Color(154, 205, 50));
		Qpage6.add(textField);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(10, 13, 89, 32);
		btnBack.setForeground(Color.BLACK);
		btnBack.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		btnBack.setBackground(UIManager.getColor("Button.highlight"));
		Qpage6.add(btnBack);
		btnBack.setActionCommand("back");
		btnBack.addActionListener(new ButtonClickListener());
		
		
		try
        { 
			String file = QuizHome.name+".txt";
			BufferedReader br = new BufferedReader(new FileReader (file));	 	            	 
			String a;
           while((a = br.readLine()) != null)
           {
           	String[] s=a.split("/");
           	Fname=s[2];Uname=s[0];Uid=s[3];Umob=s[4];Uemail=s[6];Uaddr=s[5];
     	
           }
        }
		catch (Exception ex)
		{
			
		}
		
		
		JLabel lblNewLabel = new JLabel("Profile");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 49));
		lblNewLabel.setForeground(new Color(154, 205, 50));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(363, 81, 283, 67);
		Qpage6.add(lblNewLabel);
		
		
		fullname = new JTextField(Fname);
		fullname.setForeground(Color.BLACK);
		fullname.setEditable(false);
		fullname.setBackground(Color.LIGHT_GRAY);
		fullname.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 19));
		fullname.setBounds(468, 222, 317, 35);
		Qpage6.add(fullname);
		fullname.setColumns(10);
		
		JLabel lblFullName = new JLabel("Full Name");
		lblFullName.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		lblFullName.setHorizontalAlignment(SwingConstants.CENTER);
		lblFullName.setForeground(Color.WHITE);
		lblFullName.setBounds(221, 230, 123, 27);
		Qpage6.add(lblFullName);
		
		JLabel lblUserName = new JLabel("User Name");
		lblUserName.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		lblUserName.setHorizontalAlignment(SwingConstants.CENTER);
		lblUserName.setForeground(Color.WHITE);
		lblUserName.setBounds(221, 282, 123, 27);
		Qpage6.add(lblUserName);
		
		username = new JTextField(Uname);
		username.setForeground(Color.BLACK);
		username.setBackground(Color.LIGHT_GRAY);
		username.setEditable(false);
		username.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		username.setColumns(10);
		username.setBounds(468, 280, 249, 35);
		Qpage6.add(username);
		
		JLabel lblId = new JLabel("ID");
		lblId.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		lblId.setHorizontalAlignment(SwingConstants.CENTER);
		lblId.setForeground(Color.WHITE);
		lblId.setBounds(221, 338, 123, 27);
		Qpage6.add(lblId);
		
		id = new JTextField(Uid);
		id.setForeground(Color.BLACK);
		id.setBackground(Color.LIGHT_GRAY);
		id.setEditable(false);
		id.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		id.setColumns(10);
		id.setBounds(468, 334, 249, 35);
		Qpage6.add(id);
		
		JLabel lblContactNo = new JLabel("Contact No.");
		lblContactNo.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		lblContactNo.setHorizontalAlignment(SwingConstants.CENTER);
		lblContactNo.setForeground(Color.WHITE);
		lblContactNo.setBounds(221, 395, 123, 27);
		Qpage6.add(lblContactNo);
		
		mob = new JTextField(Umob);
		mob.setForeground(Color.BLACK);
		mob.setBackground(Color.LIGHT_GRAY);
		mob.setEditable(false);
		mob.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		mob.setColumns(10);
		mob.setBounds(468, 393, 249, 35);
		Qpage6.add(mob);
		
		email = new JTextField(Uemail);
		email.setForeground(Color.BLACK);
		email.setBackground(Color.LIGHT_GRAY);
		email.setEditable(false);
		email.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		email.setColumns(10);
		email.setBounds(468, 450, 249, 35);
		Qpage6.add(email);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setBounds(221, 452, 123, 27);
		Qpage6.add(lblEmail);
		
		addr = new JTextField(Uaddr);
		addr.setForeground(Color.BLACK);
		addr.setBackground(Color.LIGHT_GRAY);
		addr.setEditable(false);
		addr.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		addr.setColumns(10);
		addr.setBounds(468, 511, 317, 59);
		Qpage6.add(addr);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		lblAddress.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddress.setForeground(Color.WHITE);
		lblAddress.setBounds(221, 511, 123, 27);
		Qpage6.add(lblAddress);
		
		
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
