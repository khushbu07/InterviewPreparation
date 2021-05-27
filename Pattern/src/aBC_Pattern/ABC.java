package aBC_Pattern;

public class ABC {
	
	//A 
	//A B 
	//A B C 
	//A B C D 
	//A B C D E 
	//A B C D E F 

	public static void main(String[] args) {
	
		
		int alpha=65;
		for (int i=0;i<=5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print((char)(alpha+j)+" ");
				}
			//alpha++;
			System.out.println();
		}
	}

}
