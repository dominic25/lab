package gui;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class ManagerBookPageGui extends EmployeeBookPageGui {

	private JFrame frmMngBookPage;
	private int month;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManagerBookPageGui window = new ManagerBookPageGui("me", "null", "mnull");
					window.frmMngBookPage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ManagerBookPageGui(String title, String summary, String author) {
		super(title, summary, author);
		initialize(title, summary, author);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(String title, String summary, String author) {
		frmMngBookPage = new JFrame();
		frmMngBookPage.setTitle("iBook - Manager Book page");
		frmMngBookPage.setBounds(100, 100, 450, 300);
		frmMngBookPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMngBookPage.getContentPane().setLayout(null);
			
		JLabel lbBookTitle = new JLabel(title);
		lbBookTitle.setToolTipText("book title");
		lbBookTitle.setBounds(10, 11, 46, 14);
		frmMngBookPage.getContentPane().add(lbBookTitle);
			
		JTextPane tpSummary = new JTextPane();
		tpSummary.setBounds(10, 36, 258, 180);
		tpSummary.setText(summary);
		frmMngBookPage.getContentPane().add(tpSummary);
			
		JLabel lblAuthor = new JLabel(author);
		lblAuthor.setToolTipText("book author");
		lblAuthor.setBounds(84, 11, 46, 14);
		frmMngBookPage.getContentPane().add(lblAuthor);
			
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBounds(335, 227, 89, 23);
		frmMngBookPage.getContentPane().add(btnUpdate);
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
				
		JButton btnRemove = new JButton("Remove");
		btnRemove.setBounds(172, 227, 89, 23);
		frmMngBookPage.getContentPane().add(btnRemove);
		btnRemove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
				
		JButton btnBackToSearch = new JButton("Back");
		btnBackToSearch.setBounds(10, 227, 89, 23);
		frmMngBookPage.getContentPane().add(btnBackToSearch);
		
		JComboBox comboBoxDates = new JComboBox();
		comboBoxDates.setMaximumRowCount(12);
		comboBoxDates.setModel(new DefaultComboBoxModel(new String[] {"January", "February", "March", "April", "May", "June", "July", "August\t", "September", "October", "November", "December"}));
		comboBoxDates.setToolTipText("select the month to get report for");
		comboBoxDates.setBounds(335, 41, 89, 20);
		frmMngBookPage.getContentPane().add(comboBoxDates);
		comboBoxDates.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JComboBox cb = (JComboBox) e.getSource();
				month= (int)cb.getSelectedIndex();
				JOptionPane.showMessageDialog(frmMngBookPage, "the month is: " +month);
			}
		});
		
		JButton btnReport = new JButton("Report");
		btnReport.setBounds(335, 7, 89, 23);
		frmMngBookPage.getContentPane().add(btnReport);
		btnReport.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		
			}
		});
		JButton btnTemporaryRemove = new JButton("Temporary Remove");
		btnTemporaryRemove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnTemporaryRemove.setBounds(297, 188, 127, 23);
		frmMngBookPage.getContentPane().add(btnTemporaryRemove);
		btnBackToSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
	
		
	}
}
