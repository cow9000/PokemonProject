package pokemon.model;

public class Cthun extends Pokemon implements Psychic, Dark
{

	public Cthun() {
		super (1,"Cthun");
		setup();
	}
	public Cthun(String name) {
		super(1, name);
		setup();
	}
	
	public Cthun(int number, String name) {
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
		
		boolean confuse = false;
		
		return confuse;
	}

	public int actionBlackHole()
	{
		int damage = 0;
		return damage;
	}

	public void actionMindControl(int type)
	{
		System.out.println("Thing is Mindcontrolled");
	}

	public int actionSleep()
	{
		int timeAsleep = 0;
		return timeAsleep;
	}

	public int actionMindCrush()
	{
		int damage = 0;
		return damage;
	}

}
