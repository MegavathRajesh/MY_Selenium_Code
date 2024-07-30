package annapurna;

public class Meals2 extends Meals{

	
	void rice() {
		
		System.out.println("In annapurna restarent rice flavour very nice with mixing soda  ");
	}
	
	void curry() {
		
		System.out.println("There  curry very very bad");
	}
	
	public static void main(String[] args) {
		
		Meals2 m = new Meals2();
		m.curry();
		m.rice();
	
		Meals a = new  Meals();
		a.curry();
		a.rice();
		
	}
}
