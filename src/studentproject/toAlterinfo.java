package studentproject;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.*;
import javax.swing.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class toAlterinfo extends JFrame {

	private JPanel contentPane;
	private JTextField rollNo;
	private JTextField classStudent;
	private JLabel lblEditPersonalInformation;
	private JTextField newfield_Personal;
	private JLabel lblOptions;
	private JLabel lblNewValue;
	private JTextField marks;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					toAlterinfo frame = new toAlterinfo();
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
	public toAlterinfo() {
		setResizable(false);
		connection=sqliteConnection.dbConnector();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 717, 575);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEnterRollNumber = new JLabel("Enter Roll number");
		lblEnterRollNumber.setBounds(48, 23, 114, 31);
		contentPane.add(lblEnterRollNumber);
		
		rollNo = new JTextField();
		rollNo.setBounds(46, 70, 116, 31);
		contentPane.add(rollNo);
		rollNo.setColumns(10);
		
		JLabel lblEnterClass = new JLabel("Enter Class");
		lblEnterClass.setBounds(502, 23, 114, 31);
		contentPane.add(lblEnterClass);
		
		classStudent = new JTextField();
		classStudent.setColumns(10);
		classStudent.setBounds(502, 70, 116, 31);
		contentPane.add(classStudent);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addItem("Unselected");
		comboBox.addItem("Name");
		comboBox.addItem("Middle Name");
		comboBox.addItem("Last Name");
		comboBox.addItem("Mobile No");
		comboBox.addItem("Father's Name");
		comboBox.addItem("Mother's Name");
		comboBox.addItem("Father's No.");
		comboBox.addItem("Mother's No.");
		comboBox.addItem("Father's Job");
		comboBox.addItem("Mother's Job");
		comboBox.addItem("Annual Income");
		comboBox.addItem("University no.");
		comboBox.addItem("Religion");
		comboBox.addItem("Caste");
		comboBox.addItem("Address");
		comboBox.addItem("Fees");
		
		comboBox.setBounds(48, 216, 114, 36);
		contentPane.add(comboBox);
		
		lblEditPersonalInformation = new JLabel("Edit Personal Information");
		lblEditPersonalInformation.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblEditPersonalInformation.setBounds(51, 135, 424, 34);
		contentPane.add(lblEditPersonalInformation);
		
		newfield_Personal = new JTextField();
		newfield_Personal.setBounds(270, 216, 130, 86);
		contentPane.add(newfield_Personal);
		newfield_Personal.setColumns(10);
		
		lblOptions = new JLabel("Options");
		lblOptions.setBounds(48, 172, 114, 31);
		contentPane.add(lblOptions);
		
		lblNewValue = new JLabel("New value");
		lblNewValue.setBounds(270, 172, 114, 31);
		contentPane.add(lblNewValue);
		
		JButton update_Personal = new JButton("Update");
		update_Personal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					    String value=(String)comboBox.getSelectedItem();
					    
					    		
					    if(value.equals("Unselected")) {
					             JOptionPane.showMessageDialog(null, "Please Select a option First");	
					    }
					    		
					    else if(value.equals("Name")) {
					    	           if(classStudent.getText().equals("fe"))
					    	           {
					    	String query="update fe set Name=? where Rollno=?";
						    PreparedStatement ps=connection.prepareStatement(query);
						    ps.setString(1,newfield_Personal.getText());
						    ps.setString(2,rollNo.getText());
					    	ps.execute();
					    	ps.close();
				             JOptionPane.showMessageDialog(null, "Success");	
					    	           }
					    	           else if(classStudent.getText().equals("se"))
					    	           {
					    	        	   String query="update se set Name=? where Rollno=?";
										    PreparedStatement ps=connection.prepareStatement(query);
										    ps.setString(1,newfield_Personal.getText());
										    ps.setString(2,rollNo.getText());
									    	ps.execute();
									    	ps.close();
								             JOptionPane.showMessageDialog(null, "Success");	
					    	           }
					    	           else if(classStudent.getText().equals("te"))
					    	           {
					    	        	   String query="update te set Name=? where Rollno=?";
										    PreparedStatement ps=connection.prepareStatement(query);
										    ps.setString(1,newfield_Personal.getText());
										    ps.setString(2,rollNo.getText());
									    	ps.execute();
									    	ps.close();
								             JOptionPane.showMessageDialog(null, "Success");	
					    	           }
					    	           else if(classStudent.getText().equals("be"))
					    	           {
					    	        	   String query="update be set Name=? where Rollno=?";
										    PreparedStatement ps=connection.prepareStatement(query);
										    ps.setString(1,newfield_Personal.getText());
										    ps.setString(2,rollNo.getText());
									    	ps.execute();
									    	ps.close();
								             JOptionPane.showMessageDialog(null, "Success");	
					    	           }
					    	
					    }
					    
					    else if(value.equals("Middle Name")) {
					    	if(classStudent.getText().equals("fe"))
			    	           {
			    	String query="update fe set MiddleName=? where Rollno=?";
				    PreparedStatement ps=connection.prepareStatement(query);
				    ps.setString(1,newfield_Personal.getText());
				    ps.setString(2,rollNo.getText());
			    	ps.execute();
			    	ps.close();
		             JOptionPane.showMessageDialog(null, "Success");	
			    	           }
			    	           else if(classStudent.getText().equals("se"))
			    	           {
			    	        	   String query="update se set MiddleName=? where Rollno=?";
								    PreparedStatement ps=connection.prepareStatement(query);
								    ps.setString(1,newfield_Personal.getText());
								    ps.setString(2,rollNo.getText());
							    	ps.execute();
							    	ps.close();
						             JOptionPane.showMessageDialog(null, "Success");	
			    	           }
			    	           else if(classStudent.getText().equals("te"))
			    	           {
			    	        	   String query="update te set MiddleName=? where Rollno=?";
								    PreparedStatement ps=connection.prepareStatement(query);
								    ps.setString(1,newfield_Personal.getText());
								    ps.setString(2,rollNo.getText());
							    	ps.execute();
							    	ps.close();
						             JOptionPane.showMessageDialog(null, "Success");	
			    	           }
			    	           else if(classStudent.getText().equals("be"))
			    	           {
			    	        	   String query="update be set MiddleName=? where Rollno=?";
								    PreparedStatement ps=connection.prepareStatement(query);
								    ps.setString(1,newfield_Personal.getText());
								    ps.setString(2,rollNo.getText());
							    	ps.execute();
							    	ps.close();
						             JOptionPane.showMessageDialog(null, "Success");	
			    	           }
					    	
					    }
					    else if(value.equals("Last Name")) {
					    	if(classStudent.getText().equals("fe"))
			    	           {
			    	String query="update fe set LastName=? where Rollno=?";
				    PreparedStatement ps=connection.prepareStatement(query);
				    ps.setString(1,newfield_Personal.getText());
				    ps.setString(2,rollNo.getText());
			    	ps.execute();
			    	ps.close();
		             JOptionPane.showMessageDialog(null, "Success");	
			    	           }
			    	           else if(classStudent.getText().equals("se"))
			    	           {
			    	        	   String query="update se set LastName=? where Rollno=?";
								    PreparedStatement ps=connection.prepareStatement(query);
								    ps.setString(1,newfield_Personal.getText());
								    ps.setString(2,rollNo.getText());
							    	ps.execute();
							    	ps.close();
						             JOptionPane.showMessageDialog(null, "Success");	
			    	           }
			    	           else if(classStudent.getText().equals("te"))
			    	           {
			    	        	   String query="update te set LastName=? where Rollno=?";
								    PreparedStatement ps=connection.prepareStatement(query);
								    ps.setString(1,newfield_Personal.getText());
								    ps.setString(2,rollNo.getText());
							    	ps.execute();
							    	ps.close();
						             JOptionPane.showMessageDialog(null, "Success");	
			    	           }
			    	           else if(classStudent.getText().equals("be"))
			    	           {
			    	        	   String query="update be set LastName=? where Rollno=?";
								    PreparedStatement ps=connection.prepareStatement(query);
								    ps.setString(1,newfield_Personal.getText());
								    ps.setString(2,rollNo.getText());
							    	ps.execute();
							    	ps.close();
						             JOptionPane.showMessageDialog(null, "Success");	
			    	           }
					    }
					    else if(value.equals("Mobile No")) {
					    	if(classStudent.getText().equals("fe"))
			    	           {
			    	String query="update fe set MobileNo=? where Rollno=?";
				    PreparedStatement ps=connection.prepareStatement(query);
				    ps.setString(1,newfield_Personal.getText());
				    ps.setString(2,rollNo.getText());
			    	ps.execute();
			    	ps.close();
		             JOptionPane.showMessageDialog(null, "Success");	
			    	           }
			    	           else if(classStudent.getText().equals("se"))
			    	           {
			    	        	   String query="update se set MobileNo=? where Rollno=?";
								    PreparedStatement ps=connection.prepareStatement(query);
								    ps.setString(1,newfield_Personal.getText());
								    ps.setString(2,rollNo.getText());
							    	ps.execute();
							    	ps.close();
						             JOptionPane.showMessageDialog(null, "Success");	
			    	           }
			    	           else if(classStudent.getText().equals("te"))
			    	           {
			    	        	   String query="update te set MobileNo=? where Rollno=?";
								    PreparedStatement ps=connection.prepareStatement(query);
								    ps.setString(1,newfield_Personal.getText());
								    ps.setString(2,rollNo.getText());
							    	ps.execute();
							    	ps.close();
						             JOptionPane.showMessageDialog(null, "Success");	
			    	           }
			    	           else if(classStudent.getText().equals("be"))
			    	           {
			    	        	   String query="update be set MobileNo=? where Rollno=?";
								    PreparedStatement ps=connection.prepareStatement(query);
								    ps.setString(1,newfield_Personal.getText());
								    ps.setString(2,rollNo.getText());
							    	ps.execute();
							    	ps.close();
						             JOptionPane.showMessageDialog(null, "Success");	
			    	           }
					    }
					    else if(value.equals("Father's Name")) {
					    	if(classStudent.getText().equals("fe"))
			    	           {
			    	String query="update fe set FatherName=? where Rollno=?";
				    PreparedStatement ps=connection.prepareStatement(query);
				    ps.setString(1,newfield_Personal.getText());
				    ps.setString(2,rollNo.getText());
			    	ps.execute();
			    	ps.close();
		             JOptionPane.showMessageDialog(null, "Success");	
			    	           }
			    	           else if(classStudent.getText().equals("se"))
			    	           {
			    	        	   String query="update se set FatherName=? where Rollno=?";
								    PreparedStatement ps=connection.prepareStatement(query);
								    ps.setString(1,newfield_Personal.getText());
								    ps.setString(2,rollNo.getText());
							    	ps.execute();
							    	ps.close();
						             JOptionPane.showMessageDialog(null, "Success");	
			    	           }
			    	           else if(classStudent.getText().equals("te"))
			    	           {
			    	        	   String query="update te set FatherName=? where Rollno=?";
								    PreparedStatement ps=connection.prepareStatement(query);
								    ps.setString(1,newfield_Personal.getText());
								    ps.setString(2,rollNo.getText());
							    	ps.execute();
							    	ps.close();
						             JOptionPane.showMessageDialog(null, "Success");	
			    	           }
			    	           else if(classStudent.getText().equals("be"))
			    	           {
			    	        	   String query="update be set FatherName=? where Rollno=?";
								    PreparedStatement ps=connection.prepareStatement(query);
								    ps.setString(1,newfield_Personal.getText());
								    ps.setString(2,rollNo.getText());
							    	ps.execute();
							    	ps.close();
						             JOptionPane.showMessageDialog(null, "Success");	
			    	           }
					    	
					    }
					    else if(value.equals("Mother's Name")) {
					    	if(classStudent.getText().equals("fe"))
			    	           {
			    	String query="update fe set MotherName=? where Rollno=?";
				    PreparedStatement ps=connection.prepareStatement(query);
				    ps.setString(1,newfield_Personal.getText());
				    ps.setString(2,rollNo.getText());
			    	ps.execute();
			    	ps.close();
		             JOptionPane.showMessageDialog(null, "Success");	
			    	           }
			    	           else if(classStudent.getText().equals("se"))
			    	           {
			    	        	   String query="update se set MotherName=? where Rollno=?";
								    PreparedStatement ps=connection.prepareStatement(query);
								    ps.setString(1,newfield_Personal.getText());
								    ps.setString(2,rollNo.getText());
							    	ps.execute();
							    	ps.close();
						             JOptionPane.showMessageDialog(null, "Success");	
			    	           }
			    	           else if(classStudent.getText().equals("te"))
			    	           {
			    	        	   String query="update te set MotherName=? where Rollno=?";
								    PreparedStatement ps=connection.prepareStatement(query);
								    ps.setString(1,newfield_Personal.getText());
								    ps.setString(2,rollNo.getText());
							    	ps.execute();
							    	ps.close();
						             JOptionPane.showMessageDialog(null, "Success");	
			    	           }
			    	           else if(classStudent.getText().equals("be"))
			    	           {
			    	        	   String query="update be set MotherName=? where Rollno=?";
								    PreparedStatement ps=connection.prepareStatement(query);
								    ps.setString(1,newfield_Personal.getText());
								    ps.setString(2,rollNo.getText());
							    	ps.execute();
							    	ps.close();
						             JOptionPane.showMessageDialog(null, "Success");	
			    	           }	
					    }
					    else if(value.equals("Father's No.")) {
					    	if(classStudent.getText().equals("fe"))
			    	           {
			    	String query="update fe set Fatherno=? where Rollno=?";
				    PreparedStatement ps=connection.prepareStatement(query);
				    ps.setString(1,newfield_Personal.getText());
				    ps.setString(2,rollNo.getText());
			    	ps.execute();
			    	ps.close();
		             JOptionPane.showMessageDialog(null, "Success");	
			    	           }
			    	           else if(classStudent.getText().equals("se"))
			    	           {
			    	        	   String query="update se set Fatherno=? where Rollno=?";
								    PreparedStatement ps=connection.prepareStatement(query);
								    ps.setString(1,newfield_Personal.getText());
								    ps.setString(2,rollNo.getText());
							    	ps.execute();
							    	ps.close();
						             JOptionPane.showMessageDialog(null, "Success");	
			    	           }
			    	           else if(classStudent.getText().equals("te"))
			    	           {
			    	        	   String query="update te set Fatherno=? where Rollno=?";
								    PreparedStatement ps=connection.prepareStatement(query);
								    ps.setString(1,newfield_Personal.getText());
								    ps.setString(2,rollNo.getText());
							    	ps.execute();
							    	ps.close();
						             JOptionPane.showMessageDialog(null, "Success");	
			    	           }
			    	           else if(classStudent.getText().equals("be"))
			    	           {
			    	        	   String query="update be set Fatherno=? where Rollno=?";
								    PreparedStatement ps=connection.prepareStatement(query);
								    ps.setString(1,newfield_Personal.getText());
								    ps.setString(2,rollNo.getText());
							    	ps.execute();
							    	ps.close();
						             JOptionPane.showMessageDialog(null, "Success");	
			    	           }
					    }
					    else if(value.equals("Mother's No.")) {
					    	if(classStudent.getText().equals("fe"))
			    	           {
			    	String query="update fe set Motherno=? where Rollno=?";
				    PreparedStatement ps=connection.prepareStatement(query);
				    ps.setString(1,newfield_Personal.getText());
				    ps.setString(2,rollNo.getText());
			    	ps.execute();
			    	ps.close();
		             JOptionPane.showMessageDialog(null, "Success");	
			    	           }
			    	           else if(classStudent.getText().equals("se"))
			    	           {
			    	        	   String query="update se set Motherno=? where Rollno=?";
								    PreparedStatement ps=connection.prepareStatement(query);
								    ps.setString(1,newfield_Personal.getText());
								    ps.setString(2,rollNo.getText());
							    	ps.execute();
							    	ps.close();
						             JOptionPane.showMessageDialog(null, "Success");	
			    	           }
			    	           else if(classStudent.getText().equals("te"))
			    	           {
			    	        	   String query="update te set Motherno=? where Rollno=?";
								    PreparedStatement ps=connection.prepareStatement(query);
								    ps.setString(1,newfield_Personal.getText());
								    ps.setString(2,rollNo.getText());
							    	ps.execute();
							    	ps.close();
						             JOptionPane.showMessageDialog(null, "Success");	
			    	           }
			    	           else if(classStudent.getText().equals("be"))
			    	           {
			    	        	   String query="update be set Motherno=? where Rollno=?";
								    PreparedStatement ps=connection.prepareStatement(query);
								    ps.setString(1,newfield_Personal.getText());
								    ps.setString(2,rollNo.getText());
							    	ps.execute();
							    	ps.close();
						             JOptionPane.showMessageDialog(null, "Success");	
			    	           }
					    	
					    }
					    else if(value.equals("Father's Job")) {
					    	if(classStudent.getText().equals("fe"))
			    	           {
			    	String query="update fe set FathersJob=? where Rollno=?";
				    PreparedStatement ps=connection.prepareStatement(query);
				    ps.setString(1,newfield_Personal.getText());
				    ps.setString(2,rollNo.getText());
			    	ps.execute();
			    	ps.close();
		             JOptionPane.showMessageDialog(null, "Success");	
			    	           }
			    	           else if(classStudent.getText().equals("se"))
			    	           {
			    	        	   String query="update se set FathersJob=? where Rollno=?";
								    PreparedStatement ps=connection.prepareStatement(query);
								    ps.setString(1,newfield_Personal.getText());
								    ps.setString(2,rollNo.getText());
							    	ps.execute();
							    	ps.close();
						             JOptionPane.showMessageDialog(null, "Success");	
			    	           }
			    	           else if(classStudent.getText().equals("te"))
			    	           {
			    	        	   String query="update te set FathersJob=? where Rollno=?";
								    PreparedStatement ps=connection.prepareStatement(query);
								    ps.setString(1,newfield_Personal.getText());
								    ps.setString(2,rollNo.getText());
							    	ps.execute();
							    	ps.close();
						             JOptionPane.showMessageDialog(null, "Success");	
			    	           }
			    	           else if(classStudent.getText().equals("be"))
			    	           {
			    	        	   String query="update be set FathersJob=? where Rollno=?";
								    PreparedStatement ps=connection.prepareStatement(query);
								    ps.setString(1,newfield_Personal.getText());
								    ps.setString(2,rollNo.getText());
							    	ps.execute();
							    	ps.close();
						             JOptionPane.showMessageDialog(null, "Success");	
			    	           }
					    }
					    else if(value.equals("Mother's Job")) {
					    	if(classStudent.getText().equals("fe"))
			    	           {
			    	String query="update fe set  MothersJob=? where Rollno=?";
				    PreparedStatement ps=connection.prepareStatement(query);
				    ps.setString(1,newfield_Personal.getText());
				    ps.setString(2,rollNo.getText());
			    	ps.execute();
			    	ps.close();
		             JOptionPane.showMessageDialog(null, "Success");	
			    	           }
			    	           else if(classStudent.getText().equals("se"))
			    	           {
			    	        	   String query="update se set MothersJob=? where Rollno=?";
								    PreparedStatement ps=connection.prepareStatement(query);
								    ps.setString(1,newfield_Personal.getText());
								    ps.setString(2,rollNo.getText());
							    	ps.execute();
							    	ps.close();
						             JOptionPane.showMessageDialog(null, "Success");	
			    	           }
			    	           else if(classStudent.getText().equals("te"))
			    	           {
			    	        	   String query="update te set MothersJob=? where Rollno=?";
								    PreparedStatement ps=connection.prepareStatement(query);
								    ps.setString(1,newfield_Personal.getText());
								    ps.setString(2,rollNo.getText());
							    	ps.execute();
							    	ps.close();
						             JOptionPane.showMessageDialog(null, "Success");	
			    	           }
			    	           else if(classStudent.getText().equals("be"))
			    	           {
			    	        	   String query="update be set MothersJob=? where Rollno=?";
								    PreparedStatement ps=connection.prepareStatement(query);
								    ps.setString(1,newfield_Personal.getText());
								    ps.setString(2,rollNo.getText());
							    	ps.execute();
							    	ps.close();
						             JOptionPane.showMessageDialog(null, "Success");	
			    	           }
					    }
					    else if(value.equals("Annual Income")) {
					    	if(classStudent.getText().equals("fe"))
			    	           {
			    	String query="update fe set AnnualIncome=? where Rollno=?";
				    PreparedStatement ps=connection.prepareStatement(query);
				    ps.setString(1,newfield_Personal.getText());
				    ps.setString(2,rollNo.getText());
			    	ps.execute();
			    	ps.close();
		             JOptionPane.showMessageDialog(null, "Success");	
			    	           }
			    	           else if(classStudent.getText().equals("se"))
			    	           {
			    	        	   String query="update se set AnnualIncome=? where Rollno=?";
								    PreparedStatement ps=connection.prepareStatement(query);
								    ps.setString(1,newfield_Personal.getText());
								    ps.setString(2,rollNo.getText());
							    	ps.execute();
							    	ps.close();
						             JOptionPane.showMessageDialog(null, "Success");	
			    	           }
			    	           else if(classStudent.getText().equals("te"))
			    	           {
			    	        	   String query="update te set AnnualIncome=? where Rollno=?";
								    PreparedStatement ps=connection.prepareStatement(query);
								    ps.setString(1,newfield_Personal.getText());
								    ps.setString(2,rollNo.getText());
							    	ps.execute();
							    	ps.close();
						             JOptionPane.showMessageDialog(null, "Success");	
			    	           }
			    	           else if(classStudent.getText().equals("be"))
			    	           {
			    	        	   String query="update be set AnnualIncome=? where Rollno=?";
								    PreparedStatement ps=connection.prepareStatement(query);
								    ps.setString(1,newfield_Personal.getText());
								    ps.setString(2,rollNo.getText());
							    	ps.execute();
							    	ps.close();
						             JOptionPane.showMessageDialog(null, "Success");	
			    	           }	
					    }
					    else if(value.equals("University no.")) {
					    	if(classStudent.getText().equals("fe"))
			    	           {
			    	String query="update fe set UnivNo=? where Rollno=?";
				    PreparedStatement ps=connection.prepareStatement(query);
				    ps.setString(1,newfield_Personal.getText());
				    ps.setString(2,rollNo.getText());
			    	ps.execute();
			    	ps.close();
		             JOptionPane.showMessageDialog(null, "Success");	
			    	           }
			    	           else if(classStudent.getText().equals("se"))
			    	           {
			    	        	   String query="update se set UnivNo=? where Rollno=?";
								    PreparedStatement ps=connection.prepareStatement(query);
								    ps.setString(1,newfield_Personal.getText());
								    ps.setString(2,rollNo.getText());
							    	ps.execute();
							    	ps.close();
						             JOptionPane.showMessageDialog(null, "Success");	
			    	           }
			    	           else if(classStudent.getText().equals("te"))
			    	           {
			    	        	   String query="update te set UnivNo=? where Rollno=?";
								    PreparedStatement ps=connection.prepareStatement(query);
								    ps.setString(1,newfield_Personal.getText());
								    ps.setString(2,rollNo.getText());
							    	ps.execute();
							    	ps.close();
						             JOptionPane.showMessageDialog(null, "Success");	
			    	           }
			    	           else if(classStudent.getText().equals("be"))
			    	           {
			    	        	   String query="update be set UnivNo=? where Rollno=?";
								    PreparedStatement ps=connection.prepareStatement(query);
								    ps.setString(1,newfield_Personal.getText());
								    ps.setString(2,rollNo.getText());
							    	ps.execute();
							    	ps.close();
						             JOptionPane.showMessageDialog(null, "Success");	
			    	           }	
					    	
					    }
					    else if(value.equals("Religion")) {
					    	if(classStudent.getText().equals("fe"))
			    	           {
			    	String query="update fe set Religion=? where Rollno=?";
				    PreparedStatement ps=connection.prepareStatement(query);
				    ps.setString(1,newfield_Personal.getText());
				    ps.setString(2,rollNo.getText());
			    	ps.execute();
			    	ps.close();
		             JOptionPane.showMessageDialog(null, "Success");	
			    	           }
			    	           else if(classStudent.getText().equals("se"))
			    	           {
			    	        	   String query="update se set Religion=? where Rollno=?";
								    PreparedStatement ps=connection.prepareStatement(query);
								    ps.setString(1,newfield_Personal.getText());
								    ps.setString(2,rollNo.getText());
							    	ps.execute();
							    	ps.close();
						             JOptionPane.showMessageDialog(null, "Success");	
			    	           }
			    	           else if(classStudent.getText().equals("te"))
			    	           {
			    	        	   String query="update te set Religion=? where Rollno=?";
								    PreparedStatement ps=connection.prepareStatement(query);
								    ps.setString(1,newfield_Personal.getText());
								    ps.setString(2,rollNo.getText());
							    	ps.execute();
							    	ps.close();
						             JOptionPane.showMessageDialog(null, "Success");	
			    	           }
			    	           else if(classStudent.getText().equals("be"))
			    	           {
			    	        	   String query="update be set Religion=? where Rollno=?";
								    PreparedStatement ps=connection.prepareStatement(query);
								    ps.setString(1,newfield_Personal.getText());
								    ps.setString(2,rollNo.getText());
							    	ps.execute();
							    	ps.close();
						             JOptionPane.showMessageDialog(null, "Success");	
			    	           }	
					    
					    }
					    else if(value.equals("Caste")) {
					    	if(classStudent.getText().equals("fe"))
			    	           {
			    	String query="update fe set Caste=? where Rollno=?";
				    PreparedStatement ps=connection.prepareStatement(query);
				    ps.setString(1,newfield_Personal.getText());
				    ps.setString(2,rollNo.getText());
			    	ps.execute();
			    	ps.close();
		             JOptionPane.showMessageDialog(null, "Success");	
			    	           }
			    	           else if(classStudent.getText().equals("se"))
			    	           {
			    	        	   String query="update se set Caste=? where Rollno=?";
								    PreparedStatement ps=connection.prepareStatement(query);
								    ps.setString(1,newfield_Personal.getText());
								    ps.setString(2,rollNo.getText());
							    	ps.execute();
							    	ps.close();
						             JOptionPane.showMessageDialog(null, "Success");	
			    	           }
			    	           else if(classStudent.getText().equals("te"))
			    	           {
			    	        	   String query="update te set Caste=? where Rollno=?";
								    PreparedStatement ps=connection.prepareStatement(query);
								    ps.setString(1,newfield_Personal.getText());
								    ps.setString(2,rollNo.getText());
							    	ps.execute();
							    	ps.close();
						             JOptionPane.showMessageDialog(null, "Success");	
			    	           }
			    	           else if(classStudent.getText().equals("be"))
			    	           {
			    	        	   String query="update be set Caste=? where Rollno=?";
								    PreparedStatement ps=connection.prepareStatement(query);
								    ps.setString(1,newfield_Personal.getText());
								    ps.setString(2,rollNo.getText());
							    	ps.execute();
							    	ps.close();
						             JOptionPane.showMessageDialog(null, "Success");	
			    	           }	
					    
					    	
					    }
					    else if(value.equals("Address")) {
					    	if(classStudent.getText().equals("fe"))
			    	           {
			    	String query="update fe set Address=? where Rollno=?";
				    PreparedStatement ps=connection.prepareStatement(query);
				    ps.setString(1,newfield_Personal.getText());
				    ps.setString(2,rollNo.getText());
			    	ps.execute();
			    	ps.close();
		             JOptionPane.showMessageDialog(null, "Success");	
			    	           }
			    	           else if(classStudent.getText().equals("se"))
			    	           {
			    	        	   String query="update se set Address=? where Rollno=?";
								    PreparedStatement ps=connection.prepareStatement(query);
								    ps.setString(1,newfield_Personal.getText());
								    ps.setString(2,rollNo.getText());
							    	ps.execute();
							    	ps.close();
						             JOptionPane.showMessageDialog(null, "Success");	
			    	           }
			    	           else if(classStudent.getText().equals("te"))
			    	           {
			    	        	   String query="update te set Address=? where Rollno=?";
								    PreparedStatement ps=connection.prepareStatement(query);
								    ps.setString(1,newfield_Personal.getText());
								    ps.setString(2,rollNo.getText());
							    	ps.execute();
							    	ps.close();
						             JOptionPane.showMessageDialog(null, "Success");	
			    	           }
			    	           else if(classStudent.getText().equals("be"))
			    	           {
			    	        	   String query="update be set Address=? where Rollno=?";
								    PreparedStatement ps=connection.prepareStatement(query);
								    ps.setString(1,newfield_Personal.getText());
								    ps.setString(2,rollNo.getText());
							    	ps.execute();
							    	ps.close();
						             JOptionPane.showMessageDialog(null, "Success");	
			    	           }	
					    	
					    }
					    else if(value.equals("Fees")) {
					    	if(classStudent.getText().equals("fe"))
			    	           {
			    	String query="update fe set Fees=? where Rollno=?";
				    PreparedStatement ps=connection.prepareStatement(query);
				    ps.setString(1,newfield_Personal.getText());
				    ps.setString(2,rollNo.getText());
			    	ps.execute();
			    	ps.close();
		             JOptionPane.showMessageDialog(null, "Success");	
			    	           }
			    	           else if(classStudent.getText().equals("se"))
			    	           {
			    	        	   String query="update se set Fees=? where Rollno=?";
								    PreparedStatement ps=connection.prepareStatement(query);
								    ps.setString(1,newfield_Personal.getText());
								    ps.setString(2,rollNo.getText());
							    	ps.execute();
							    	ps.close();
						             JOptionPane.showMessageDialog(null, "Success");	
			    	           }
			    	           else if(classStudent.getText().equals("te"))
			    	           {
			    	        	   String query="update te set Fees=? where Rollno=?";
								    PreparedStatement ps=connection.prepareStatement(query);
								    ps.setString(1,newfield_Personal.getText());
								    ps.setString(2,rollNo.getText());
							    	ps.execute();
							    	ps.close();
						             JOptionPane.showMessageDialog(null, "Success");	
			    	           }
			    	           else if(classStudent.getText().equals("be"))
			    	           {
			    	        	   String query="update be set Fees=? where Rollno=?";
								    PreparedStatement ps=connection.prepareStatement(query);
								    ps.setString(1,newfield_Personal.getText());
								    ps.setString(2,rollNo.getText());
							    	ps.execute();
							    	ps.close();
						             JOptionPane.showMessageDialog(null, "Success");	
			    	           }	
					    }
					    		
				}
				
				catch(Exception e)
				{
					JOptionPane.showMessageDialog(null, "Your data is not in database");
				}
			}
		});
		update_Personal.setBounds(530, 222, 97, 25);
		contentPane.add(update_Personal);
		
		JLabel lblEditMarksInformation = new JLabel("Edit Marks Information");
		lblEditMarksInformation.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblEditMarksInformation.setBounds(51, 331, 424, 34);
		contentPane.add(lblEditMarksInformation);
		
		JLabel label = new JLabel("Options");
		label.setBounds(48, 386, 114, 31);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("New value");
		label_1.setBounds(270, 386, 114, 31);
		contentPane.add(label_1);
		
		
		
		
		marks = new JTextField();
		marks.setColumns(10);
		marks.setBounds(270, 429, 130, 42);
		contentPane.add(marks);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(48, 430, 114, 36);
		contentPane.add(comboBox_1);
		comboBox_1.addItem("Unselected");
		comboBox_1.addItem("Class X marks");
		comboBox_1.addItem("Class XII marks");
		comboBox_1.addItem("FE sem1 marks");
		comboBox_1.addItem("FE sem2 marks");
		comboBox_1.addItem("SE sem1 marks");
		comboBox_1.addItem("SE sem2 marks");
		comboBox_1.addItem("TE sem1 marks");
		comboBox_1.addItem("TE sem2 marks");
		comboBox_1.addItem("BE sem1 marks");
		comboBox_1.addItem("BE sem2 marks");
		JButton update_Marks = new JButton("Update");
		
		update_Marks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
			    String value=(String)comboBox_1.getSelectedItem();
			    if(value.equals("Unselected"))
			    {
		             JOptionPane.showMessageDialog(null, "Please select a option first!");	
	
			    }
			    
			    else if(value.equals("Class X marks"))
			    {
			    	String query="update classxmarks set Percentage=? where Rollno=?";
				    PreparedStatement ps=connection.prepareStatement(query);
				    ps.setString(1,marks.getText());
				    ps.setString(2,rollNo.getText());
			    	ps.execute();
			    	ps.close();
		             JOptionPane.showMessageDialog(null, "Success");	
			    }

			    else if(value.equals("Class XII marks"))
			    {
			    	String query="update classxiimarks set Percentage=? where Rollno=?";
				    PreparedStatement ps=connection.prepareStatement(query);
				    ps.setString(1,marks.getText());
				    ps.setString(2,rollNo.getText());
			    	ps.execute();
			    	ps.close();
		             JOptionPane.showMessageDialog(null, "Success");	
			    }	
			    
			    else if(value.equals("FE sem1 marks"))
			    {
			    	String query="update femarks set sem1=? where Rollno=?";
				    PreparedStatement ps=connection.prepareStatement(query);
				    ps.setString(1,marks.getText());
				    ps.setString(2,rollNo.getText());
			    	ps.execute();
			    	ps.close();
		             JOptionPane.showMessageDialog(null, "Success");	
			    }	
			    
			    else if(value.equals("FE sem2 marks"))
			    {
			    	String query="update femarks set sem2=? where Rollno=?";
				    PreparedStatement ps=connection.prepareStatement(query);
				    ps.setString(1,marks.getText());
				    ps.setString(2,rollNo.getText());
			    	ps.execute();
			    	ps.close();
		             JOptionPane.showMessageDialog(null, "Success");	
			    }	
			    
			    else if(value.equals("SE sem1 marks"))
			    {
			    	String query="update semarks set sem1=? where Rollno=?";
				    PreparedStatement ps=connection.prepareStatement(query);
				    ps.setString(1,marks.getText());
				    ps.setString(2,rollNo.getText());
			    	ps.execute();
			    	ps.close();
		             JOptionPane.showMessageDialog(null, "Success");	
			    }	
			    
			    else if(value.equals("SE sem2 marks"))
			    {
			    	String query="update semarks set sem2=? where Rollno=?";
				    PreparedStatement ps=connection.prepareStatement(query);
				    ps.setString(1,marks.getText());
				    ps.setString(2,rollNo.getText());
			    	ps.execute();
			    	ps.close();
		             JOptionPane.showMessageDialog(null, "Success");	
			    }	
			    
			    else if(value.equals("TE sem1 marks"))
			    {
			    	String query="update temarks set sem1=? where Rollno=?";
				    PreparedStatement ps=connection.prepareStatement(query);
				    ps.setString(1,marks.getText());
				    ps.setString(2,rollNo.getText());
			    	ps.execute();
			    	ps.close();
		             JOptionPane.showMessageDialog(null, "Success");	
			    }	
			    
			    else if(value.equals("TE sem2 marks"))
			    {
			    	String query="update temarks set sem2=? where Rollno=?";
				    PreparedStatement ps=connection.prepareStatement(query);
				    ps.setString(1,marks.getText());
				    ps.setString(2,rollNo.getText());
			    	ps.execute();
			    	ps.close();
		             JOptionPane.showMessageDialog(null, "Success");	
			    }	
			    
			    else if(value.equals("BE sem1 marks"))
			    {
			    	String query="update bemarks set sem1=? where Rollno=?";
				    PreparedStatement ps=connection.prepareStatement(query);
				    ps.setString(1,marks.getText());
				    ps.setString(2,rollNo.getText());
			    	ps.execute();
			    	ps.close();
		             JOptionPane.showMessageDialog(null, "Success");	
			    }	
			    
			    else if(value.equals("BE sem2 marks"))
			    {
			    	String query="update bemarks set sem2=? where Rollno=?";
				    PreparedStatement ps=connection.prepareStatement(query);
				    ps.setString(1,marks.getText());
				    ps.setString(2,rollNo.getText());
			    	ps.execute();
			    	ps.close();
		             JOptionPane.showMessageDialog(null, "Success");	
			    }	
			}
				catch(Exception e)
				{
		             JOptionPane.showMessageDialog(null, "Your data is not in database");	
	
				}
			}
			
		});
		update_Marks.setBounds(530, 436, 97, 25);
		contentPane.add(update_Marks);
	}
}
