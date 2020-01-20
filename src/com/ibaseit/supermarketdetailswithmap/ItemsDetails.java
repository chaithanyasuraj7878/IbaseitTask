package com.ibaseit.supermarketdetailswithmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ItemsDetails {
	public static void main(String[] args) {

		Map map = new HashMap();
		map.put("oil", 98.2);
		map.put("rice", 42);
		map.put("pulses", 78.9);
		map.put("biscuits", 10);
		map.put("chocolate", 20);

		Scanner scan = new Scanner(System.in);
		System.out.println("which item price you want to know");

		String key = scan.nextLine();

		System.out.println("how  many " + key + " item do you want");
		int number = scan.nextInt();

		System.out.println(map.get(key));

		map.remove("oil");
		System.out.println(map.get("rice"));

		map.put("rice", 78);
		System.out.println(map.get("rice"));

	}
}
