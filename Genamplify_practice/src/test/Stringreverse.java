package test;

public class Stringreverse {
	
	public static void main(String[] args) 
	{
		String name="hallo every one";
		char[] ch=name.toCharArray();
		String reverse= " ";
		
		for(int i=name.length()-1;i>=0;i--) 
		{
			reverse=reverse+ch[i];
		}
		System.out.println("Original String : "+name);
		System.out.println("Reverse String : "+reverse);
		
		
		
		
		String Name2 = "Hello Hyderabad";
		 StringBuilder reversed = new StringBuilder();
        int i = Name2.length() - 1;
        while (i >= 0) {
            reversed.append(Name2.charAt(i));
            i--;
        }

        System.out.println("Original String: " + Name2);
        System.out.println("Reversed String: " + reversed.toString());
    }

	}


