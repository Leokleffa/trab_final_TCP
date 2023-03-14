package gui.components.buttons;

import javax.swing.JButton;
import file.ActionListenerExport;

public class Export extends Buttons{
	public Export(String nameBtn, int x, int y, int width, int height){
		super();
		btn = new JButton(nameBtn);
		btn.addActionListener(new ActionListenerExport());
		this.graphics(x,y,width, height);
	}
}