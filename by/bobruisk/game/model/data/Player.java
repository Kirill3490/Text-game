package by.bobruisk.game.model.data;

public class Player extends Character{
	private int level;
	private int exp;
	private int levelExp;
	
	
	public Player() {
		setName("Garon");
		setAlive(true);
		
		setMaxHp(200);
		setHp(getMaxHp());
		
		setLevel(1);
		setExp(0);
		setLevelExp(100);
		
		setStrength(5);
		setDexterity(5);
		setDefence(0);
		
	}
	
	
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public int getLevelExp() {
		return levelExp;
	}
	public void setLevelExp(int levelExp) {
		this.levelExp = levelExp;
	}
	
	public void levelUp() {
		
		while (getExp() >= getLevelExp()) {
			setMaxHp(getMaxHp() + 50);
			setHp(getMaxHp());
			
			setLevel(getLevel()+1);
			
			setExp(getExp() - getLevelExp());
			setLevelExp(getLevelExp() + 300);
			
			setStrength(getStrength() + 2);
			setDexterity(getDexterity() + 1);
			setDefence(getDefence() + 1);
		}
	}
	
	
}
