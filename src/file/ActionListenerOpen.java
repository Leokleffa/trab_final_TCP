package file;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import gui.components.Screen;

public class ActionListenerOpen implements ActionListener {
	//coloca atributos para receber os argumentos

	private String fileContent;
	
	public ActionListenerOpen(String fileContent){
		//this.argumentos = argumentos;
		this.fileContent = fileContent;		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Screen.setTextScreen("OPEN FILE!");
	}
	
	
	public String pickContent(){
		open = new open();
		
		open.pathFileSelector();
		open.scanfile();
		
		this.fileContent = open.getFileContent();
		
		return this.fileContent;
	}
	
}
