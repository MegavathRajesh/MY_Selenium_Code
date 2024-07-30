package gen_package;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist2 {

	public static void main(String[] args) {
   
		LinkedList<String>place = new LinkedList<String>();
		
		place.add("Goa");
		place.add("Ayodya");
		place.add("Tirupati");
		place.add("Golconda");
		place.add("Kamaredyy");
		
		System.out.println(place);
	
		
		place.addFirst("America");
		place.addLast("Asgaurd");
		
		System.out.println(place);
		
		System.out.println();
		
		Iterator<String>in= place.iterator();
		while(in.hasNext()) {
			System.out.println(in.next());
		}
	
		place.add("Ramesh");
		System.out.println(place);
		
		Iterator<String>on=place.descendingIterator();
      while(on.hasNext()) {
    	  System.out.println(on.next());
    	  
      }
      
      Collections.sort(place);
      System.out.println(place);
		
		
		
		
	}

}
