package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicate {

	public static void main(String[] args) {
		 ArrayList<Integer> numbers= new ArrayList<Integer>(Arrays.asList(1,2,3,4,1,2,3,4,5,5,6));
		 //1. Using LinkedHashSet
		 LinkedHashSet<Integer> num= new LinkedHashSet<Integer>(numbers);
		ArrayList<Integer> withoutDuplicate= new ArrayList<Integer>(num);
		System.out.println(withoutDuplicate);
		 //System.out.println(num);
		 
		 
		 //2. JDK-8 Stream
		 ArrayList<Integer> Marks= new ArrayList<Integer>(Arrays.asList(1,2,3,4,1,2,3,4,5,5,6));
		List<Integer> UniqueMarks= Marks.stream().distinct().collect(Collectors.toList());
		System.out.println(UniqueMarks);
		 
		 
	}

}
