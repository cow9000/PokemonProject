package pokemon.model;

public class Mukla extends Pokemon implements Dark
{

	public Mukla() {
		super (2,"Mukla");
		setup();
	}
	public Mukla(String name) {
		super(2, name);
		setup();
	}
	
	public Mukla(int number, String name) {
		super(number,name);
		setup();
	}
	
	
	protected void setup() {
		this.setAttackPoints(50);
		this.setCanEvolve(true);
		this.setEnhancementModifier(.64);
		this.setHealthPoints(123);
	}
	
	public void actionConceal() {
		
	}
	
	public boolean actionConfuse() {
		boolean confused = false;
		 
		return confused;
	}
	
	public int actionBlackHole() {
		int damage = 0;
		
		return damage;
	}
	
}
