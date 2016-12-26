package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import net.miginfocom.swing.MigLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JEditorPane;

public class UpdateBookGui {

	private JFrame frame;
	private JTextField txtTitle;
	private JTextField txtLang;
	private JTextField txtKeyword;
	private JTextField txtGenre;
	private JTextField txtToc;
	private JButton btnSubmit;
	private JButton btnBack;
	private JEditorPane dtrpnAuthors;
	private JEditorPane dtrpnCategorys;
	private JEditorPane dtrpnSummary;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdateBookGui window = new UpdateBookGui();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public UpdateBookGui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new MigLayout("", "[grow]", "[][][grow][grow][grow][][][][]"));
		
		txtTitle = new JTextField();
		txtTitle.setText("title");
		frame.getContentPane().add(txtTitle, "flowx,cell 0 0,alignx left");
		txtTitle.setColumns(10);
		
		txtLang = new JTextField();
		txtLang.setText("lang");
		frame.getContentPane().add(txtLang, "cell 0 0");
		txtLang.setColumns(10);
		
		txtKeyword = new JTextField();
		txtKeyword.setText("keyword");
		frame.getContentPane().add(txtKeyword, "cell 0 0");
		txtKeyword.setColumns(10);
		
		txtGenre = new JTextField();
		txtGenre.setText("genre");
		frame.getContentPane().add(txtGenre, "flowx,cell 0 1,alignx left");
		txtGenre.setColumns(10);
		
		txtToc = new JTextField();
		txtToc.setText("toc");
		frame.getContentPane().add(txtToc, "cell 0 1");
		txtToc.setColumns(10);
		
		dtrpnCategorys = new JEditorPane();
		dtrpnCategorys.setText("categorys");
		frame.getContentPane().add(dtrpnCategorys, "cell 0 2,grow");
		
		dtrpnAuthors = new JEditorPane();
		dtrpnAuthors.setText("authors");
		frame.getContentPane().add(dtrpnAuthors, "cell 0 3,grow");
		
		dtrpnSummary = new JEditorPane();
		dtrpnSummary.setText("summary");
		frame.getContentPane().add(dtrpnSummary, "cell 0 4 1 4,grow");
		
		btnBack = new JButton("back");
		frame.getContentPane().add(btnBack, "flowx,cell 0 8,alignx center");
		
		btnSubmit = new JButton("submit");
		frame.getContentPane().add(btnSubmit, "cell 0 8,alignx center");
	}
}
