package com.codingdojo.zookeeper;

public class Mammal {
	private String name;
	private int energyLevel;
	
	public Mammal(String name, int energyLevel) {
		setName(name);
		setEnergy(energyLevel);
		
	}
	public Mammal(String name) {
		setName(name);
		setEnergy(100);
		
	}
	public Mammal() {
		setName(null);
		setEnergy(100);

		
	}
	public void setName(String name) {
		this.name = name;
	}

	public void setEnergy(int energyLevel){
	    this.energyLevel = energyLevel;
	}
	public String getName() {
		return this.name;
	}

	public int getEnergy(){
	    return energyLevel;
	}

	 public int displayEnergy(){
	     System.out.println("The current energy is: " + energyLevel);

	     return energyLevel;
	    }
}
