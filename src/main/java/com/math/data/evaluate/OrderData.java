package com.math.data.evaluate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.math.utils.PriorityOperator;
import com.math.utils.ValidateNumber;

/**
 * Funcion que ordena los elementos intfix para convertirlo a postfix
 * @param intfix String enviado por el usuario para ser convertido
 */
@Service
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
				//validamos si el array no esta vacio
				if(!opStack.isEmpty()) {			
					//calculamos los elementos actuales del array
					int listVales = opStack.size();
					//recorremos cada elemento del array
					for (int i = 0; i < listVales; i++) {
						int listValesAct = opStack.size();
						//evaluamos la cantidad actual de elementos del array
						int b = listValesAct == 0 ? 0 : listValesAct - 1;
						//si el operador es menor o igual al operador dentro del array lo ingresamos al array de opstack
						if(priorityOperator.operatorOrder(x, opStack.get(b))) {
							opStack.add(x);							
						} else {
							//si se cumple la condicion de un operador con mas prioridad lo sacamos del array op y lo
							//ingresamos al array de salida.
							outputStack.add(opStack.get(b));
							opStack.remove(b);	
							//si es el ultimo elemento lo ingresamo al opstack
							if(b==0)
								opStack.add(x);
						}
					}			
				} else opStack.add(x);
			}
		});		
		StringBuilder str = new StringBuilder();
		//devolvemos el array de operadores restantes en reversa por orden de prioridad
		Collections.reverse(opStack);				
		outputStack.forEach(x -> str.append(x));
		opStack.forEach(x -> str.append(x));		
		System.out.println(str);
		return str.toString();
	}
	
}
