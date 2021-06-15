package SimplePractice;

import java.util.Scanner;

public class MultplicationTable {

	public static void main(String[] args) {


		int n,i;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number for Table");
		n=sc.nextInt();
		
	    System.out.println("Multiplication of table " +n+" is : ");
	    
		for(i=1;i<=10;i++) {
			System.out.println(n+"*"+i+"="+(n*i));
			
		}
		
	}

}
