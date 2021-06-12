package SimplePractice;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {

  int n;
  Scanner sc=new Scanner(System.in);
   
  System.out.println("Input an integer");
  
  while((n=sc.nextInt())>10) {
	  
	  System.out.println("You entered " + n);
	  System.out.println("Input an integer");
	 }
       System.out.println("Out of loop");
	 }
	

}
