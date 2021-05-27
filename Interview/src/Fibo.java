
public class Fibo {

	public static void main(String[] args) {
	int total =10,n1=0,n2=1;
	
		
		for(int i=1;i<=total;i++)
		{
			int sum=n1+n2;
			 n1=n2;
			 n2=sum;
			 
			System.out.println("Fibbo Value " +sum);	 
			 
	}
		
		
}}
