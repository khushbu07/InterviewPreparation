
public class ReverseEachWordString {

	public static void main(String[] args) {
		// 1. convert string into array by split method
		// 2. reverse each word
		// 3. add reverseword into reverse string

		String str = "Welcome to java";
		String[] words = str.split("//s");
        String reverseString = "";

		for (String w : words) {

			String reverseWords = "";

			for (int i = w.length() - 1; i >= 0; i--) {

				reverseWords = reverseWords + w.charAt(i);
			}

			reverseString = reverseString + reverseWords + " ";
		}

		System.out.println(reverseString);
	}

}
