package com.day5;

public class Example9 {
	static double withdraw(int balance,int amount) {
		try {
		assert balance>amount;
		return balance-amount;
		}
		catch(AssertionError e) {
			System.out.println("balance is not greater than");	
		}
		return amount;
	}
	public static void main(String[] args) {
		System.out.println(withdraw(1000,500));
		System.out.println(withdraw(1000,2000));

	}

}
