package GUI;
import javax.swing.JFrame;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import GUI.Components.Bottons.Bottons;
import GUI.Components.EditorText.EditorText;
import GUI.Components.ListInstruments.ListInstruments;
import GUI.Components.Menu.Menu;
import GUI.Components.ProgessBar.ProgressBar;
import GUI.Components.Screen.Screen;
import javax.swing.JFormattedTextField;


public class Gui extends JFrame {

	private JPanel contentPane;
	
	public Gui() throws InterruptedException {
		
		super.setTitle("Gerador de Música a partir de Texto");
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.setBounds(100, 100, 450, 314);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		super.setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JFormattedTextField screen = new JFormattedTextField();
		Screen.initializationScreen(contentPane, screen);
		ListInstruments.initializationListInstruments((contentPane));
		Bottons.initializationBottons(contentPane, screen);
		ProgressBar.initializationProgressBar(contentPane);
		super.setJMenuBar(Menu.initializationTopMenu(screen));
		EditorText.initializationEditorText(contentPane);
	}
	
}
