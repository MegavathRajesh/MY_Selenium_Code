package hashmap;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class Hashtbl2 {

	public static void main(String[] args) {

Hashtable h1 = new Hashtable();
		
		//Add the values
		h1.put(1, "Arvind");
		h1.put(2, "Java");
		h1.put(3, "Selenium");
		
		//System.out.println(h1);
		
		//Create another object
		//Clone of hashtable
		Hashtable h2 = new Hashtable();
		
		h2 = (Hashtable)h1.clone(); //in this way h2 has all values of h1
		System.out.println("Values of H1 : "+h1);
		System.out.println("Values of H2 : "+h2);
		
		h1.clear();
		System.out.println("Values of H1 : "+h1);
		System.out.println("Values of H2 : "+h2);
		
		//Create object
		Hashtable h3 = new Hashtable();
		h3.put("A", "Rao");
		h3.put("B", "Manager");
		h3.put("C", "Testing");
		
		//Contains value method
		//how to check the value is present or not
		if(h3.containsValue("Rao")) {
			System.out.println("Value is Present");
		}
		
		//Enumeration How to print all the values using Enumeration -- elements()
		Enumeration e = h3.elements();
		System.out.println("Print values from H3 using Enumeration");
		
		while(e.hasMoreElements()) {
			
			System.out.println(e.nextElement());
		}
		
		//Another way to print the values
		//get all the values from hashtable using -- entrySet() 
//		System.out.println("Print values from H3 using entrySet");
//		
//		Set s = h3.entrySet();
//		System.out.println(s);
//		
//		//get the value from key
//		System.out.println(h3.get("A"));
//		
//		h3.put("C", "Testing"); //will contain only unique values
//		System.out.println(h3);
//		
//		//it cannot have null key null values
////		h3.put(null, "Selenium"); 
////		System.out.println(h3); //display NullPointerException
////		
//		h3.put("D", null); //this is also not acceptable
//		System.out.println(h3);
		
		
		
	}


}
