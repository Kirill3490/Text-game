package by.bobruisk.game.view;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.omg.CORBA.PRIVATE_MEMBER;

public class MainWindow {
	JFrame mainWindow = new JFrame("Главное меню");
	private JPanel panel = new JPanel();
	private JButton loadGame = new JButton();
	private static final String PICTURES_FOLDER = "pic";
	private static final String PICTURES_FORMAT = ".jpg";
	private static final String PICTURE_WAY = "src\\pic\\MainWindowFon.jpg";
	
	public MainWindow() {
		this.mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.mainWindow.setVisible(true);
		this.mainWindow.setSize(900, 600);
		this.mainWindow.setLocationRelativeTo(null);
		this.mainWindow.setLayout(new BorderLayout());
		final ImageIcon image = new ImageIcon(PICTURE_WAY);
		JLabel backGround = new JLabel(image); 
		this.mainWindow.add(backGround);
		backGround.setLayout(new FlowLayout());
		backGround.setVisible(true);
		
		this.mainWindow.add(this.panel);
		this.panel.setSize(400, 200);
		this.panel.add(setLoadGame());
	}

	public JButton setLoadGame() {
		this.loadGame.setVisible(true);
		this.loadGame.setSize(100, 60);
		return loadGame;
	}
	
	
}
