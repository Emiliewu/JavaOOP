package com.codingdojo.pokemon;

public class Pokemon {
	//name, health, and type member variable
	private String name;
	private int health;
	private String type;
	private static int countPokemon = 0;
	
	public Pokemon(String name, int health, String type) {
		this.name = name;
		this.health = health;
		this.type = type;
		countPokemon++;
	}
	//void attackPokemon(Pokemon pokemon): This method lowers the attacked Pokemon's health by 10
	public void attackPokemon(Pokemon pokemon) {
		System.out.println(this.name + " attacked " + pokemon.name);
		pokemon.health -= 10;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public void settype(String type) {
		this.type = type;
	}
	public String getName() {
		return this.name;
	}
	public int getHealth() {
		return this.health;
	}
	public String getType() {
		return this.type;
	}
	public static int getCount() {
		return countPokemon;
	}
	
}
