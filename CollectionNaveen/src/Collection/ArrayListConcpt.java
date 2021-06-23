package Collection;

import java.util.ArrayList;

public class ArrayListConcpt {

	public static void main(String[] args) {
		
		ArrayList<Integer> ar=new ArrayList<Integer>();
		
		ar.add(100);
		ar.add(200);
		
		System.out.println(ar.size());
		System.out.println(ar.get(0));
		System.out.println(ar);
		
		ar.add(12);
		ar.add(121);
		
		System.out.println(ar);
		System.out.println(ar.size());
		System.out.println("Lower Index " +0);
		System.out.println("Higher Index " + (ar.size()-1));
		
		

	}

}
