package GUI.Components.Menu.Actions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import GUI.Components.ProgessBar.ProgressBar;
import GUI.Components.Screen.Screen;

public class Actions {
	public static void initializationMenuActions(JMenuBar menuBar) {
		JMenu menuActions = new JMenu("Actions");	    
	    menuBar.add(menuActions);
	    
	    initializationMenuActionsPlay(menuActions);
	    initializationMenuActionsPause(menuActions);
	    initializationMenuActionsReset(menuActions);
	}
	
	private static void initializationMenuActionsPlay(JMenu menuActions) {
		JMenuItem menuActionsPlay = new JMenuItem("Play");
	    menuActions.add(menuActionsPlay);
	    menuActionsPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Screen.setTextScreen("PLAY!");
				ProgressBar.updateProgressbar();
			}
		});
	}
	
	private static void initializationMenuActionsPause(JMenu menuActions) {
		JMenuItem menuActionsPause = new JMenuItem("Pause");	    
	    menuActions.add(menuActionsPause);
	    menuActionsPause.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Screen.setTextScreen("PAUSE!");
			}
		});
	}
	
	private static void initializationMenuActionsReset(JMenu menuActions) {
		JMenuItem menuActionsReset = new JMenuItem("Reset");
	    menuActions.add(menuActionsReset);
	    menuActionsReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Screen.setTextScreen("RESET!");
			}
		});
	}
}
