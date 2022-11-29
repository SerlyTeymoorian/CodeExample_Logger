package client;

public class LoggerRequest {
	
	private int loggingRequestNumber; 
	
	//get the level based on the request
	public LoggerRequest(String msg) {
		
		if(msg.equals("OutputInfo")) {
			loggingRequestNumber = 1; 
			
		} else if(msg.equals("ErrorInfo")) {
			loggingRequestNumber = 2; 
			
		} else if(msg.equals("DebugInfo")) {
			loggingRequestNumber = 3; 
		}
	}
	
	//return the level 
	public int getLoggingRequestNumber() {
		
		return loggingRequestNumber; 
	}

}
