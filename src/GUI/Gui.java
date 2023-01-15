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


public class Gui extends JFrame {

	private JPanel contentPane;
	
	public Gui(){
		contentPane = new JPanel();
		
		super.setTitle("Gerador de Música a partir de Texto");
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.setBounds(100, 100, 450, 314);
		super.setContentPane(contentPane);
		super.setJMenuBar(Menu.initializationTopMenu());
		
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		Screen.initializationScreen(contentPane);
		ListInstruments.initializationListInstruments((contentPane));
		Bottons.initializationBottons(contentPane);
		EditorText.initializationEditorText(contentPane);	
		//ProgressBar.initializationProgressBar(contentPane);
	}
	
}
