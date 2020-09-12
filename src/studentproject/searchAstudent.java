package studentproject;

import java.awt.BorderLayout;
import java.sql.*;
import javax.swing.*;
import java.awt.EventQueue;

import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class searchAstudent extends JFrame {

	private JPanel contentPane;
	private JTextField rollno;
	private JTable table;

	/**
	 * Launch the application.
	 */
	Connection connection=null;
	private JTable table_1;
	private JScrollPane scrollPane;
	private JTextField year;
	private JTable table_2;
	private JTable table_3;
	private JTable table_4;
	private JTable table_5;
	private JScrollPane scrollPane_1;
	private JScrollPane scrollPane_2;
	private JScrollPane scrollPane_3;
	private JScrollPane scrollPane_4;
	private JLabel lblFirstYear;
	private JLabel lblSecondYear;
	private JLabel lblThirdYear;
	private JLabel lblFourthYear;
	private JTable table_6;
	private JTable table_7;
	private JScrollPane scrollPane_5;
	private JScrollPane scrollPane_6;
	private JLabel lblClassX;
	private JLabel lblClassXii;
	private JLabel lblDiploma;
	private JTable table_8;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					searchAstudent frame = new searchAstudent();
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
	public searchAstudent() {
		setResizable(false);
	connection=sqliteConnection.dbConnector();
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 952, 753);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter the Roll number and Year to Search");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(292, 13, 508, 46);
		contentPane.add(lblNewLabel);
		
		rollno = new JTextField();
		rollno.setBounds(162, 132, 116, 34);
		contentPane.add(rollno);
		rollno.setColumns(10);
		
		JLabel lblRollNo = new JLabel("Roll no.");
		lblRollNo.setBounds(162, 85, 90, 34);
		contentPane.add(lblRollNo);
		
		JLabel lblYear = new JLabel("Year");
		lblYear.setBounds(625, 85, 90, 34);
		contentPane.add(lblYear);
		
		JButton btnNewButton = new JButton("Show record");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					if(year.getText().equals("fe"))
					{
                    String query="select * from fe where Rollno= ?";
                    PreparedStatement pst=connection.prepareStatement(query);
                    pst.setString(1, rollno.getText());
                    ResultSet rs=pst.executeQuery();
                    table_1.setModel(DbUtils.resultSetToTableModel(rs));
			        }
					
					if(year.getText().equals("se"))
					{
                    String query="select * from se where Rollno= ?";
                    PreparedStatement pst=connection.prepareStatement(query);
                    pst.setString(1, rollno.getText());
                    ResultSet rs=pst.executeQuery();
                    table_1.setModel(DbUtils.resultSetToTableModel(rs));
			        }
					
					if(year.getText().equals("te"))
					{
                    String query="select * from te where Rollno= ?";
                    PreparedStatement pst=connection.prepareStatement(query);
                    pst.setString(1, rollno.getText());
                    ResultSet rs=pst.executeQuery();
                    table_1.setModel(DbUtils.resultSetToTableModel(rs));
			        }
					
					if(year.getText().equals("be"))
					{
                    String query="select * from be where Rollno= ?";
                    PreparedStatement pst=connection.prepareStatement(query);
                    pst.setString(1, rollno.getText());
                    ResultSet rs=pst.executeQuery();
                    table_1.setModel(DbUtils.resultSetToTableModel(rs));
			        }
					String query1="select sem1,sem2 from femarks where Rollno= ?";
                    PreparedStatement pst1=connection.prepareStatement(query1);
                    pst1.setString(1, rollno.getText());
                    ResultSet rs1=pst1.executeQuery();
                    table_2.setModel(DbUtils.resultSetToTableModel(rs1));
				
                    String query2="select sem1,sem2 from semarks where Rollno= ?";
                    PreparedStatement pst2=connection.prepareStatement(query2);
                    pst2.setString(1, rollno.getText());
                    ResultSet rs2=pst2.executeQuery();
                    table_3.setModel(DbUtils.resultSetToTableModel(rs2));
                    
                    String query3="select sem1,sem2 from temarks where Rollno= ?";
                    PreparedStatement pst3=connection.prepareStatement(query3);
                    pst3.setString(1, rollno.getText());
                    ResultSet rs3=pst3.executeQuery();
                    table_4.setModel(DbUtils.resultSetToTableModel(rs3));
                    
                    String query4="select sem1,sem2 from bemarks where Rollno= ?";
                    PreparedStatement pst4=connection.prepareStatement(query4);
                    pst4.setString(1, rollno.getText());
                    ResultSet rs4=pst4.executeQuery();
                    table_5.setModel(DbUtils.resultSetToTableModel(rs4));
                    
                    String query5="select Percentage from classxmarks where Rollno= ?";
                    PreparedStatement pst5=connection.prepareStatement(query5);
                    pst5.setString(1, rollno.getText());
                    ResultSet rs5=pst5.executeQuery();
                    table_6.setModel(DbUtils.resultSetToTableModel(rs5));
                    
                    String query6="select Percentage from classxiimarks where Rollno= ?";
                    PreparedStatement pst6=connection.prepareStatement(query6);
                    pst6.setString(1, rollno.getText());
                    ResultSet rs6=pst6.executeQuery();
                    table_7.setModel(DbUtils.resultSetToTableModel(rs6));
                    
                    String query7="select Percentage from diplomamarks where Rollno= ?";
                    PreparedStatement pst7=connection.prepareStatement(query7);
                    pst7.setString(1, rollno.getText());
                    ResultSet rs7=pst7.executeQuery();
                    table_8.setModel(DbUtils.resultSetToTableModel(rs7));
				}
			
			catch(Exception e1) {
	        	 JOptionPane.showMessageDialog(null,"Some records are not available,The ones available are shown");

			}
			}
		});
		btnNewButton.setBounds(398, 203, 125, 25);
		contentPane.add(btnNewButton);
		
		table = new JTable();
		table.setBounds(125, 268, 1, 1);
		contentPane.add(table);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 253, 910, 65);
		contentPane.add(scrollPane);
		
		table_1 = new JTable();
		scrollPane.setViewportView(table_1);
		
		year = new JTextField();
		year.setBounds(625, 132, 128, 34);
		contentPane.add(year);
		year.setColumns(10);
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(203, 472, 575, 46);
		contentPane.add(scrollPane_1);
		
		table_2 = new JTable();
		scrollPane_1.setViewportView(table_2);
		
		scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(203, 528, 575, 44);
		contentPane.add(scrollPane_2);
		
		table_3 = new JTable();
		scrollPane_2.setViewportView(table_3);
		
		scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(203, 585, 575, 48);
		contentPane.add(scrollPane_3);
		
		table_4 = new JTable();
		scrollPane_3.setViewportView(table_4);
		
		scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(203, 646, 575, 47);
		contentPane.add(scrollPane_4);
		
		table_5 = new JTable();
		scrollPane_4.setViewportView(table_5);
		
		lblFirstYear = new JLabel("First Year");
		lblFirstYear.setBounds(61, 472, 102, 46);
		contentPane.add(lblFirstYear);
		
		lblSecondYear = new JLabel("Second Year");
		lblSecondYear.setBounds(61, 528, 102, 46);
		contentPane.add(lblSecondYear);
		
		lblThirdYear = new JLabel("Third Year");
		lblThirdYear.setBounds(61, 585, 102, 46);
		contentPane.add(lblThirdYear);
		
		lblFourthYear = new JLabel("Fourth Year");
		lblFourthYear.setBounds(61, 646, 102, 46);
		contentPane.add(lblFourthYear);
		
		scrollPane_5 = new JScrollPane();
		scrollPane_5.setBounds(106, 382, 151, 44);
		contentPane.add(scrollPane_5);
		
		table_6 = new JTable();
		scrollPane_5.setViewportView(table_6);
		
		scrollPane_6 = new JScrollPane();
		scrollPane_6.setBounds(420, 382, 153, 46);
		contentPane.add(scrollPane_6);
		
		table_7 = new JTable();
		scrollPane_6.setViewportView(table_7);
		
		lblClassX = new JLabel("Class X");
		lblClassX.setBounds(12, 373, 82, 34);
		contentPane.add(lblClassX);
		
		lblClassXii = new JLabel("Class XII");
		lblClassXii.setBounds(343, 373, 82, 34);
		contentPane.add(lblClassXii);
		
		lblDiploma = new JLabel("Diploma");
		lblDiploma.setBounds(671, 373, 82, 34);
		contentPane.add(lblDiploma);
		
		JScrollPane scrollPane_7 = new JScrollPane();
		scrollPane_7.setBounds(738, 383, 156, 46);
		contentPane.add(scrollPane_7);
		
		table_8 = new JTable();
		scrollPane_7.setViewportView(table_8);
	}
}
