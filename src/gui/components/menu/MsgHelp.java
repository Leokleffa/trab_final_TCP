package gui.components.menu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JDesktopPane;
import java.awt.CardLayout;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class MsgHelp extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public MsgHelp() {
		setTitle("Help");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		JTextPane txtpnTextoAqui = new JTextPane();
		txtpnTextoAqui.setText("texto aqui\nDá para fazer um arquivo, leia e coloque o conteúdo aqui");
		contentPane.add(txtpnTextoAqui, "name_105970486362763");
	}
}
