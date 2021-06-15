package SimplePractice;

import java.util.Scanner;

public class SwapNoWithoutUsingThird {

	public static void main(String[] args) {
		
		int x,y;
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter two number");
		x=sc.nextInt();
		y=sc.nextInt();
		System.out.println("Before Swapping "+x+" and "+y+" ");
		
		x=x+y;
		y=x-y;
		x=x-y;
		
		System.out.println("After Swapping "+x+" and "+y+" ");

	}

}
