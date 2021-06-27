package SimplePractice;

public class TSYS {

	 public static void main(String args[]){
		  
		 for(int i=1;i<=15;i++) {
			 
			 if(i==3 || i%3==0) {
				System.out.println("No is divided by 3 ");
			 }
			 else if(i==5 || i%5==0 )  {
					System.out.println("No is divided by 5 ");
				 }
			 else {
				 System.out.println(i);
			 }
		 }
		 
	 }
}