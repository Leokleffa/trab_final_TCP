package file;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

import org.jfugue.midi.MidiFileManager;
import org.jfugue.pattern.Pattern;


public class SaveMIDI {
	
	private Pattern music;
	private String pathFile;

	public void save(){
		JFileChooser chooser = new JFileChooser();
		FileNameExtensionFilter filter = new FileNameExtensionFilter("Arquivo .MIDI", "MIDI");
		
		chooser.setFileFilter(filter);
		chooser.setAcceptAllFileFilterUsed(false);
		chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
		
		if(chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
			File arquivoMIDI = new File(chooser.getSelectedFile().getAbsolutePath() + ".MIDI");
			try {
				MidiFileManager.savePatternToMidi(this.getMusic(), arquivoMIDI);
			}
			catch(IOException err) {
				err.printStackTrace();
			}
		}
	}
		
	public Pattern toPattern(String textContent) {
		Pattern music = new Pattern (textContent);
		return music;
	}
	
	
	public void salvaMIDI(Pattern music) throws IOException {
		
		this.save();
	}

	public Pattern getMusic() {
		return this.music;
	}

	public void setMusic(Pattern music) {							//aqui entra o texto a ser salvo
		this.music = music;
	}

	public String getPathFile() {
		return pathFile;
	}

	public void setFilePath(String pathFile) {
		this.pathFile = pathFile;
	}	
}