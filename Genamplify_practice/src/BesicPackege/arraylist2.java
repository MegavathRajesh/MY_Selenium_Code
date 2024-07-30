package BesicPackege;

import java.util.ArrayList;
import java.util.Collections;

public class arraylist2 {

	public static void main(String[] args) {
		
		ArrayList<String>leaders=new ArrayList<String>();
		
		 leaders.add("KTR");
		 leaders.add("kA Paul");
		 leaders.add("KCR");
		 leaders.add("harish rao");
		 leaders.add("Revanth reddy");
		 
		 System.out.println(leaders);
		 System.out.println("Here The no.of leaders are : "+leaders.size());
		 leaders.remove(1);
		 System.out.println(leaders);
		 System.out.println("After Remove The Leader list is "+leaders.size());
		 leaders.remove("KCR");
		 System.out.println(leaders);
		 
		Collections.sort(leaders);
		System.out.println(leaders);
		
		 
		
		 
		 ArrayList<Integer>num=new ArrayList<Integer>();
		 num.add(34);
		 num.add(54);
		 num.add(65);
		 num.add(42);
		 num.add(87);
		 
		 
		 System.out.println(num);
		  
		 Collections.sort(num);
		 
		 System.out.println(num);
		 
 
	}

}
