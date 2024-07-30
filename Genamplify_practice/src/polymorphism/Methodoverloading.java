package polymorphism;

public class Methodoverloading {
	
	public void add(int a ) {
		
		System.out.println("Hai This Int parameter");
	}

   public void add(int s, String b ) {
		
		System.out.println("Hai This Int and String parameter");
	}
   public void add(String x ) {
		
		System.out.println("Hai This String  parameter");
	}

  public static void main(String[] args) {
	
	  Methodoverloading me = new Methodoverloading();
	  me.add(3);
	  me.add("HAi");
	  me.add(2, "hallo");
	  
}
}
