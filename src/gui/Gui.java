package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import gui.components.*;
import gui.components.menu.*;
import gui.components.buttons.*;

public class Gui extends JFrame {
	
	private static JPanel contentPane;
	private static Play play;
	private static Pause pause;
	private static Reset reset;
	private static Open open;
	private static Export export;
	
	public Gui(){
		contentPane = new JPanel();
		//Panel initialization
		super.setTitle("Gerador de Música a partir de Texto");
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.setBounds(100, 100, 450, 314);
		super.setContentPane(contentPane);
		super.setJMenuBar(Menu.initializationTopMenu());
		
		//content initialization
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		initializationButtons();
		Screen.initializationScreen(contentPane);
		ListInstruments.initializationListInstruments((contentPane));
		EditorText.initializationEditorText(contentPane);	
		ProgressBar.initializationProgressBar(contentPane);
	}
	
	private static void initializationButtons() {
		play = new Play("PLAY", 24, 189, 81, 62);
		pause = new Pause("PAUSE", 116, 189, 81, 62);
		reset = new Reset("RESET", 208, 189, 81, 62);
		open = new Open("OPEN", 301, 12, 117, 25);
		export = new Export("EXPORT", 301, 49, 117, 25);
		
		contentPane.add(play.inicializaBtn());
		contentPane.add(pause.inicializaBtn());
		contentPane.add(reset.inicializaBtn());
		contentPane.add(open.inicializaBtn());
		contentPane.add(export.inicializaBtn());
	}
	
	public static void protectPlay() {
		EditorText.disableTextEdition();
		reset.setDisabled();
		open.setDisabled();
		export.setDisabled();
		play.setDisabled();
		ListInstruments.disableListInstrument();
	}
	
	public static void notPlaying() {
		EditorText.ableTextEdition();
		reset.setEnabled();
		open.setEnabled();
		export.setEnabled();
		play.setEnabled();
		ListInstruments.ableListInstrument();
	}
	
}
