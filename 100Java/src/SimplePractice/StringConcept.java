package SimplePractice;

import java.util.Scanner;

public class StringConcept {

	public static void main(String[] args) {
		 
		String s1,s2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first String");
		s1=sc.next();
		
		System.out.println("Enter Second String");
		s2=sc.next();
		
		if(s1.compareTo(s2)>0) 
			System.out.println("First string is greater than second.");
			 else if ( s1.compareTo(s2) < 0 )
			 System.out.println("First string is smaller than second.");
			 else 
			 System.out.println("Both strings are equal");
			
		}
	}


