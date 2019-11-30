package com.math.data.validate;

import org.springframework.stereotype.Service;

import com.math.utils.Validations;


/**
 * Funcion para validar si el string enviado es valido
 * @param infix cadena de caracteres digitada por el usuario para ser evaluada
 */
@Service
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
