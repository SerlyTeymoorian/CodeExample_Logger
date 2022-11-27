package driver;

import chain.Chain;
import client.LoggerRequest;

public class Driver {
	
	public static void main(String[] args) {
		
		Chain chainOfLoggers = new Chain(); 
		
		chainOfLoggers.getLogger().logMessage(new LoggerRequest("ErrorInfo"), "An error occured now ");
	}

}
