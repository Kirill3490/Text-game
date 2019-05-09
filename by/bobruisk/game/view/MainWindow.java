package by.bobruisk.game.view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import by.bobruisk.game.view.mainwindow.LoadGameButton;
import by.bobruisk.game.view.mainwindow.NewGameButton;

public class MainWindow {
	JFrame mainWindow = new JFrame("Главное меню");
	//private JPanel panel = new JPanel();
	//private JButton loadGame = new JButton();
	NewGameButton newGame = new NewGameButton();
	LoadGameButton loadGame = new LoadGameButton();
	GridBagConstraints c = new GridBagConstraints();
	
	
	public MainWindow() {
		this.mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.mainWindow.setVisible(true);
		this.mainWindow.setSize(900, 600);
		this.mainWindow.setLocationRelativeTo(null);
		this.mainWindow.setLayout(new GridBagLayout()); 
	}
	
	
}
