package hashmap;

 
   
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;



public class Hashmap {

	public static void main(String[] args) {
		 
		/* Java HashMap
		 *  is a class implements the Map interface which allows us to store key & value pair. 
		 *  Where keys should be unique, if we try to insert a duplicate key it will replace the 
		 *  	element of the corresponding key.
		 *  HashMap class is also found in java.util package
		 *  
		 *  Java HashMap conatins values based on the key
		 *  Java HashMap contains unique keys
		 *  This may have one null key & multiple values
		 *  It maintains no order
		 */		
	

		HashMap<String, String>capital = new HashMap<String, String>();
		capital.put("India", "NewDelhi");
		capital.put("USA", "WashitonDC");
		capital.put("UK", "London");
		//This doesnot maintain order
		//How to get the values in run time
		System.out.println(capital); //this will print all the key values but not in order
		
		//Using get method
		System.out.println(capital.get("USA")); //this will print only specific key value
		
		System.out.println(capital.get("Germany")); //we dont have the key will get null value
		
		//When using duplicate key
		capital.put("UK", "London11");
		System.out.println(capital.get("UK")); //this will overriden from London to new London11 this will never give error
		
		//Using null key
		capital.put(null, "Berlin");
		System.out.println(capital.get(null)); //will print the null value as Berlin
		
		//Add another null key with different value
		capital.put(null, "LA");
		System.out.println(capital.get(null)); //this will not give error but null key value gets updated from Berlin to LA
		
		//Using null value
		capital.put("Russia", null);
		capital.put("France", null);
		System.out.println(capital.get("Russia")); //can have multiple null values
		//there is no value so will print null value
		
		//Using iterator for key have to use keyset.iterator
		//create iterator object using key set
		Iterator<String>it = capital.keySet().iterator();
		
		//how to get keyset in run time using while loops
		while(it.hasNext()) {
			String key = it.next();
			String value = capital.get(key);
			System.out.println("Key = " +key + "Value = " + value);
		}
//Note -- this is called iterator over the keyset()
		
		System.out.println("********************");

		//Create another iterator object using entryset
		Iterator<Entry<String, String>>it1 = capital.entrySet().iterator();
		while(it1.hasNext()) {
			Entry<String, String>entry = it1.next();
			System.out.println("Key = " +entry.getKey() +" and Value " +entry.getValue());
		}

		System.out.println("********************");

		//Remove a key
		capital.remove("France");
		System.out.println(capital);
		
		System.out.println("********************");
capital.forEach((a,b)->System.out.println("Key = " +a+" and value = "+b));;
		
	}

	}


