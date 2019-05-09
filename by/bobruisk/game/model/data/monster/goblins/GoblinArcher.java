package by.bobruisk.game.model.data.monster.goblins;

import by.bobruisk.game.model.data.monster.Monster;

public class GoblinArcher extends Monster{
	public GoblinArcher() {
		setName("Гоблин лучник");
		setDefence(1);
		setMaxHp(140);
		setHp(getMaxHp());
		setStrength(3);
		setDexterity(6);
		setKillExperience(150);
	}
}
