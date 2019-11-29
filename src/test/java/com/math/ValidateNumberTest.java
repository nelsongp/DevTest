package com.math;

import org.junit.Assert;
import org.junit.Test;

import com.math.utils.ValidateNumber;

public class ValidateNumberTest {
	
	ValidateNumber validateNumber = new ValidateNumber();
	
	@Test
	public void positiveNumberTest() {		
		Assert.assertEquals(true, validateNumber.validateNumber('5'));
	}
	
	@Test
	public void notANumberTest() {
		Assert.assertEquals(false, validateNumber.validateNumber('+'));
	}
}
