package com.codingdojo.bankaccount;

public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount emilie = new BankAccount();
		BankAccount coco = new BankAccount();
		
		emilie.depositeChecking(100000);
		emilie.depositeSaving(2000000);
		emilie.viewBalance();
		
		emilie.withdrawChecking(500);
		emilie.withdrawSaving(5000);
		emilie.viewBalance();
		double emilietotal = emilie.getChecking() + emilie.getSaving();
		System.out.println("Emilie in total have $" + emilietotal + " deposites");
		System.out.println("Emilie in total have $" + emilie.total() + " deposites");
		
		coco.depositeChecking(10000);
		coco.depositeSaving(3000000);
		coco.viewBalance();
		
		coco.withdrawChecking(500);
		coco.withdrawSaving(5000);
		coco.viewBalance();
		
		double cocototal = coco.getChecking() + coco.getSaving();
		System.out.println("Coco in total have $" + cocototal + " deposites");
		System.out.println("Coco in total have $" + coco.total() + " deposites");
		
		System.out.println("In total there are " + BankAccount.getAccounts() + " accounts");
		System.out.println("In total there are $" + BankAccount.getTotalDeposites() + " deposites");
	}

}
