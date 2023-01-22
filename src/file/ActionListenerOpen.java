package file;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import gui.components.Screen;

public class ActionListenerOpen implements ActionListener {
	//coloca atributos para receber os argumentos
	
	public ActionListenerOpen(/*Argumentos do OPEN*/){
		//this.argumentos = argumentos;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Screen.setTextScreen("OPEN FILE!");
	}
}
