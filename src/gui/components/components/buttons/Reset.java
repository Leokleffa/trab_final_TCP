package gui.components.buttons;

import javax.swing.JButton;
import actions.ActionListenerReset;

public class Reset extends Buttons{	
	public Reset(String nameBtn, int x, int y, int width, int height){
		super();
		btn = new JButton(nameBtn);
		btn.addActionListener(new ActionListenerReset());
		this.graphics(x,y,width, height);
	}
}