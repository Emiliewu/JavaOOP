package com.codingdojo.zookeeper;

public class Gorilla extends Mammal {

	public void throwSomething() {
		
		setEnergy(getEnergy() - 5);
		System.out.println("The gorilla threw something, energy decreased by 5!");
		displayEnergy();
	}
	public void eatBananas() {
		setEnergy(getEnergy() + 10);
		System.out.println("The gorilla ate bananas, energy increased by 10!");
		displayEnergy();
	}
	public void climb() {
		setEnergy(getEnergy() - 10);
		System.out.println("The gorilla climbed a tree, energy decreased by 10!");
		displayEnergy();
	}

}
