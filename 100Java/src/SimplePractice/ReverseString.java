package SimplePractice;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {

    String original;
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter Original String");
	original=sc.next();
	int leng=original.length();
	System.out.println(leng);
	
    String rev="";
	for(int i=leng-1;i>=0;i--) {
    rev=rev+original.charAt(i);
	}
	System.out.println("Reverse of string : "+rev);
	}
	}

	


