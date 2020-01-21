package src.com.ibaseit.supermarketmadewithmap;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class BussinessLogicSuperMarketOperationsTest {

	BussinessLogicSuperMarketOperations operations = new BussinessLogicSuperMarketOperations();
	Map<String, Double> productPrice = new HashMap<>();

	@Test
	public void testCreateproductPrice() {

		String item = "juice";
		double price = 25.0;
		Map<String, Double> actualProductPrice = operations.createproductPrice(item, price);

		productPrice.put("juice", 25.0);
		Assert.assertEquals(productPrice, actualProductPrice);

	}

	@Test
	public void testUpdateProductPrice() {

		String item = "rice";
		double price = 35.0;
		Map<String, Double> actualProductPrice = operations.updateProductPrice(item, price);
		productPrice.put("rice", 35.0);

		Assert.assertEquals(productPrice, actualProductPrice);

	}

	@Test
	public void testDeletProductPrice() {

		String item = "juice";
		double price = 78.0;
		Map<String, Double> actualProductPrice = operations.createproductPrice(item, price);

		Map<String, Double> actualProductPrice2 = operations.deletProductPrice(item);

		productPrice.put("juice", 25.0);

		Assert.assertNotEquals(productPrice, actualProductPrice2);
	}
	
	
	

}
