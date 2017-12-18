package pokemon.model;

public class Rot extends Pokemon implements Dark
{
	public Rot(int number, String name) {
		super(number,name);
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
