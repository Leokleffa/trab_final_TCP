package gui.components;

import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class ProgressBar {
	private static JProgressBar progressBar;
	private static int currentPorcentage = 0;
	
	public static void initializationProgressBar(JPanel contentPane){
		progressBar = new JProgressBar();
		progressBar.setBounds(24, 158, 264, 14);
		progressBar.setStringPainted(true);
		contentPane.add(progressBar);
		progressBar.setValue(0);
	}
	
	private static void updateInfo() {
		progressBar.setValue(currentPorcentage);
        progressBar.setString(currentPorcentage + "%");
	}
	
	public static void resetProgressBar() {
		currentPorcentage = 0;
		updateInfo();
	}
	
	
	public static void updateProgressbar() {
		int soma = 1;
		try {
			if(currentPorcentage >= 0 && currentPorcentage + soma < 100) {
				currentPorcentage += soma;
			}
			else {
				currentPorcentage = 100;
			}
			updateInfo();
	        Thread.sleep(20);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
	}
}
