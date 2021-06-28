package HashTableConcept;

import java.util.Hashtable;

public class HashTableBasics {

	public static void main(String[] args) {

		Hashtable<String, Integer> marks = new Hashtable<>();

		marks.put("Naveen", 100);
		marks.put("Tom", 300);
		marks.put("Lixa", 50);
		marks.put("Manvi", 600);
		// marks.put(null, 600);
		marks.put("tri", null);

		System.out.println(marks);
		System.out.println(marks.get("Lixa"));
       //System.out.println(marks.get(null));
	   //System.out.println(marks.get("tri"));

	}

}
