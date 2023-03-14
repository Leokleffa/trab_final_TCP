package actions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import gui.Gui;
import gui.components.ProgressBar;
import gui.components.Screen;

public class ActionListenerReset implements ActionListener {
	//coloca atributos para receber os argumentos
	
	public ActionListenerReset(/*Argumentos do RESET*/){
		//this.argumentos = argumentos;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		ProgressBar.resetProgressBar();
		Screen.setTextScreen("RESET!");
	}
}
