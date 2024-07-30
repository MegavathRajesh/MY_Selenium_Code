package enumset;

public class Enumpackage2 {
	 
	  enum Level{
		  
		  low,
		  medium,
		  high
	  }

	  public static void main(String[] args) {
		
		  Level myval = Level.high;
		  
		  switch(myval) {
		  case low:
			  System.out.println("low level");
		  break;
		  
		  case medium:
			  System.out.println("medium level");
		  break;
			
		  case high:
			  System.out.println("high level");
		  }
		  
		  
	}
	  
	}



