package TreeMapConcept;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapBasics {

	public static void main(String[] args) {
//1. on the basis on key if we sorted the value,then go for treeMap
//2. stores the value on key value pair
//3. it does not follow hashing concept
		
		
    TreeMap<Integer,String> map1=new TreeMap<>();
    
    map1.put(1000, "Tom");
    map1.put(3000, "Steve");
    map1.put(1400, "lisa");
    map1.put(1200, "Mona");
    //it prints in ascending order default
    System.out.println(map1);
    
    System.out.println("--------------------");
    map1.forEach((K,V)->System.out.println("Key "+K +"="+"Value "+V));
    
    System.out.println(map1.lastEntry());
    System.out.println(map1.firstEntry());
    
   Set<Integer> lessthan= map1.headMap(1400).keySet();
   System.out.println(lessthan);
   
   Set<Integer> greaterthan =map1.tailMap(1200).keySet();
   System.out.println(greaterthan);
    
    //if want ot print on desc
   
   TreeMap<Integer,String> map2=new TreeMap<>(Comparator.reverseOrder());
   
  
   map2.put(1000, "Tom");
   map2.put(3000, "Steve");
   map2.put(1400, "lisa");
   map2.put(1200, "Mona");
   map2.forEach((K,V)->System.out.println("Key "+K +"="+"Value "+V));
	}

}
