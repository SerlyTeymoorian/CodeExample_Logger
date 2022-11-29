package driver;

import chain.Chain;
import client.LoggerRequest;

public class Driver {
	
	public static void main(String[] args) {
		
		//create a chain of handlers 
		Chain chainOfLoggers = new Chain(); 
		
		//handle the request by the handlers 
		chainOfLoggers.getLogger().logMessage(new LoggerRequest("ErrorInfo"), "An error occured now ");
	}

}
