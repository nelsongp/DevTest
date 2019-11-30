package com.math;

import org.junit.Assert;
import org.junit.Test;

import com.math.utils.SearchOperatorPriority;

public class SearchOperatorTest {

	@Test
	public void prioridadOperador() {
		SearchOperatorPriority search = new SearchOperatorPriority();		
		Assert.assertEquals(2, search.searchOperator("*"));
		Assert.assertEquals(1, search.searchOperator("+"));
	}
}
