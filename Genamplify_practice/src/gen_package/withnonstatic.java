package gen_package;

public class withnonstatic {
	
	  int c = 25;
	  int d = 3;
     int x = c+d;
	
	  void ram() {
		 System.out.println("The value of  C and D is  "+x);
	 }
	 
	  void raj(String a,int e) {
		 
		 System.out.println("Here the value of a and e "+a+e);
	 }

	public static void main(String[]rajesh) {
		
		withnonstatic w = new withnonstatic();
		
		 
	    w.ram();
		
		w.raj("megastar ", 67);
		w.raj("powerstar ", 76);
		w.raj("megapower", 63);
	}
}
