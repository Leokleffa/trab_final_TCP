package text;

public class Text {
	private static int currentPosition;
	private static String textInput;
		
	public static int getCurrentPosition() {
		return currentPosition;
	}
	
	public static void setCurrentPosition(int position) {
		currentPosition = position;
	}
		
	public static int getLengthTotal() {
		return textInput.length();
	}
	
	public static int getPorcentageReadText() {
		return Text.getCurrentPosition() / Text.getLengthTotal(); 
	}

	public String getTextInput() { //pega texto da entrada ou arquivo
		return Text.textInput; 
	} 
		
	public static void setTextInput(String text) { //pega texto do arquivo e coloca em text
		textInput = text;
	}		
}
