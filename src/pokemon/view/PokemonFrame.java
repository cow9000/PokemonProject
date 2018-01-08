package pokemon.view;

import javax.swing.JFrame;

import pokemon.controller.PokemonController;

public class PokemonFrame extends JFrame
{
	private PokemonController pokemonController;
	private PokemonPanel appPanel;
	
	public PokemonFrame(PokemonController pokemonController){
		super();
		this.pokemonController = pokemonController;
		this.appPanel = new PokemonPanel(pokemonController);
		setupFrame();
	}
	
	private void setupFrame() {
		this.setContentPane(appPanel);
		this.setTitle("");
		this.setSize(500, 500);
		this.setVisible(true);
	}
}
