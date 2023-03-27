package gui.components.menu;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import actions.ActionListenerExport;
import actions.ActionListenerHelp;
import actions.ActionListenerOpen;
import actions.ActionListenerPlay;
import actions.ActionListenerReset;
import actions.ActionListenerStop;
import actions.ControllerPlayer;
import gui.components.EditorText;
import gui.components.ListInstruments;

public class Menu extends JMenuBar{
	
	JMenu menuActions;
	JMenu menuFile;
	
	MenuItem menuHelp;
	
	MenuItem play;
	MenuItem stop; 
	MenuItem reset;
	MenuItem open;
	MenuItem export;
	
	public Menu() {
		
	}
	
	public Menu(ListInstruments listInstrument, EditorText editorText, ControllerPlayer player) {
		this.add(menuActions = new JMenu("Actions"));
		this.add(menuFile = new JMenu("File"));
		this.add(menuHelp = new MenuItem("Help", new ActionListenerHelp()));		
		
		menuActions.add(play = new MenuItem("PLAY", new ActionListenerPlay(listInstrument, editorText,player)));
		menuActions.add(stop = new MenuItem("STOP", new ActionListenerStop(player)));
		menuActions.add(reset = new MenuItem("RESET", new ActionListenerReset(player)));
		
		menuFile.add(open = new MenuItem("OPEN", new ActionListenerOpen(editorText)));
		menuFile.add(export = new MenuItem("EXPORT", new ActionListenerExport(listInstrument, editorText)));
	}
	
	public void disableMenu() {
		play.setEnabled(false);
		stop.setEnabled(true);
		reset.setEnabled(true);
		open.setEnabled(false);
		export.setEnabled(false);
	}
	
	public void ableMenu() {
		play.setEnabled(true);
		stop.setEnabled(false);
		reset.setEnabled(false);
		open.setEnabled(true);
		export.setEnabled(true);
	}
}
