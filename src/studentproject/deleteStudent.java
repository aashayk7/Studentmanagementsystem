package studentproject;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.border.EmptyBorder;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import java.sql.*;
import javax.swing.*;

public class deleteStudent extends JFrame {

	private JPanel contentPane;
	private JTextField rollno;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					deleteStudent frame = new deleteStudent();
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
	public deleteStudent() {
		connection=sqliteConnection.dbConnector();

		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 543, 391);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEnterTheRoll = new JLabel("ENTER THE ROLL NO OF THE STUDENT TO DELETE RECORD ");
		lblEnterTheRoll.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblEnterTheRoll.setBounds(46, 62, 456, 32);
		contentPane.add(lblEnterTheRoll);
		
		rollno = new JTextField();
		rollno.setFont(new Font("Tahoma", Font.ITALIC, 14));
		rollno.setBounds(187, 140, 125, 49);
		contentPane.add(rollno);
		rollno.setColumns(10);
		
		JButton btn_delete = new JButton("Delete Record");
		btn_delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					 String query="select * from fe where Rollno=?";
			         PreparedStatement pst= connection.prepareStatement(query);
			         pst.setString(1,rollno.getText());
			         ResultSet rs = pst.executeQuery();
			         int count=0;
			         while(rs.next())
			         {
			        	 count++;
			         }
			         if(count>0)
			         {
			        	 String query0="delete from fe where Rollno=?";
				         PreparedStatement pst0= connection.prepareStatement(query0);
				         pst0.setString(1,rollno.getText());
				         pst0.execute();
				         pst0.close();
			         }
			         
			         String query1="select * from se where Rollno=?";
			         PreparedStatement pst1= connection.prepareStatement(query1);
			         pst1.setString(1,rollno.getText());
			         ResultSet rs1 = pst1.executeQuery();
			         int count1=0;
			         while(rs1.next())
			         {
			        	 count1++;
			         }
			         if(count1>0)
			         {
			        	 String query2="delete from se where Rollno=?";
				         PreparedStatement pst2= connection.prepareStatement(query2);
				         pst2.setString(1,rollno.getText());
				         pst2.execute();
				         pst2.close();
			         }
			         
			         String query3="select * from te where Rollno=?";
			         PreparedStatement pst3= connection.prepareStatement(query3);
			         pst3.setString(1,rollno.getText());
			         ResultSet rs3 = pst3.executeQuery();
			         int count3=0;
			         while(rs3.next())
			         {
			        	 count3++;
			         }
			         if(count3>0)
			         {
			        	 String query4="delete from te where Rollno=?";
				         PreparedStatement pst4= connection.prepareStatement(query4);
				         pst4.setString(1,rollno.getText());
				         pst4.execute();
				         pst4.close();
			         }
			         
			         String query5="select * from be where Rollno=?";
			         PreparedStatement pst5= connection.prepareStatement(query5);
			         pst5.setString(1,rollno.getText());
			         ResultSet rs5 = pst5.executeQuery();
			         int count5=0;
			         while(rs5.next())
			         {
			        	 count5++;
			         }
			         if(count5>0)
			         {
			        	 String query6="delete from be where Rollno=?";
				         PreparedStatement pst6= connection.prepareStatement(query6);
				         pst6.setString(1,rollno.getText());
				         pst6.execute();
				         pst6.close();
			         }
			         ///////
			         String query7="select * from femarks where Rollno=?";
			         PreparedStatement pst7= connection.prepareStatement(query7);
			         pst7.setString(1,rollno.getText());
			         ResultSet rs7 = pst7.executeQuery();
			         int count7=0;
			         while(rs7.next())
			         {
			        	 count7++;
			         }
			         if(count7>0)
			         {
			        	 String query8="delete from femarks where Rollno=?";
				         PreparedStatement pst8= connection.prepareStatement(query8);
				         pst8.setString(1,rollno.getText());
				         pst8.execute();
				         pst8.close();
			         }
			         
			         String query9="select * from semarks where Rollno=?";
			         PreparedStatement pst9= connection.prepareStatement(query9);
			         pst9.setString(1,rollno.getText());
			         ResultSet rs9 = pst9.executeQuery();
			         int count9=0;
			         while(rs9.next())
			         {
			        	 count9++;
			         }
			         if(count9>0)
			         {
			        	 String query10="delete from semarks where Rollno=?";
				         PreparedStatement pst10= connection.prepareStatement(query10);
				         pst10.setString(1,rollno.getText());
				         pst10.execute();
				         pst10.close();
			         }
			         
			         String query11="select * from temarks where Rollno=?";
			         PreparedStatement pst11= connection.prepareStatement(query11);
			         pst11.setString(1,rollno.getText());
			         ResultSet rs11 = pst11.executeQuery();
			         int count11=0;
			         while(rs11.next())
			         {
			        	 count11++;
			         }
			         if(count11>0)
			         {
			        	 String query12="delete from temarks where Rollno=?";
				         PreparedStatement pst12= connection.prepareStatement(query12);
				         pst12.setString(1,rollno.getText());
				         pst12.execute();
				         pst12.close();
			         }
			         
			         String query12="select * from bemarks where Rollno=?";
			         PreparedStatement pst12= connection.prepareStatement(query12);
			         pst12.setString(1,rollno.getText());
			         ResultSet rs12 = pst12.executeQuery();
			         int count12=0;
			         while(rs12.next())
			         {
			        	 count12++;
			         }
			         if(count12>0)
			         {
			        	 String query13="delete from bemarks where Rollno=?";
				         PreparedStatement pst13= connection.prepareStatement(query13);
				         pst13.setString(1,rollno.getText());
				         pst13.execute();
				         pst13.close();
			         }
			         
			         /***/
			         String query14="select * from classxmarks where Rollno=?";
			         PreparedStatement pst14= connection.prepareStatement(query14);
			         pst14.setString(1,rollno.getText());
			         ResultSet rs14 = pst14.executeQuery();
			         int count14=0;
			         while(rs14.next())
			         {
			        	 count14++;
			         }
			         if(count14>0)
			         {
			        	 String query15="delete from classxmarks where Rollno=?";
				         PreparedStatement pst15= connection.prepareStatement(query15);
				         pst15.setString(1,rollno.getText());
				         pst15.execute();
				         pst15.close();
			         }
			         
			         String query16="select * from classxiimarks where Rollno=?";
			         PreparedStatement pst16= connection.prepareStatement(query16);
			         pst16.setString(1,rollno.getText());
			         ResultSet rs16 = pst16.executeQuery();
			         int count16=0;
			         while(rs16.next())
			         {
			        	 count16++;
			         }
			         if(count16>0)
			         {
			        	 String query17="delete from classxiimarks where Rollno=?";
				         PreparedStatement pst17= connection.prepareStatement(query17);
				         pst17.setString(1,rollno.getText());
				         pst17.execute();
				         pst17.close();
			         }
			         
		        	 JOptionPane.showMessageDialog(null,"Deleted successfully!!");

			           
				}
				
				catch(Exception e) {
		        	 JOptionPane.showMessageDialog(null,e);

				}
			}
		});
		btn_delete.setBounds(187, 260, 125, 39);
		contentPane.add(btn_delete);
	}
}
