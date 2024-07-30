package javaPractice;

public class StringRevers {

	public static void main(String[] args) {
	 String name = "Megavath Rajesh";
	 System.out.println("Before Reverse "+name);
	 StringBuilder data = new StringBuilder();
	 data.append(name);
	 data.reverse();
	System.out.println("After Reverse "+data);
	 
	}

}
