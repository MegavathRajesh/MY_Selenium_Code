package Java;

public class Forloopprimeno {

	public static void main(String[] args) {
		 
		
		int num = 20;
		int count ;
		
		for(int i=1;i<=num;i++) {
			
			count = 0;
			for(int a=2;a<num/2;a++ ) {
				
				if(i%a==0) {
					count++;
					break;
				}
			}
			
			if(count==0) {
				
				System.out.println(i);
			}
			
			
			
			
			 
			
			  	
	 
		}

	}

}
