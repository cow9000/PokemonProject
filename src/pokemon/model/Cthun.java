package pokemon.model;

public class Cthun extends Pokemon implements Psychic, Dark
{
	
	public Cthun(int number, String name) {
		super(number,name);
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
