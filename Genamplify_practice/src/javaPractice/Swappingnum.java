package javaPractice;

public class Swappingnum {

	public static void main(String[] args) {
	 
		int a= 20,b= 32;
		System.out.println("before swap a="+a +" and b= "+b);
		 
		a=a+b;// 20+32=52
		b=a-b;// 52-32=20
		
		a=a-b;//52-20=32
		
		System.out.println("After swap a= "+a +" and b= "+b);
		

	}

}
