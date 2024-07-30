package abstraction;

interface oat{
	 int age = 20 ;
	 
	 void name();
}
public class Tested implements oat {
	
	
	@Override
	public void name() {
		 System.out.println("This is the interface class ");
		
	}
	public static void main(String[] args) {
		
		Tested obj = new Tested();
		obj.name();
	    System.out.println(obj.age);
	 
	}

	
}
