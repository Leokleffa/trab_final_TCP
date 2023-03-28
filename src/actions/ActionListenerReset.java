package actions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import gui.components.Screen;

public class ActionListenerReset implements ActionListener {
	private ControllerPlayer player;
	
	public ActionListenerReset(ControllerPlayer player){
		this.player = player;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Screen.setText("RESET!");
		player.resetSound();
	}
}
