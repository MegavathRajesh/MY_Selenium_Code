package test;

import java.util.ArrayList;

public class arraylist {

	public static void main(String[] args) {
		
		ArrayList<String>name=new ArrayList<String>();
		
		name.add("steven");
		name.add("steve");
		name.add("hemsworth");
		
		System.out.println(name);
		
		ArrayList<String>cinema=new ArrayList<String>();
		cinema.add("captain america");
		cinema.add("Iron man");
		cinema.add("Thor");
		cinema.add("Avengers");
		System.out.println("Most liked movies are "+cinema);
		
	  boolean check = name.equals(cinema);
	  System.out.println("here Comparing the Value is :"+check);

}
}