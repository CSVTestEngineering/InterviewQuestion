package com.bhuvana.unittest;
import com.bhuvana.tax.LuxuryItem;
import com.bhuvana.tax.Necessity;
public class SingleDataTest {

	public static void main(String[] args) {

		System.out.println("NECESSITY ITEMS\n");
		
		Necessity milk = new Necessity(1.00);

		System.out.println(milk.getPriceWithTax() + "\n");

		System.out.println("LUXURY ITEMS\n");
		
		LuxuryItem purse = new LuxuryItem(1.00);

		System.out.println(purse.getPriceWithTax() + "\n");

	}

}