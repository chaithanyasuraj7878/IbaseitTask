package com.ibaseit.supermarketdetailswithmap;

import java.util.Collection;

public interface OrdersInterface {
	boolean addProduct(Product p);

	boolean removeProduct(String pid) throws ProductNotFoundException;

	Collection getCartDetails();

	Product getProductFromCart(String pid) throws ProductNotFoundException;

	int productCount();

	double getCartPrice();
}
