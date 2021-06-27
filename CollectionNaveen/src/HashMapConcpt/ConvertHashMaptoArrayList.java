package HashMapConcpt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;



public class ConvertHashMaptoArrayList {

	public static void main(String[] args) {

            HashMap<String,String> map1=new HashMap<>();
            map1.put("Google", "1000");
            map1.put("Deloitte", "2000");
            map1.put("Amazon", "3000");
            
            System.out.println("Size of hashmap "+map1.size());
            
           Iterator<Entry<String, String>> it= map1.entrySet().iterator();
           
           while(it.hasNext()) {
        	   
        	   Entry<String,String> entry= it.next();
        	   
        	   System.out.println(entry.getKey()+"="+entry.getValue());
           }

           System.out.println("==================");
           List<String> key1=new ArrayList<String>(map1.keySet());
           System.out.println("Size of Keys "+key1.size());
           for(String k:key1) {
           System.out.println(k);
           
	}
           System.out.println("==================");
           
           List<String> value1=new ArrayList<String>(map1.values());
           System.out.println("Size of value " +value1.size());
           for(String v:value1) {
        	   System.out.println(v);
           }
}}
