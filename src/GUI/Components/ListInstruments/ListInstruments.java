package GUI.Components.ListInstruments;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JPanel;

public class ListInstruments {
	public static void initializationListInstruments(JPanel contentPane) {
		JComboBox listInstruments = new JComboBox();
		listInstruments.setModel(new DefaultComboBoxModel(new String[] {"AGOGO", "CHURCHORGAN", "HARPSICHORD", "PANFLUTE", "TUBULARBELLS"}));
		listInstruments.setBounds(301, 86, 117, 24); //301, 97, 117, 24
		contentPane.add(listInstruments);
	}
}
