package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedArrayList {

	public static void main(String[] args) {

   List<String> nameList= Collections.synchronizedList(new ArrayList<String>());
    nameList.add("java");
    nameList.add("C#");
    nameList.add("python");
    
    synchronized (nameList) {
     
   Iterator<String> it= nameList.iterator();
 while(it.hasNext()) {
	   
	   System.out.println(it.next());
   }
  
    }
   //2. using copyonwriteArraylist 
    
    CopyOnWriteArrayList<String> emplist=new CopyOnWriteArrayList<String>();
    
    emplist.add("java");
    emplist.add("C#");
    emplist.add("python");
    
   Iterator<String> it=emplist.iterator();
    
 while(it.hasNext()) {
	   
	   System.out.println(it.next());
   }
}
}