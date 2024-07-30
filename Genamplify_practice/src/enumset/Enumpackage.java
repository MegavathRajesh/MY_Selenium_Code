package enumset;

import java.util.EnumSet;

public class Enumpackage {
	//creating enum 
		enum months{ //lang is the enum name
		   January,
			Febraury,
			March,
			April,
			May
		}

		public static void main(String[] args) {
	 
		 
			EnumSet<months> ll = EnumSet.noneOf(months.class);
			
	 System.out.println(ll);
	 
 	 	EnumSet<months>enumRange = EnumSet.range(months.January, months.April);
	  
	   	
	  System.out.println(enumRange); //will not print SELENIUM
			
	  	 
	  EnumSet<months>enumoff = EnumSet.of(months.March);
 	    
	 System.out.println(enumoff);
	 
	 	 
	 EnumSet<months>multipleenum = EnumSet.of(months.January, months.May);
	 System.out.println(multipleenum);
	 
	 	 
	 	EnumSet<months>lg1 = EnumSet.allOf(months.class);
	 	EnumSet<months>lg2 = EnumSet.noneOf(months.class);
	 	
	 	System.out.println(lg1);  
	 	System.out.println(lg2);  
	 	
	 	  
	 	lg2.addAll(lg1);
	 	System.out.println("After addAll method : "+lg2);
	 	
	 	  
	 	EnumSet<months>fulllang = EnumSet.allOf(months.class);
	 	
	 	java.util.Iterator<months> it = fulllang.iterator();
	 	
	 	 
	 	while(it.hasNext()) {
	 		System.out.println(it.next());
	 	}
			
	 	
	 	EnumSet<months>newlang = EnumSet.allOf(months.class);
	 	System.out.println(newlang);
	 	
	  
	 	boolean b = newlang.remove(months.Febraury);
	 	System.out.println(b);  
	 	System.out.println(newlang);
	 	
	 	 
	 	boolean b1 = newlang.removeAll(newlang);
	 	System.out.println(b1);
	 	System.out.println(newlang);
			
			
		}

	}



