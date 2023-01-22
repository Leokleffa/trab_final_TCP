package gui.components;

import javax.swing.JEditorPane;
import javax.swing.JPanel;

public class EditorText {
	private static JEditorPane editorText = new JEditorPane();
	private static Boolean textEdition;
	
	public static void initializationEditorText(JPanel contentPane) {
		EditorText.ableTextEdition();
		editorText.setBounds(24, 12, 265, 129);
		contentPane.add(editorText);
	}
	
	public static void setTextEditorPane(String text) {
		editorText.setText(text);
	}
	
	public static String getTextEditorPane() {
		return editorText.getText();
	}
	
	public static void disableTextEdition() {
		textEdition = false;		
		editorText.setEnabled(textEdition);
	}
	
	public static void ableTextEdition() {
		textEdition = true;
		editorText.setEnabled(textEdition);
	}
	
	public static boolean isTextEdittable() {
		return textEdition;
	}
}
