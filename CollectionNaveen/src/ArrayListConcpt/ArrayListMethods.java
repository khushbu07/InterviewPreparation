package ArrayListConcpt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArrayListMethods {
	
	//1. add
	//2. addall
	//3. clear
	//4. remove
	//5. clone
	//6. Contains
	//7. Indexof
	//8.lastIndexof
	//9.reatinAll
	//10.removeif
	//11.toarray-it returns single dimension object array
	//12.sublist

	public static void main(String[] args) {
		
		ArrayList<String> ar1=new ArrayList<String>();
		ar1.add("Java");
		ar1.add("Python");
		ar1.add("Ruby");
		
		ArrayList<String> ar2=new ArrayList<String>();
		 ar2.add("Test1");
		 ar2.add("Test2");
		 
		// ar1.addAll(ar2);
		 
		 System.out.println(ar1);
		 
		 ar1.addAll(2,ar2);
		 
		 System.out.println(ar1);
		 
		// ar1.clear();
		 //System.out.println(ar1);
		 
		ArrayList<String> clonelist=(ArrayList<String>)ar1.clone();
		 System.out.println(clonelist);

		 System.out.println(ar1.contains("Ruby"));
		 System.out.println(ar1.contains("C"));
		 System.out.println(ar1.indexOf("Java")>0);
		 
		 ArrayList<String> List1=new ArrayList<String>(Arrays.asList("Navin","Lisa","Tom","Jerry","Navin","Jerry"));
		 
		int i= List1.lastIndexOf("Navin");
		System.out.println(i);
		System.out.println(List1.remove(1));
		System.out.println(List1);
		List1.remove("Tom");
		System.out.println(List1);
		 
		List1.retainAll(Collections.singleton("Jerry"));
		System.out.println(List1);
		
		ArrayList<Integer> List2=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8));
		//List2.removeIf(num->num%2==0);
		//System.out.println(List2);
		
		System.out.println(List2.subList(2, 5));
		
		ArrayList<String> List3=new ArrayList<String>(Arrays.asList("Navin","Lisa","Tom","Jerry","Navin","Jerry"));
	
		Object arr[]=List3.toArray();
		System.out.println(Arrays.toString(arr));//print array
		
		for(Object o:arr) {
		System.out.println(o);	
		//System.out.println((String)o); //return in string form
	}

}}
