package com.bhuvana.tax;

import java.text.DecimalFormat;
/** Taxperson

Calculate the total cost of an item including tax based on whether it is considered a necessary or luxury item. 
The tax rate for basic necessities is 1%, the tax rate for luxury items is 9%. 
For simplicity of implementation, all transactions are measured in cents (pennies).
 * 
 */

/**
 * @Bhuvana 
 *
 */

public abstract class Item {

	protected double price;

	// This formats the item prices to 2 decimal places
	DecimalFormat df = new DecimalFormat("#.##");
	
	Item(double item) {
		price = item;
	}
	
	protected double getPrice() {
		return Double.parseDouble(df.format(price));
	}
	
	public double getPriceWithTax() {
		return Double.parseDouble(df.format(price + addTax()));
	}

	protected abstract double addTax();

}
