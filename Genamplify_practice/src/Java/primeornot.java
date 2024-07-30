package Java;

public class primeornot {

	public static void main(String[] args) {
// The number should be greater than 1
		//it contains only two factars
		int a = 18;
		int count = 0;
		
		if (a>1) {
			 
			for(int i =2 ; i<=a;i++ ) 
			{
				
				if(a%i==0) {
				count++;	
				}
				if(count==2)
				{
					System.out.println("the Number is prime ");
				}
				else {
					System.out.println("not a prime");
				}
			}
			
		}
		
		
		
		
		 
	}

}
