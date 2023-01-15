package Text;

import javax.swing.JEditorPane;

public class Text {
	private int currentPostion;
	private static String textInput;
	private static Boolean textEdition = true;
		
	public int getCurrentPostion() {
		return this.currentPostion;
	}
		
	public int getLengthTotal(String textParsed) {
		return textParsed.length();
	}

	public String getTextInput() { //pega texto da entrada ou arquivo
		return Text.textInput; 
	} 
		
	public static void setTextInput(JEditorPane TextEditor) { //pega texto do arquivo e coloca em text
		Text.textInput = TextEditor.getText(); 
	}
	
	public static void disableTextEdition() {
		Text.textEdition = false;
	}
	
	public static void ableTextEdition() {
		Text.textEdition = true;
	}
	
	public static boolean isTextEdittable() {
		return Text.textEdition;
	}
	
		
}
