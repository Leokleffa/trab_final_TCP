package Music;

public class Music {
	
	public static final int DefaultOctave = 5;
	public static final int MinOctave = 1;
	public static final int MaxOctave = 10;
	
	public static final String DefaultDuration = "q";
	
	public static final int DefaultVolume = 63;
	public static final int MinVolume = 0;
	public static final int MaxVolume = 127;
	
	public static final Instruments DefaultInstrument = Instruments.AcousticGrandPiano;
	
	private int octave;
	private String duration;
	private int volume;
	private Instruments instrument;
	
	public Music(){	
		this.setOctave(DefaultOctave);
		this.setDuration(DefaultDuration);
		this.setVolume(DefaultVolume);
		this.setInstrument(DefaultInstrument);
	}
	
	public Music(int newOctave, String newDuration, int newVolume, Instruments newInstrument){
		this.setOctave(newOctave);
		this.setDuration(newDuration);
		this.setVolume(newVolume);
		this.setInstrument(newInstrument);
	}
	
	public Music(int newOctave, String newDuration, int newVolume, int newInstrumentMIDI_num){
		this.setOctave(newOctave);
		this.setDuration(newDuration);
		this.setVolume(newVolume);
		this.setInstrument(newInstrumentMIDI_num);
	}
	
	public void setOctave(int newOctave) {
		if((newOctave >= MinOctave) && (newOctave <= MaxOctave)) {
			this.octave = newOctave;
		}
	}
	
	public int getOctave() {
		return this.octave;
	}
	
	public void setDuration(String newDuration) {
		this.duration = newDuration;
	}
	
	public String getDuration() {
		return this.duration;
	}
	
 	public void setVolume(int newVolume) {
 		if((newVolume >= MinVolume) && (newVolume <= MaxVolume)) {
 			this.volume = newVolume;
 		}
 	}
 	
 	public int getVolume() {
 		return this.volume;
 	}
 	
 	public void setInstrument(Instruments newInstrument) {
 		this.instrument = newInstrument;
 	}
 	
 	public void setInstrument(int newInstrumentMIDI_num) {
 		this.instrument = Instruments.values()[newInstrumentMIDI_num - 1];
 	}
 	
 	public Instruments getInstrument() {
 		return this.instrument;
 	}
 	
}
