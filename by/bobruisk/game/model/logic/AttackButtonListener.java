package by.bobruisk.game.model.logic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import by.bobruisk.game.model.data.Player;
import by.bobruisk.game.model.data.monster.Monster;

public class AttackButtonListener implements ActionListener{
	private Player player;
	private Monster monster;
	
	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public Monster getMonster() {
		return monster;
	}

	public void setMonster(Monster monster) {
		this.monster = monster;
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent event) {
		 int playerAttack = FightWorker.heroAttack(player);
		 
		 monster.setHp(monster.getHp() + monster.getDefence() - playerAttack);
	}
}
