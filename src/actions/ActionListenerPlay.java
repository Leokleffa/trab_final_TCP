package actions;

import java.awt.event.ActionEvent;
import gui.Gui;
import java.awt.event.ActionListener;

import org.jfugue.player.Player;

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
		EditorText.setTextEditorPane("Oi, meu chapa!\nTudo bem?\n");
		Screen.setTextScreen("PLAY!");
		ProgressBar.updateProgressbar();
		//depois de acabar
		//Bottons.notPlaying(); //colocar qnd Play estiver pronta
		
		//Aqui esta a logica do play, nao consegui fazer rodar ele na classe play
        //deve chamar Play.java aqui, la faz a magia do play acontecer
		Player player = new Player();
		Gui.protectPlay();
        String music = "C4q D4q E4q A4q B4q C4q";
        player.play(music);
        player.play("A A A A a a a a D E F G A B");
	} 
	
}	
