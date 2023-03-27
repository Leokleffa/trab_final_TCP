package gui.components.menu;

import java.awt.event.ActionListener;
import javax.swing.JMenuItem;

public class MenuItem extends JMenuItem{

	public MenuItem(String name, ActionListener l){
		this.setText(name);
		this.addActionListener(l);
	}
}
