package pokemon.controller;

import java.util.ArrayList;
import java.util.List;

import pokemon.model.Cthun;
import pokemon.model.Mukla;
import pokemon.model.Pokemon;
import pokemon.model.Rip;
import pokemon.model.Rot;
import pokemon.model.Shaarji;
import pokemon.model.Soggoth;
import pokemon.view.PokemonFrame;

public class PokemonController
{
	private List<Pokemon> pokedex;
	private PokemonFrame appFrame;
	
	public PokemonController(){
		pokedex = new ArrayList<Pokemon>();
		buildPokedex();
		
		appFrame = new PokemonFrame(this);
		
	}
	
	private void buildPokedex() {
		pokedex.add(new Cthun("Cthun"));
		pokedex.add(new Mukla(123123,"Mukla"));
		pokedex.add(new Rip());
		pokedex.add(new Rot());
		pokedex.add(new Shaarji());
		pokedex.add(new Soggoth());
		
		System.out.println(isValidInteger("v23"));
	}
	
	public List<Pokemon> getPokedex(){
		return pokedex;
	}
	
	public boolean isValidInteger(String input) {
		if(input.matches("-?\\d+")) {
			return true;
		}
		return false;
		
	}
	
	public boolean isValidDouble(String input) {
		try
		{
			Double.parseDouble(input);
		}
		catch(NumberFormatException e)
		{
			//not a double
			return false;
		}
		return true;
	}
	
	public String [] convertPokedex() {
		String [] names = new String [pokedex.size()];
		
		for(int i = 0 ; i < pokedex.size(); i++) {
			names[i] = pokedex.get(i).getName();
		}
		
		return names;
	}
	
	public void updateSelected(int selection, int health, int attack, boolean evolve, double modify, String name) {
		Pokemon selected = pokedex.get(selection);
		selected.setAttackPoints(attack);
		selected.setCanEvolve(evolve);
		selected.setEnhancementModifier(modify);
		selected.setName(name);
		selected.setHealthPoints(health);
		
		FileController.savePokemonToFile((ArrayList<Pokemon>) pokedex);
	}

}
