package by.bobruisk.game.model.data.monster.goblins;

import by.bobruisk.game.model.data.monster.Monster;

public class GoblinSworsman extends Monster{
	public GoblinSworsman() {
		setName("Гоблин мечник");
		setDefence(2);
		setMaxHp(200);
		setHp(getMaxHp());
		setStrength(8);
		setDexterity(6);
		setKillExperience(200);
	}
}
