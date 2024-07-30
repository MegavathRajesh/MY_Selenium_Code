package polymorphism;

public class Methodoverriding3 extends Methodoverriding {
	
	
  void adding(int a) {
	  
	  System.out.println("Hai This is Grandchild method ");
  }
  
  public static void main(String[] args) {
	  
	  Methodoverriding obj = new Methodoverriding();
	  obj.adding(2);
	  
	  Methodoverriding obj1 = new  Methodoverriding2 ();
	  obj1.adding(3);
	  
	  Methodoverriding obj2 = new  Methodoverriding3();
	  obj2.adding(5);
}
}
