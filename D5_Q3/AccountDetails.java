package com.D5_Q3;

import java.util.Scanner;

public class AccountDetails {

	
	public Account getAccountDetails() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Account Id:");
		int accountId = input.nextInt();
		
		System.out.println("Enter Account Type:");
		String accountType = input.next();
		
		System.out.println("Enter Balance:");
		int balance = input.nextInt();
		
		while(balance <= 0)
		{
			System.out.println("Balance should be positive:");
			System.out.println("Enter Balance:");
			balance = input.nextInt();
		}
		
		Account a1 = new Account();
		a1.setAccountId(accountId);
		a1.setAccountType(accountType);
		a1.setBalance(balance);
		
		return a1;
		
	}
	
	public int getWithdrawAmount() {
		
        Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Amount to be Withdrawl:");
		int withdraw = input.nextInt();
		
		while(withdraw <= 0)
		{
			System.out.println("Amount should be positive:");
			System.out.println("Enter Amount to be Withdrawl:");
			withdraw = input.nextInt();
		}
		return withdraw;
	}
	
	
	
	public static void main(String[] args) {
		
		AccountDetails ad1 = new AccountDetails();
		
		Account a1 = ad1.getAccountDetails();
		
		int withdrawl  = ad1.getWithdrawAmount();
		
		a1.withdraw(withdrawl);		
	}
}
