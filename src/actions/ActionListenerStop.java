package actions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import gui.Gui;
import gui.components.Screen;

public class ActionListenerStop implements ActionListener {
	private ControllerPlayer player;
	
	public ActionListenerStop(){

	}
	
	public ActionListenerStop(ControllerPlayer player){
		this.player = player;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Screen.setText("STOP!");
		Gui.notPlaying();
		player.stopSound();
	}
}
