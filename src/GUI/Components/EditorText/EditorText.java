package GUI.Components.EditorText;

import javax.swing.JEditorPane;
import javax.swing.JPanel;

import Text.Text;

public class EditorText {
	public static void initializationEditorText(JPanel contentPane) {
		JEditorPane editorText = new JEditorPane();
		editorText.setEnabled(Text.isTextEdittable());
		editorText.setBounds(24, 24, 265, 123);
		contentPane.add(editorText);
	}
}
