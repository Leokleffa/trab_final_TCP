package gui.components.menu;

import javax.swing.JMenuBar;

public class Menu {
	
	public static JMenuBar initializationTopMenu() {
		JMenuBar menuBar = new JMenuBar();
		File.initializationMenuFile(menuBar);
	    Actions.initializationMenuActions(menuBar);
	    Help.initializationMenuHelp(menuBar);	    
	    return menuBar;
	}
}
