package pokemon.model;

public class Shaarji extends Pokemon implements Poison
{

	public Shaarji(int number, String name)
	{
		super(number, name);
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
