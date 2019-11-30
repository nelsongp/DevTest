package com.math.utils;


/**
 * Funcion que valida si el character enviado es un numero
 * @param cha caracter enviado para validar si es numero o operador
 */
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
