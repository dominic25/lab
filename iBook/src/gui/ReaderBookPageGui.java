package gui;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.JComboBox;

public class ReaderBookPageGui extends BookPageGui {

	private JFrame frmRdrBookPage;
	private String format;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReaderBookPageGui window = new ReaderBookPageGui("me", "null", "mnull");
					window.frmRdrBookPage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ReaderBookPageGui(String title, String summary, String author) {
		initialize(title, summary, author);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(String title, String summary, String author) {
		frmRdrBookPage = new JFrame();
		frmRdrBookPage.setTitle("iBook - Employee Book page");
		frmRdrBookPage.setBounds(100, 100, 450, 300);
		frmRdrBookPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRdrBookPage.getContentPane().setLayout(null);
		
		JLabel lbBookTitle = new JLabel(title);
		lbBookTitle.setToolTipText("book title");
		lbBookTitle.setBounds(10, 11, 46, 14);
		frmRdrBookPage.getContentPane().add(lbBookTitle);
		
		JTextPane tpSummary = new JTextPane();
		tpSummary.setBounds(10, 36, 258, 180);
		tpSummary.setText(summary);
		frmRdrBookPage.getContentPane().add(tpSummary);
		
		JLabel lblAuthor = new JLabel(author);
		lblAuthor.setToolTipText("book author");
		lblAuthor.setBounds(84, 11, 46, 14);
		frmRdrBookPage.getContentPane().add(lblAuthor);
		
		JButton btnBackToSearch = new JButton("Back");
		btnBackToSearch.setBounds(10, 227, 89, 23);
		frmRdrBookPage.getContentPane().add(btnBackToSearch);
		btnBackToSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JComboBox comboBoxFormat = new JComboBox();
		comboBoxFormat.setToolTipText("select the format you want for your perches");
		comboBoxFormat.setModel(new DefaultComboBoxModel(new String[] {"pdf", "doc", "fb2"}));
		comboBoxFormat.setBounds(335, 196, 89, 20);
		frmRdrBookPage.getContentPane().add(comboBoxFormat);
		comboBoxFormat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JComboBox cb = (JComboBox) e.getSource();
				format = (String)cb.getSelectedItem();
				JOptionPane.showMessageDialog(frmRdrBookPage, "the format is: " +format);
			}
		});
		
		JButton btnCheckout = new JButton("Checkout");
		
		btnCheckout.setBounds(335, 227, 89, 23);
		frmRdrBookPage.getContentPane().add(btnCheckout);
		btnCheckout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
	}

}
