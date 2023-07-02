package Exceptions;

public class NoAppFoundException extends RuntimeException {

	
	public NoAppFoundException() {
		super("The App is not found in config file");
		
	}
	
	
	
	
}
