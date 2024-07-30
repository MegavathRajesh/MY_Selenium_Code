package polymorphism;

public class Methodoverloading2 {
	
	 public  int multiply(int a , int b) {
		 
		 return a*b;
	 }
	 
    public  double multiply(double x , double y) {
		 
		 return x*y;
	 }
 
   public static void main(String[] args) {
	  
	   Methodoverloading2 obj = new Methodoverloading2();
	   
	 System.out.println(obj.multiply(3, 8));  
	 System.out.println(obj.multiply(5.2, 4.3));
	   
	 
	
}
}
