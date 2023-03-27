package Parser;

import Music.Music;
import Music.Instruments;
import java.text.*;
import org.jfugue.pattern.*;
import java.lang.Integer;

public class Parser implements Runnable {
	
	private String text;
	
	public Music musicProperties;
	private Pattern musicPattern = new Pattern();
	
	public Parser() {
		this.text = "";
	}
	
	public Parser(Music newMusicProperties) {
		this.musicProperties = newMusicProperties;
		this.text = "";
	}
	
	public Parser(String text) {
		this.text = text;
	}
	
	public Parser(Music newMusicProperties, String text) {
		this.musicProperties = newMusicProperties;
		this.text = text;
	}
	
	//Sets text directly
	public void setText(String text) {
		this.text = text;
	}
	
	//Gets text from parser buffer
	public String getText() {
		return this.text;
	}
	
	public void setMusicProperties(Music newMusicProperties) {
		this.musicProperties = newMusicProperties;
	}
	
	public Music getMusicProperties() {
		return this.musicProperties;
	}
	
	//Gets musicPattern from parser buffer
	public Pattern getMusic() {
		return this.musicPattern;
	}
	
	private void setInstrument(Instruments newInstrument) {
		this.musicProperties.setInstrument(newInstrument);
		this.musicPattern.add("I" + (this.musicProperties.getInstrument().getMIDI_num() - 1));
	}
	
	private void setInstrument(int newInstrumentMIDI_num) {
		this.musicProperties.setInstrument(newInstrumentMIDI_num);
		this.musicPattern.add("I" + (this.musicProperties.getInstrument().getMIDI_num() - 1));
	}
	
	private void setVolume(int newVolume) {
		this.musicProperties.setVolume(newVolume);
		this.musicPattern.add(":CON(7," + Integer.toString(this.musicProperties.getVolume()) + ")");
	}
	
	private void initPattern() {
		this.setVolume(this.musicProperties.getVolume());
		this.setInstrument(this.musicProperties.getInstrument());
	}
	
	public void convTextToMusic() {
		this.musicPattern.clear();
		this.initPattern();

		CharacterIterator textPointer = new StringCharacterIterator(this.text);
		
		while(textPointer.current() != CharacterIterator.DONE) {
			char curChar = textPointer.current();
			
			if(Character.isDigit(curChar)) {
				int value = Character.getNumericValue(curChar);
				int newInstrumentMIDI_num;
				
				newInstrumentMIDI_num = this.musicProperties.getInstrument().getMIDI_num() + value;
				if(newInstrumentMIDI_num > 128) {
					newInstrumentMIDI_num = newInstrumentMIDI_num - 128;
				}
				
				this.setInstrument(newInstrumentMIDI_num);
			}
			else {
				switch(curChar) {
				case 'A','B','C','D','E','F','G':
					this.musicPattern.add(curChar + Integer.toString(this.musicProperties.getOctave()) + this.musicProperties.getDuration());
					break;
				case ' ':
					int newVolume = 2 * this.musicProperties.getVolume();
					
					if(newVolume > Music.MaxVolume) {	//Mudar para constantes!
						newVolume = Music.DefaultVolume;
					}
					this.setVolume(newVolume);
					break;
				case '!':
					this.setInstrument(Instruments.Agogo);
					break;
				case 'I','i','O','o','U','u':
					this.setInstrument(Instruments.Harpsichord);
					break;
				case '?':
					int newOctave = this.musicProperties.getOctave() + 1;
					
					if(newOctave > Music.MaxOctave) {
						newOctave = Music.DefaultOctave;
					}
					this.musicProperties.setOctave(newOctave);
					break;
				case '\n':
					this.setInstrument(Instruments.TubularBells);
					break;
				case ';':
					this.setInstrument(Instruments.PanFlute);
					break;
				case ',':
					this.setInstrument(Instruments.ChurchOrgan);
					break;
				default:
					char prevChar = textPointer.previous();	
					switch(prevChar) {
					case 'A','B','C','D','E','F','G':
						this.musicPattern.add(prevChar + Integer.toString(this.musicProperties.getOctave()) + this.musicProperties.getDuration());
						break;
					default:
						this.musicPattern.add("R" + Integer.toString(this.musicProperties.getOctave()) + this.musicProperties.getDuration());
						break;
					}
					textPointer.next();
					break;
				}
			}
			
			textPointer.next();
		}
	}
	
	@Override
	public void run() {
		this.convTextToMusic();
	}
}
