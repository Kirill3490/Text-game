package by.bobruisk.game.model.data.monster.wolves;

import by.bobruisk.game.model.data.monster.Monster;

public class Wolf extends Monster{
	public Wolf() {
		setName("Волк");
		setDefence(0);
		setMaxHp(100);
		setHp(getMaxHp());
		setStrength(5);
		setDexterity(4);
		setKillExperience(100);
	}
}
