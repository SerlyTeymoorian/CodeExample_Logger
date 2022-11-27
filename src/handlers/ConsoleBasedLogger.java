package handlers;

import client.LoggerRequest;

public class ConsoleBasedLogger implements Logger {
	
	private int levels; 
	private Logger nextLevelLogger; 

	public ConsoleBasedLogger() {
		this.levels = 1; 
	}
	
	@Override
	public void displayLogInfo(String msg) {
		System.out.println("CONSOLE LOGGER INFO: "+ msg); 
		
	}
	
	@Override
	public void setNextLevelLogger(Logger nextLevelLogger) {
		this.nextLevelLogger = nextLevelLogger; 
		
	}
	
	@Override
	public void logMessage(LoggerRequest request, String msg) {
		
		if(this.levels <= request.getLoggingRequestNumber()){  
            		displayLogInfo(msg);  
		}  
		if (nextLevelLogger!=null) {  
			nextLevelLogger.logMessage(request, msg);  
		}  
	
		
	}
	

}
