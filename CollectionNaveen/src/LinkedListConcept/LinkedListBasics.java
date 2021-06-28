package LinkedListConcept;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListBasics {

	public static void main(String[] args) {
		/*
		 * 1.Linked list is a default class in java 
		 * 2. It can be used as list stack and queue 
		 * 3. It allows null 
		 * 4. Dynamic collection 
		 * 5. Insertion and deletion easily implemented
		 * 6. It can contain duplicate elements 
		 * 7. It is not synchronized (thread safe) 
		 * 8. LL manipulation is fast bcz we dont need any shifting*/
		
		LinkedList<String> names=new LinkedList<>();
		System.out.println(names.size());
		names.add("Tom");
		names.add("jeerry");
		System.out.println(names.size());
		System.out.println(names);
		System.out.println(names.get(0));
		//System.out.println(names.get(2)); //indexoutofbound exception
		
		Iterator it=names.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
        names.add(2, "steve");
        System.out.println(names);
        
        names.add(1, "liza");
        System.out.println(names);
        
        names.addFirst("kamla");
        System.out.println(names);
        
        names.addLast("Shiv");
        System.out.println(names);
        
        names.remove(1);
        System.out.println(names);
        
        LinkedList<String> user=new LinkedList<>();
		
		user.add("TomUser");
		user.add("Jeerryuser");
		user.add("Appyuser");

         names.addAll(user);
		 System.out.println(names);
		 
		 names.removeAll(user);
		 System.out.println(names);
		// names.removeAll(names);
		 //System.out.println(names);
		 
		 names.removeFirst();
		 System.out.println(names);
		 
		// user.clear();
		// System.out.println(user);
		 
		 //print in revers order
		 Iterator it1=names.descendingIterator();
			while(it1.hasNext()) {
				System.out.println(it1.next());
			}
			
			//sort
			Collections.sort(user);
			 System.out.println(user);
	}
	
	

}
