package Java;

public class String_reverse {

	public static void main(String[] args) 
	{
		String name="hallo every one";
		char[] ch=name.toCharArray();
		String rev="";
		
		for(int i=name.length()-1;i>=0;i--) 
		{
			rev=rev+ch[i];
		}
		
System.out.println(rev);
System.out.println(name.length());
if(name.equals(rev)) 
{
	System.out.println("given string was polindrome");
}
else
{
	System.out.println("not a plondrome");
}
	}

}
