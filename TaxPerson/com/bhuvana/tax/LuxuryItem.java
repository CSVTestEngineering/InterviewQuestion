package com.bhuvana.tax;

public class LuxuryItem extends Item {
	
	public LuxuryItem(double item) {
		super(item);
	}

	@Override
	public double addTax() {
		return price * .9 + price;
	}
}