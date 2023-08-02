package com;

public class InsuffiecentBalanceException {
	private String message;
	InsuffiecentBalanceException(String message)
	{
		this.message=message;	
	}
	public String getMessage() {
		return message;
	}

}
