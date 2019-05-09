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
import by.bobruisk.game.model.data.monster.Monster;

public class FightWindow {
	private Player player;
	private Monster monster;

	JFrame fightWindow = new JFrame("Окно боя");

	JButton attack = new JButton("Атака");
	JButton defence = new JButton("Защита");
	JButton escape = new JButton("Сбежать");

	JTextArea fightLog = new JTextArea(32, 30);
	JScrollPane scrollPane = new JScrollPane(fightLog);

	JLabel playerName = new JLabel("Имя игрока:");
	JLabel playerNameField;

	JLabel playerHp = new JLabel("Запас здоровья:");
	JLabel playerHpField;

	JLabel playerLeftHp = new JLabel("Здоровья осталось");
	JLabel playerLeftHpField;

	JLabel playerStrength = new JLabel("Сила:");
	JLabel playerStrengthField;

	JLabel playerDexterity = new JLabel("Ловкость:");
	JLabel playerDexterityField;

	JLabel playerDefence = new JLabel("Защита:");
	JLabel playerDefenceField;

	JLabel monsterName = new JLabel("Название монстра:");
	JLabel monsterNameField;

	JLabel monsterHp = new JLabel("Запас здоровья:");
	JLabel monsterHpField;

	JLabel monsterLeftHp = new JLabel("Здоровья осталось");
	JLabel monsterLeftHpField;

	JLabel monsterStrength = new JLabel("Сила:");
	JLabel monsterStrengthField;

	JLabel monsterDexterity = new JLabel("Ловкость:");
	JLabel monsterDexterityField;

	JLabel monsterDefence = new JLabel("Защита:");
	JLabel monsterDefenceField;

	public Monster getMonster() {
		return monster;
	}

