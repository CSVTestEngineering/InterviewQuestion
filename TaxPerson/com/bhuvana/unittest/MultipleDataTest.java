package com.bhuvana.unittest;
import java.util.ArrayList;
import java.util.List;

import com.bhuvana.tax.Item;
import com.bhuvana.tax.LuxuryItem;
import com.bhuvana.tax.Necessity;

public class MultipleDataTest {
	public static void main(String[] args) {

		Item milk = new Necessity(2.00);
		Item purse = new LuxuryItem(1.00);
		Item curd = new Necessity(4.00);
		Item handbag = new LuxuryItem(1.00);

		List<Item> items = new ArrayList<>();
		items.add(milk);
		items.add(purse);
		items.add(curd);
		items.add(handbag);
		
		for (Item item : items) {
			System.out.println(item.getPriceWithTax());
		}

	}

}