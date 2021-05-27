package interview.src.newpackage;

import java.util.StringJoiner;

public class StringJoinerConcept {

	public static void main(String[] args) {
		
		StringJoiner joiner=new StringJoiner(":", "[", "]");
		
		joiner.add("Tom")
		       .add("Liza")
		       .add("nav");
		
		System.out.println(joiner.toString());

	}

}
