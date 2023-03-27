package actions;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import gui.components.Screen;
import gui.components.menu.MsgHelp;

public class ActionListenerHelp implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		Screen.setText("HELP!");
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MsgHelp frame = new MsgHelp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
