package HashMapConcpt;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapBasics {

	public static void main(String[] args) {
         //hashmap is not thread safe -unsnchronized
		//no order and indexing
      HashMap<String,String> Capitalmap=new HashMap<String,String>();
      Capitalmap.put("USA","NY");
      Capitalmap.put("MP","Bhopal");
      Capitalmap.put("UP","Lucknow");
      Capitalmap.put("UP","Lucknow1");
      Capitalmap.put(null,"MUmbai");
      Capitalmap.put(null,"pune"); //store multiple null value but only one null key
      Capitalmap.put("Russia",null);
      Capitalmap.put("France",null);
      
      System.out.println(Capitalmap.get("UP"));//if key is repeated then it overriden value,not giviing error
      System.out.println(Capitalmap.get("BN"));//if key is not available ,give null
      System.out.println(Capitalmap.get("France"));
      System.out.println(Capitalmap.get(null));
      System.out.println(Capitalmap.remove("France"));
      
      //iterator :over the key by using keyset
    Iterator<String> it=  Capitalmap.keySet().iterator();
    
    while(it.hasNext()) {
    	
    	System.out.println();
    	String key=it.next();
    	String Value=Capitalmap.get(key);
    	System.out.println("Key =  " +  key  +   " -Value = "+Value);
	}
    System.out.println("===========================");
    
    
    //2. iterator: over the set(pair)
    
    Iterator<Entry<String, String>> it1=Capitalmap.entrySet().iterator();
    
    while(it1.hasNext()) {
    	
    	Entry<String, String> entry=it1.next();
    	
    	System.out.println( "Key = "+entry.getKey()+" and Value = "+entry.getValue());
    }
    
    System.out.println("===========================");
    //iterate hashmap using java 8 for each and lambda
    
    Capitalmap.forEach((K,V)->System.out.println( "Key = "+K +" and Value = "+ V));
}}
