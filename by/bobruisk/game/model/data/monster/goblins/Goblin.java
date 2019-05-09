package by.bobruisk.game.model.data.monster.goblins;

import by.bobruisk.game.model.data.monster.Monster;

public class Goblin extends Monster {
	public Goblin() {
		setName("Гоблин");
		setDefence(0);
		setMaxHp(130);
		setHp(getMaxHp());
		setStrength(5);
		setDexterity(4);
		setKillExperience(100);
	}
}
