package com.math.data.evaluate;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

import com.math.utils.PriorityOperator;
import com.math.utils.ValidateNumber;
import com.math.utils.Validations;

public class OrderData implements IOrderData{

	@Override
	public String evaluarExpresion(String infix) {		
		List<Character> lstInfix = infix.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
		List<Character> outputStack = new ArrayList<>();
		List<Character> opStack = new ArrayList<>();
		ValidateNumber validateNumber = new ValidateNumber();
		PriorityOperator priorityOperator = new PriorityOperator();
		
		lstInfix.stream().forEach(x -> {
			if(validateNumber.validateNumber(x))
				outputStack.add(x);
			else {
				if(!opStack.isEmpty()) {
					int listVales = opStack.size();					
					for (int i = 0; i < listVales; i++) {
						if(priorityOperator.operatorOrder(x, opStack.get(listVales - 1))) {
							opStack.add(x);							
						} else {
							outputStack.add(opStack.remove(i));
						}
					}
					/*while(itr.hasNext()) {
						if(priorityOperator.operatorOrder(x, itr.next())) {
							opStack.push(x);							
						} else outputStack.push(opStack.pop());													
					}	*/				
				} else opStack.add(x);
			}
		});		
		System.out.println(outputStack.toString());
		System.out.println(opStack.toString());
		return null;
	}
	
}
