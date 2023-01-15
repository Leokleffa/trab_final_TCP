package GUI.Components.Menu.Actions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFormattedTextField;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import GUI.Components.ProgessBar.ProgressBar;

public class Actions {
	public static void initializationMenuActions(JMenuBar menuBar, JFormattedTextField screen) {
		JMenu menuActions = new JMenu("Actions");	    
	    menuBar.add(menuActions);
	    
	    JMenuItem menuActionsPlay = new JMenuItem("Play");
	    initializationMenuActionsPlay(menuActions, screen);
	    initializationMenuActionsPause(menuActions, screen);
	    initializationMenuActionsReset(menuActions, screen);
	}
	
	private static void initializationMenuActionsPlay(JMenu menuActions, JFormattedTextField screen) {
		JMenuItem menuActionsPlay = new JMenuItem("Play");
	    menuActions.add(menuActionsPlay);
	    menuActionsPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				screen.setText("PLAY!");
				ProgressBar.updateProgressbar();
			}
		});
	}
	
	private static void initializationMenuActionsPause(JMenu menuActions, JFormattedTextField screen) {
		JMenuItem menuActionsPause = new JMenuItem("Pause");	    
	    menuActions.add(menuActionsPause);
	    menuActionsPause.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				screen.setText("PAUSE!");
			}
		});
	}
	
	private static void initializationMenuActionsReset(JMenu menuActions, JFormattedTextField screen) {
		JMenuItem menuActionsReset = new JMenuItem("Reset");
	    menuActions.add(menuActionsReset);
	    menuActionsReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				screen.setText("RESET!");
			}
		});
	}
}
