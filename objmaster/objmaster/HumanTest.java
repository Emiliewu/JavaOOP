package com.codingdojo.objmaster;

public class HumanTest {

	public static void main(String[] args) {
		Human h = new Human("human");
		h.attack(h);
		h.displayHealth();
		Ninja ninja1 = new Ninja("Ninja1");
		Ninja ninja2 = new Ninja("Ninja2");
		Wizard wizard1 = new Wizard("Wizard1");
		Samurai samurai1 = new Samurai("Samurai1");
		Samurai samurai2 = new Samurai("Samurai2");
		Samurai samurai3 = new Samurai("Samurai3");
		
		ninja1.steal(ninja2);
		ninja1.runAway();
		
		wizard1.fireball(ninja1);
		wizard1.heal(ninja2);
		
		samurai3.deathBlow(ninja1);
		samurai1.meditate();
		samurai2.deathBlow(samurai3);
		samurai2.meditate();
		samurai1.deathBlow(samurai2);
		wizard1.heal(samurai3);
		wizard1.heal(samurai2);
		wizard1.heal(ninja1);
		
		System.out.println(Samurai.howmany());
		
	}
}
