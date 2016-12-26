package gui;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;

import com.sun.glass.ui.Window;

import gui.EmployeeLoginGui;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.event.*;
import java.awt.SystemColor;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;

public class ReaderLoginGui {

	JFrame frmIbookLogin;
	private JTextField username_textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReaderLoginGui window = new ReaderLoginGui();
					window.frmIbookLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ReaderLoginGui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmIbookLogin = new JFrame();
		frmIbookLogin.setTitle("iBook - Reader login");
		frmIbookLogin.setBounds(100, 100, 450, 300);
		frmIbookLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmIbookLogin.getContentPane().setLayout(null);
		
		username_textField = new JTextField();
		username_textField.setBounds(74, 98, 86, 20);
		frmIbookLogin.getContentPane().add(username_textField);
		username_textField.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnLogin.setBounds(154, 129, 89, 23);
		frmIbookLogin.getContentPane().add(btnLogin);
		
		JButton btnEmployee = new JButton("Employee");
		btnEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmIbookLogin.setVisible(false);
				EmployeeLoginGui window = new EmployeeLoginGui();
				window.frmIbookEmployee.setVisible(true);
				
			}
		});
		btnEmployee.setBounds(335, 227, 89, 23);
		frmIbookLogin.getContentPane().add(btnEmployee);
		
		JLabel lblUsername = new JLabel("username");
		lblUsername.setBounds(74, 69, 86, 14);
		frmIbookLogin.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("password");
		lblPassword.setBounds(232, 73, 86, 14);
		frmIbookLogin.getContentPane().add(lblPassword);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(10, 227, 89, 23);
		frmIbookLogin.getContentPane().add(btnExit);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(232, 98, 86, 20);
		frmIbookLogin.getContentPane().add(passwordField);
	}
}

/*class ButtonClickListener implements ActionListener{
    public void actionPerformed(ActionEvent e) {
       String command = e.getActionCommand();  
       if( command.equals( "Login" ))  {
          
       }
       else if( command.equals( "Employee" ) )  {

       }
       else if( command.equals( "Exit" ) ) {

       }  	
    }		*/