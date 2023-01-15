package GUI.Components.Menu.File;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFormattedTextField;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class File {
	public static void initializationMenuFile(JMenuBar menuBar, JFormattedTextField screen) {
		JMenu menuFile = new JMenu("File");
	    menuBar.add(menuFile);
	   
	    initializationMenuFileOpen(menuFile, screen);
	    initializationMenuFileExport(menuFile, screen);
	  
	}
	private static void initializationMenuFileOpen(JMenu menuFile, JFormattedTextField screen) {
		JMenuItem menuFileOpen = new JMenuItem("Open");
	    menuFile.add(menuFileOpen);
	    menuFileOpen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				screen.setText("OPEN!");
			}
		});
	}
	
	private static void initializationMenuFileExport(JMenu menuFile, JFormattedTextField screen) {
		JMenuItem menuFileExport = new JMenuItem("Export");
	    menuFile.add(menuFileExport);
	    menuFileExport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				screen.setText("EXPORT");
			}
		});
	}
}
