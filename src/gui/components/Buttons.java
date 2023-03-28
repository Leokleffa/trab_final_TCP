package gui.components;

import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public  class Buttons  extends JButton{	

	public Buttons() {
		
	}
	
	public Buttons(String nameBtn, int x, int y, int width, int height, ActionListener l) {
		this.addActionListener(l);	
		this.graphics(x,y,width, height);
		this.setText(nameBtn);	
	}
	
	protected void graphics(int x, int y, int width, int height) {
		this.setFont(new Font("Dialog", Font.BOLD, 10));
		this.setBounds(x,y,width, height);
	}
	
	public void setEnabled() {
		this.setEnabled(true);
	}
	
	public void setDisabled() {
		this.setEnabled(false);
	}
	
}
