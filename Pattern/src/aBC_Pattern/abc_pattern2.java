package aBC_Pattern;

public class abc_pattern2 {
	
	//A 
	//B B 
	//C C C 
	//D D D D 
	//E E E E E 
	//F F F F F F 

	public static void main(String[] args) {
	
		
		int alpha=65;
		for (int i=0;i<=5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print((char)(alpha)+" ");
				}
			alpha++;
			System.out.println();
		}
	}

}


