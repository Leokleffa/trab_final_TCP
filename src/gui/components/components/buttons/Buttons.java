package gui.components.buttons;

import java.awt.Font;
import javax.swing.JButton;

public  class Buttons {	
	protected JButton btn;
	
	public Buttons() {
		
	}
	
	protected void graphics(int x, int y, int width, int height) {
		btn.setFont(new Font("Dialog", Font.BOLD, 10));
		btn.setBounds(x,y,width, height);
	}
	
	public JButton inicializaBtn() {
		return this.btn;
	}
	
	public void setEnabled() {
		this.btn.setEnabled(true);
	}
	
	public void setDisabled() {
		this.btn.setEnabled(false);
	}
	
}
