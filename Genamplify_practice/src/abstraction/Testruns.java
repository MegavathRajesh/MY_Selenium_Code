package abstraction;

  abstract class bike{
	  
	  private String model;
	  private int year;
	  
	  public bike(String model,int year) {
		 this.model=model;
		 this.year= year;
		 
	  }
	    abstract void startbike();
	    
	    abstract void bikecolour();
	    
	    public void display() {
	    	
	    	System.out.println("Model : "+model+" and Year : "+ year);	
	    }
	    
  }
	class Bullet350 extends bike{

		 
        public Bullet350(String model, int year){
        	
        	super(model, year);
       
        }
		 

		@Override
		void startbike() {
			 System.out.println("The Bike Started");
		}

		@Override
		void bikecolour() {
			 System.out.println("The Bike Colour is Gray");
			
		}	
		
	}

public class Testruns {

	public static void main(String[] args) {
	 
		bike bi = new Bullet350("Royal enfield", 2021);
		
		bi.display();
		bi.startbike();
		bi.bikecolour();

	}

}
