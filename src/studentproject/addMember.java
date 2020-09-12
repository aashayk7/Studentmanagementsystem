package studentproject;

import java.awt.BorderLayout;
import java.sql.*;
import javax.swing.*;
import java.awt.EventQueue;

import javax.swing.border.EmptyBorder;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class addMember extends JFrame {

	private JPanel contentPane;
	private JTextField name;
	private JTextField surname;
	private JTextField username;
	private JTextField password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addMember frame = new addMember();
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
	Connection connection;
	public addMember() {
		connection=sqliteConnection.dbConnector();
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 568, 472);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		name = new JTextField();
		name.setBounds(38, 95, 142, 47);
		contentPane.add(name);
		name.setColumns(10);
		
		surname = new JTextField();
		surname.setColumns(10);
		surname.setBounds(369, 95, 142, 47);
		contentPane.add(surname);
		
		username = new JTextField();
		username.setBounds(38, 262, 142, 47);
		contentPane.add(username);
		username.setColumns(10);
		
		password = new JTextField();
		password.setColumns(10);
		password.setBounds(369, 262, 142, 47);
		contentPane.add(password);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(38, 66, 83, 26);
		contentPane.add(lblName);
		
		JLabel lblSurname = new JLabel("Surname");
		lblSurname.setBounds(369, 56, 83, 26);
		contentPane.add(lblSurname);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(38, 225, 83, 26);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(369, 223, 83, 26);
		contentPane.add(lblPassword);
		
		JButton btnAddMember = new JButton("Add Member");
		btnAddMember.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				   try {
				String query="insert into admintable(Name,Surname,Username,Password) values(?,?,?,?)";
			    PreparedStatement pst=connection.prepareStatement(query);
				pst.setString(1, name.getText());
				pst.setString(2,surname.getText());
				pst.setString(3,username.getText());
				pst.setString(4,password.getText());
				pst.execute();
			    JOptionPane.showMessageDialog(null,"stored");
				pst.close();
				dispose();
				   }
				   
				   catch(Exception e1)
				   {
					    JOptionPane.showMessageDialog(null,e1);

				   }
			}
		});
		btnAddMember.setBounds(222, 367, 123, 25);
		contentPane.add(btnAddMember);
		
		JLabel lblAddMember = new JLabel("ADD MEMBER");
		lblAddMember.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblAddMember.setBounds(222, 13, 151, 26);
		contentPane.add(lblAddMember);
	}

}
