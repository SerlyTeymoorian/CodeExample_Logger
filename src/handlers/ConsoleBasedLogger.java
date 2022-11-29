package handlers;

import client.LoggerRequest;

public class ConsoleBasedLogger implements Logger {
	
	//set the level of the logger 
	private int levels; 
	private Logger nextLevelLogger; 

	//constructor to set the level 
	public ConsoleBasedLogger() {
		this.levels = 1; 
	}
	
	//display the log info 
	@Override
	public void displayLogInfo(String msg) {
		System.out.println("CONSOLE LOGGER INFO: "+ msg); 
		
	}
	
	//set the logger that the current logger will point to 
	@Override
	public void setNextLevelLogger(Logger nextLevelLogger) {
		this.nextLevelLogger = nextLevelLogger; 
		
	}
	//handle the request sent by the client 
	@Override
	public void logMessage(LoggerRequest request, String msg) {
		
		if(this.levels <= request.getLoggingRequestNumber()){  
            		displayLogInfo(msg);  
		}  
		//check if it is poiting to another logger 
		if (nextLevelLogger!=null) {  
			nextLevelLogger.logMessage(request, msg);  
		}  
	
		
	}
	

}
