package studentproject;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class toaddmarks extends JFrame {

	private JPanel contentPane;
	private JTextField classxmarks;
	private JTextField classxiimarks;
	private JTextField diplomamarks;
	private JTextField fesem1;
	private JLabel lblSem_1;
	private JTextField fesem2;
	private JLabel lblSecondYear;
	private JLabel label;
	private JLabel lblSem_2;
	private JTextField sesem1;
	private JTextField sesem2;
	private JLabel lblYear;
	private JLabel label_3;
	private JTextField tesem1;
	private JLabel lblSem_3;
	private JTextField tesem2;
	private JLabel lblFourthYear;
	private JLabel label_6;
	private JLabel lblSem_4;
	private JTextField besem1;
	private JTextField besem2;
	private JLabel lblRollNo;
	private JTextField roll;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					toaddmarks frame = new toaddmarks();
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
	public toaddmarks() {
		connection=sqliteConnection.dbConnector();

		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 920, 789);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		classxmarks = new JTextField();
		classxmarks.setBounds(12, 48, 116, 40);
		contentPane.add(classxmarks);
		classxmarks.setColumns(10);
		
		JLabel lblClassX = new JLabel("Class X Percentage");
		lblClassX.setBounds(12, 13, 129, 16);
		contentPane.add(lblClassX);
		
		JLabel lblClassXiiPercentage = new JLabel("Class XII Percentage");
		lblClassXiiPercentage.setBounds(255, 13, 129, 16);
		contentPane.add(lblClassXiiPercentage);
		
		classxiimarks = new JTextField();
		classxiimarks.setColumns(10);
		classxiimarks.setBounds(255, 48, 116, 40);
		contentPane.add(classxiimarks);
		
		JLabel lblDiplomaOverall = new JLabel("Diploma overall Percentage");
		lblDiplomaOverall.setBounds(502, 13, 184, 16);
		contentPane.add(lblDiplomaOverall);
		
		diplomamarks = new JTextField();
		diplomamarks.setColumns(10);
		diplomamarks.setBounds(502, 48, 116, 40);
		contentPane.add(diplomamarks);
		
		JLabel lblFirstYear = new JLabel("FIRST YEAR");
		lblFirstYear.setBounds(12, 215, 94, 31);
		contentPane.add(lblFirstYear);
		
		fesem1 = new JTextField();
		fesem1.setBounds(255, 210, 116, 40);
		contentPane.add(fesem1);
		fesem1.setColumns(10);
		
		JLabel lblSem = new JLabel("SEM1");
		lblSem.setBounds(255, 171, 94, 31);
		contentPane.add(lblSem);
		
		lblSem_1 = new JLabel("SEM2");
		lblSem_1.setBounds(502, 171, 94, 31);
		contentPane.add(lblSem_1);
		
		fesem2 = new JTextField();
		fesem2.setColumns(10);
		fesem2.setBounds(502, 210, 116, 40);
		contentPane.add(fesem2);
		
		lblSecondYear = new JLabel("SECOND YEAR");
		lblSecondYear.setBounds(12, 341, 94, 31);
		contentPane.add(lblSecondYear);
		
		label = new JLabel("SEM1");
		label.setBounds(255, 297, 94, 31);
		contentPane.add(label);
		
		lblSem_2 = new JLabel("SEM2");
		lblSem_2.setBounds(502, 304, 94, 31);
		contentPane.add(lblSem_2);
		
		sesem1 = new JTextField();
		sesem1.setColumns(10);
		sesem1.setBounds(255, 336, 116, 40);
		contentPane.add(sesem1);
		
		sesem2 = new JTextField();
		sesem2.setColumns(10);
		sesem2.setBounds(502, 336, 116, 40);
		contentPane.add(sesem2);
		
		lblYear = new JLabel("THIRD YEAR");
		lblYear.setBounds(12, 470, 94, 31);
		contentPane.add(lblYear);
		
		label_3 = new JLabel("SEM1");
		label_3.setBounds(255, 438, 94, 31);
		contentPane.add(label_3);
		
		tesem1 = new JTextField();
		tesem1.setColumns(10);
		tesem1.setBounds(255, 482, 116, 40);
		contentPane.add(tesem1);
		
		lblSem_3 = new JLabel("SEM2");
		lblSem_3.setBounds(502, 440, 94, 31);
		contentPane.add(lblSem_3);
		
		tesem2 = new JTextField();
		tesem2.setColumns(10);
		tesem2.setBounds(502, 482, 116, 40);
		contentPane.add(tesem2);
		
		lblFourthYear = new JLabel("FOURTH YEAR");
		lblFourthYear.setBounds(12, 583, 94, 31);
		contentPane.add(lblFourthYear);
		
		label_6 = new JLabel("SEM1");
		label_6.setBounds(255, 572, 94, 31);
		contentPane.add(label_6);
		
		lblSem_4 = new JLabel("SEM2");
		lblSem_4.setBounds(519, 572, 94, 31);
		contentPane.add(lblSem_4);
		
		besem1 = new JTextField();
		besem1.setColumns(10);
		besem1.setBounds(255, 626, 116, 40);
		contentPane.add(besem1);
		
		besem2 = new JTextField();
		besem2.setColumns(10);
		besem2.setBounds(502, 626, 116, 40);
		contentPane.add(besem2);
		
		lblRollNo = new JLabel("Roll No");
		lblRollNo.setBounds(776, 245, 56, 16);
		contentPane.add(lblRollNo);
		
		roll = new JTextField();
		roll.setColumns(10);
		roll.setBounds(762, 288, 116, 40);
		contentPane.add(roll);
		
		JButton btnSaveDetails = new JButton("Save Details");
		btnSaveDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Roll=roll.getText();
				try
				{
				if(!classxmarks.getText().equals(""))
				{
					String query1="insert into classxmarks(Rollno,Percentage) values(?,?)";
					PreparedStatement pst1=connection.prepareStatement(query1);
					pst1.setString(1, Roll);
					pst1.setString(2,classxmarks.getText());
					pst1.execute();
					pst1.close();
				}
				
				if(!classxiimarks.getText().equals(""))
				{
					String query2="insert into classxiimarks(Rollno,Percentage) values(?,?)";
					PreparedStatement pst2=connection.prepareStatement(query2);
					pst2.setString(1, Roll);
					pst2.setString(2,classxiimarks.getText());
					pst2.execute();
					pst2.close();
				}
				
				if(!fesem1.getText().equals("") && fesem2.getText().equals(""))
				{
					String query3="insert into femarks(Rollno,sem1) values(?,?)";
					PreparedStatement pst3=connection.prepareStatement(query3);
					pst3.setString(1, Roll);
					pst3.setString(2,fesem1.getText());
					pst3.execute();
					pst3.close();
				}
				
				if(!fesem1.getText().equals("") && !fesem2.getText().equals(""))
				{
					String query4="insert into femarks(Rollno,sem1,sem2) values(?,?,?)";
					PreparedStatement pst4=connection.prepareStatement(query4);
					pst4.setString(1, Roll);
					pst4.setString(2,fesem1.getText());
					pst4.setString(3,fesem2.getText());
					pst4.execute();
					pst4.close();
				}
				
				if(!sesem1.getText().equals("") && sesem2.getText().equals(""))
				{
					String query5="insert into semarks(Rollno,sem1) values(?,?)";
					PreparedStatement pst5=connection.prepareStatement(query5);
					pst5.setString(1, Roll);
					pst5.setString(2,sesem1.getText());
					pst5.execute();

					pst5.close();
				}
				
				if(!sesem1.getText().equals("") && !sesem2.getText().equals(""))
				{
					String query6="insert into semarks(Rollno,sem1,sem2) values(?,?,?)";
					PreparedStatement pst6=connection.prepareStatement(query6);
					pst6.setString(1, Roll);
					pst6.setString(2,sesem1.getText());
					pst6.setString(3,sesem2.getText());
					pst6.execute();
		        	 JOptionPane.showMessageDialog(null,sesem1.getText());
		        	 JOptionPane.showMessageDialog(null,sesem2.getText());


					pst6.close();
				}
				
				if(!tesem1.getText().equals("") && tesem2.getText().equals(""))
				{
					String query7="insert into temarks(Rollno,sem1) values(?,?)";
					PreparedStatement pst7=connection.prepareStatement(query7);
					pst7.setString(1, Roll);
					pst7.setString(2,tesem1.getText());
					pst7.execute();
					pst7.close();
				}
				
				if(!tesem1.getText().equals("") && !tesem2.getText().equals(""))
				{
					String query8="insert into temarks(Rollno,sem1,sem2) values(?,?,?)";
					PreparedStatement pst8=connection.prepareStatement(query8);
					pst8.setString(1, Roll);
					pst8.setString(2,tesem1.getText());
					pst8.setString(3,tesem2.getText());
					pst8.execute();
					pst8.close();
				}
				
				if(!besem1.getText().equals("") && besem2.getText().equals(""))
				{
					String query9="insert into bemarks(Rollno,sem1) values(?,?)";
					PreparedStatement pst9=connection.prepareStatement(query9);
					pst9.setString(1, Roll);
					pst9.setString(2,besem1.getText());
					pst9.execute();
					pst9.close();
				}
				
				if(!besem1.getText().equals("") && !besem2.getText().equals(""))
				{
					String query10="insert into bemarks(Rollno,sem1,sem2) values(?,?,?)";
					PreparedStatement pst10=connection.prepareStatement(query10);
					pst10.setString(1, Roll);
					pst10.setString(2,besem1.getText());
					pst10.setString(3,besem2.getText());
					pst10.execute();
					pst10.close();
				}
			
			}
			
			catch(Exception e1)
			{
	        	 JOptionPane.showMessageDialog(null,e1);

			}
			}
		});
		btnSaveDetails.setBounds(762, 397, 129, 25);
		contentPane.add(btnSaveDetails);
		
		JLabel lblPleaseFillOnly = new JLabel("Please Fill Only Those Fields Which Are Applicable For You ");
		lblPleaseFillOnly.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblPleaseFillOnly.setBounds(213, 713, 734, 16);
		contentPane.add(lblPleaseFillOnly);
	}
}
