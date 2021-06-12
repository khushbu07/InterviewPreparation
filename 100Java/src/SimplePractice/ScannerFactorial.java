package SimplePractice;

import java.util.Scanner;

public class ScannerFactorial {

	public static void main(String[] args) {

		int n, Fact = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No to calculate factorial ");
		n = sc.nextInt();

		if (n <= 0) {

			System.out.println("Number should be non Negative");
		} else {
			for (int i = 1; i <= n; i++)
				Fact = Fact * i;

			System.out.println("Factorial of " + n + " is =" + Fact);
		}
	}
}
