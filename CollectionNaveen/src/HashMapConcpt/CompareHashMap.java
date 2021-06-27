package HashMapConcpt;

import java.util.HashMap;
import java.util.HashSet;

public class CompareHashMap {

	public static void main(String[] args) {

   HashMap<Integer,String> map1=new HashMap<Integer,String>();


   map1.put(1, "A");
   map1.put(2, "B");
   map1.put(3, "C");

   HashMap<Integer,String> map2=new HashMap<Integer,String>();
   
   map2.put(3, "C");
   map2.put(1, "A");
   map2.put(2, "B");
   
HashMap<Integer,String> map3=new HashMap<Integer,String>();
   
   map3.put(1, "A");
   map3.put(2, "B");
   map3.put(3, "C");
   map3.put(3, "D");
   
   //1/ on the basis of key value: equals method
   System.out.println(map1.equals(map2));//true
   System.out.println(map1.equals(map3)); //false
   
   
   //2. compare hashmap for same keys by keyset
   
   System.out.println(map1.keySet().equals(map2.keySet())); //true
   System.out.println(map1.keySet().equals(map3.keySet())); //true
   
   //3. findout extra keys
     HashMap<Integer,String> map4=new HashMap<Integer,String>();
   
   map4.put(1, "A");
   map4.put(2, "B");
   map4.put(3, "C");
   map4.put(4, "D");
   //combine the keys from bothe maps using hashset
   HashSet<Integer> combinekeys=new HashSet<Integer>(map1.keySet());
  //add values
   combinekeys.addAll(map4.keySet());
   combinekeys.removeAll(map1.keySet());
   System.out.println(combinekeys);
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
}
}