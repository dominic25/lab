package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public abstract class BookPageGui {

	//private JFrame frmIbookBook;

	/**
	 * Launch the application.
	 */
/*	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookPageGui window = new BookPageGui();
					window.frmIbookBook.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the application.
	 */
	public BookPageGui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
	/*	frmIbookBook = new JFrame();
		frmIbookBook.setTitle("iBook - Book page");
		frmIbookBook.setBounds(100, 100, 450, 300);
		frmIbookBook.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmIbookBook.getContentPane().setLayout(null);
		
		JLabel lbBookTitle = new JLabel("New label");
		lbBookTitle.setToolTipText("book title");
		lbBookTitle.setBounds(10, 11, 46, 14);
		frmIbookBook.getContentPane().add(lbBookTitle);
		
		JTextPane tpSummary = new JTextPane();
		tpSummary.setBounds(10, 36, 258, 180);
		tpSummary.setText(summary);
		frmEmpBookPage.getContentPane().add(tpSummary);
		
		JLabel lblAuthor = new JLabel("New label");
		lblAuthor.setToolTipText("book author");
		lblAuthor.setBounds(84, 11, 46, 14);
		frmIbookBook.getContentPane().add(lblAuthor);
		
		JButton btnReviews = new JButton("Reviews");
		btnReviews.setBounds(10, 227, 89, 23);
		frmIbookBook.getContentPane().add(btnReviews);
		
		JButton btnBackToSearch = new JButton("back");
		btnBackToSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBackToSearch.setBounds(179, 227, 89, 23);
		frmIbookBook.getContentPane().add(btnBackToSearch);
		
		JButton btnCheackout = new JButton("cheackout");
		btnCheackout.setBounds(335, 227, 89, 23);
		frmIbookBook.getContentPane().add(btnCheackout);
		
		JComboBox comboBoxFormat = new JComboBox();
		comboBoxFormat.setModel(new DefaultComboBoxModel(new String[] {"pdf", "doc", "fb2"}));
		comboBoxFormat.setBounds(335, 196, 89, 20);
		frmIbookBook.getContentPane().add(comboBoxFormat);*/
	}
}
