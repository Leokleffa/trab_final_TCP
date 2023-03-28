package actions;

import org.jfugue.pattern.Pattern;
import org.jfugue.player.Player;
import gui.Gui;

public class ControllerPlayer implements Runnable {
    private Pattern pattern;
    private Thread threadPlayer;
    private Player player = new Player();
    
    public ControllerPlayer(){

    }
    
    // funcao de thread para tocar em paralelo
    @Override
    public void run() {
    	Gui.protectPlay();
    	player.play(pattern);
    	Gui.notPlaying();
    }
    
    public void playSound(Pattern pattern) {
    	this.pattern = pattern;
    	threadPlayer = new Thread(this);
        threadPlayer.start();
    }
    
	public void stopSound() {
		player.play("");
		//player.getManagedPlayer().pause();
	}

	public void resetSound() {
		this.stopSound();
		this.playSound(pattern);
	}
}
