package by.bobruisk.game.view.mainwindow;

import java.awt.Button;
import java.awt.Component;

import javax.swing.JPanel;

public class ButtonsPanel {
	JPanel buttonsPanel = new JPanel();
	NewGameButton gameButton = new NewGameButton();
	
	Button button = new Button("New Game");
	
	public ButtonsPanel() {
		this.buttonsPanel.add(this.button);
		this.buttonsPanel.setVisible(true);
	}
}
