
public class MissingNumInArray {
	
public static void main(String[] args) {
		
		int a[]= {1,2,3,5};
		
		System.out.println("Length of an Array :" +a.length);
		
		int sum=0;
		
		for(int i=0;i<a.length;i++) {
			
		  sum=sum+a[i];  //3
		}
		
         System.out.println("Sum of given array :" +sum);
         
         int sum1=0;
         for (int j=1;j<=5;j++){
        	 
	         sum1=sum1+j ;
	         
	    	  }
	
	 
		System.out.println("Sum of continue series : "+sum1);
	
        System.out.println("Missing Number in Array is " +(sum1-sum));
        
}
}
