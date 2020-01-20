package com.ibaseit.supermarketdetailswithmap;

public class SuperMarketDetails {
	public SuperMarketDetails(String item, double price) {
		super();
		this.item = item;
		this.price = price;
	}

	String item;
	double price;

	public String getItem() {
		return item;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "SuperMarketDetails [item=" + item + ", price=" + price + "]";
		
	}

}
