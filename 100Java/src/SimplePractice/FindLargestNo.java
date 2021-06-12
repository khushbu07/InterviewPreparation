package SimplePractice;

import java.util.Scanner;

public class FindLargestNo {

	public static void main(String[] args) {
	
		int x,y,z;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three Numbers");
		x=sc.nextInt();
		y=sc.nextInt();
		z=sc.nextInt();
		
		if(x>y && x>z) {
			System.out.println(""+x+" is the largest");
		}
		else if (y>x && y>z) {
			System.out.println(""+y+" is the largest");
		}
		else if (z>x && z>y) {
			System.out.println(""+z+" is the largest");
		}
		else
			System.out.println("No is not distinct");
	}

}
