package com.codingdojo.objmaster;

public class Wizard extends Human{
	public Wizard(String name) {
		super(name);
		this.setHuman(name, 3, 3, 8, 50);
	}
	public void heal(Human target) {
		System.out.println(this.name + " just heals " + target.name);
		target.setHealth(target.getHealth(target) + this.getIntel());
		target.displayHealth();
	}
	public void fireball(Human target) {
		System.out.println(this.name + " threw a fireball on " + target.name);
		target.setHealth(target.getHealth(target) - this.getIntel()*3);
		target.displayHealth();

	}
}
