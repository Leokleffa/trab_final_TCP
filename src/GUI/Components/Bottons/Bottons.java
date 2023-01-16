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
import GUI.Components.ListInstruments.ListInstruments;
import GUI.Components.ProgessBar.ProgressBar;
import GUI.Components.Screen.Screen;
import Text.Text;

public  class Bottons {	
	private static JButton btnPlay = new JButton("PLAY");
	private static JButton btnPause = new JButton("PAUSE");
	private static JButton btnReset = new JButton("RESET");
	private static JButton btnOpen = new JButton("OPEN");
	private static JButton btnExport = new JButton("EXPORT");
	
	public static void initializationBottons(JPanel contentPane){
		contentPane.add(initializationBtnPlay());
		contentPane.add(initializationBtnPause());
		contentPane.add(initializationBtnReset());
		contentPane.add(initializationBtnOpen());
		contentPane.add(initializationBtnExport());
	}
	
	private static JButton initializationBtnPlay() {
		
		btnPlay.setFont(new Font("Dialog", Font.BOLD, 10));
		btnPlay.setBounds(24, 189, 81, 62);
		btnPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Screen.setTextScreen("PLAY!");
				Bottons.protectPlay();
				EditorText.setTextEditorPane("Oi, meu chapa!\nTudo bem?\n");
				
				//depois de acabar
				//Bottons.notPlaying(); //colocar qnd Play estiver pronta
			} 
		});
		return btnPlay;
	}
	
	private static JButton initializationBtnPause() {
		btnPause.setFont(new Font("Dialog", Font.BOLD, 10));
		btnPause.setBounds(116, 189, 81, 62);
		btnPause.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Screen.setTextScreen("PAUSE!");
				Bottons.notPlaying();
			}
		});
		return btnPause;
	}
	
	private static JButton initializationBtnReset() {
		btnReset.setFont(new Font("Dialog", Font.BOLD, 10));
		btnReset.setBounds(208, 189, 81, 62);
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Screen.setTextScreen("RESET!");
			}
		});
		return btnReset;
	}
	private static JButton initializationBtnOpen() {
		btnOpen.setBounds(301, 12, 117, 25);
		btnOpen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Screen.setTextScreen("OPEN FILE!");
			}
		});
		return btnOpen;
	}
	
	private static JButton initializationBtnExport() {
		btnExport.setBounds(301, 49, 117, 25);
		btnExport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Screen.setTextScreen("EXPORT FILE!");
			}
		});
		return btnExport;
	}
	
	private static void protectPlay() {
		EditorText.disableTextEdition();
		btnReset.setEnabled(false);
		btnOpen.setEnabled(false);
		btnExport.setEnabled(false);
		ListInstruments.disableListInstrument();
	}
	
	private static void notPlaying() {
		EditorText.ableTextEdition();
		btnReset.setEnabled(true);
		btnOpen.setEnabled(true);
		btnExport.setEnabled(true);
		ListInstruments.ableListInstrument();
	}
}
