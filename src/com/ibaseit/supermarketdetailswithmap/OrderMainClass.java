package com.ibaseit.supermarketdetailswithmap;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class OrderMainClass {
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the customer name");
		String s = scan.nextLine();
		Order o = new Order(s);
		Random random = new Random();

		o.addProduct(new Product("p101", "Lux Soap", 12, 120));

		o.addProduct(new Product("p102", "Olive Oil", 4, 140));

		// Order b = new Order("cortex");
		// b.addProduct(new Product("p105", "colgatte", 1, 20));

		System.out.println("\nNo. of Product : " + o.productCount());
		System.out.println("Order Places By: " + o.uid);

		// code to remove product from Cart
		// o.removeProduct("p102");

		// Get Product By its Id
		o.getProductFromCart("hgk");
	 

		System.out.println("total amount for products inside the cart is " + o.getCartPrice());
		final Iterator it = o.getCartDetails().iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			
			
			
			

		}
	}
	

}
