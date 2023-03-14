package gui.components.buttons;

import javax.swing.JButton;
import actions.ActionListenerPlay;

public class Play extends Buttons{
	public Play(String nameBtn, int x, int y, int width, int height){
		super();
		btn = new JButton(nameBtn);
		btn.addActionListener(new ActionListenerPlay());
		this.graphics(x,y,width, height);
	}
}
