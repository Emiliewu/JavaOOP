package com.codingdojo.bankaccount;

import java.util.Random;

public class BankAccount {
	//(string) account number, (double) checking balance, (double) savings balance.
	protected String accountNumber;
	private double checkingBalance;
	private double savingBalance;
	private static int numberOfAccounts = 0;
	private static int totalDeposites = 0;
	
	public BankAccount() {
		setAccount();
		setChecking();
		setSaving();
		numberOfAccounts++;
	}
	public void setAccount() {
		this.accountNumber = generateAccount();
	}
	public void setChecking() {
		this.checkingBalance = 0;
	}
	public void setSaving() {
		this.savingBalance = 0;
	}
	public String getAccount() {
		return this.accountNumber;
	}
	public double getChecking() {
		return this.checkingBalance;
	}
	
	public double getSaving() {
		return this.savingBalance;
	}
		
	public void depositeChecking(double deposite) {
		this.checkingBalance += deposite;
		totalDeposites += this.checkingBalance;
	}
	
	public void depositeSaving(double deposite) {
		this.savingBalance += deposite;
		totalDeposites += this.savingBalance;
	}
	

	
	public double withdrawChecking(double amount) {
		if (amount > this.checkingBalance) {
			throw new IllegalArgumentException("Cannot withdraw, not sufficient balance");		
		} else {
			this.checkingBalance -= amount;
			totalDeposites -= amount;
		}
		return this.checkingBalance;
	}
	
	public double withdrawSaving(double amount) {
		if (amount > this.savingBalance) {
			throw new IllegalArgumentException("Cannot withdraw, not sufficient balance");		
		} else {
			this.savingBalance -= amount;
			totalDeposites -= amount;
		}
		return this.savingBalance;
	}
	
	private String generateAccount() {
		String accountNum = "";
		Random rand = new Random();
		for(int i = 0; i < 10; i++) {
			accountNum += String.valueOf(rand.nextInt(10));
		}
		return accountNum;
	}
	public double total() {
		return this.checkingBalance + this.savingBalance;
	}
	
	public void viewBalance() {
		System.out.println("Checking balance: $" + this.checkingBalance + " Saving balance: $" + this.savingBalance);
	}
	
	public static int getAccounts() {
		return numberOfAccounts;
	}
	
	public static double getTotalDeposites() {
		return totalDeposites;
	}
	
}
