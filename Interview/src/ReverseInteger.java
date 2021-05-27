
public class ReverseInteger {
public static void main(String[] args) {
		
		//1. Using algo
		
		long num = 12345;
		
		long rev=0;
		
		System.out.println();
		while(num!=0) {
			
			rev=rev*10+num%10;
			
			num=num/10;
					
		}	
			
			System.out.println(rev);
		
	//2. Using Stringbuffer
	
	 long num1=1234567 ;
	 
	System.out.println( new StringBuffer(String.valueOf(num1)).reverse()); 

	}
	
	



}
