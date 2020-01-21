package src.com.ibaseit.logging;

import java.util.logging.LogManager;
import java.util.logging.Logger;

public class LogMainClass {

	public static void main(String[] args) {
		// reset() will remove all default handlers
		LogManager.getLogManager().reset();
		Logger rootLogger = LogManager.getLogManager().getLogger("");

		//rootLogger.addHandler(new MyLogHandler());
		AppClass appClass = new AppClass();
		appClass.doSomething();
		rootLogger.info("some message");
	}

}
