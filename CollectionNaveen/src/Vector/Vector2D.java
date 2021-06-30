package Vector;

import java.util.Vector;

public class Vector2D {

	public static void main(String[] args) {

		Vector<String> lang = new Vector();
		lang.add("Java");
		lang.add("C");
		lang.add("JavaScript");
		
		Vector osvector = new Vector();
		osvector.add(lang);
		
		for(int i=0;i<lang.size();i++) {
		String str=	((Vector<String>) osvector.get(0)).get(i);
		System.out.println(str);
		}
	}

}
