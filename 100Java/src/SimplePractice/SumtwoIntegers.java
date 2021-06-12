package SimplePractice;

import java.util.Scanner;

public class SumtwoIntegers {

	public static void main(String[] args) {
		int x, y, sum;
		Scanner sc = new Scanner(System.in);
		System.out.println("Add first no");
		x = sc.nextInt();
		System.out.println("Add Second no");
		y = sc.nextInt();
		sum = x + y;

		System.out.println("Sum of two Integers=" + sum);

	}

}
