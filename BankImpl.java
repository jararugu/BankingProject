package com;
import com.InsuffiecentBalanceException;

public class BankImpl implements Bank{
	int bal;
	BankImpl(int bal){
		this.bal=bal;
	}

	@Override
	public void deposit(int amount) {
		System.out.println("Depositing Rs."+amount);
		bal+=amount;
		System.out.println("Amount Deposited Successfully!!!");	
	}

	@Override
	public void withdraw(int amount) {
		if(amount<=bal) {
		System.out.println("Withdrawing Amount Rs."+amount);
		bal-=amount;
		System.out.println("Amount Withdrawn Successfully!!!");
		}
		else
		{
			try {
				String message="Insufficient Balance";
				throw new InsuffiecentBalanceException(message);	
			}
			catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	}

	@Override
	public int checkBalance() {
		return bal;
	}

}
