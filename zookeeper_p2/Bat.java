package com.codingdojo.zookeeper;

public class Bat extends Mammal{
	public Bat() {
		setEnergy(300);
	}
	public void fly() {
		setEnergy(getEnergy() - 50);
		System.out.println("The Bat is flying, energy decreased by 50!");
		displayEnergy();
	}
	public void eatHumans() {
		setEnergy(getEnergy() + 25);
		System.out.println("The Bat ate human, energy increased by 25!");
		displayEnergy();
	}
	public void attackTown() {
		setEnergy(getEnergy() - 100);
		System.out.println("The Bat is flying, energy decreased by 100!");
		displayEnergy();
	}

}
