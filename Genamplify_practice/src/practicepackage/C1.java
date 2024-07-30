package practicepackage;

import java.util.Scanner;

public class C1 {	
	
	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
 
	
		//System.out.print("here we printing scanner class:");
	
	String name = s.nextLine();
	String colour = s.nextLine();
	 int num = s.nextInt();
	
	
	System.out.println("the Scanner name is : "+name);
    System.out.println("The Scanner colour is : "+colour);
    System.out.println(num);
	}

}
