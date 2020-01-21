package src.com.ibaseit.supermarketmadewithmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;

import com.ibase.logging.util.LoggerDemo;

public class BussinessLogicSuperMarketOperations {
	private final static Logger logger = Logger.getLogger(LoggerDemo.class);

	Map<String, Double> items = new HashMap<>();

	public Map<String, Double> createproductPrice(String item, double price)
	{
		items.put(item, price);
		
		return items;
	}

	public Map<String, Double> deletProductPrice(String item) {
try
{
		items.remove(item);
}
catch(Exception e)
{
	logger.error(e);
}
		return items;

	}

	public Map<String, Double> updateProductPrice(String item, double price) {

		items.put(item, price);
		System.out.println(items);
		return items;
	}

	public Double readElements(String item) {

		try
		{
		System.out.println(items.get(item));

		}
		catch (Exception e)
		{
			logger.error(e);
		}

		return items.get(item);
	}
	

}
