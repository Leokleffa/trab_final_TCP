package file;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import gui.components.Screen;

public class ActionListenerOpen implements ActionListener {
	//coloca atributos para receber os argumentos
	private String filePath;
	private String fileContent;
	
	public ActionListenerOpen(String filePath, String fileContent){
		//this.argumentos = argumentos;
		this.filePath = filePath;
		this.fileContent = fileContent;		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Screen.setTextScreen("OPEN FILE!");
	}
	
	
}
