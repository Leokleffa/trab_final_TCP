package file;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import gui.components.Screen;

public class ActionListenerExport implements ActionListener {
	//coloca atributos para receber os argumentos
	
	public ActionListenerExport(/*Argumentos do EXPORT*/){
		//this.argumentos = argumentos;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Screen.setTextScreen("EXPORT FILE!");
	}
}
