package handlers;

import client.LoggerRequest;

public interface Logger {
	
	//sets the next logger (HANDLER) 
	public void setNextLevelLogger(Logger nextLevelLogger); 
	
	//log the message corresponding to the request and message  
	public void logMessage(LoggerRequest request, String msg) ;

	//display corresponding information 
	public abstract void displayLogInfo(String msg); 

}
