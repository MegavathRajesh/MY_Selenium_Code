package abstraction;

abstract class Car {
	
	private String model;
	private int year;
	// adding a constructor method
	public void car(String model, int year) {
		
		
		
		this.model = model;
		this.year = year;
		
	}
	
	// adding abstraction method
	
	abstract void startengine();
	
	abstract void carcolour();
	
	public void display() {
		
		System.out.println("Model :"+model+" and Year : "+year);
	}	
}

  class SWift extends Car{
	
	public SWift(String model, int year) {
		
		super.car(model, year);
	}

	@Override
	void startengine() {
		 System.out.println("The Engine Is Started");
		 
	}

	@Override
	void carcolour() {
		System.out.println("The Car Colour Is Red");
		
	}
}
  
  class hondacity extends Car {
	  
	  public hondacity(String model, int year) {
		  
		  super.car(model, year);
		  
	  }

	@Override
	void startengine() {
		
	 System.out.println("The Hondacity Car Engine will Started");
	}

	@Override
	void carcolour() {
		 
		System.out.println("The Hondacity Car Colour is Black");
	}
	  
	  
	  
	  
  }

  class Testcar {
	
	public static void main(String[] args) {
		
		Car ar = new SWift("Tayota", 2020);

	 
	ar.display();
		ar.startengine();
		ar.carcolour();
		
		Car ho = new hondacity("Huindai", 2023);
		ho.display();
		ho.startengine();
		ho.carcolour();
		
	}
	
	}

