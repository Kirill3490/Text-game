package by.bobruisk.game.model.logic;

import java.util.Random;
import java.util.Scanner;

import by.bobruisk.game.model.data.Player;
import by.bobruisk.game.model.data.monster.Monster;

public abstract class FightWorker {
	static Scanner scanner = new Scanner(System.in);
	static Random random = new Random();

	public static void playerAction(Player player, Monster monster) {
		int choice = scanner.nextInt();
		switch (choice) {
		case 1:
			heroAttack(player, monster);
			break;
		case 2:
			heroDefence(player, monster);
			break;
		case 3:

			break;

		default:
			break;
		}
	}
	
	public static void monsterAction(Player player, Monster monster) {
		
	}

	private static void heroAttack(Player player, Monster monster) {
		int playerAttack = player.getStrength() * 2;
		int monsterHp = monster.getHp() - (playerAttack - monster.getDefence());
		monster.setHp(monsterHp);
	}
	
	private static void monsterAttack(Player player, Monster monster) {
		int monsterAttack = monster.getStrength() * 2;
		int playerHp = player.getHp() + player.getDefence() - monsterAttack;
		player.setHp(playerHp);
	}
	
	//private static void monsterDefence(Player player, Monster monster) {
	//	int 
	//}

	private static void heroDefence(Player player, Monster monster) {
		int monsterAttack = monster.getStrength() * 2;
		int heroHp = player.getHp() - (monsterAttack - (player.getDefence() + chance()));
		player.setHp(heroHp);
	}
	
	private static void heroEscape(Player player) {
		
	}
	
	private static int chance() {
		int chance = random.nextInt(7);
		return chance;
	}
	
	
}
