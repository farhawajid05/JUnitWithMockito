package com.learn.service;

public class StringUtilityService {
	
	//provides the length of the string
	public int getLengthForInputString(String input) {
		return input.length();
	}
	
	//validates username and password
	public boolean validate(String username, String password) {
		try {
			if(username.equals("admin")&&password.equals("admin123"))
				return true;
		}
		catch(NullPointerException npe) {
			throw npe;
		}
		return false;
	}
	
	//convert to uppercase
	public String convertToUpperCase(String input) {
		return input.toUpperCase();
	}

}
