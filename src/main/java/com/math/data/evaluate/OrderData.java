package com.math.data.evaluate;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class OrderData implements IOrderData{

	@Override
	public String evaluarExpresion(String infix) {		
		List<Character> lstInfix = infix.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
		List<Character> lstPostfix = new ArrayList<>();
		
		lstInfix.stream().forEach(x -> {
			System.out.println(x);
		});
		return null;
	}
	
}
