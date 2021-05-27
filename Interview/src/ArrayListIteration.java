import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteration {

	public static void main(String[] args) {
		
		
		ArrayList<String> tvSeries= new ArrayList<String>();
		
		tvSeries.add("Game of thrones");
		tvSeries.add("Breaking bad");
		tvSeries.add("The big bang theory");
		tvSeries.add("The Walking dead");
		tvSeries.add("Prison break");

		
		//1. Using java 8 with for each loop and lambda expression
		System.out.println("--Using java 8 with for each loop and lambda expression-----------------");
		
		    tvSeries.forEach(shows ->
		    {
			System.out.println(shows);
			});
		
		
		//2. using Iterator
		    System.out.println("--using Iterator----------------");
		    
		Iterator<String> it =tvSeries.iterator();
		while(it.hasNext()) {
		String shows=it.next();
		System.out.println(shows);
	}
		
		
		//3. using iterator and java 8 forEachRemaining() method
		System.out.println("--using iterator and java 8 forEachRemaining() method----------------");
		
		 it =tvSeries.iterator();
		it.forEachRemaining(shows ->{
		System.out.println(shows);
		});
		
		
		// 4. Using foreach loop
		System.out.println("--using foreachloop-----");
		
		for(String shows :tvSeries) {
		System.out.println(shows);
		}
			
		// 5. Using for loop
		
		System.out.println("--using for loop-----");
		
		
		for(int i=0;i<tvSeries.size();i++) {
			System.out.println(tvSeries.get(i));	
			
		}
}}
