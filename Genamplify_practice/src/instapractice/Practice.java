package instapractice;

public class Practice{	
	
	
	
	Practice(){
		
		System.out.println("hii this is constructer ");
		
		 
	 }
	Practice(String name){
		
		System.out.println("Hi this is parameter constructer");
		
		 
	 }
    Practice(String name,int s){
		
		System.out.println("Hi this is string and ints parameter constructer");
		
		 
	 }
	
	public static void main(String[] args) {
	
		Practice P = new Practice();
		Practice y = new Practice("hallo");
		Practice u = new Practice("hallo",2);
	  
//			
//			
//			 for(int i=0; i<=3; i++) {
//				 
//			 System.out.println("vinod is good boy");
		
		
	 }
		 
	 
	

}
