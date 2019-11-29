package com.math.utils;

import java.util.List;
import java.util.Optional;

import com.math.pojo.OperatorPriorityPojo;

public class PriorityOperator {
	public Boolean operatorOrder(Character in, Character isIn) {		
		int valOne = 0;
		int valTwo = 0;
		valOne = searchOperator(String.valueOf(in));		
		valTwo = searchOperator(String.valueOf(isIn));
		
		if(valOne == valTwo)
			return true;
		else if(valOne > valTwo)
			return true;
		else
			return false;
	}
	
	public int searchOperator(String val){
		List<OperatorPriorityPojo> lstPri = Validations.lstPri();
		int orden = 0;
		Optional<OperatorPriorityPojo> op = lstPri.stream().filter(x -> String.valueOf(val).equals(x.getOperator())).findFirst();
		if(op.isPresent())
			orden = op.get().getOrder();
		return orden;
	}
}
