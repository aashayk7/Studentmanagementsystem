package studentproject;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class adminOptions extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					adminOptions frame = new adminOptions();
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
	public adminOptions() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 527, 428);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAddNewMember = new JButton("Add New Member");
		btnAddNewMember.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addMember.main(null);
				dispose();
			}
		});
		btnAddNewMember.setBounds(180, 117, 144, 53);
		contentPane.add(btnAddNewMember);
		
		JButton btnDeleteMember = new JButton("Delete Member");
		btnDeleteMember.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				deleteMember.main(null);
				dispose();
			}
		});
		btnDeleteMember.setBounds(180, 224, 144, 53);
		contentPane.add(btnDeleteMember);
		
		JLabel lblAdminOptions = new JLabel("Admin Options");
		lblAdminOptions.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblAdminOptions.setBounds(184, 31, 313, 47);
		contentPane.add(lblAdminOptions);
	}

}
