package javaPractice;

public class GSHClass {
	
	void rajesh() {
		
		int a = 453;
		int c = 564;
		
		System.out.println("here we add the values a & c  "+ a*c);
		System.out.println("here rajesh can do manual and automation testing ");
	}
	static void murthi() {
		
		System.out.println("murthi is one of the test engineer in GSH");
		}

       public static void main(String[] args) {
		 
		 // with out  object we can call methods with static keywords
		murthi();
		 ram();
		GSHClass G = new GSHClass();
		G.rajesh();	
	}
       																																																																																																																																																																																																																																																													static void ram () {
		System.out.println("Ram can write the test Scripts in automation testing");
		
		
	}
	
	
	
}
