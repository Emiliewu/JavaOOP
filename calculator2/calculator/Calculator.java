package com.javaoop.calculator;
import java.util.ArrayList;

public class Calculator {
	private double operandOne;
	private String operation;
	private double operandTwo;
	private static double result;
	private ArrayList<Double> operand = new ArrayList<Double>();
	
	public Calculator() {
		
	}
	public Calculator(double operandOne, String operation, double operandTwo) {
		this.operandOne = operandOne;
		this.operation = operation;
		this.operandTwo = operandTwo;
	}
	
	public void setOperand(double n) {
		operand.add(n);
	}
	
	public void setOperandOne(double n) {
		this.operandOne = n;
	}
	
	public void setOperandTwo(double n) {
		this.operandTwo = n;
	}
	
	public void setOperation(String o) {
		this.operation = o;
	}
	
	public static double getResult() {
		System.out.println("Current result is " + result);
		return result;
	}
	
	public void setZero() {
		result = 0;
	}
	
	public void performOperation() {
		if (this.operation == "+" ||this.operation ==  "add") {
			result = this.operandOne + this.operandTwo;
		} else if (this.operation == "-" ||this.operation ==  "minus") {
			result = this.operandOne - this.operandTwo;
		}
	}

}
