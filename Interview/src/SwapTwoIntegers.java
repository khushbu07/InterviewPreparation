
public class SwapTwoIntegers {

		public static void main(String[] args) {
			
			int x=5;
			int y=10;
			
			//1. Using third(temp) variable
			
			
			  int temp;
			 
			 temp=x; x=y; y=temp;
			 
			
			
			 //2. Using without variable (+ operator)
			
			  x=x+y;//15 
			  y=x-y;//5 
			  x=x-y;//10
				
			//3. Using without variable (* operator)
			
			x=x*y;//50
			y=x/y;//5
			x=x/y;//10
			
			
			//4. Using without variable (ZOR operator)
			
		
			x=x^y;
			y=x^y;
			x=x^y;
			
			
			System.out.println("Value of x after swapping : "+x);
			System.out.println("Value of y after swapping : "+y);
			
			
			
			
			
		}

	}


