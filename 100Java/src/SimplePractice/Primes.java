package SimplePractice;

public class Primes {

	public static void main(String[] args) {
      
       System.out.println(" 4 isPrime no.: " +isprime(4));
       System.out.println(" 13 isPrime no.: " +isprime(13));
	}
	
	
	public static boolean isprime(int n) {

		if(n<=1) {
			return false;
		}
		for(int i=2;i<n;i++) {
			
			if(n%i==0) {
				return false;
			}
			
}
		return true;
	}

}
