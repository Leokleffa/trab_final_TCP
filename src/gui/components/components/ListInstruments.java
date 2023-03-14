package gui.components;

import java.awt.event.ItemEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JPanel;

public class ListInstruments {
	private static JComboBox<String> listInstruments = new JComboBox<>();
	private static String item = "";
	
	public static void initializationListInstruments(JPanel contentPane) {
		
		listInstruments.addItem("AGOGO");
		listInstruments.addItem("CHURCHORGAN");
		listInstruments.addItem("HARPSICHORD");
		listInstruments.addItem("PANFLUTE"); 
		listInstruments.addItem("TUBULARBELLS"); 
		listInstruments.setBounds(301, 97, 117, 24);
		listInstruments.addItemListener(e -> selectItem(e));
		contentPane.add(listInstruments);
	}
	
	public static void disableListInstrument() {
		listInstruments.setEnabled(false);
	}
	
	public static void ableListInstrument() {
		listInstruments.setEnabled(true);
	}
	private static void selectItem(ItemEvent e){
	if(e.getStateChange() == ItemEvent.SELECTED){
		item = (String) e.getItem();
		Screen.setTextScreen(item);}
	}
	
	public static String getItem() {
		return item;
	}
}