package SimplePractice;

public class ConvertIntegerToString {

	public static void main(String[] args) {

    int i=100;
  String str=String.valueOf(i);
  System.out.println(i+200);//300 because + is binary plus operator
  System.out.println(str+200);//100200 because + is string concatenation operator
	
  
 // How to convert string to long in java

    String s="9009094343";
    Long l=  Long.parseLong(s);
    System.out.println(l);
    System.out.println(s);
    
    
    
    
    
    
    
    
    
    
	} 
}