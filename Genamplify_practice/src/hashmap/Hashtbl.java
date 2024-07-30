package hashmap;

import java.util.Hashtable;

public class Hashtbl {

	public static void main(String[] args) {

           Hashtable t1 = new Hashtable();
           t1.put('k', "hashmap");
           t1.put('a', "Rajesh");
           t1.put('L', "Nagesh");
           t1.put('r', "Ravi");
           t1.put('n', "Naresh");
           t1.put('N', "Naga");
           t1.put('R', "Rama");
           t1.put('T', "Ramesh");
           
           
           System.out.println(t1);
           Hashtable t2 = new  Hashtable();
           t2.put('M', "megavth");
           
           System.out.println(t2);
           t2 =(Hashtable)t1.clone();
           
           System.out.println(t2);
           System.out.println(t1);
           
           Hashtable t3 = new  Hashtable();
           t3.put('T', "Telugu");
           t3.put('H', "Hindi");
           t3.put('E', "English");
           t3.put('M', "Maths");
           t3.put('S', "Science");
           
           System.out.println(t3);

           
           
	}

}
