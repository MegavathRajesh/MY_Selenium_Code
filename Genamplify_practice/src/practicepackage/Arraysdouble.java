package practicepackage;

public class Arraysdouble {

	public static void main(String[] args) {
 
		int [][] num = {{2,3,4,5,6,},{7,8,9,10,11,}};
		
		//System.out.println(num[0][1]);
		
		for(int i =0; i<num.length; i++ ) {
			
			for(int j=0;j<num[i].length;j++) {
			
			System.out.print(num[i][j]+" ");
 
			}
			System.out.println();
		}
		
		
	}

}
