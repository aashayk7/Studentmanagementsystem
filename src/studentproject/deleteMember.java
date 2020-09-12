package studentproject;

import java.awt.BorderLayout;
import java.sql.*;
import javax.swing.*;
import java.awt.EventQueue;

import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class deleteMember extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					deleteMember frame = new deleteMember();
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
	Connection connection=null;
	private JTextField username;
	public deleteMember() {
		connection=sqliteConnection.dbConnector();
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 510, 295);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEnterTheUsername = new JLabel("Enter The Username To Delete The Member");
		lblEnterTheUsername.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblEnterTheUsername.setBounds(73, 13, 357, 37);
		contentPane.add(lblEnterTheUsername);
		
		username = new JTextField();
		username.setBounds(158, 88, 169, 37);
		contentPane.add(username);
		username.setColumns(10);
		
		JButton btnNewButton = new JButton("Delete Member");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String query="select * from admintable where Username=?";
			         PreparedStatement pst= connection.prepareStatement(query);
			         pst.setString(1,username.getText());
			         ResultSet rs = pst.executeQuery();
			         int count=0;
			         while(rs.next())
			         {
			        	 count++;
			         }
			         if(count>0)
			         {
			        	 String query0="delete from admintable where Username=?";
				         PreparedStatement pst0= connection.prepareStatement(query0);
				         pst0.setString(1,username.getText());
				         pst0.execute();
				         pst0.close();
			         }
			         
					   JOptionPane.showMessageDialog(null,"Deleted");
					   dispose();

				}
				
				catch(Exception e1)
				{
					   JOptionPane.showMessageDialog(null,"No such member exists!!!");

				}
			}
		});
		btnNewButton.setBounds(175, 168, 136, 25);
		contentPane.add(btnNewButton);
	}

}
