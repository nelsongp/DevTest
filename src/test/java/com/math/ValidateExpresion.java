package com.math;

import org.junit.Assert;
import org.junit.Test;

import com.math.data.validate.ValidateData;


public class ValidateExpresion {
	ValidateData validar = new ValidateData();
	
	@Test
	public void expresionCorrecta() {
		String exp = "3+4";				
		Assert.assertEquals(true, validar.ValidarData(exp));
	}
	
	@Test
	public void numeroNegativo() {
		String exp = "-1+2";		
		Assert.assertEquals(false, validar.ValidarData(exp));
	}
	
	@Test
	public void caraterInvalido() {
		String exp = "1+(2)";
		Assert.assertEquals(false, validar.ValidarData(exp));		
	}
}
