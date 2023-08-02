package com;

public class InvalidChoiceException {
	private String message;
	InvalidChoiceException(String message){
		this.message=message;	
	}
	public String getMessage(){
		return message;
	}

}
