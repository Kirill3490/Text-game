package by.bobruisk.game.model.data.monster.wolves;

import by.bobruisk.game.model.data.monster.Monster;

public class WolfLeader extends Monster{
	public WolfLeader() {
		setName("Вожак стаи");
		setDefence(2);
		setMaxHp(200);
		setHp(getMaxHp());
		setStrength(7);
		setDexterity(6);
		setKillExperience(200);
	}
}
