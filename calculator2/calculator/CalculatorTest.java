package com.javaoop.calculator;

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.setOperandOne(25.0);
		c.setOperation("+");
		c.setOperandTwo(50.0);
		c.performOperation();
		c.getResult();
		

	}

}
