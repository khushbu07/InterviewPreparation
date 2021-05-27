
public class ReverseString {

	
	public static void main(String[] args) {
	     
		String s = "Selenium";
			
		
		//1. using for loop
        int leng=s.length();
        
        String rev= "";
        
        
        for(int i=leng-1;i>=0;i--) {
        	
        	rev =rev+s.charAt(i);

	}
    
        System.out.println("reverser string : "+ rev);


	//2. using string buffer
        
	StringBuffer sb=new StringBuffer(s);
	
	System.out.println(sb.reverse());
	
	
	
	}
}
	
	
	

