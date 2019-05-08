package by.bobruisk.game.view.mainwindow;

import java.awt.Button;
import javax.swing.JPanel;

public class ButtonsPanel extends JPanel{
	
	private static final long serialVersionUID = 456L;
	
	JPanel buttonsPanel = new JPanel();
	
	NewGameButton gameButton = new NewGameButton();
	
	Button button = new Button("New Game");
	
	public ButtonsPanel() {
		this.buttonsPanel.add(this.gameButton);
		this.buttonsPanel.setVisible(true);
	}
}
