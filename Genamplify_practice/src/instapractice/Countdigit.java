package instapractice;

import java.util.Scanner;

public class Countdigit {

	public static void main(String[] args) {
 
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int numofdigit = 0;
		int original=n;
		
		while(n>0) {
			
			n =n/10;
			numofdigit++;
		}
		System.out.println("Number of digites in "+original+"="+numofdigit);
		}
	}

