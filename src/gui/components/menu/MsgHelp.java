package gui.components.menu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import javax.swing.JTextPane;

public class MsgHelp extends JFrame {

	private JPanel contentPane;

	public MsgHelp() {
		setTitle("Help");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		JTextPane txtpnTextoAqui = new JTextPane();
		txtpnTextoAqui.setEditable(false);
		txtpnTextoAqui.setText("");
		contentPane.add(txtpnTextoAqui, "name_105970486362763");
	}
}
