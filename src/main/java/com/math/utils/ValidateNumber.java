package com.math.utils;

public class ValidateNumber {
	public Boolean validateNumber(Character cha) {
		try {
			Integer.parseInt(String.valueOf(cha));
			return true;
		} catch (Exception e) {
			return false;
		}		
	}
}
