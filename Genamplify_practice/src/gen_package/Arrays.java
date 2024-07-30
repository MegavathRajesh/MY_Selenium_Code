package gen_package;

public class Arrays {//An Array is a group of similar elements or data items of the same 

	public static void main(String[] args) {
		 
		
		String[] cars= {"BMW ", "Audi ", "Bukhati ","benze ","kia "};
		
		/*System.out.println(cars[0]);
		System.out.println(cars[1]);
		System.out.println(cars[2]);*/

		for(int i=0; i<cars.length; i++) {
			
			System.out.println(cars[i]);
		}
		
		
		String[] names = {"Rajesh ,","Naresh ,","Ramesh ,","Nagesh ,","Vinod ,","Roshan ,", "Naveen ,"};
		
		//System.out.println(names[0]);
		
		for(int i=names.length-1; i>=0; i--) {
			
			System.out.print(names[i]);
		}
		

	}

}
