package by.bobruisk.game.model.data.monster;

import java.util.ArrayList;
import java.util.List;

import by.bobruisk.game.model.data.monster.goblins.Goblin;
import by.bobruisk.game.model.data.monster.goblins.GoblinArcher;
import by.bobruisk.game.model.data.monster.goblins.GoblinSworsman;

public class MonsterList {
	Monster monster;
	
	List <Monster> monsterList = new ArrayList<Monster>();
	
	Goblin goblin = new Goblin();
	GoblinSworsman goblinSworsman = new GoblinSworsman();
	GoblinArcher goblinArcher = new GoblinArcher();
	
	
}
