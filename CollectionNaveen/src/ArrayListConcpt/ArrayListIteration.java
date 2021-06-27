package ArrayListConcpt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListIteration {
    //default array capacity 10


	public static void main(String[] args) {

		ArrayList<String> ar=new ArrayList<String>();
		
		ar.add("Naveen");
		ar.add("tom");
		ar.add("Niv");
		ar.add("lisa");
		
		System.out.println(ar.get(3));
		
		//Using for loop
		for(int i=0;i<=ar.size()-1;i++) {
			System.out.println(ar.get(i));
		}
		System.out.println("***********");
		
		//Using for Each
		
		for (String s:ar) {
			System.out.println(s);
			}
		System.out.println("****//using lambada*******");
		
		
		//using lambada
		ar.stream().forEach(ele->System.out.println(ele));

		
		System.out.println("****Using Iterator*******");
		
		Iterator<String> it=ar.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("****Array to array *******");
		
		ArrayList<Integer> num=new ArrayList<Integer>(Arrays.asList(10,20,30));
		
		System.out.println(num);
		
		
	}
	
	
}
