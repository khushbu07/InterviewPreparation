package SimplePractice;

import java.util.Scanner;

public class NestedIfElse {

	public static void main(String[] args) {
     char grade;
     
       int marksObtained,Passingmarks;
       Passingmarks = 40;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Marks that obtained");
		marksObtained=sc.nextInt();
		if(marksObtained>=Passingmarks) {
		if(marksObtained>90) 
		grade ='A';
		
         else if (marksObtained>75) 
			 grade ='B';
			
		else if (marksObtained>60) 
			grade ='C';
			
		else 
			grade='D';
		
		System.out.println("You passed the exam and your grade is " + grade);
		}
		else {
		grade='f';
		System.out.println("You failed the exam and your grade is " + grade);

	}
}}