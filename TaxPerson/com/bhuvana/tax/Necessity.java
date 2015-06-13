package com.bhuvana.tax;

public class Necessity extends Item {

	public Necessity(double item) {
		super(item);
	}

	@Override
	public double addTax() {
		return price * .1 + price;
	}
}