package by.bobruisk.game.model.data.monster;

import by.bobruisk.game.model.data.Character;

public class Monster extends Character{
	private int killExperience;
	public int getKillExperience() {
		return killExperience;
	}

	public void setKillExperience(int killExperience) {
		this.killExperience = killExperience;
	}
}
