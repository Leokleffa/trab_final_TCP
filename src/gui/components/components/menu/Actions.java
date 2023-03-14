package gui.components.menu;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import actions.ActionListenerStop;
import actions.ActionListenerPlay;
import actions.ActionListenerReset;

public class Actions {
	public static void initializationMenuActions(JMenuBar menuBar) {
		JMenu menuActions = new JMenu("Actions");	    
	    menuBar.add(menuActions);
	    
	    initializationMenuActionsPlay(menuActions);
	    initializationMenuActionsStop(menuActions);
	    initializationMenuActionsReset(menuActions);
	}
	
	private static void initializationMenuActionsPlay(JMenu menuActions) {
		JMenuItem menuActionsPlay = new JMenuItem("Play");
	    menuActions.add(menuActionsPlay);
	    menuActionsPlay.addActionListener(new ActionListenerPlay());
	}
	
	private static void initializationMenuActionsStop(JMenu menuActions) {
		JMenuItem menuActionsPause = new JMenuItem("Stop");	    
	    menuActions.add(menuActionsPause);
	    menuActionsPause.addActionListener(new ActionListenerStop());
	}
	
	private static void initializationMenuActionsReset(JMenu menuActions) {
		JMenuItem menuActionsReset = new JMenuItem("Reset");
	    menuActions.add(menuActionsReset);
	    menuActionsReset.addActionListener(new ActionListenerReset());
	}
}
