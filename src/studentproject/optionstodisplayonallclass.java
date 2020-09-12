package studentproject;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;
import javax.swing.*;

public class optionstodisplayonallclass extends JFrame {

	private JPanel contentPane;
	private JTable displayclass_table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					optionstodisplayonallclass frame = new optionstodisplayonallclass();
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
	public optionstodisplayonallclass() {
		connection=sqliteConnection.dbConnector();

		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 976, 641);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton displayclass_fe = new JButton("FIRST YEAR");
		displayclass_fe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
                           String query="select Rollno,Name,MiddleName,LastName,UnivNo from fe";
                           PreparedStatement pst=connection.prepareStatement(query);
                           ResultSet rs=pst.executeQuery();
                           displayclass_table.setModel(DbUtils.resultSetToTableModel(rs));
				}
				
				catch(Exception e1) {
		        	 JOptionPane.showMessageDialog(null,e1);

				}
			}
		});
		displayclass_fe.setBounds(77, 13, 138, 38);
		contentPane.add(displayclass_fe);
		
		JButton displayclass_se = new JButton("SECOND YEAR");
		displayclass_se.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
                    String query="select Rollno,Name,MiddleName,LastName,UnivNo from se";
                    PreparedStatement pst=connection.prepareStatement(query);
                    ResultSet rs=pst.executeQuery();
                    displayclass_table.setModel(DbUtils.resultSetToTableModel(rs));
			}
			
			catch(Exception e2) {
	        	 JOptionPane.showMessageDialog(null,e2);

			}
			}
		});
		displayclass_se.setBounds(293, 13, 138, 38);
		contentPane.add(displayclass_se);
		
		JButton displayclass_te = new JButton("THIRD YEAR");
		displayclass_te.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
                    String query="select Rollno,Name,MiddleName,LastName,UnivNo from te";
                    PreparedStatement pst=connection.prepareStatement(query);
                    ResultSet rs=pst.executeQuery();
                    displayclass_table.setModel(DbUtils.resultSetToTableModel(rs));
			}
			
			catch(Exception e3) {
	        	 JOptionPane.showMessageDialog(null,e3);

			}
			}
		});
		displayclass_te.setBounds(520, 13, 138, 38);
		contentPane.add(displayclass_te);
		
		JButton displayclass_be = new JButton("FOURTH YEAR");
		displayclass_be.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
                    String query="select Rollno,Name,MiddleName,LastName,UnivNo from be";
                    PreparedStatement pst=connection.prepareStatement(query);
                    ResultSet rs=pst.executeQuery();
                    displayclass_table.setModel(DbUtils.resultSetToTableModel(rs));
			}
			
			catch(Exception e4) {
	        	 JOptionPane.showMessageDialog(null,e4);

			}
			}
		});
		displayclass_be.setBounds(736, 13, 128, 38);
		contentPane.add(displayclass_be);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 110, 934, 471);
		contentPane.add(scrollPane);
		
		displayclass_table = new JTable();
		scrollPane.setViewportView(displayclass_table);
	}
}
