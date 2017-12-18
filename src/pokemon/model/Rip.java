package pokemon.model;

public class Rip extends Rot
{

	public Rip(int number, String name)
	{
		super(number, name);
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
