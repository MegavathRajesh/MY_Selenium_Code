package test;

import java.util.ArrayList;
import java.util.Collections;

public class sortlist {
	 
	    public static void main(String[] args) {
	         
	        ArrayList<String> List = new ArrayList<String>();
	        List.add("Rajesh");
	        List.add("Megavath");
	        List.add("Nani");
	        List.add("ramcharan");
	        List.add("abhiram");
	        List.add("Arya");

	        
	        Collections.sort(List);

 	        System.out.println("Here Sorted List: " +List);
	    }
	}


