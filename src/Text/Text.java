package Text;

import javax.swing.JEditorPane;

public class Text {
	private int currentPostion;
	private static String textInput;
		
	public int getCurrentPostion() {
		return this.currentPostion;
	}
		
	public int getLengthTotal(String textParsed) {
		return textParsed.length();
	}

	public String getTextInput() { //pega texto da entrada ou arquivo
		return Text.textInput; 
	} 
		
	public static void setTextInput() { //pega texto do arquivo e coloca em text
		
	}		
}
