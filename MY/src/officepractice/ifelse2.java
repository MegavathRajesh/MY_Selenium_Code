package officepractice;

public class ifelse2 {

	public static void main(String[] args) {
 
		
		int amount =0 ;
		
		if(amount>=1 && amount<=100) {
			
			System.out.println("Here display was Small ");
		}
        else if(amount>=101 && amount<=1000) {
			
			System.out.println("Here display was Medium ");
		}
       else if(amount>=1001 && amount<=10000) {
			
			System.out.println("Here display was big ");
		}
       else if(amount>=10000) {
			
			System.out.println("Here display was high ");
		}
		
       else  {
			
			System.out.println("Invalid ");
		}
	}
//"
}
