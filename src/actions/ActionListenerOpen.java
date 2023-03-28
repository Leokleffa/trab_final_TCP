package actions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

import gui.components.EditorText;
import gui.components.Screen;
	
public class ActionListenerOpen implements ActionListener {
	private EditorText editorText;
	private String fileContent = "";
	private String pathFile;

	public ActionListenerOpen() {

	}
	
	public ActionListenerOpen(EditorText editorText) {
		this.editorText = editorText;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		editorText.setText("");
		Screen.setText("OPEN FILE!");
		try {
			pickContent();
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		editorText.setText(this.fileContent);		
	}
	
	public void pickContent() throws FileNotFoundException{
		this.fileContent = "";
		this.editorText.setText("");
		this.pathFileSelector();
		this.scanFile();
		this.fileContent = this.getFileContent();
	}
	
	public void pathFileSelector(){
		JFileChooser chooser = new JFileChooser();
		FileNameExtensionFilter filter = new FileNameExtensionFilter("Arquivo.txt", "txt");
		
		chooser.setFileFilter(filter);
		chooser.setAcceptAllFileFilterUsed(false);
		chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
		
		chooser.showOpenDialog(null);
		File f = chooser.getSelectedFile();
		if(f != null) {
			String filename = f.getAbsolutePath();
			this.pathFile = filename;
		}
	}
	
	public void scanFile() throws FileNotFoundException {
		if(this.pathFile != null) {
			File file = new File(this.pathFile);
			Scanner scan = new Scanner(file);
			while(scan.hasNextLine()) {
				this.fileContent = fileContent.concat(scan.nextLine() + "\n");
			}
			scan.close();
		}
	}
	
	public String getFileContent() {
		return fileContent;
	}
}