	public void setMonster(Monster monster) {
		this.monster = monster;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public FightWindow() {
		fightWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fightWindow.setSize(900, 600);
		fightWindow.setResizable(false);
		fightWindow.setLocationRelativeTo(null);
	}

	private void playerInit() {
		this.playerNameField = new JLabel(player.getName());

		this.playerHpField = new JLabel(Integer.toString(player.getMaxHp()));

		this.playerLeftHpField = new JLabel(Integer.toString(player.getHp()));

		this.playerStrengthField = new JLabel(Integer.toString(player.getStrength()));

		this.playerDexterityField = new JLabel(Integer.toString(player.getDexterity()));

		this.playerDefenceField = new JLabel(Integer.toString(player.getDefence()));
	}

	private void monsterInit() {
		this.monsterNameField = new JLabel(monster.getName());

		this.monsterHpField = new JLabel(Integer.toString(monster.getMaxHp()));

		this.monsterLeftHpField = new JLabel(Integer.toString(monster.getHp()));

		this.monsterStrengthField = new JLabel(Integer.toString(monster.getStrength()));

		this.monsterDexterityField = new JLabel(Integer.toString(monster.getDexterity()));

		this.monsterDefenceField = new JLabel(Integer.toString(monster.getDefence()));
	}

	public void init() {

		playerInit();

		monsterInit();

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
		springLayout.putConstraint(SpringLayout.WEST, playerName, 10, SpringLayout.WEST, contentPane);
		springLayout.putConstraint(SpringLayout.NORTH, playerName, 25, SpringLayout.NORTH, contentPane);
		springLayout.putConstraint(SpringLayout.NORTH, playerNameField, 25, SpringLayout.NORTH, contentPane);
		springLayout.putConstraint(SpringLayout.WEST, playerNameField, 80, SpringLayout.WEST, playerName);

		contentPane.add(playerHp);
		contentPane.add(playerHpField);
		springLayout.putConstraint(SpringLayout.WEST, playerHp, 10, SpringLayout.WEST, contentPane);
		springLayout.putConstraint(SpringLayout.NORTH, playerHp, 45, SpringLayout.NORTH, contentPane);
		springLayout.putConstraint(SpringLayout.NORTH, playerHpField, 45, SpringLayout.NORTH, contentPane);
		springLayout.putConstraint(SpringLayout.WEST, playerHpField, 100, SpringLayout.WEST, playerHp);

		contentPane.add(playerLeftHp);
		contentPane.add(playerLeftHpField);
		springLayout.putConstraint(SpringLayout.WEST, playerLeftHp, 10, SpringLayout.WEST, contentPane);
		springLayout.putConstraint(SpringLayout.NORTH, playerLeftHp, 65, SpringLayout.NORTH, contentPane);
		springLayout.putConstraint(SpringLayout.NORTH, playerLeftHpField, 65, SpringLayout.NORTH, contentPane);
		springLayout.putConstraint(SpringLayout.WEST, playerLeftHpField, 120, SpringLayout.WEST, playerLeftHp);

		contentPane.add(playerStrength);
		contentPane.add(playerStrengthField);
		springLayout.putConstraint(SpringLayout.WEST, playerStrength, 10, SpringLayout.WEST, contentPane);
		springLayout.putConstraint(SpringLayout.NORTH, playerStrength, 85, SpringLayout.NORTH, contentPane);
		springLayout.putConstraint(SpringLayout.NORTH, playerStrengthField, 85, SpringLayout.NORTH, contentPane);
		springLayout.putConstraint(SpringLayout.WEST, playerStrengthField, 120, SpringLayout.WEST, playerStrength);

		contentPane.add(playerDexterity);
		contentPane.add(playerDexterityField);
		springLayout.putConstraint(SpringLayout.WEST, playerDexterity, 10, SpringLayout.WEST, contentPane);
		springLayout.putConstraint(SpringLayout.NORTH, playerDexterity, 105, SpringLayout.NORTH, contentPane);
		springLayout.putConstraint(SpringLayout.NORTH, playerDexterityField, 105, SpringLayout.NORTH, contentPane);
		springLayout.putConstraint(SpringLayout.WEST, playerDexterityField, 120, SpringLayout.WEST, playerDexterity);

		contentPane.add(playerDefence);
		contentPane.add(playerDefenceField);
		springLayout.putConstraint(SpringLayout.WEST, playerDefence, 10, SpringLayout.WEST, contentPane);
		springLayout.putConstraint(SpringLayout.NORTH, playerDefence, 125, SpringLayout.NORTH, contentPane);
		springLayout.putConstraint(SpringLayout.NORTH, playerDefenceField, 125, SpringLayout.NORTH, contentPane);
		springLayout.putConstraint(SpringLayout.WEST, playerDefenceField, 120, SpringLayout.WEST, playerDefence);

		contentPane.add(monsterName);
		contentPane.add(monsterNameField);
		springLayout.putConstraint(SpringLayout.WEST, monsterName, 670, SpringLayout.WEST, contentPane);
		springLayout.putConstraint(SpringLayout.NORTH, monsterName, 25, SpringLayout.NORTH, contentPane);
		springLayout.putConstraint(SpringLayout.NORTH, monsterNameField, 25, SpringLayout.NORTH, contentPane);
		springLayout.putConstraint(SpringLayout.WEST, monsterNameField, 120, SpringLayout.WEST, monsterName);

		contentPane.add(monsterHp);
		contentPane.add(monsterHpField);
		springLayout.putConstraint(SpringLayout.WEST, monsterHp, 670, SpringLayout.WEST, contentPane);
		springLayout.putConstraint(SpringLayout.NORTH, monsterHp, 45, SpringLayout.NORTH, contentPane);
		springLayout.putConstraint(SpringLayout.NORTH, monsterHpField, 45, SpringLayout.NORTH, contentPane);
		springLayout.putConstraint(SpringLayout.WEST, monsterHpField, 120, SpringLayout.WEST, monsterHp);

		contentPane.add(monsterLeftHp);
		contentPane.add(monsterLeftHpField);
		springLayout.putConstraint(SpringLayout.WEST, monsterLeftHp, 670, SpringLayout.WEST, contentPane);
		springLayout.putConstraint(SpringLayout.NORTH, monsterLeftHp, 65, SpringLayout.NORTH, contentPane);
		springLayout.putConstraint(SpringLayout.NORTH, monsterLeftHpField, 65, SpringLayout.NORTH, contentPane);
		springLayout.putConstraint(SpringLayout.WEST, monsterLeftHpField, 120, SpringLayout.WEST, monsterLeftHp);

		contentPane.add(monsterStrength);
		contentPane.add(monsterStrengthField);
		springLayout.putConstraint(SpringLayout.WEST, monsterStrength, 670, SpringLayout.WEST, contentPane);
		springLayout.putConstraint(SpringLayout.NORTH, monsterStrength, 85, SpringLayout.NORTH, contentPane);
		springLayout.putConstraint(SpringLayout.NORTH, monsterStrengthField, 85, SpringLayout.NORTH, contentPane);
		springLayout.putConstraint(SpringLayout.WEST, monsterStrengthField, 120, SpringLayout.WEST, monsterStrength);

		contentPane.add(monsterDexterity);
		contentPane.add(monsterDexterityField);
		springLayout.putConstraint(SpringLayout.WEST, monsterDexterity, 670, SpringLayout.WEST, contentPane);
		springLayout.putConstraint(SpringLayout.NORTH, monsterDexterity, 105, SpringLayout.NORTH, contentPane);
		springLayout.putConstraint(SpringLayout.NORTH, monsterDexterityField, 105, SpringLayout.NORTH, contentPane);
		springLayout.putConstraint(SpringLayout.WEST, monsterDexterityField, 120, SpringLayout.WEST, monsterDexterity);

		contentPane.add(monsterDefence);
		contentPane.add(monsterDefenceField);
		springLayout.putConstraint(SpringLayout.WEST, monsterDefence, 670, SpringLayout.WEST, contentPane);
		springLayout.putConstraint(SpringLayout.NORTH, monsterDefence, 125, SpringLayout.NORTH, contentPane);
		springLayout.putConstraint(SpringLayout.NORTH, monsterDefenceField, 125, SpringLayout.NORTH, contentPane);
		springLayout.putConstraint(SpringLayout.WEST, monsterDefenceField, 120, SpringLayout.WEST, monsterDefence);

		fightWindow.setVisible(true);

	}

}
