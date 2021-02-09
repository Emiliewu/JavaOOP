package com.codingdojo.zookeeper;

public class Mammal {
	private String name;
	private int energyLevel;
	
	public Mammal(String name, int energyLevel) {
		this.name = name;
		this.energyLevel = energyLevel;
		
	}
	public Mammal(String name) {
		this.name = name;
		this.energyLevel = 100;
		
	}
	public Mammal() {
		this.name = null;
		this.energyLevel = 100;
		
	}

	public void setEnergy(int energyLevel){
	    this.energyLevel = energyLevel;
	}

	public int getEnergy(){
	    return energyLevel;
	}

	 public int displayEnergy(){
	     System.out.println("The current energy is: " + energyLevel);

	     return energyLevel;
	    }
}
