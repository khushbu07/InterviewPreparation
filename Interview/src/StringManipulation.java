


public class StringManipulation {

	public static void main(String[] args) {

    String str= "The Rains have started here";
    String str1= "The Rains Have started here";
    
    System.out.println(str.length());
 
    System.out.println(str.charAt(4));
    
    System.out.println(str.indexOf("s")); // first occurence of S
    
    System.out.println(str.indexOf("s",9)); //using hardcoded value-first occurence of S
    
    System.out.println(str.indexOf("s",str.indexOf("s")+1)); //using 
    
    System.out.println(str.indexOf("have"));
    
    System.out.println(str.indexOf("hello")); //if any string is not available then it will print -1
     
    //String comparision
    
    System.out.println(str.equals(str1));
    
    System.out.println(str.equalsIgnoreCase(str1));
    
    System.out.println(str.substring(0, 9));
	  
    
    //trim-it trims only before space and after space not between space
    
    String s= "   Hello World";
    
    System.out.println(s.trim());
    
    System.out.println(s.replace(" ", "")); //between space k liye replace use krte h
    
    String date="01-01-2018";
    
    System.out.println(date.replace("-", "/"));
    
    //Split
    
    String test= "Hello_world_selenium_java";
    
    String testval[]=test.split("_");
    
    for(int i=0;i<testval.length;i++) {
    	
    System.out.println(testval[i]);
    	
    }
    
    
    String s2="Cares";
    
    System.out.println(s2.concat("S"));//concat-jb kuch append krna ho
    
    
    
    String s3="Hello";
    
    String s4="World";
    
    int a=100;
    int b=200;
     
    System.out.println(s3+s4); //concat
    
    System.out.println(a+b); //concat
    
    System.out.println(s3+s4+a+b); //concat
    
    System.out.println(a+b+s3+s4); //concat
    
    System.out.println(s3+s4+(a+b)); //concat-string can be concate with anytype of datatype
    
    
    
	}

}
