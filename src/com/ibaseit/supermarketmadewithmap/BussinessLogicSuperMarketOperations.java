package com.ibaseit.supermarketmadewithmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;

import com.ibaseit.logging.Loggingforexception;

public class BussinessLogicSuperMarketOperations {
	
	
	final Logger logger = Logger.getLogger(BussinessLogicSuperMarketOperations.class);
	
	Map<String, Double> items = new HashMap<>();

	public Map<String, Double> createproductPrice(String item, double price) {
		items.put(item, price);
		return items;
	}

	public Map<String, Double> deletProductPrice(String item) 
	{
		String removeEle = item;
		Set set = items.entrySet();
		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());

			if (removeEle.equals(itr.next())) {
				itr.remove();
			}
		}
		return (Map<String, Double>) itr;
	}

	public Map<String, Double> updateProductPrice(String item, double price) {
		// items.put("Rice", 100.0);
		items.put(item, price);
		System.out.println(items);
		return items;

	}
}
