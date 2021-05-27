package interview.src.newpackage;



public class FactorialNumber{

	//fact of 5 =5*4*3*2*1=120
	//fact of 1=1
	//fact of 0=1
	//without recursive using for loop
	public static int factorial(int num) {
		
		int fact=1;
		
		if(num==0)
			return 1;
		
		for(int i=1;i<=num;i++) {
			
			fact=fact*i;
	}
		return fact;
	}
	
	public static void main(String[] args) {
		
		
		System.out.println(factorial(4));
		System.out.println(factorial(0));
		System.out.println(factorial(1));
		
		System.out.println(factorial(10));
		
		
		}

}

