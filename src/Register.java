import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Register extends JFrame {
	
		
		
		JButton btnOK;
		JLabel InUser,InPassword;
		JTextField InFirst, InSecond ;
		
		
		public Register() {
			InUser=new JLabel("Enter User");
			InPassword=new JLabel("Enter Pass");
		   
			InFirst=new JTextField();
			InSecond=new JTextField();
			btnOK = new JButton("Finish");
		
		
		setLayout(null);
		
		add(InUser).setBounds(10, 30, 100, 20);
		add(InFirst).setBounds(110, 10, 250, 50);
		
		add(InPassword).setBounds(10, 80, 130, 20);
		add(InSecond).setBounds(110, 65, 250, 50);
		
		
		add(btnOK).setBounds(180, 120, 100, 60);
		
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 String uname = InFirst.getText();
				   String pass = InSecond.getText();
				   
				   LogIn cal= new LogIn();
			
			
				
			}
		});
		
		
		
		
		setTitle("Register");
		setSize(400, 300);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		}
	
		public static void main(String[] args) {
			new Register();
	}
	

}