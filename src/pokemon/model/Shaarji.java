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
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int actionVenomousBite()
	{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void actionWeaken()
	{
		// TODO Auto-generated method stub
		
	}

}
