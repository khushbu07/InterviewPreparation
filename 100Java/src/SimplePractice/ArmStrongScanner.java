package SimplePractice;

import java.util.Scanner;

public class ArmStrongScanner {

	public static void main(String[] args) {


		int t,r;
		
		int cube=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No");
		 int num=sc.nextInt();
		 t=num;
		while(num>0) {
			r=num%10;
			num=num/10;
			cube=cube+(r*r*r);
		}
		 if(t==cube) {
			 System.out.println("this is an armstrong number");
	}
	else {
		System.out.println("this is not an armstrong number");
	}
	}
	 
	
	
		
	

}
