package Java;

public class Stringreverse2 {

	public static void main(String[] args) {
		
    String input = "Genamplify solution hub";
    
   StringBuilder data = new StringBuilder();
    //StringBuffer data = new StringBuffer();
    data.append(input);
    data.reverse();
    
    System.out.println(data);

	}

}
