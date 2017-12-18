package pokemon.model;

public class Soggoth extends Pokemon implements Psychic
{

	public Soggoth(int number, String name)
	{
		super(number, name);
		// TODO Auto-generated constructor stub
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
