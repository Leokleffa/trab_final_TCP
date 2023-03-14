package file;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;

import gui.components.EditorText;
import gui.components.Screen;

public class ActionListenerOpen implements ActionListener {
	private String fileContent;
	
	public ActionListenerOpen(String fileContent){
		this.fileContent = fileContent;		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Screen.setTextScreen("OPEN FILE!");
		try {
			pickContent();
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		EditorText.setTextEditorPane(this.fileContent);		
	}
	
	public void pickContent() throws FileNotFoundException{
		Open open = new Open();

		open.pathFileSelector();
		open.scanFile();
		this.fileContent = open.getFileContent();
	}
	
}