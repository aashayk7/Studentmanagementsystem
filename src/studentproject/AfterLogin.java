package studentproject;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.awt.event.ActionEvent;
import java.sql.*;
import javax.swing.*;

public class AfterLogin extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AfterLogin frame = new AfterLogin();
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

	public AfterLogin() {
		connection=sqliteConnection.dbConnector();

		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 631, 515);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setBounds(5, 5, 603, 0);
		contentPane.add(label);
		
		JButton search_stuent = new JButton("SEARCH FOR A STUDENT");
		search_stuent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				searchAstudent.main(null);
			}
		});
		search_stuent.setBounds(32, 92, 214, 40);
		contentPane.add(search_stuent);
		
		JButton add_student = new JButton("ADD A NEW STUDENT");
		add_student.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				toAddStudent.main(null);
			}
		});
		add_student.setBounds(356, 92, 214, 40);
		contentPane.add(add_student);
		
		JButton delete_student = new JButton("DELETE A STUDENT");
		delete_student.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				deleteStudent.main(null);
			}
		});
		delete_student.setBounds(32, 188, 214, 40);
		contentPane.add(delete_student);
		
		JButton alter_student = new JButton("ALTER STUDENT'S INFO");
		alter_student.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			toAlterinfo.main(null);
			}
		});
		alter_student.setBounds(356, 188, 214, 40);
		contentPane.add(alter_student);
		
		JButton view_class = new JButton("VIEW ENTIRE CLASS");
		view_class.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			  optionstodisplayonallclass.main(null);
			  
			}
		});
		view_class.setBounds(197, 297, 214, 40);
		contentPane.add(view_class);
		
		JButton queries_admin = new JButton("ADMIN RELATED QUERIES");
		queries_admin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adminOptions.main(null);
			}
		});
		queries_admin.setBounds(356, 406, 214, 40);
		contentPane.add(queries_admin);
		
		JButton logout_admin = new JButton("LOGOUT");
		logout_admin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				contentPane.setVisible(false);
				dispose();
				Login.main(null);
		
						
			}
		});
		logout_admin.setBounds(32, 406, 214, 40);
		contentPane.add(logout_admin);
		
		JLabel lblComputerDepartmentStudent = new JLabel("COMPUTER DEPARTMENT STUDENT MANAGEMENT SYSTEM");
		lblComputerDepartmentStudent.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblComputerDepartmentStudent.setBounds(76, 13, 494, 54);
		contentPane.add(lblComputerDepartmentStudent);
	}
}
