package gui.components.buttons;

import javax.swing.JButton;
import actions.ActionListenerStop;

public class Stop extends Buttons{	
	public Stop(String nameBtn, int x, int y, int width, int height){
		super();
		btn = new JButton(nameBtn);
		btn.addActionListener(new ActionListenerStop());
		this.graphics(x,y,width, height);
	}
}
