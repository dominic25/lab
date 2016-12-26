package gui;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class EmployeeBookPageGui extends BookPageGui{

	private JFrame frmEmpBookPage;

	/**
	 * Launch the application.
	 */
/*	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeeBookPageGui window = new EmployeeBookPageGui();
					window.frmEmpBookPage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the application.
	 */
	public EmployeeBookPageGui(String title, String summary, String author) {
		initialize(title, summary, author);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(String title, String summary, String author) {
		frmEmpBookPage = new JFrame();
		frmEmpBookPage.setTitle("iBook - Employee Book page");
		frmEmpBookPage.setBounds(100, 100, 450, 300);
		frmEmpBookPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEmpBookPage.getContentPane().setLayout(null);
		
		JLabel lbBookTitle = new JLabel(title);
		lbBookTitle.setToolTipText("book title");
		lbBookTitle.setBounds(10, 11, 46, 14);
		frmEmpBookPage.getContentPane().add(lbBookTitle);
		
		JTextPane tpSummary = new JTextPane();
		tpSummary.setBounds(10, 36, 258, 180);
		tpSummary.setText(summary);
		frmEmpBookPage.getContentPane().add(tpSummary);
		
		JLabel lblAuthor = new JLabel(author);
		lblAuthor.setToolTipText("book author");
		lblAuthor.setBounds(84, 11, 46, 14);
		frmEmpBookPage.getContentPane().add(lblAuthor);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBounds(335, 227, 89, 23);
		frmEmpBookPage.getContentPane().add(btnUpdate);
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		
		JButton btnRemove = new JButton("Remove");
		btnRemove.setBounds(165, 227, 89, 23);
		frmEmpBookPage.getContentPane().add(btnRemove);
		btnRemove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		
		JButton btnBackToSearch = new JButton("Back");
		btnBackToSearch.setBounds(10, 227, 89, 23);
		frmEmpBookPage.getContentPane().add(btnBackToSearch);
		btnBackToSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
	}
}
