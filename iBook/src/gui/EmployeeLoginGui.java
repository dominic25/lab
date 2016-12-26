package gui;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EmployeeLoginGui {

	JFrame frmIbookEmployee;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
	/*	EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeeLoginGui window = new EmployeeLoginGui();
					window.frmIbookEmployee.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});*/
	}

	/**
	 * Create the application.
	 */
	public EmployeeLoginGui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmIbookEmployee = new JFrame();
		frmIbookEmployee.setTitle("iBook - Employee login");
		frmIbookEmployee.setBounds(100, 100, 450, 300);
		frmIbookEmployee.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmIbookEmployee.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(75, 84, 86, 20);
		frmIbookEmployee.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(246, 84, 86, 20);
		frmIbookEmployee.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblUsername = new JLabel("username");
		lblUsername.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsername.setBounds(75, 59, 86, 14);
		frmIbookEmployee.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("password");
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setBounds(246, 59, 86, 14);
		frmIbookEmployee.getContentPane().add(lblPassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnLogin.setBounds(155, 115, 89, 23);
		frmIbookEmployee.getContentPane().add(btnLogin);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(10, 227, 89, 23);
		frmIbookEmployee.getContentPane().add(btnExit);
		
		JButton btnReader = new JButton("Reader");
		btnReader.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmIbookEmployee.setVisible(false);
				ReaderLoginGui window = new ReaderLoginGui();
				window.frmIbookLogin.setVisible(true);
			}
		});
		btnReader.setBounds(335, 227, 89, 23);
		frmIbookEmployee.getContentPane().add(btnReader);
	}

}
