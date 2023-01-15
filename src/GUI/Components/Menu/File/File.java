package GUI.Components.Menu.File;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFormattedTextField;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import GUI.Components.Screen.Screen;

public class File {
	public static void initializationMenuFile(JMenuBar menuBar) {
		JMenu menuFile = new JMenu("File");
	    menuBar.add(menuFile);
	   
	    initializationMenuFileOpen(menuFile);
	    initializationMenuFileExport(menuFile);
	  
	}
	private static void initializationMenuFileOpen(JMenu menuFile) {
		JMenuItem menuFileOpen = new JMenuItem("Open");
	    menuFile.add(menuFileOpen);
	    menuFileOpen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Screen.setTextScreen("OPEN!");
			}
		});
	}
	
	private static void initializationMenuFileExport(JMenu menuFile) {
		JMenuItem menuFileExport = new JMenuItem("Export");
	    menuFile.add(menuFileExport);
	    menuFileExport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Screen.setTextScreen("EXPORT");
			}
		});
	}
}
