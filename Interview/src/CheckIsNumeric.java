
public class CheckIsNumeric {
	
	
	public static boolean isEmpty( CharSequence cs) {
		
		return cs==null || cs.length()==0;
		
		}
	public static boolean isNumric(CharSequence cs) {
		
		if (isEmpty(cs)) {
			return false;
		}
		int len=cs.length();
		
	for(int i=0;i<len;i++) {
		
		if(!Character.isDigit(cs.charAt(i))) {
			return false;
		}
		
	}
	
	
	return true;
	}
	
	public static void main(String[] args) {
		
	System.out.println(isNumric(""));
	System.out.println(isNumric("null"));
	System.out.println(isNumric(" "));
	System.out.println(isNumric("123"));
	System.out.println(isNumric("123testing"));
	System.out.println(isNumric("testing123"));
	System.out.println(isNumric("1"));
	System.out.println(isNumric("+123"));
	System.out.println(isNumric("-123"));
	System.out.println(isNumric("0"));
	System.out.println(isNumric("3.7"));
	System.out.println(isNumric("1 1 1"));
	System.out.println(isNumric("$"));
	System.out.println(isNumric("a"));
	}

}
