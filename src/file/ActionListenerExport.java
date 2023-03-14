package file;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import gui.components.EditorText;
import gui.components.Screen;

public class ActionListenerExport implements ActionListener {
	SaveMIDI handleMidi = new SaveMIDI();
	// coloca atributos para receber os argumentos

	public ActionListenerExport(/* Argumentos do EXPORT */) {
		// this.argumentos = argumentos;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		/*
		 * try { handleMidi.salvaMIDI(PATTERN AQUI); } catch (IOException e1) { // TODO
		 * Auto-generated catch block e1.printStackTrace(); }
		 */
		Screen.setTextScreen("EXPORT FILE!");
	}
}
