package GUI.Components.Screen;

import javax.swing.JFormattedTextField;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Screen {
	private static JFormattedTextField screen = new JFormattedTextField();;
	
	public static void initializationScreen(JPanel contentPane) {
		screen.setHorizontalAlignment(SwingConstants.CENTER);
		screen.setEditable(false);
		screen.setBounds(301, 178, 117, 73);
		contentPane.add(screen);
	}
	
	public static void setTextScreen(String text) {
		screen.setText(text);
	}	
	
}
