package gui.components.menu;

import java.awt.EventQueue;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import javax.swing.JTextPane;

public class MsgHelp extends JFrame {
	private String textHelp = "";
	private JPanel contentPane;

	public MsgHelp() throws FileNotFoundException {
		setTitle("Help");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 650, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		JTextPane txtpnTextoAqui = new JTextPane();
		txtpnTextoAqui.setEditable(false);
		this.scanFile();
		txtpnTextoAqui.setText(textHelp);
		contentPane.add(txtpnTextoAqui, "name_105970486362763");
	}
	
	public void scanFile() throws FileNotFoundException {
		String pathFile = "/home/leokl/eclipse-workspace/TrabFinalTCP/src/gui/components/menu/help_do_java.txt";
		if(pathFile != null) {
			File file = new File(pathFile);
			Scanner scan = new Scanner(file);
			while(scan.hasNextLine()) {
				this.textHelp = this.textHelp.concat(scan.nextLine() + "\n");
			}
			scan.close();
		}
	}
}
