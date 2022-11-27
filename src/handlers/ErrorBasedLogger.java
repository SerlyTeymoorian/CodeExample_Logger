package handlers;

import client.LoggerRequest;

public class ErrorBasedLogger implements Logger {

	private int levels; 
	private Logger nextLevelLogger; 
	
	public ErrorBasedLogger() {
		this.levels = 2; 
	}
	
	@Override
	public void displayLogInfo(String msg) {
		System.out.println("ERROR LOGGER INFO: "+ msg);
		
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
