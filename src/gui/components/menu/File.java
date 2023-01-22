package gui.components.menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import file.*;
import gui.components.Screen;

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
	    menuFileOpen.addActionListener(new ActionListenerOpen());
	}
	
	private static void initializationMenuFileExport(JMenu menuFile) {
		JMenuItem menuFileExport = new JMenuItem("Export");
	    menuFile.add(menuFileExport);
	    menuFileExport.addActionListener(new ActionListenerExport());
	}
}
