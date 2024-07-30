package gen_package;

public class withstatic {
	
	static int c = 25;
	static int d = 3;
    static int x = c+d;
	
	static void ram() {
		 System.out.println("The value of  C and D is  "+x);
	 }
	 
	static void raj(String a,int e) {
		 
		 System.out.println("Here the value of a and e "+a+e);
	 }

	public static void main(String[]rajesh) {
		
		 
		ram();
		
		raj("rajesh ", 6);
		raj("nani ", 6);
	}
}
