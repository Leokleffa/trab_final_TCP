package GUI.Components.Menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFormattedTextField;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import GUI.Components.Menu.Actions.Actions;
import GUI.Components.Menu.File.File;
import GUI.Components.Menu.Help.Help;
import GUI.Components.ProgessBar.ProgressBar;

public class Menu {
	
	public static JMenuBar initializationTopMenu() {
		JMenuBar menuBar = new JMenuBar();
		//File.initializationMenuFile(menuBar);
	    //Actions.initializationMenuActions(menuBar);
	    Help.initializationMenuHelp(menuBar);	    
	    return menuBar;
	}
}
