package pokemon.model;

public class Rip extends Rot
{

	public Rip() {
		super (4,"Rip");
		setup();
	}
	public Rip(String name) {
		super(4, name);
		setup();
	}
	
	public Rip(int number, String name) {
		super(number,name);
		setup();
	}
	
	@Override
	protected void setup() {
		this.setAttackPoints(10);
		this.setCanEvolve(true);
		this.setEnhancementModifier(.70);
		this.setHealthPoints(123);
	}
	
	public void actionConceal()
	{
		System.out.println("Concealed");
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
