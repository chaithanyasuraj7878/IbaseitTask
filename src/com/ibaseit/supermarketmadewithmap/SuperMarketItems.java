package src.com.ibaseit.supermarketmadewithmap;

import java.util.Scanner;

public class SuperMarketItems {
	public static void main(String[] args) {

		BussinessLogicSuperMarketOperations operations = new BussinessLogicSuperMarketOperations();
		Scanner scan = new Scanner(System.in);
		System.out.println("enter 1 to create product  operation");
		System.out.println("enter 2 to delete operation");
		System.out.println("enter 3 to update operation");
		System.out.println("enter 4 to read the product price");
		int operation = scan.nextInt();

		if (operation == 1) {
			System.out.println("enter product name");
			String product = scan.next();

			System.out.println("enter the product price");
			double price = scan.nextDouble();
			operations.createproductPrice(product, price);

		}

		else if (operation == 2) {

			System.out.println("enter product name");
			String product = scan.next();

			operations.deletProductPrice(product);

		}

		else if (operation == 3) {

			System.out.println("enter product name");
			String product = scan.next();

			System.out.println("enter the product price");
			double price = scan.nextDouble();
			operations.updateProductPrice(product, price);

		} else if (operation == 4) {
			System.out.println("enter the product for which you want to know the price");
			String product = scan.next();

			operations.readElements(product);
		}

	}
	
	
	

}
