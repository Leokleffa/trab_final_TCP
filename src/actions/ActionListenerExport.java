package actions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.jfugue.midi.MidiFileManager;
import org.jfugue.pattern.Pattern;

import Music.Music;
import Parser.Parser;
import gui.components.EditorText;
import gui.components.ListInstruments;
import gui.components.Screen;

public class ActionListenerExport implements ActionListener {
	private Pattern pattern;
	private Parser parser;
	private Music music = new Music();
	private ListInstruments listInstrument;
	private EditorText editorText;
	
	public ActionListenerExport(ListInstruments listInstrument, EditorText editorText) {
		this.parser = new Parser();
		this.editorText = editorText;
		this.listInstrument = listInstrument;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		music.setInstrument(listInstrument.getInstrument());
		parser.setMusicProperties(music);
		parser.setText(editorText.getText()); 
		parser.convTextToMusic();
		
		this.setPattern(parser.getMusic());
		
		try {
			this.saveMIDI(this.getPattern());
		} 
		catch (IOException e1) {
			e1.printStackTrace();
		}
		 
		Screen.setText("EXPORT FILE!");
	}
	
	public void save(){
		JFileChooser chooser = new JFileChooser();
		FileNameExtensionFilter filter = new FileNameExtensionFilter("Arquivo.MIDI", "MIDI");
		
		chooser.setFileFilter(filter);
		chooser.setAcceptAllFileFilterUsed(false);
		chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
		
		if(chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
			File arquivoMIDI = new File(chooser.getSelectedFile().getAbsolutePath() + ".MIDI");
			try {
				MidiFileManager.savePatternToMidi(this.getPattern(), arquivoMIDI);
			}
			catch(IOException err) {
				err.printStackTrace();
			}
		}
	}
	
	public void saveMIDI(Pattern music) throws IOException {
		this.save();
	}

	public Pattern getPattern() {
		return this.pattern;
	}
	
	public void setPattern(Pattern music) {						
		this.pattern = music;
	}
	
}
