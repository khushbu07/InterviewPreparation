package SimplePractice;

public class TestThrow1 {

	 static void validate(int age){ 
		 if(age<18) 
		 throw new ArithmeticException("not valid1"); //explicit mentioned throw
		 else 
		 System.out.println("welcome to vote on Technolamror"); 
		 } 
		 public static void main(String args[]){ 
		 validate(13); 
		 System.out.println("rest of the code..."); 
		 } 
		}