package studentproject;

import java.awt.BorderLayout;
import java.sql.*;
import javax.swing.*;
import java.awt.EventQueue;

import javax.swing.border.EmptyBorder;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class toAddStudent extends JFrame {

	private JPanel contentPane;
	private JTextField field_name;
	private JTextField field_middlename;
	private JTextField field_lastname;
	private JTextField field_class;
	private JTextField field_fathersname;
	private JTextField field_mothersname;
	private JTextField field_fathersno;
	private JTextField field_mothersno;
	private JTextField field_fathersoccu;
	private JTextField field_mothersoccu;
	private JTextField field_religion;
	private JTextField field_caste;
	private JLabel lblFamilyIncome;
	private JTextField field_annualincome;
	private JLabel lblAddress;
	private JTextField field_address;
	private JLabel lblUniversityNo_1;
	private JTextField field_univno;
	private JTextField field_rollno;
	private JLabel lblRollNo_1;
	private JLabel lblFees;
	private JTextField field_fees;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					toAddStudent frame = new toAddStudent();
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
	private JTextField field_mobileno;

	public toAddStudent() {
		setResizable(false);
		connection=sqliteConnection.dbConnector();
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 920, 778);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(49, 13, 67, 23);
		contentPane.add(lblName);
		
		JLabel lblMiddleName = new JLabel("Middle Name");
		lblMiddleName.setBounds(252, 13, 106, 23);
		contentPane.add(lblMiddleName);
		
		JLabel lblLastname = new JLabel("Last Name");
		lblLastname.setBounds(474, 13, 67, 23);
		contentPane.add(lblLastname);
		
		field_name = new JTextField();
		field_name.setBounds(49, 49, 122, 40);
		contentPane.add(field_name);
		field_name.setColumns(10);
		
		field_middlename = new JTextField();
		field_middlename.setColumns(10);
		field_middlename.setBounds(252, 49, 122, 40);
		contentPane.add(field_middlename);
		
		field_lastname = new JTextField();
		field_lastname.setColumns(10);
		field_lastname.setBounds(474, 49, 141, 40);
		contentPane.add(field_lastname);
		
		field_class = new JTextField();
		field_class.setColumns(10);
		field_class.setBounds(719, 49, 122, 40);
		contentPane.add(field_class);
		
		JLabel lblClass = new JLabel("Class");
		lblClass.setBounds(719, 13, 95, 23);
		contentPane.add(lblClass);
		
		JLabel lblRollNo = new JLabel("Father's Name");
		lblRollNo.setBounds(49, 160, 122, 23);
		contentPane.add(lblRollNo);
		
		field_fathersname = new JTextField();
		field_fathersname.setColumns(10);
		field_fathersname.setBounds(49, 196, 122, 40);
		contentPane.add(field_fathersname);
		
		field_mothersname = new JTextField();
		field_mothersname.setColumns(10);
		field_mothersname.setBounds(252, 196, 122, 40);
		contentPane.add(field_mothersname);
		
		JLabel lblUniversityNo = new JLabel("Mother's Name");
		lblUniversityNo.setBounds(252, 163, 106, 23);
		contentPane.add(lblUniversityNo);
		
		field_fathersno = new JTextField();
		field_fathersno.setColumns(10);
		field_fathersno.setBounds(474, 196, 122, 40);
		contentPane.add(field_fathersno);
		
		JLabel lblReligion = new JLabel("Father's No.");
		lblReligion.setBounds(474, 160, 106, 23);
		contentPane.add(lblReligion);
		
		field_mothersno = new JTextField();
		field_mothersno.setColumns(10);
		field_mothersno.setBounds(719, 205, 122, 40);
		contentPane.add(field_mothersno);
		
		JLabel lblCaste = new JLabel("Mother's No.");
		lblCaste.setBounds(719, 163, 106, 23);
		contentPane.add(lblCaste);
		
		field_fathersoccu = new JTextField();
		field_fathersoccu.setColumns(10);
		field_fathersoccu.setBounds(49, 346, 122, 40);
		contentPane.add(field_fathersoccu);
		
		JLabel lblFathersOccupation = new JLabel("Father's Occupation");
		lblFathersOccupation.setBounds(49, 310, 122, 23);
		contentPane.add(lblFathersOccupation);
		
		JLabel lblMothersOccupation = new JLabel("Mother's Occupation");
		lblMothersOccupation.setBounds(252, 310, 122, 23);
		contentPane.add(lblMothersOccupation);
		
		field_mothersoccu = new JTextField();
		field_mothersoccu.setColumns(10);
		field_mothersoccu.setBounds(252, 346, 122, 40);
		contentPane.add(field_mothersoccu);
		
		JLabel lblReligion_1 = new JLabel("Religion");
		lblReligion_1.setBounds(474, 313, 122, 23);
		contentPane.add(lblReligion_1);
		
		field_religion = new JTextField();
		field_religion.setColumns(10);
		field_religion.setBounds(474, 346, 122, 40);
		contentPane.add(field_religion);
		
		JLabel lblCaste_1 = new JLabel("Caste");
		lblCaste_1.setBounds(719, 313, 122, 23);
		contentPane.add(lblCaste_1);
		
		field_caste = new JTextField();
		field_caste.setColumns(10);
		field_caste.setBounds(719, 346, 122, 40);
		contentPane.add(field_caste);
		
		lblFamilyIncome = new JLabel("Annual Income");
		lblFamilyIncome.setBounds(49, 450, 122, 23);
		contentPane.add(lblFamilyIncome);
		
		field_annualincome = new JTextField();
		field_annualincome.setColumns(10);
		field_annualincome.setBounds(49, 481, 122, 40);
		contentPane.add(field_annualincome);
		
		lblAddress = new JLabel("Address");
		lblAddress.setBounds(252, 453, 122, 23);
		contentPane.add(lblAddress);
		
		field_address = new JTextField();
		field_address.setColumns(10);
		field_address.setBounds(252, 490, 175, 112);
		contentPane.add(field_address);
		
		lblUniversityNo_1 = new JLabel("University No.");
		lblUniversityNo_1.setBounds(474, 456, 122, 16);
		contentPane.add(lblUniversityNo_1);
		
		field_univno = new JTextField();
		field_univno.setColumns(10);
		field_univno.setBounds(474, 481, 122, 40);
		contentPane.add(field_univno);
		
		field_rollno = new JTextField();
		field_rollno.setBounds(719, 490, 116, 40);
		contentPane.add(field_rollno);
		field_rollno.setColumns(10);
		
		lblRollNo_1 = new JLabel("Roll No.");
		lblRollNo_1.setBounds(719, 453, 122, 16);
		contentPane.add(lblRollNo_1);
		
		lblFees = new JLabel("fees");
		lblFees.setBounds(49, 650, 56, 16);
		contentPane.add(lblFees);
		
		field_fees = new JTextField();
		field_fees.setColumns(10);
		field_fees.setBounds(49, 679, 122, 40);
		contentPane.add(field_fees);
		
		JButton btnAddMarksDetails = new JButton("Add Marks Details");
		btnAddMarksDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				toaddmarks.main(null);
			}
		});
		btnAddMarksDetails.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnAddMarksDetails.setBounds(489, 694, 163, 25);
		contentPane.add(btnAddMarksDetails);
		
		JButton btnAddStudent = new JButton("Add Student");
		btnAddStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String tabletoadd=field_class.getText();
				if(tabletoadd.equals("fe"))
				{   try {
					String query="insert into fe(Name,MiddleName,LastName,MobileNo,FatherName,Mothername,Fatherno,Motherno,FathersJob,MothersJob,AnnualIncome,Class,Rollno,UnivNo,Religion,Caste,Address,Fees) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
				    PreparedStatement pst=connection.prepareStatement(query);
				    pst.setString(1, field_name.getText());
				    pst.setString(2, field_middlename.getText());
				    pst.setString(3, field_lastname.getText());
				    pst.setString(4, field_mobileno.getText());
				    pst.setString(5, field_fathersname.getText());
				    pst.setString(6, field_mothersname.getText());
				    pst.setString(7, field_fathersno.getText());
				    pst.setString(8, field_mothersno.getText());
				    pst.setString(9, field_fathersoccu.getText());
				    pst.setString(10, field_mothersoccu.getText());
				    pst.setString(11, field_annualincome.getText());
				    pst.setString(12, field_class.getText());
				    pst.setString(13, field_rollno.getText());
				    pst.setString(14, field_univno.getText());
				    pst.setString(15, field_religion.getText());
				    pst.setString(16, field_caste.getText());
				    pst.setString(17, field_address.getText());
				    pst.setString(18, field_fees.getText());
				   pst.execute();
				   JOptionPane.showMessageDialog(null,"stored");
				   pst.close();
				}
				catch(Exception e)
				{
		        	 JOptionPane.showMessageDialog(null,e);

				}
				}
				else if(tabletoadd.equals("se"))
				{
				
					   try {
						String query="insert into se(Name,MiddleName,LastName,MobileNo,FatherName,Mothername,Fatherno,Motherno,FathersJob,MothersJob,AnnualIncome,Class,Rollno,UnivNo,Religion,Caste,Address,Fees) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
					    PreparedStatement pst=connection.prepareStatement(query);
					    pst.setString(1, field_name.getText());
					    pst.setString(2, field_middlename.getText());
					    pst.setString(3, field_lastname.getText());
					    pst.setString(4, field_mobileno.getText());
					    pst.setString(5, field_fathersname.getText());
					    pst.setString(6, field_mothersname.getText());
					    pst.setString(7, field_fathersno.getText());
					    pst.setString(8, field_mothersno.getText());
					    pst.setString(9, field_fathersoccu.getText());
					    pst.setString(10, field_mothersoccu.getText());
					    pst.setString(11, field_annualincome.getText());
					    pst.setString(12, field_class.getText());
					    pst.setString(13, field_rollno.getText());
					    pst.setString(14, field_univno.getText());
					    pst.setString(15, field_religion.getText());
					    pst.setString(16, field_caste.getText());
					    pst.setString(17, field_address.getText());
					    pst.setString(18, field_fees.getText());
					   pst.execute();
					   JOptionPane.showMessageDialog(null,"stored");
					   pst.close();
					}
					catch(Exception e)
					{
			        	 JOptionPane.showMessageDialog(null,e);

					}
					
				}
				
				else if(tabletoadd.equals("te"))
				{
					try {
						String query="insert into te(Name,MiddleName,LastName,MobileNo,FatherName,Mothername,Fatherno,Motherno,FathersJob,MothersJob,AnnualIncome,Class,Rollno,UnivNo,Religion,Caste,Address,Fees) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
					    PreparedStatement pst=connection.prepareStatement(query);
					    pst.setString(1, field_name.getText());
					    pst.setString(2, field_middlename.getText());
					    pst.setString(3, field_lastname.getText());
					    pst.setString(4, field_mobileno.getText());
					    pst.setString(5, field_fathersname.getText());
					    pst.setString(6, field_mothersname.getText());
					    pst.setString(7, field_fathersno.getText());
					    pst.setString(8, field_mothersno.getText());
					    pst.setString(9, field_fathersoccu.getText());
					    pst.setString(10, field_mothersoccu.getText());
					    pst.setString(11, field_annualincome.getText());
					    pst.setString(12, field_class.getText());
					    pst.setString(13, field_rollno.getText());
					    pst.setString(14, field_univno.getText());
					    pst.setString(15, field_religion.getText());
					    pst.setString(16, field_caste.getText());
					    pst.setString(17, field_address.getText());
					    pst.setString(18, field_fees.getText());
					   pst.execute();
					   JOptionPane.showMessageDialog(null,"stored");
					   pst.close();
					}
					catch(Exception e)
					{
			        	 JOptionPane.showMessageDialog(null,e);

					}
				}
				
				else if(tabletoadd.equals("be"))
				{
					try {
						String query="insert into be(Name,MiddleName,LastName,MobileNo,FatherName,Mothername,Fatherno,Motherno,FathersJob,MothersJob,AnnualIncome,Class,Rollno,UnivNo,Religion,Caste,Address,Fees) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
					    PreparedStatement pst=connection.prepareStatement(query);
					    pst.setString(1, field_name.getText());
					    pst.setString(2, field_middlename.getText());
					    pst.setString(3, field_lastname.getText());
					    pst.setString(4, field_mobileno.getText());
					    pst.setString(5, field_fathersname.getText());
					    pst.setString(6, field_mothersname.getText());
					    pst.setString(7, field_fathersno.getText());
					    pst.setString(8, field_mothersno.getText());
					    pst.setString(9, field_fathersoccu.getText());
					    pst.setString(10, field_mothersoccu.getText());
					    pst.setString(11, field_annualincome.getText());
					    pst.setString(12, field_class.getText());
					    pst.setString(13, field_rollno.getText());
					    pst.setString(14, field_univno.getText());
					    pst.setString(15, field_religion.getText());
					    pst.setString(16, field_caste.getText());
					    pst.setString(17, field_address.getText());
					    pst.setString(18, field_fees.getText());
					   pst.execute();
					   JOptionPane.showMessageDialog(null,"stored");
					   pst.close();
					}
					catch(Exception e)
					{
			        	 JOptionPane.showMessageDialog(null,e);

					}
				}
			}
		});
		btnAddStudent.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnAddStudent.setBounds(699, 694, 163, 25);
		contentPane.add(btnAddStudent);
		
		field_mobileno = new JTextField();
		field_mobileno.setBounds(258, 679, 116, 40);
		contentPane.add(field_mobileno);
		field_mobileno.setColumns(10);
		
		JLabel lblMobileNo = new JLabel("Mobile no");
		lblMobileNo.setBounds(261, 650, 56, 16);
		contentPane.add(lblMobileNo);
	}
}
