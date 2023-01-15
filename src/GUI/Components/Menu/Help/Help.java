package GUI.Components.Menu.Help;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import GUI.Components.Screen.Screen;

public class Help {
	public static void initializationMenuHelp(JMenuBar menuBar){
		JMenuItem menuHelp = new JMenuItem("Help");
		menuBar.add(menuHelp);
	    menuHelp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Screen.setTextScreen("HELP!");
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							MsgHelp frame = new MsgHelp();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
	}
}
