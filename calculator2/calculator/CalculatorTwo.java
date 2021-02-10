package com.javaoop.calculator;

import java.util.ArrayList;

public class CalculatorTwo {
	private ArrayList<Object> operands = new ArrayList<Object>();
	private boolean isValid = false;

	private static double result = 0;

	
	public CalculatorTwo() {
		
	}
	
	public static double getResult() {
		System.out.println("Current result is " + result);
		return result;
	}
	
	public void setZero() {
		result = 0;
	}
	
	//operator priority take place
	public void performOperation(Object o) {
		//validation
//		if((this.operands.size() % 2 == 0) && (o == "+" || o == "-" || o == "*" || o == "/" )) {
//			this.isValid = true;
//		} else if ((this.operands.size() % 2 != 0) && (o != "+" & o != "-" & o != "*" & o != "/")) {
//			this.isValid = true;
//		} else {
//			this.isValid = false;
////			throw new IllegalArgumentException("Cannot calculate, enter valid number or operator");
//		}
//		System.out.println(this.isValid);
		this.operands.add(o);
		if(o == "=") {
			calculate();
		} 
		
	}
	
	public void calculate() {
		double temp = 0;
		for (Object o: this.operands ) {
			if(o == "*") {
				int idx = this.operands.indexOf("*");
				temp = (double)this.operands.get(idx-1) * (double)this.operands.get(idx+1);
				this.operands.set(idx-1, temp);
				this.operands.remove(idx);
				this.operands.remove(idx+1);
			} else if (o == "/") {
				int idx = this.operands.indexOf("/");
				temp = (double)this.operands.get(idx-1) / (double)this.operands.get(idx+1);
				this.operands.set(idx-1, temp);
				this.operands.remove(idx);
				this.operands.remove(idx+1);
			} 	
		}

		for (Object o: this.operands) {
			if(o == "+") {
				int idx = this.operands.indexOf("+");
				temp = (double)this.operands.get(idx-1) + (double)this.operands.get(idx+1);
				this.operands.set(idx-1, temp);
				this.operands.remove(idx);
				this.operands.remove(idx+1);
			} else if (o == "-") {
				int idx = this.operands.indexOf("-");
				temp = (double)this.operands.get(idx-1) - (double)this.operands.get(idx+1);
				this.operands.set(idx-1, temp);
				this.operands.remove(idx);
				this.operands.remove(idx+1);
			} 	
		}
		result = temp;
	}
		

}
