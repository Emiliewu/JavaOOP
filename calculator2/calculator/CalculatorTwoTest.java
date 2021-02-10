package com.javaoop.calculator;

public class CalculatorTwoTest {

	public static void main(String[] args) {
		CalculatorTwo c = new CalculatorTwo();
		c.performOperation(10.5);
		c.performOperation("+");
		c.performOperation(5.2);
		c.performOperation("*");
		c.performOperation(10.0);
		c.performOperation("=");
		c.getResult();

	}

}
