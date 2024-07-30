package gen_package;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class arraylist {

	public static void main(String[] args) {
		
		ArrayList<String>name=new ArrayList<String>();
		
		System.out.println();
		name.add("Megavath");
		name.add("Rajesh");
		name.add("nani");
		
	System.out.println("The Name of the Employee is : "+name);
		
		
		name.add("steven");
		name.add("steve");
		name.add("hemsworth");
		
	name.add(3, "Chris Hemsworth ");
		
		System.out.println(name);
		
		ArrayList<String>cinema=new ArrayList<String>();
		cinema.add("captain america");
		cinema.add("Iron man");
		cinema.add("Thor");
		cinema.add("Avengers");
	
		
		System.out.println("Most liked movies are "+cinema);
		
	//	name.addAll(cinema);
		System.out.println(name.size());
		System.out.println("value is "+name.size());	 
	}

}
