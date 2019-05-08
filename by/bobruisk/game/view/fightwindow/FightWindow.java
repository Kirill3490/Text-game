package by.bobruisk.game.view.fightwindow;

import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.SpringLayout;

import by.bobruisk.game.model.data.Player;

public class FightWindow {
	private Player player;
	JFrame fightWindow = new JFrame("Окно боя");

	JButton attack = new JButton("Атака");
	JButton defence = new JButton("Защита");
	JButton escape = new JButton("Сбежать");

	JTextArea fightLog = new JTextArea(32, 30);
	JScrollPane scrollPane = new JScrollPane(fightLog);
	
	JLabel playerName;
	JLabel playerNameField;
	
	JLabel playerHp;
	JLabel playerHpField;
	
	JLabel playerLeftHp;
	JLabel playerLeftHpField;
	
	JLabel playerStrength;
	JLabel playerStrengthField;
	
	JLabel playerDexterity;
	JLabel playerDexterityField;
	
	JLabel playerDefence;
	JLabel playerDefenceField;
	
	public FightWindow() {
		fightWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fightWindow.setSize(900, 600);
		fightWindow.setResizable(false);
		fightWindow.setLocationRelativeTo(null);
	}
	
	private void playerInit() {
		this.playerName = new JLabel("Имя игрока");
		this.playerNameField = new JLabel(player.getName());
	}

	public void init() {
		
		playerInit();
		
		
		
		Container contentPane = fightWindow.getContentPane();
		SpringLayout springLayout = new SpringLayout();
		contentPane.setLayout(springLayout);

		// button.setSize(50, 40);

		contentPane.add(attack);
		springLayout.putConstraint(SpringLayout.WEST, attack, 10, SpringLayout.WEST, contentPane);
		springLayout.putConstraint(SpringLayout.NORTH, attack, 400, SpringLayout.NORTH, contentPane);

		contentPane.add(defence);
		springLayout.putConstraint(SpringLayout.WEST, defence, 100, SpringLayout.WEST, contentPane);
		springLayout.putConstraint(SpringLayout.NORTH, defence, 400, SpringLayout.NORTH, contentPane);

		contentPane.add(escape);
		springLayout.putConstraint(SpringLayout.WEST, escape, 200, SpringLayout.WEST, contentPane);
		springLayout.putConstraint(SpringLayout.NORTH, escape, 400, SpringLayout.NORTH, contentPane);
		escape.setEnabled(false);

		contentPane.add(scrollPane);
		springLayout.putConstraint(SpringLayout.WEST, scrollPane, 300, SpringLayout.WEST, contentPane);
		springLayout.putConstraint(SpringLayout.NORTH, scrollPane, 10, SpringLayout.NORTH, contentPane);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		fightLog.setLineWrap(true);
		fightLog.setWrapStyleWord(true);

		contentPane.add(playerName);
		contentPane.add(playerNameField);
		springLayout.putConstraint(SpringLayout.WEST, playerName, 320, SpringLayout.WEST, contentPane);
		springLayout.putConstraint(SpringLayout.NORTH, playerName, 25, SpringLayout.NORTH, contentPane);
		springLayout.putConstraint(SpringLayout.NORTH, playerNameField, 45, SpringLayout.NORTH, contentPane);
		//springLayout.putConstraint(SpringLayout.WEST, playerNameField, 0, SpringLayout.WEST, playerName);

		fightWindow.setVisible(true);

	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}
}
