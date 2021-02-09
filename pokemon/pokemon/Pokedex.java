package com.codingdojo.pokemon;

import java.util.ArrayList;

public class Pokedex extends AbstractPokemon {
	private ArrayList<Pokemon> myPokemons;
	
	public Pokedex() {
		this.myPokemons = new ArrayList<Pokemon>();
	}
	
	public void add(Pokemon pokemon) {
		myPokemons.add(pokemon);
	}
	
	@Override
	public void listPokemon() {
		// TODO Auto-generated method stub
		for(Pokemon pokemon : myPokemons) {
			System.out.println(this.pokemonInfo(pokemon));
		}
	}

}
