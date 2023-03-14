package gui.components;

import java.awt.Component;
import java.awt.Rectangle;
import javax.swing.GroupLayout;
import javax.swing.JEditorPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.GroupLayout.Alignment;

public class EditorText {
	private static JEditorPane editorText = new JEditorPane();
	private static Boolean textEdition;
	
	
	public static void initializationEditorText(JPanel contentPane) {
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(new Rectangle(24, 12, 265, 129));
		scrollPane.setAlignmentY(Component.TOP_ALIGNMENT);
		scrollPane.setAlignmentX(Component.RIGHT_ALIGNMENT);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		GroupLayout gl_panel = new GroupLayout(contentPane);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
						.addGap(20)
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 265, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(265, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
						.addGap(10)
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(129, Short.MAX_VALUE))
		);
		
		scrollPane.setViewportView(editorText);
		contentPane.setLayout(gl_panel);
		EditorText.ableTextEdition();	
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
