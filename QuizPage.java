
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
import java.awt.event.ActionEvent;
import javax.swing.UIManager;

public class QuizPage extends JFrame {

	private JPanel Qpage1;
	private JTextField UserName;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() {
			public void run() 
			{
				try {
					QuizPage frame = new QuizPage();
					frame.setVisible(true);
				} catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
		
	}
	/**
	 * Create the frame.
	 */
	public QuizPage() {
		setBackground(Color.DARK_GRAY);
		setTitle("QuizPage");
		setForeground(Color.DARK_GRAY);
		setFont(new Font("Arial Black", Font.PLAIN, 12));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1002, 700);
		Qpage1 = new JPanel();
		Qpage1.setForeground(SystemColor.textHighlight);
		Qpage1.setBackground(Color.GRAY);
		Qpage1.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Qpage1);
		Qpage1.setLayout(null);
		
		UserName = new JTextField();
		UserName.setHorizontalAlignment(SwingConstants.CENTER);
		UserName.setText(QuizHome.name);
		UserName.setEditable(false);
		UserName.setBackground(new Color(154, 205, 50));
		UserName.setForeground(Color.BLACK);
		UserName.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 16));
		UserName.setBounds(760, 11, 216, 34);
		Qpage1.add(UserName);
		UserName.setColumns(10);
		
		JButton btnMyResult = new JButton("My Result");
		btnMyResult.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 10));
		btnMyResult.setBackground(Color.DARK_GRAY);
		btnMyResult.setForeground(new Color(255, 255, 255));
		btnMyResult.setBounds(855, 106, 121, 34);
		Qpage1.add(btnMyResult);
		btnMyResult.setActionCommand("result");
		btnMyResult.addActionListener(new ButtonClickListener()); 
		
		JButton btnBack = new JButton("Back");
		btnBack.setForeground(new Color(0, 0, 0));
		btnBack.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		btnBack.setBackground(UIManager.getColor("Button.highlight"));
		btnBack.setBounds(25, 11, 85, 34);
		Qpage1.add(btnBack);
		btnBack.setActionCommand("back");
		btnBack.addActionListener(new ButtonClickListener()); 
		
		JButton btnNewButton = new JButton("Java");
		btnNewButton.setBackground(new Color(210, 105, 30));
		btnNewButton.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 20));
		btnNewButton.setBounds(398, 278, 216, 56);
		Qpage1.add(btnNewButton);
		btnNewButton.setActionCommand("java");
		btnNewButton.addActionListener(new ButtonClickListener()); 
		
		
		JButton btnNewButton_1 = new JButton("Data Structure");
		btnNewButton_1.setBackground(new Color(255, 165, 0));
		btnNewButton_1.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 20));
		btnNewButton_1.setBounds(398, 372, 216, 56);
		Qpage1.add(btnNewButton_1);
		btnNewButton_1.setActionCommand("ds");
		btnNewButton_1.addActionListener(new ButtonClickListener()); 
		
		JButton btnNewButton_2 = new JButton("Algorithm");
		btnNewButton_2.setBackground(new Color(154, 205, 50));
		btnNewButton_2.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 20));
		btnNewButton_2.setBounds(398, 459, 216, 56);
		Qpage1.add(btnNewButton_2);
		btnNewButton_2.setActionCommand("algo");
		btnNewButton_2.addActionListener(new ButtonClickListener()); 
		
		JButton btnNewButton_3 = new JButton("C Programming");
		btnNewButton_3.setBackground(new Color(0, 191, 255));
		btnNewButton_3.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 20));
		btnNewButton_3.setBounds(398, 192, 216, 56);
		Qpage1.add(btnNewButton_3);
		btnNewButton_3.setActionCommand("cpro");
		btnNewButton_3.addActionListener(new ButtonClickListener()); 
		
		JButton btnMyProfile = new JButton("My Profile");
		btnMyProfile.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 10));
		btnMyProfile.setBackground(Color.DARK_GRAY);
		btnMyProfile.setForeground(new Color(255, 255, 255));
		btnMyProfile.setBounds(855, 56, 121, 34);
		Qpage1.add(btnMyProfile);
		btnMyProfile.setActionCommand("profile");
		btnMyProfile.addActionListener(new ButtonClickListener()); 
				
	}
	
	 public class ButtonClickListener implements ActionListener{
	      public void actionPerformed(ActionEvent e) {
	         String command = e.getActionCommand();  
	         
	         if( command.equals( "back" ))  
	         {
	        	 dispose();
	        	 QuizHome qp0 = new QuizHome();
	        	 qp0.frmCpquiz.setVisible(true);
	        	 
	         } 
	         else if( command.equals( "cpro" ))  
	         {
	        	 dispose();
	        	 Cpro qp2 = new Cpro();
	        	 qp2.setVisible(true);
	         } 
	         else if( command.equals( "java" ))  
	         {
	        	 dispose();
	        	 Java qp3 = new Java();
	        	 qp3.setVisible(true);
	         } 
	         else if( command.equals( "ds" ))  
	         {
	        	 dispose();
	        	 DS qp4 = new DS();
	        	 qp4.setVisible(true);
	         } 
	         else if( command.equals( "algo" ))  
	         {
	        	 dispose();
	        	 Algo qp5 = new Algo();
	        	 qp5.setVisible(true);
	         } 
	         else if(command.equals("profile"))
	         {
	        	 dispose();
	        	 Profile qp6 = new Profile();
	        	 qp6.setVisible(true);
	         }  
	         else if(command.equals("result"))
	         {
	        	 dispose();
	        	 Result qp7 = new Result(); 
	        	 qp7.setVisible(true);
	         }  
	      }		
	   }
}