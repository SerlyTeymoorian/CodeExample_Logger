package chain;

import handlers.ConsoleBasedLogger;
import handlers.DebugBasedLogger;
import handlers.ErrorBasedLogger;
import handlers.Logger;

public class Chain {
	
	private Logger l1;  
	
	public Chain() {
		l1 = new ConsoleBasedLogger(); 
		Logger l2 = new ErrorBasedLogger();
		Logger l3 = new DebugBasedLogger(); 
		
		l1.setNextLevelLogger(l2);
		l2.setNextLevelLogger(l3);
		
	}
	
	public Logger getLogger() {
		return l1; 
	}

}
