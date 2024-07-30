package gen_package;

public class For_do_while {

	public static void main(String[] args) {
 
		for(int i = 0; i<=20;i++) {
			
			
			System.out.println(i);
			
			
		}
		
		System.out.println("&&&&&&&&&&&");
		for (int i =0; i<=5;i++) {
			
			if((i!=3)&&(i!=5)) {
				
				System.out.println(i);
			}
		}
		
		System.out.println("**************");
		for(int i=10; i>=0; i-- ) {
			
			 
			System.out.print(","+i);
			
			System.out.println();
			
		}
		
		System.out.println("@@@@@@@@@");
		
		for(int a=0; a<=10; a++) {
			
			for(int b=1; b<=2; b++) {
				
				System.out.print(a);
			}
			
			System.out.println();
		}
	}

}
