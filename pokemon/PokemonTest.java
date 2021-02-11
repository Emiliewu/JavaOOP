package com.codingdojo.pokemon;

public class PokemonTest {

	public static void main(String[] args) {
		Pokemon Butterfly = new Pokemon("Butterfly", 100, "flying");
		Pokemon Pikachu = new Pokemon("Pikachur", 200, "electric");
		Butterfly.attackPokemon(Pikachu);
		Pikachu.attackPokemon(Butterfly);
		Pokedex pokedex = new Pokedex();
		pokedex.add(Butterfly);
		pokedex.add(Pikachu);
		System.out.println("There are " + Pokemon.getCount() + " pokemons created");
		pokedex.listPokemon();

	}

}
