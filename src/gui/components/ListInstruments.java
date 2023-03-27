package gui.components;

import java.awt.event.ItemEvent;
import javax.swing.JComboBox;
import javax.swing.JPanel;

import Music.Instruments;

public class ListInstruments extends JComboBox<String> {
	private static Instruments instrument = Instruments.Agogo;
	private static String name_item = "";
	
	public ListInstruments () {
		
	}

	public ListInstruments(JPanel contentPane) {
		this.addItem(Instruments.Agogo.name());
		this.addItem(Instruments.ChurchOrgan.name());
		this.addItem(Instruments.Harpsichord.name());
		this.addItem(Instruments.PanFlute.name()); 
		this.addItem(Instruments.TubularBells.name()); 
		this.setBounds(301, 97, 117, 24);
		this.addItemListener(e -> selectItem(e));
		contentPane.add(this);
	}
	
	public void disableListInstrument() {
		this.setEnabled(false);
	}
	
	public void ableListInstrument() {
		this.setEnabled(true);
	}
	
	private void selectItem(ItemEvent e){
		if(e.getStateChange() == ItemEvent.SELECTED){
			name_item = (String)e.getItem();
			instrument = Instruments.valueOf((String) this.getSelectedItem());
			Screen.setText(name_item);
		}
	}
	
	public String getItem() {
		return name_item;
	}
	
	public Instruments getInstrument() {
		return instrument;
	}
}