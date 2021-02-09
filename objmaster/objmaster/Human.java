package com.codingdojo.objmaster;

public class Human {
	public String name;
	private int strength;
	private int stealth;
	private int intelligence;
	private int health;

	public Human(String name) {
		this.name = name;
		strength = 3;
		stealth = 3;
		intelligence = 3;
		health = 100;
	}
	
	public void setHuman(String name, int strength, int stealth, int intelligence, int health) {
		this.name = name;
		this.strength = strength;
		this.stealth = stealth;
		this.intelligence = intelligence;
		this.health = health;
	}
	public void attack(Human target) {
		target.health -= this.strength;
		System.out.println(this.name + " Attack " + target.name + " health decreased by " + this.strength);
	}
	public void setHealth(int health) {
		this.health = health;
//		displayHealth();
	}
	public int getHealth(Human target) {
		target.health = this.health;
//		System.out.println(target + " current health is " + target.health);
		return target.health;
	}
	public int getIntel() {
		return this.intelligence;
	}
	
	public int displayHealth() {
		System.out.println(this.name + " current health is " + this.health);
		return this.health;
	}
}
