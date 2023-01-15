package GUI.Components.Bottons;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JPanel;

import GUI.Components.ProgessBar.ProgressBar;

public  class Bottons {	
	
	public static void initializationBottons(JPanel contentPane, JFormattedTextField screen){
		contentPane.add(initializationBtnPlay(screen));
		contentPane.add(initializationBtnPause(screen));
		contentPane.add(initializationBtnReset(screen));
		contentPane.add(initializationBtnOpen(screen));
		contentPane.add(initializationBtnExport(screen));
	}
	
	private static JButton initializationBtnPlay(JFormattedTextField screen) {
		JButton btnPlay = new JButton("PLAY");
		btnPlay.setFont(new Font("Dialog", Font.BOLD, 10));
		btnPlay.setBounds(24, 189, 75, 62);
		btnPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				screen.setText("PLAY!");
				ProgressBar.updateProgressbar();
			}
		});
		return btnPlay;
	}
	
	private static JButton initializationBtnPause(JFormattedTextField screen) {
		JButton btnPause = new JButton("PAUSE");
		btnPause.setFont(new Font("Dialog", Font.BOLD, 10));
		btnPause.setBounds(111, 189, 81, 62);
		btnPause.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				screen.setText("PAUSE!");
			}
		});
		return btnPause;
	}
	
	private static JButton initializationBtnReset(JFormattedTextField screen) {
		JButton btnReset = new JButton("RESET");
		btnReset.setFont(new Font("Dialog", Font.BOLD, 10));
		btnReset.setBounds(204, 189, 81, 62);
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				screen.setText("RESET!");
			}
		});
		return btnReset;
	}
	private static JButton initializationBtnOpen(JFormattedTextField screen) {
		JButton btnOpen = new JButton("OPEN");
		btnOpen.setBounds(301, 12, 117, 25);
		btnOpen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				screen.setText("OPEN FILE!");
			}
		});
		return btnOpen;
	}
	
	private static JButton initializationBtnExport(JFormattedTextField screen) {
		JButton btnExport = new JButton("EXPORT");
		btnExport.setBounds(301, 49, 117, 25);
		btnExport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				screen.setText("EXPORT FILE!");
			}
		});
		return btnExport;
	}
}
