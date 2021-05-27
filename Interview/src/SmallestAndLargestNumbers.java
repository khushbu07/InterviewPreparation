import java.util.Arrays;

public class SmallestAndLargestNumbers {
	


		public static void main(String[] args) {
			
			int numbers[] = { 20,-10,99,3434,-99};
			
			int largest=numbers[0];
			int smallest=numbers[0];
			
			for(int i=1;i<numbers.length;i++) {
			
			if (numbers[i]>largest) {
				
				largest=numbers[i];
			}
			
			else if (numbers[i]<smallest) 
			{
				smallest=numbers[i];
			}
			}
			System.out.println("\n Given Array :" +Arrays.toString(numbers));
			
			System.out.println("Largest "+largest);
			
			System.out.println("Smallest "+smallest);
			
			
			
		}


		

	}


