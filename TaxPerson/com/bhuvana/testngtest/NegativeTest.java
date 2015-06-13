package com.bhuvana.testngtest;
import static org.testng.AssertJUnit.assertEquals;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

import com.bhuvana.tax.Item;
import com.bhuvana.tax.LuxuryItem;
import com.bhuvana.tax.Necessity;
public class NegativeTest {
@Test(dataProvider = "dp")
  public void tesGetPriceWithTax(Item item, double price) {
	  if(item instanceof Necessity) {
		  assertEquals(item.getPriceWithTax(), price);
	  } else if (item instanceof LuxuryItem) {
		  assertEquals(item.getPriceWithTax(), price);
	  }
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
    	{new LuxuryItem(1.00), 1.9},
    	{new Necessity(1.00), 1.1}
    };
  }

}