package src.com.ibaseit.logging;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Loggingforexception {
	public void divide() {
		int a = 12;
		System.out.println(a / 0);
	}

	public static void main(String[] args) {
		final Logger logger = Logger.getLogger(Loggingforexception.class);

		BasicConfigurator.configure();

		Loggingforexception obj = new Loggingforexception();

		try {
			obj.divide();
		}

		catch (ArithmeticException e) {
			logger.error("The number is getting divided by zero which is invalid", e);
		}

	}
}
