package SimplePractice;

import java.util.Scanner;

public class Fahrenheit {

	public static void main(String[] args) {
	
		
		float temperature;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Temperature in Fahrenheit");
		temperature=sc.nextInt();
		
		temperature=((temperature-32)*5)/9;
		
		System.out.println("Temperature in Celsius =" +temperature);
		
	}

}
