package com.math;

import org.junit.Test;

import com.math.data.evaluate.OrderData;

public class OrderDataTest {
	
	OrderData data = new OrderData();
	
	@Test
	public void orderData() {
		String exp = "2+5*4-3";
		data.evaluarExpresion(exp);
	}
}
