package actions;

import java.awt.event.ActionEvent;
import gui.Gui;
import java.awt.event.ActionListener;
import gui.components.EditorText;
import gui.components.ProgressBar;
import gui.components.Screen;

public class ActionListenerPlay implements ActionListener {
	//coloca atributos para receber os argumentos
	
	public ActionListenerPlay(/*Argumentos do PLAY*/){
		//this.argumentos = argumentos;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Gui.protectPlay();
		EditorText.setTextEditorPane("Oi, meu chapa!\nTudo bem?\n");
		Screen.setTextScreen("PLAY!");
		ProgressBar.updateProgressbar();
		//depois de acabar
		//Bottons.notPlaying(); //colocar qnd Play estiver pronta
	} 
	
}	
