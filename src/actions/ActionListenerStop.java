package actions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import gui.Gui;
import gui.components.Screen;

public class ActionListenerStop implements ActionListener {
	//coloca atributos para receber os argumentos
	
	public ActionListenerStop(/*Argumentos do STOP*/){
		//this.argumentos = argumentos;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Screen.setTextScreen("STOP!");
		Gui.notPlaying();
	}
}
