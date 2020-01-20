package com.ibaseit.supermarketdetailswithmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.log4j.FileAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;

import com.ibaseit.studentdetailsinlist.ListOfStudents;

public class Order implements OrdersInterface {
	public String uid;
	private Map map = new HashMap();;

	public Order() {
	}

	public Order(String uid) {
		this.uid = uid;
		// Map map = new HashMap();
	}// Order

	public boolean addProduct(Product p) {
		if (map.containsKey(p.getPid())) {
			Product p1 = (Product) map.get(p.getPid());
			p1.setPrice(p1.getPrice() + p.getPrice());
			p1.setQty(p1.getQty() + p.getQty());
			return true;
		}
		map.put(p.getPid(), p);
		return false;
	}// addProduct

	public boolean removeProduct(String pid) throws ProductNotFoundException {
		if (map.containsKey(pid)) {
			map.remove(pid);
			return true;
		} else
			throw new ProductNotFoundException("Product with ID " + pid + " is not Found.");
	}

	public Collection getCartDetails() {
		return map.values();

		/*
		 * Iterator it = ((Iterable) map).iterator(); while (it.hasNext()) { it.next();
		 */

	}

	public void getProductFromCart(String pid) {

		final Logger logger = Logger.getLogger(Order.class);
		FileAppender fileAppender = new FileAppender();
		String conversionPattern = "%-7p %d [%t] %c %x - %m%n";
		PatternLayout layout = new PatternLayout();

		if (map.containsKey(pid)) {
		System.out.println(	(Product) map.get(pid));
		} 
		else {
			// throw new ProductNotFoundException("Product with ID " + pid + " is not
			// Found.");

			fileAppender.setFile("E://ExceptionFileStoreforRemoving.txt");
			fileAppender.setLayout(layout);
			layout.setConversionPattern(conversionPattern);
			fileAppender.activateOptions();
			logger.addAppender(fileAppender);
			logger.setLevel(Level.DEBUG);
			logger.debug("The number is which you have gaven doesn't exists among index values");

		}
	
	}

	public int productCount() {
		return map.size();
	}

	public double getCartPrice() {
		double price = 0.0d;
		Iterator iterator = getCartDetails().iterator();
		while (iterator.hasNext()) {
			price += ((Product) iterator.next()).getPrice();
		}
		return price;

	}
}
