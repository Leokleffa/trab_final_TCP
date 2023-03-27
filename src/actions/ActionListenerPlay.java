package actions;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import Music.Music;
import Parser.Parser;
import gui.components.EditorText;
import gui.components.ListInstruments;
import gui.components.Screen;

public class ActionListenerPlay extends Thread implements ActionListener {
	private Parser parser;
	private Music music = new Music();
	private ControllerPlayer player;
	private ListInstruments listInstrument;
	private EditorText editorText;
	
	public ActionListenerPlay(){
		
	}
	
	public ActionListenerPlay(ListInstruments listInstrument, EditorText editorText, ControllerPlayer player) {
		this.parser = new Parser();
		this.player = player; 
		this.editorText = editorText;
		this.listInstrument = listInstrument;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Screen.setText("PLAY!");
		
		music.setInstrument(listInstrument.getInstrument());
		parser.setMusicProperties(music);
		parser.setText(editorText.getText()); 
		parser.convTextToMusic();
				
		player.playSound(parser.getMusic());
	} 
	
}	