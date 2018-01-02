package pokemon.model;

public class Rot extends Pokemon implements Dark
{
	public Rot() {
		super (3,"Rot");
		setup();
	}
	public Rot(String name) {
		super(3, name);
		setup();
	}
	
	public Rot(int number, String name) {
		super(number,name);
		setup();
	}
	
	
	protected void setup() {
		this.setAttackPoints(10);
		this.setCanEvolve(true);
		this.setEnhancementModifier(.70);
		this.setHealthPoints(123);
	}

	public void actionConceal()
	{
		System.out.print("CONCEALED");
	}

	public boolean actionConfuse()
	{
		boolean isConfused = false;
		return isConfused;
	}

	public int actionBlackHole()
	{
		int damage = 0;
		return damage;
	}
}
