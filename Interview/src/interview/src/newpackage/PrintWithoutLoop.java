package interview.src.newpackage;

import java.util.stream.IntStream;

public class PrintWithoutLoop {
	

		// Using recursive function
		// using jdk 8 stream

		public static void main(String[] args) {
			// printNum(1);
			// printNum1(1,50);

			IntStream.range(1, 60).forEach(e -> System.out.println(e));

		}

		// using static num
		public static void printNum(int num) {
			if (num <= 100) {
				System.out.println(num);
				num++;
				printNum(num);

			}
		}

	//using dymamic num
		public static void printNum1(int Snum, int Enum) {
			if (Snum <= Enum) {
				System.out.println(Snum);
				Snum++;
				printNum1(Snum, Enum);

			}

		}
	}

