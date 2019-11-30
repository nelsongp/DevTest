package com.math.utils;


/**
 *Funcion que retorna prioridad de los operadores
 *@param in Valor entrante a la cola
 *@param isIn Valor que ya se encuentra en la pila
 */
public class PriorityOperator {
	public Boolean operatorOrder(Character in, Character isIn) {
		SearchOperatorPriority search = new SearchOperatorPriority();
		int valOne = 0;
		int valTwo = 0;
		valOne = search.searchOperator(String.valueOf(in));		
		valTwo = search.searchOperator(String.valueOf(isIn));
		
		if(valOne == valTwo || valOne < valTwo)
			return false;
		else
			return true;
	}		
}
