package GUI;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextArea;
import java.awt.SystemColor;
import javax.swing.DropMode;
import javax.swing.JProgressBar;
import javax.swing.JFormattedTextField;
import javax.swing.JEditorPane;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Gui extends JFrame {

	private JPanel contentPane;
	private JTextField txtBpm;

	/**
	 * Create the frame.
	 */
	public Gui() {
		setTitle("Gerador de Música a partir de Texto");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox listIntruments = new JComboBox();
		listIntruments.setModel(new DefaultComboBoxModel(new String[] {"AGOGO", "CHURCHORGAN", "HARPSICHORD", "PANFLUTE", "TUBULARBELLS"}));
		listIntruments.setBounds(301, 97, 117, 24);
		contentPane.add(listIntruments);
		
		JButton btnPlay = new JButton("PLAY");
		btnPlay.setFont(new Font("Dialog", Font.BOLD, 10));
		btnPlay.setBounds(24, 189, 75, 62);
		contentPane.add(btnPlay);
		
		JButton btnPause = new JButton("PAUSE");
		btnPause.setFont(new Font("Dialog", Font.BOLD, 10));
		btnPause.setBounds(111, 189, 81, 62);
		contentPane.add(btnPause);
		
		JButton btnReset = new JButton("RESET");
		btnReset.setFont(new Font("Dialog", Font.BOLD, 10));
		btnReset.setBounds(204, 189, 81, 62);
		contentPane.add(btnReset);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(24, 158, 264, 14);
		contentPane.add(progressBar);
		
		JButton btnOpen = new JButton("OPEN");
		btnOpen.setBounds(301, 12, 117, 25);
		contentPane.add(btnOpen);
		
		JButton btnExport = new JButton("EXPORT");
		btnExport.setBounds(301, 49, 117, 25);
		contentPane.add(btnExport);
		
		JFormattedTextField frmtdtxtfldNotas = new JFormattedTextField();
		frmtdtxtfldNotas.setHorizontalAlignment(SwingConstants.CENTER);
		frmtdtxtfldNotas.setEditable(false);
		//frmtdtxtfldNotas.setText("NOTAS");
		frmtdtxtfldNotas.setBounds(301, 178, 117, 73);
		contentPane.add(frmtdtxtfldNotas);
		
		txtBpm = new JTextField();
		txtBpm.setText("BPM");
		txtBpm.setBounds(304, 147, 114, 19);
		contentPane.add(txtBpm);
		txtBpm.setColumns(10);
		
		JEditorPane dtrpnText = new JEditorPane();
		dtrpnText.setEnabled(true);
		dtrpnText.setText("Write your text here");
		dtrpnText.setBounds(24, 23, 265, 123);
		contentPane.add(dtrpnText);
		
		btnPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmtdtxtfldNotas.setText("PLAY!");
			}
		});
		
		btnPause.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmtdtxtfldNotas.setText("PAUSE!");
			}
		});
		
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmtdtxtfldNotas.setText("RESET!");
			}
		});
		
		btnOpen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmtdtxtfldNotas.setText("OPEN FILE!");
			}
		});
		
		btnExport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmtdtxtfldNotas.setText("EXPORT FILE!");
			}
		});
	}
}
