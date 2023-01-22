package actions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import gui.Gui;
import gui.components.Screen;

public class ActionListenerPause implements ActionListener {
	//coloca atributos para receber os argumentos
	
	public ActionListenerPause(/*Argumentos do PAUSE*/){
		//this.argumentos = argumentos;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Screen.setTextScreen("PAUSE!");
		Gui.notPlaying();
	}
}
