package GUI.Components.Menu.Help;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFormattedTextField;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Help {
	public static void initializationMenuHelp(JMenuBar menuBar, JFormattedTextField screen){
		JMenuItem menuHelp = new JMenuItem("Help");
	    menuBar.add(menuHelp);
	    menuHelp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				screen.setText("HELP!");
			}
		});
	}
}
