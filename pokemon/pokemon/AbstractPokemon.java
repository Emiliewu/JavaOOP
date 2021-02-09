package com.codingdojo.pokemon;

public abstract class AbstractPokemon implements PokemonInterface {
	public Pokemon createPokemon(String name, int health, String type) {
		Pokemon newPokemon = new Pokemon(name, health, type);
		return newPokemon;
	}
	
	public String pokemonInfo(Pokemon pokemon) {
		String info = pokemon.getName() + " " + pokemon.getHealth() + "hp " + pokemon.getType();
		return info;
	}
}
