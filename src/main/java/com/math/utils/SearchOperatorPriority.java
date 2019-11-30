package com.math.utils;

import java.util.List;
import java.util.Optional;

import com.math.pojo.OperatorPriorityPojo;


/**
 * Funcion que retorna la prioridad del operador
 * @val Operador a evaluar para determinar su prioridad
 */
public class SearchOperatorPriority {
	public int searchOperator(String val){
		List<OperatorPriorityPojo> lstPri = Validations.lstPri();
		int orden = 0;
		Optional<OperatorPriorityPojo> op = lstPri.stream().filter(x -> String.valueOf(val).equals(x.getOperator())).findFirst();
		if(op.isPresent())
			orden = op.get().getOrder();
		return orden;
	}
}
