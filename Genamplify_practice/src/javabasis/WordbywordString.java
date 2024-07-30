package javabasis;

import test.Wordbywordrevers;

public class WordbywordString {
	
	
	public void reverseword(String str) {
		
		String[] word = str.split("");
		String revstring = "";
		
		for(int i=0; i<word.length;i++) {
			
			String s = word[i];
			String revword = "";
			
			for(int j =s.length()-1; j>=0;j--) {
			
				revword = revword+s.charAt(j);
				
			}
			revstring = revstring+revword+" ";
			
		}
		System.out.println(str);
 		System.out.println(revstring);
	}

	public static void main(String[] args) {
		
		
		Wordbywordrevers obj  = new Wordbywordrevers();
		obj.reverseword("This is the hard to write the code");
		 
	}

}
