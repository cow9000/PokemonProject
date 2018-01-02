package pokemon.model;

public class Soggoth extends Pokemon implements Psychic
{

	public Soggoth() {
		super (6,"Soggoth");
		setup();
	}
	public Soggoth(String name) {
		super(6, name);
		setup();
	}
	
	public Soggoth(int number, String name) {
		super(number,name);
		setup();
	}
	
	protected void setup() {
		this.setAttackPoints(23);
		this.setCanEvolve(true);
		this.setEnhancementModifier(1.10);
		this.setHealthPoints(1024);
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
