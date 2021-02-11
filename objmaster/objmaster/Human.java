package com.codingdojo.objmaster;

public class Human {
	public String name;
	private int strength;
	private int stealth;
	private int intelligence;
	private int health;

	public Human(String name) {
		setName(name);
		strength = 3;
		stealth = 3;
		intelligence = 3;
		health = 100;
	}
	

	public void setHuman(String name, int strength, int stealth, int intelligence, int health) {
		this.name = name;
		setStrength(strength);
		setStealth(stealth);
		setIntel(intelligence);
		setHealth(health);
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	public void setStealth(int stealth) {
		this.stealth = stealth;
	}
	public void setIntel(int intel) {
		this.intelligence = intel;
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
	public int getStealh() {
		return this.stealth;
	}
	public int getStrength() {
		return this.strength;
	}
	
	public int displayHealth() {
		System.out.println(this.name + " current health is " + this.health);
		return this.health;
	}
}
