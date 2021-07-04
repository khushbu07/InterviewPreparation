package SimplePractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PracticeBook {
	int id,quantity;
    String name,publisher,author;
    
    PracticeBook(int id,String name,String publisher,String author,int quantity) {
    this.id=id;
    this.quantity=quantity;
    this.name=name;
    this.author=author;
    this.publisher=publisher;
    }
	public static void main(String[] args) {

		PracticeBook b1=new PracticeBook(1,"Monalika","pblish1","Java",11);
		PracticeBook b2=new PracticeBook(2,"Mona","pblish2","C",12);
		PracticeBook b3=new PracticeBook(2,"Monali","pblish3","python",13);
		
		List<PracticeBook> list=new ArrayList<PracticeBook>();
		
		list.add(b1);
		list.add(b2);
		list.add(b3);
		
		for(PracticeBook b:list) {
			System.out.println(b.id+"-"+b.author+" -"+b.name+"- "+b.quantity+"- "+b.publisher);
		}
		
	Iterator<PracticeBook> it=list.iterator();
	
	while(it.hasNext()) {
		
		PracticeBook st=	it.next();
		System.out.println(st.author+" "+st.id+" "+st.name+" "+st.publisher+" "+st.quantity);
	}

	}

}
