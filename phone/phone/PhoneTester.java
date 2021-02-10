package com.javaoop.phone;

public class PhoneTester {

	public static void main(String[] args) {
		Galaxy s9 = new Galaxy("S9", 99, "Verizon", "HOHOHO");
		IPhone iphoneX = new IPhone("X", 100, "Fido", "Happy Valentines Day");
		
		s9.displayInfo();
		System.out.println(s9.ring());
		System.out.println(s9.unlock());
		
		iphoneX.displayInfo();
		System.out.println(iphoneX.ring());
		System.out.println(iphoneX.unlock());

	}

}
