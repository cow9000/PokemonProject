package pokemon.controller;

import java.util.ArrayList;
import java.util.List;

import pokemon.model.Pokemon;

public class PokemonController
{
	private List<Pokemon> pokedex;
	
	public void start() {
		
	}
	
	public PokemonController(){
		pokedex = new ArrayList<Pokemon>();
	}
	
	public List<Pokemon> getPokedex(){
		return pokedex;
	}
	
	public boolean isValidInteger(String input) {
		if(input.matches("-?\\d+")) {
			
		}
		return true;
		
	}
	
	public boolean isValidDouble(String input) {
		if(input.matches("-?\\d+")) {
			return true;
		}
		return false;
	}

}
