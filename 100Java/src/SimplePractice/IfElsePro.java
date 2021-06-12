package SimplePractice;

import java.util.Scanner;

public class IfElsePro {

	public static void main(String[] args) {
		
		int marksobtained,passingmarks;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter marksobtained :");
		marksobtained=sc.nextInt();
		passingmarks=40;
		if(marksobtained>=passingmarks) {
		System.out.println("You are passed");
		}
		else
		{
				
			System.out.println("You are Failed");
	}

}}
