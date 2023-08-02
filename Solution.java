
package com;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		System.out.println("Welcome to HDFC Bank");
		System.out.println("----------------------");
		Scanner sc=new Scanner(System.in);
		//upcasting to achieve abstraction
		Bank bank=new BankImpl(5000);
		while(true) {
			System.out.println("1:Deposit Amount\n2:Withdraw Amount\n3:Check Balance\n4:Exit");
			System.out.println("Enter the choice: ");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:System.out.println("Enter the amount to be deposited: ");
			int amountToDeposit=sc.nextInt();
			bank.deposit(amountToDeposit);//bank.deposit(sc.nextInt());		
			break;
			case 2:System.out.println("Enter the amount to be withdrawn: ");
			int amountToWithdraw=sc.nextInt();
			bank.withdraw(amountToWithdraw);//bank.withdraw(sc.nextInt());
			break;
			case 3:System.out.println("Available balance is Rs."+bank.checkBalance());
			break;
			case 4:System.out.println("Thank You! Visit Again");
			System.exit(0);
			default:
				try {
					String message="Invalid choice, Enter valid choice!";
					throw new InsuffiecentBalanceException(message);	
				}
				catch(Exception e) {
				System.out.println(e.getMessage());
			}
			}
			System.out.println("-------------------");
		}
	}

}
