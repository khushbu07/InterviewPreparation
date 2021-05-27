
public class RemoveJunk {

public static void main(String[] args) {
		
		// Using Regular expression  [^a-zA-Z0-9]
		
		String s= "remove &**)#$%&";
		
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		
		
		System.out.println(s);
		
		
		
		
	}

}

	
	
	
	
	
	
	
	
	
	
	

