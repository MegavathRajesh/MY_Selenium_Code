package variables;

public class Localvariable {
	
	
	void gen () {
		
		int s = 23;
		int y = 32;
		System.out.println("here The value Of s and y "+ (s+y));
		
	}
	
	void sol() {
		
		String st = "Hai iam Rajesh";
		
		System.out.println("The Sol method " + st);
		
	}
	 
	void hub() {
		
		 String r = " Hai this is Hub Method";
		 
		 System.out.println("The Hub method " + r);
	}

	public static void main(String[] args) {
		
		Localvariable local = new Localvariable();
		
		local.gen();
		local.sol();
		local.hub();
		
				
		 
	}

}
