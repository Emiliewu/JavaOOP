package com.javaoop.phone;

public class Galaxy extends Phone implements Ringable {
	private String versionNumber;
    private int batteryPercentage;
    private String carrier;
    private String ringTone;
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
        this.versionNumber = versionNumber;
        this.batteryPercentage = batteryPercentage;
        this.carrier = carrier;
        this.ringTone = ringTone;
    }
    @Override
    public String ring() {
    	return "Galaxy " + this.versionNumber + " says " + this.ringTone;
    }
    @Override
    public String unlock() {
        return "Unlocking via finger print";
    }
    @Override
    public void displayInfo() {
        System.out.println("Galaxy " + this.versionNumber + " from " + this.carrier);           
    }
}