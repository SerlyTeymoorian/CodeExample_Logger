package chain;

import handlers.ConsoleBasedLogger;
import handlers.DebugBasedLogger;
import handlers.ErrorBasedLogger;
import handlers.Logger;

public class Chain {
	
	//root logger 
	private Logger l1;  
	
	//setting up the chain 
	public Chain() {
		l1 = new ConsoleBasedLogger(); 
		Logger l2 = new ErrorBasedLogger();
		Logger l3 = new DebugBasedLogger(); 
		
		//handler pointing to the next handler 
		l1.setNextLevelLogger(l2);
		l2.setNextLevelLogger(l3);
		
	}
	
	//return root logger 
	public Logger getLogger() {
		return l1; 
	}

}
