package com.math.data.validate;

import com.math.utils.Validations;

public class ValidateData implements IValidateData{

	@Override
	public Boolean ValidarData(String infix) {
		
		char[] validate = infix.toCharArray();
		char[] lstCorrect = Validations.LIST_CORRECT.toCharArray();	
		boolean response = true;
		
		if(Validations.MINUS_FIRST.charAt(0) == validate[0]) {
			 System.out.println("Numero negativo");
			 response = false;
		} else {
			for (char c : validate) {
				for (char d : lstCorrect) {
					if(c == d) {
						System.out.println("caracter Incorrecto");	
						response = false;						
					}
						
				}
			}
		}
		return response;
	}

}
