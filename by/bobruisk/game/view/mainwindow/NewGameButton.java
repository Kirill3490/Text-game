package by.bobruisk.game.view.mainwindow;

import javax.swing.JButton;

public class NewGameButton extends JButton{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3242L;
	JButton newGameButton;
	
	public NewGameButton() {
		this.newGameButton = new JButton("Новая игра");
		newGameButton.setVisible(true);
	}
}
