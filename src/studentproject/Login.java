package studentproject;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import java.sql.*;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Component;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
public class Login {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	Connection connection=null;
	private JTextField textField;
	private JPasswordField passwordField;
	public Login() {
		initialize();
		connection=sqliteConnection.dbConnector();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 1168, 769);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(532, 348, 217, 47);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		passwordField = new JPasswordField();
		passwordField.setBounds(532, 435, 217, 47);
		frame.getContentPane().add(passwordField);
		
		JLabel Labelusername = new JLabel("Username");
		Labelusername.setFont(new Font("Tahoma", Font.BOLD, 15));
		Labelusername.setBounds(176, 355, 158, 32);
		frame.getContentPane().add(Labelusername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPassword.setBounds(176, 435, 188, 32);
		frame.getContentPane().add(lblPassword);
		
		JToggleButton buttonLogin = new JToggleButton("Login");
		buttonLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
				         String query="select * from admintable where Username=? and Password=?";
				         PreparedStatement pst= connection.prepareStatement(query);
				      
				         pst.setString(1,textField.getText());
				      
				         pst.setString(2, passwordField.getText());
				         ResultSet rs = pst.executeQuery();
				         
				         int count=0;
				         while(rs.next())
				         {
				        	 count++;
				         }
			
				         if(count==1)
				         {
				        	 frame.dispose();
				        	 AfterLogin alogin=new AfterLogin();
				        	 alogin.setVisible(true);
				         }
				         
				         else if(count>1)
				         {
				        	 JOptionPane.showMessageDialog(null, "Duplicate username password");
				        	 
				         }
				         
				         else
				         {
				        	 JOptionPane.showMessageDialog(null, "Not found any maching record");

				         }
				         pst.close();
				         rs.close();
				}
				
				catch(Exception e){
					
		        	 JOptionPane.showMessageDialog(null,e);

				}
			}
		});
		buttonLogin.setBounds(532, 602, 120, 47);
		frame.getContentPane().add(buttonLogin);
		
		JLabel lblNewLabel = new JLabel("");
		Image img= new ImageIcon(this.getClass().getResource("/AISSMS-500-x-200-for-website-COE.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(344, 13, 534, 235);
		frame.getContentPane().add(lblNewLabel);
	}
}
