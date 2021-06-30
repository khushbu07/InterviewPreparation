package HashSetConcpt;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetBasics {

	public static void main(String[] args) {
		
		//1. it does not contain insertion order
	Set<String> hs=new HashSet<String>();
	hs.add("Alpha");
	hs.add("Alpha");
	hs.add("Beta");
	hs.add("Testing");
	hs.add(null);
	System.out.println(hs);
	System.out.println(hs.contains("Beta"));
	
	for(String s:hs) {
		System.out.println(s);
	}
		
	hs.remove("Alpha");
	System.out.println(hs);
		
	Iterator<String> it=hs.iterator();	
	while(it.hasNext()) {
		System.out.println(it.next());
	}
		
	//get union	
		
	Set<Integer> first=new HashSet<>();
	first.addAll(Arrays.asList(new Integer[] {1,2,0,4,6,8,9}));
	
	
	Set<Integer> second=new HashSet<>();
	second.addAll(Arrays.asList(new Integer[] {5,7,9,2,0,8}));
	
	Set<Integer> union=new HashSet<>(first);
	union.addAll(second);
	System.out.println(union);
	
	System.out.println("=================");
	
    //get intersection
	Set<Integer> intersection=new HashSet<>(first);
	intersection.retainAll(second);
	System.out.println(intersection);
	
	//get the difference
	Set<Integer> diff=new HashSet<>(first);
	diff.removeAll(second);
	System.out.println(diff);
	}

}
