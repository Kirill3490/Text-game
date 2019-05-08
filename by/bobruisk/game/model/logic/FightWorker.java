package by.bobruisk.game.model.logic;

import java.util.Random;
import java.util.Scanner;

import by.bobruisk.game.model.data.Player;
import by.bobruisk.game.model.data.monster.Monster;

public class FightWorker {
	static Scanner scanner = new Scanner(System.in);
	static Random random = new Random();

	public static int playerAction() {
		int choice = scanner.nextInt();
		if (choice <= 0 && choice > 3) {
			choice = -1;
		}
		return choice;
	}

	public static void monsterAction(Player player, Monster monster) {
		if (monster.getHp() <= (monster.getMaxHp() / 3) && (chance() >= 5)) {

		}
	}

	public static int heroAttack(Player player) {
		return player.getStrength() * 2;
	}

	public static int monsterAttack(Monster monster) {
		return monster.getStrength() * 2;
	}

	public static int monsterDefence(Monster monster) {
		return monster.getDefence() + chance();
	}

	public static int heroDefence(Player player) {
		return player.getDefence() + chance();
	}
	
	public static void fight(Player player, Monster monster) {
		
	}

	public static int chance() {
		int chance = random.nextInt(7);
		return chance;
	}

}
