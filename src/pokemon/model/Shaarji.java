package pokemon.model;

public class Shaarji extends Pokemon implements Poison
{
	
	public Shaarji() {
		super (5,"Shaarji");
		setup();
	}
	public Shaarji(String name) {
		super(5, name);
		setup();
	}
	
	public Shaarji(int number, String name) {
		super(number,name);
		setup();
	}
	
	protected void setup() {
		this.setAttackPoints(10);
		this.setCanEvolve(true);
		this.setEnhancementModifier(.70);
		this.setHealthPoints(123);
	}

	@Override
	public boolean actionKill(int pokemonHealth)
	{
		
		boolean targetDead = true;
		
		if(pokemonHealth < 50)
			return targetDead;
		
		return false;
	}

	@Override
	public int actionVenomousBite()
	{
		
		return 0;
	}

	@Override
	public void actionWeaken()
	{
		System.out.println("Target is weakened");
	}

}
