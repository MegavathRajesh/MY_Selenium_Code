package abstraction;

abstract class Bikes{
	
	private String model;
	private int year;
	
	//conccreate method
	
	public Bikes(String model, int year) {
		
		this.model=model;
		this.year=year;	
	}
	// creating abstract method 
	abstract void bikeengine();
	abstract void bikecolour();
	
	// normal method 
	public void display() {
		System.out.println("Model : "+model +" and Year : "+year);
		
	}
}
class Pulsar extends Bikes {

	 public Pulsar(String model,int year) {
		 super(model, year);
	 }

	@Override
	void bikeengine() {
	 System.out.println("The Bike Engine is started nicely");
		
	}

	@Override
	void bikecolour() {
		 System.out.println("The Bike Colour is Red and black");
		
	}	
		
	}

class Royal extends Bikes{

	 public Royal (String model , int year) {
		 super(model, year);
		 
	 }

	@Override
	void bikeengine() {
		System.out.println("The Bike Engine is started Hardly");
		 
	}

	@Override
	void bikecolour() {
		 
		 System.out.println("The Bike Colour is Red");
	}
	
	
}
	
public class Abstractrun {

	public static void main(String[] args) {
		
		Bikes obj = new Pulsar("Bajaj", 2024);
		obj.display();
		obj.bikeengine();
		obj.bikecolour();
		
		Bikes obj1 = new Royal("Bullet 350", 2021);
		obj1.display();
		obj1.bikeengine();
		obj1.bikecolour();
		 

	}

}
