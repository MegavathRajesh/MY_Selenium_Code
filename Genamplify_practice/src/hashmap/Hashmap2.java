package hashmap;

 
   
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;



public class Hashmap2 {//The hashmap is the class of the java collection frame work provides the 
	//functionality of hash table data structure.it Stores elements in key/value pairs.

	public static void main(String[] args) {
		 
		 HashMap<String, String> capitals = new HashMap<String, String>();
		 
		 capitals.put("Telangana", "Hyderabad");
		 capitals.put("Karnataka", "Bangaloor");
		 capitals.put("Tamilnadu", "Chennai");
		 capitals.put("Gujarat", "Gandinagar");
		 capitals.put("kerala", "kochi");
		 
		 System.out.println(capitals);
		 System.out.println(capitals.get("Telangana"));
		 System.out.println(capitals.get("Tamilnadu"));

		 capitals.put("Rajesh", "kamareddy");
		 System.out.println(capitals);
		 
		 System.out.println(capitals.remove("kerala"));
		 
		
		 capitals.put("Rajesh", "Secundrabad");
		 System.out.println(capitals);
		 
		 Iterator<String>cl= capitals.keySet().iterator();
		 
		 while(cl.hasNext()) {
			 
			 String key = cl.next();
			 String value = (String) capitals.get(key);
 			 System.out.println("keys = "+key+"  values = "+value);
		 }
		 
		 
		// Iterator<String>
		 
		
	}

}
