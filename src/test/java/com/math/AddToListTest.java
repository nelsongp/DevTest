package com.math;

import org.junit.Assert;
import org.junit.Test;

import com.math.utils.PriorityOperator;

/**
 * Funcion que decide si saca elemento o no de la lista dependiendo de la prioridad del operador
 */
public class AddToListTest {
	PriorityOperator priOp = new PriorityOperator();
	@Test
	public void agregarLista() {
		Assert.assertEquals(false, priOp.operatorOrder('+', '*'));
		Assert.assertEquals(false, priOp.operatorOrder('+', '+'));
		Assert.assertEquals(true, priOp.operatorOrder('*', '-'));
	}
}
