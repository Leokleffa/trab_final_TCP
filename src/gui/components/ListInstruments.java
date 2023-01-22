package gui.components;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JPanel;

public class ListInstruments {
	private static JComboBox listInstruments = new JComboBox();
	
	public static void initializationListInstruments(JPanel contentPane) {
		
		listInstruments.setModel(new DefaultComboBoxModel(new String[] {"AGOGO", "CHURCHORGAN", "HARPSICHORD", "PANFLUTE", "TUBULARBELLS"}));
		listInstruments.setBounds(301, 86, 117, 24); //301, 97, 117, 24
		contentPane.add(listInstruments);
	}
	
	public static void disableListInstrument() {
		listInstruments.setEnabled(false);
	}
	
	public static void ableListInstrument() {
		listInstruments.setEnabled(true);
	}
}
