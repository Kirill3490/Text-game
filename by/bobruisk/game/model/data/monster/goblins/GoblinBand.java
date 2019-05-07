package by.bobruisk.game.model.data.monster.goblins;

import java.util.ArrayList;
import java.util.List;

import by.bobruisk.game.model.data.monster.Monster;

public class GoblinBand {
	private List<Monster> goblinList = new ArrayList<>();
	
	Goblin firstgoblin = new Goblin();
	Goblin secondGoblin = new Goblin();
	GoblinSworsman goblinSworsman = new GoblinSworsman();
	GoblinArcher goblinArcher = new GoblinArcher();
	
	public GoblinBand() {
		this.goblinList.add(firstgoblin);
		this.goblinList.add(secondGoblin);
		this.goblinList.add(goblinSworsman);
		this.goblinList.add(goblinArcher);
	}

	public List<Monster> getGoblinList() {
		return goblinList;
	}

	public void setGoblinList(List<Monster> goblinList) {
		this.goblinList = goblinList;
	}
}
