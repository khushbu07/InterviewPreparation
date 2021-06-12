package SimplePractice;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
     String Original, reverse;
     Scanner Sc=new Scanner(System.in);
     
     System.out.println("Enter the original String");
     
     Original=Sc.next();
     
     int len=Original.length();
     
     System.out.println(len);
     reverse="";
     
     for(int i=len-1;i>=0;i--) {
    	 reverse=reverse+Original.charAt(i);
     }

     System.out.println("Reverse String :"+reverse);
     
     if(Original.equalsIgnoreCase(reverse))	{
    	 
    	 System.out.println("Entered String is palindrome");
     }
     
     else 
    	 
    	 {
        	 
        	 System.out.println("Entered String is not palindrome");
         }
     }
    	 
     }


