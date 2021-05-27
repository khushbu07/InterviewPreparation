
public class SwapStrings {
	

		public static void main(String[] args) {
			
			//1/ WAP Swap string without using temp variable
			String a= "Hello";
			
			String b="World";
			 
			System.out.println("Before Swapping : ");
		
			System.out.println("Value of a before swapping : "+a);
			System.out.println("Value of b before swapping : "+b);
			
			
			//1. Append a and b
			
			a=a+b;//Helloworld
			
			//2. Store intial String a in b
			
			b=a.substring(0, a.length()-b.length());//Hello
			
			//3. Store intial String b in a
			
			a=a.substring(b.length());
			
			
			System.out.println("After Swapping : ");
			System.out.println("Value of a after swapping : "+a);
			System.out.println("Value of b after swapping : "+b);

		}

	}


