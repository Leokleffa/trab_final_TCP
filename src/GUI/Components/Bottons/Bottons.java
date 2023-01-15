package GUI.Components.Bottons;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import GUI.Components.EditorText.EditorText;
import GUI.Components.ProgessBar.ProgressBar;
import GUI.Components.Screen.Screen;
import Text.Text;

public  class Bottons {	
	
	public static void initializationBottons(JPanel contentPane){
		contentPane.add(initializationBtnPlay());
		contentPane.add(initializationBtnPause());
		contentPane.add(initializationBtnReset());
		contentPane.add(initializationBtnOpen());
		contentPane.add(initializationBtnExport());
	}
	
	private static JButton initializationBtnPlay() {
		JButton btnPlay = new JButton("PLAY");
		btnPlay.setFont(new Font("Dialog", Font.BOLD, 10));
		btnPlay.setBounds(24, 189, 75, 62);
		btnPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Screen.setTextScreen("PLAY!");
				EditorText.disableTextEdition();
				EditorText.setTextEditorPane("Oi, meu chapa!\nTudo bem?\n");
			}
		});
		return btnPlay;
	}
	
	private static JButton initializationBtnPause() {
		JButton btnPause = new JButton("PAUSE");
		btnPause.setFont(new Font("Dialog", Font.BOLD, 10));
		btnPause.setBounds(111, 189, 81, 62);
		btnPause.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Screen.setTextScreen("PAUSE!");
				EditorText.ableTextEdition();
			}
		});
		return btnPause;
	}
	
	private static JButton initializationBtnReset() {
		JButton btnReset = new JButton("RESET");
		btnReset.setFont(new Font("Dialog", Font.BOLD, 10));
		btnReset.setBounds(204, 189, 81, 62);
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Screen.setTextScreen("RESET!");
			}
		});
		return btnReset;
	}
	private static JButton initializationBtnOpen() {
		JButton btnOpen = new JButton("OPEN");
		btnOpen.setBounds(301, 12, 117, 25);
		btnOpen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Screen.setTextScreen("OPEN FILE!");
			}
		});
		return btnOpen;
	}
	
	private static JButton initializationBtnExport() {
		JButton btnExport = new JButton("EXPORT");
		btnExport.setBounds(301, 49, 117, 25);
		btnExport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Screen.setTextScreen("EXPORT FILE!");
			}
		});
		return btnExport;
	}
}
