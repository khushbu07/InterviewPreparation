
public class PrimeNumbers {

	//2 is the lowest prime number
		public static boolean isPrimeNumber(int num) {
			
		if(num<=1) {
		return false;
		}
		for(int i=2;i<num;i++) {
			
			if(num%i==0) {
				return false;
			}
		}
		
		return true;
		
		}
		
		
		public static void getPrimeNumbers(int num) {
			  
			for(int i=2;i<=num;i++) {
				if (isPrimeNumber(i)) {
					System.out.println(i + " ");
				}
			}
		}

		
		public static void main(String[] args) {
			


			
		System.out.println(" 5 isPrime no.: " +isPrimeNumber(5));
		
		System.out.println(" 0 isPrime no.: " +isPrimeNumber(0));

		System.out.println(" 10 isPrime no.: " +isPrimeNumber(10));
				
		System.out.println(" -3 isPrime no.: " +isPrimeNumber(-3));
		
		 getPrimeNumbers(7);
		 
		 
		 
		}
		
		
		

		

	}
