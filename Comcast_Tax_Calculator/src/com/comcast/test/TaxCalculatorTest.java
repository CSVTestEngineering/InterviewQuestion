package com.comcast.test;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

import com.comcast.task.*;

public class TaxCalculatorTest {
	
	TaxCalculator tcalc= new TaxCalculator();
	
	@Test
	public void testTaxCalculation() throws Exception
	{
		assertEquals(tcalc.getItemTotalCost(100,1), 101.0);
		assertEquals(tcalc.getItemTotalCost(100,2), 109.0);
		assertEquals(tcalc.getItemTotalCost(0,1), 0.0);
	}
	
	@Test (expectedExceptions=Exception.class)
	public void testTaxCalculationErrorCase() throws Exception
	{
		tcalc.getItemTotalCost(100,3);

	}


}
