package gui.components.buttons;

import javax.swing.JButton;
import file.ActionListenerOpen;
import gui.components.EditorText;

public class Open extends Buttons{
	public Open(String nameBtn, int x, int y, int width, int height){
		super();
		btn = new JButton(nameBtn);
		btn.addActionListener(new ActionListenerOpen(EditorText.getTextEditorPane()));
		this.graphics(x,y,width, height);
	}
}