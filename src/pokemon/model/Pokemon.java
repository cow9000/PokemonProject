package pokemon.model;

import java.util.ArrayList;

public abstract class Pokemon
{
	private int healthPoints;
	private int attackPoints;
	private double enhancementModifier;
	private int number;
	private String name;
	private boolean canEvolve;
	
	public Pokemon (int number, String name) {
		this.name = name;
		this.number = number;
	}
	
	public String[] getPokemonTypes() {
		String[] types = null;
		ArrayList<String> parentType = new ArrayList<String>();
		Class<?> currentClass = this.getClass();
		
		while(currentClass.getSuperclass() != null) {
			Class<?> [] pokemonTypes = getClass().getInterfaces();
			types = new String[pokemonTypes.length];
			
			for(int i = 0; i < types.length; i++) {
				String currentInterface = pokemonTypes[i].getCanonicalName();
				currentInterface = currentInterface.replace(this.getClass().getPackage().getName() + ".", "");
				if(!parentType.contains(currentInterface)) {
					parentType.add(currentInterface);
				}
				
			}
			
			currentClass = currentClass.getSuperclass();
			
		}
		
		types = new String[parentType.size()];
		for(int i = 0; i < parentType.size(); i++) {
			types[i] = parentType.get(i);
		}
		
		return types;
	}
	
	public String toString() {
		String description = "Hi, I am a " + name + ", and my hp is " + healthPoints;
		return description;
	}
	
	public String getPokemonInformation(){
		String pokemonInfo = "This pokemon is of type: " + this.getClass().getSimpleName();
		
		return pokemonInfo;
	}

	/**
	 * @return the healthPoints
	 */
	public int getHealthPoints()
	{
		return healthPoints;
	}

	/**
	 * @param healthPoints the healthPoints to set
	 */
	public void setHealthPoints(int healthPoints)
	{
		this.healthPoints = healthPoints;
	}

	/**
	 * @return the attackPoints
	 */
	public int getAttackPoints()
	{
		return attackPoints;
	}

	/**
	 * @param attackPoints the attackPoints to set
	 */
	public void setAttackPoints(int attackPoints)
	{
		this.attackPoints = attackPoints;
	}

	/**
	 * @return the enhancementModifier
	 */
	public double getEnhancementModifier()
	{
		return enhancementModifier;
	}

	/**
	 * @param enhancementModifier the enhancementModifier to set
	 */
	public void setEnhancementModifier(double enhancementModifier)
	{
		this.enhancementModifier = enhancementModifier;
	}

	/**
	 * @return the name
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name)
	{
		this.name = name;
	}

	/**
	 * @return the canEvolve
	 */
	public boolean isCanEvolve()
	{
		return canEvolve;
	}

	/**
	 * @param canEvolve the canEvolve to set
	 */
	public void setCanEvolve(boolean canEvolve)
	{
		this.canEvolve = canEvolve;
	}

	/**
	 * @return the number
	 */
	public int getNumber()
	{
		return number;
	}
	
}
