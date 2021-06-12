package SimplePractice;

public class Concatenate {

	public static void main(String[] args) {
		int n;
		 String s = "Java programming";
				 
	
		 System.out.println(s);
		 // Find length of string
           n = s.length();
           
		 System.out.println("Number of characters = " + n);
		 
		 // Replace characters in string
		String t = s.replace("Java", "C++");
		// System.out.println(s);
		 System.out.println(t);
		 
		 // Concatenating string with another string
		String u = s.concat(" is fun");
		// System.out.println(s);
		 System.out.println(u);
		 

	}

}
