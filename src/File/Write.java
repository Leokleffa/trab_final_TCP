package File;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Write {

	private String textContent;
	private String filePath;

	
	public void writeText() throws IOException{
		Path fileName = Path.of(this.filePath);
		
		Files.writeString(fileName, this.textContent);
	}


	public String getTextContent() {
		return textContent;
	}


	public void setTextContent(String textContent) {
		this.textContent = textContent;
	}


	public String getFilePath() {
		return filePath;
	}


	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	
	
}
