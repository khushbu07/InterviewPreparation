package Vector;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class VectorBasics {

	public static void main(String[] args) {

		Vector<Integer> v1 = new Vector();
		v1.add(100);
		v1.add(50);
		v1.add(800);
		v1.add(700);
		v1.add(900);

		System.out.println(v1);

		System.out.println(v1.get(2));
		v1.remove(0);
		System.out.println(v1);

		Vector<Integer> v2 = new Vector();
		v2.add(60);
		v2.add(70);

		v1.addAll(v2);
		System.out.println(v1);
		
		//1. iterate by for each
		for(int iter:v1)
		{
			System.out.println(iter);
		}
		System.out.println("===============");
		//2. iterator
		
		for(int i=1;i<v1.size();i++) {
			System.out.println(v1.get(i));
		}
		
		System.out.println("===============");
		
		Iterator it=v1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			}
		Collections.sort(v1);
		System.out.println(v1);
		
	}

}
