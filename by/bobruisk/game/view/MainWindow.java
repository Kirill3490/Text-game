package by.bobruisk.game.view;

import java.awt.Button;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainWindow {
	JFrame mainWindow = new JFrame("Главное меню");
	private JPanel panel = new JPanel();
	private JButton newGame = new JButton("Новая игра");
	private JButton loadGame = new JButton();
	
	public MainWindow() {
		mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainWindow.setVisible(true);
		mainWindow.setSize(900, 600);
		mainWindow.setLocationRelativeTo(null);
		mainWindow.add(this.panel);
		this.panel.setSize(400, 200);
		this.panel.add(setLoadGame());
	}

	public JButton setLoadGame() {
		this.loadGame.setVisible(true);
		this.loadGame.setSize(100, 60);
		return loadGame;
	}
	
	
}
