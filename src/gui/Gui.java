package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import actions.ActionListenerExport;
import actions.ActionListenerOpen;
import actions.ActionListenerPlay;
import actions.ActionListenerReset;
import actions.ActionListenerStop;
import actions.ControllerPlayer;
import gui.components.*;
import gui.components.menu.*;

public class Gui extends JFrame {
	private static ControllerPlayer player = new ControllerPlayer();
	
	private static JPanel contentPane = new JPanel();
	
	private static Menu menu;
	
	private static ListInstruments listInstruments;
	private static EditorText editorText;
	
	private static Buttons play;
	private static Buttons stop;
	private static Buttons reset;
	private static Buttons open;
	private static Buttons export;
	
	public Gui(){		
		panelInitialization();
		
		initializationContent();
		
		Screen.initializationScreen(contentPane);
		initializationEditorText(contentPane);	
		initializationListInstruments(contentPane);
		initializationButtons(contentPane);
		initializationMenu(contentPane);
		notPlaying();
	}

	private void initializationContent() {
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
	}

	private void panelInitialization() {
		super.setResizable(false);
		super.setTitle("Gerador de Música a partir de Texto");
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.setBounds(100, 100, 450, 314);
		super.setContentPane(contentPane);
	}
	
	private void initializationMenu(JPanel contentPane) {
		super.setJMenuBar(menu = new Menu(listInstruments, editorText, player));
	}
	
	private void initializationEditorText(JPanel contentPane) {
		editorText = new EditorText(contentPane);
	}

	private void initializationListInstruments(JPanel contentPane) {
		listInstruments = new ListInstruments(contentPane);
		
	}

	private static void initializationButtons(JPanel contentPane) {
		play = new Buttons("PLAY", 24, 189, 81, 62, new ActionListenerPlay(listInstruments, editorText, player));
		stop = new Buttons("STOP", 116, 189, 81, 62, new ActionListenerStop(player));
		reset = new Buttons("RESET", 208, 189, 81, 62, new ActionListenerReset(player));
		open = new Buttons("OPEN", 301, 14, 117, 25, new ActionListenerOpen(editorText));
		export = new Buttons("EXPORT", 301, 51, 117, 25, new ActionListenerExport(listInstruments, editorText));
		
		contentPane.add(play);
		contentPane.add(stop);
		contentPane.add(reset);
		contentPane.add(open);
		contentPane.add(export);
	}
	
	public static void protectPlay() {
		editorText.disableTextEdition();
		menu.disableMenu();
		reset.setEnabled();
		stop.setEnabled();
		open.setDisabled();
		export.setDisabled();
		play.setDisabled();
		listInstruments.disableListInstrument();
	}
	
	public static void notPlaying() {
		editorText.ableTextEdition();
		menu.ableMenu();
		reset.setDisabled();
		stop.setDisabled();
		open.setEnabled();
		export.setEnabled();
		play.setEnabled();
		listInstruments.ableListInstrument();
	}
}
