package file;

import javax.swing.JFileChooser;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Open {
	private String pathFile;
	private String fileContent = "";
	private String pathMaster;

	public void pathFileSelector(){
		JFileChooser chooser = new JFileChooser();
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

	public void copyToMaster() throws IOException {
		FileWriter writer = new FileWriter(this.pathMaster); 
		writer.write(this.fileContent);
		writer.close();
	}

	public String getPathFile() {
		return pathFile;
	}

	public void setPathFile(String pathFile) {
		this.pathFile = pathFile;
	}
	
	public String getFileContent() {
		return fileContent;
	}

	public void setFileContent(String fileContent) {
		this.fileContent = fileContent;
	}

	public String getPathMaster() {
		return pathMaster;
	}

	public void setPathMaster(String pathMaster) {
		this.pathMaster = pathMaster;
	}
}
