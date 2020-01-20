package com.ibaseit.supermarketmadewithmap;

public class SuperMarketItems {
	 public static void main(String[] args) {

	        BussinessLogicSuperMarketOperations operations = new BussinessLogicSuperMarketOperations();
	        operations.createproductPrice("juice", 45.00);
	        operations.deletProductPrice("juice");
	        operations.updateProductPrice("rice", 77.00);

	 

	    }

	 
}
