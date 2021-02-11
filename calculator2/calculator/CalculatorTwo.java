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
		this.operands.clear();
	}
	
	//operator priority take place
	public void performOperation(Object o) {
		//validation
		this.operands.add(o);
		if((this.operands.size() % 2 == 0) && (o.equals("+") || o.equals( "-" )|| o.equals("*")|| o.equals( "/" ) || o.equals("="))) {
			this.isValid = true;
		} else if ((this.operands.size() % 2 != 0) && (!o.equals("+") & !o.equals("-") & !o.equals("*") & !o.equals("/") )) {
			this.isValid = true;
		}  else {
			this.isValid = false;
			throw new IllegalArgumentException("Cannot calculate, enter valid number or operator");
		}
//		System.out.println(this.isValid);
		if(o.equals("=") ) {
			if(isValid == true) {
				calculate();
			}
		}
		
		
	}
	
	public void calculate() {
		double temp = 0;
		for (int i = 0; i < this.operands.size(); i++) {
			if(this.operands.get(i).equals("*")) {
				temp = (double)this.operands.get(i-1) * (double)this.operands.get(i+1);
				this.operands.set(i-1, temp);
//				System.out.println(this.operands.get(i-1));
				this.operands.remove(i+1);
				this.operands.remove(i);
				i --;
//				System.out.println(this.operands.get(i));
			} else if(this.operands.get(i).equals("/")) {
				temp = (double)this.operands.get(i-1) / (double)this.operands.get(i+1);
				this.operands.set(i-1, temp);
//				System.out.println(this.operands.get(i-1));
				this.operands.remove(i+1);
				this.operands.remove(i);
//				System.out.println(this.operands.get(i));
				i --;
			} 	
		}
		for (int i = 0; i < this.operands.size(); i++) {
			if(this.operands.get(i).equals("+")) {
				temp = (double)this.operands.get(i-1) + (double)this.operands.get(i+1);
				this.operands.set(i-1, temp);
//				System.out.println(this.operands.get(i-1));
				this.operands.remove(i+1);
				this.operands.remove(i);
//				System.out.println(this.operands.get(i));
				i--;
			} else if(this.operands.get(i).equals("-")) {
				temp = (double)this.operands.get(i-1) - (double)this.operands.get(i+1);
				this.operands.set(i-1, temp);
//				System.out.println(this.operands.get(i-1));
				this.operands.remove(i+1);
				this.operands.remove(i);
//				System.out.println(this.operands.get(i));
				i--;
			} 	
		}

		result = (double)this.operands.get(0);
	}
		

}
