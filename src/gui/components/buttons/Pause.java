package gui.components.buttons;

import javax.swing.JButton;
import actions.ActionListenerPause;

public class Pause extends Buttons{	
	public Pause(String nameBtn, int x, int y, int width, int height){
		super();
		btn = new JButton(nameBtn);
		btn.addActionListener(new ActionListenerPause());
		this.graphics(x,y,width, height);
	}
}
