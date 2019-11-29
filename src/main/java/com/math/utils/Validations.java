package com.math.utils;

import java.util.ArrayList;
import java.util.List;

import com.math.pojo.OperatorPriorityPojo;



public class Validations {
	public static final String LIST_CORRECT = "(){}[]";
	public static final String MINUS_FIRST = "-";
	public static final String VALID_OPERATION = "+,-,*,/";	
	
	public static final List<OperatorPriorityPojo> lstPri (){
		List<OperatorPriorityPojo> lstOp = new ArrayList<>();
		lstOp.add(new OperatorPriorityPojo("+", 1));
		lstOp.add(new OperatorPriorityPojo("-", 1));
		lstOp.add(new OperatorPriorityPojo("*", 2));
		lstOp.add(new OperatorPriorityPojo("/", 2));
		return lstOp;
	};
}	
