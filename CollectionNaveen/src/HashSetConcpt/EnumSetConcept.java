package HashSetConcpt;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

import HashSetConcpt.EnumSetConcept.lang;

public class EnumSetConcept {
//1. it is not synchronized
	// 2. its a high performanace java collection
	// 3. faster than hashset
	// 4. all the methods are implemented using bitwise arithmetic operations

	enum lang {
		JAVA, JAVASCRIPT, C, RUBY
	}

	public static void main(String[] args) {
		
		// created a new enumset using enum
		EnumSet<lang> langs = EnumSet.allOf(lang.class);
		System.out.println(langs);

		// empty enum set
		EnumSet<lang> l = EnumSet.noneOf(lang.class);
		System.out.println(l);
		
        //range 
		EnumSet<lang> enumrange = EnumSet.range(lang.JAVA, lang.C);
		System.out.println(enumrange);

		// of: single value
		EnumSet<lang> enumJava = EnumSet.of(lang.JAVA);
		System.out.println(enumJava);

		// multiple value
		EnumSet<lang> multipleEnum = EnumSet.of(lang.C, lang.JAVASCRIPT);
		System.out.println(multipleEnum);
		
		
             //add and add all
		EnumSet<lang> lang1 = EnumSet.allOf(lang.class);
	    EnumSet<lang> lang2	=EnumSet.noneOf(lang.class);
	    lang2.add(lang.C);
	    System.out.println(lang2);
	    
	    lang2.addAll(lang1);
	    System.out.println(lang2);
	    
	    
	    //how to iterate
	    EnumSet<lang> full=EnumSet.allOf(lang.class);
	   Iterator<lang> it= full.iterator();
	   while(it.hasNext()) {
		   System.out.print(it.next());
		   System.out.println(" , ");
	   }
	    
	   
	   //remove and removeAll
	   EnumSet<lang> rem=EnumSet.allOf(lang.class);
	   boolean re=rem.remove(lang.C);
	   System.out.println(re);
	   System.out.println(rem);
	   
	   EnumSet<lang> remAll=EnumSet.allOf(lang.class);
	   System.out.println(remAll);
	   boolean re1=remAll.removeAll(remAll);
	   System.out.println(re1);
	   System.out.println(remAll);
	}

}
