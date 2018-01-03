
public class StringMethods {
	
	public static void main(String[] args) {
		/*
		 * String methods:
		 * 
		 * 		int length()
		 * 		int indexOf(str)
		 *		String substring(int)
		 *		String substring(int, int)
		 *		int compareTo(String) 
		 * 		
		 */
		
		String name = "Mr. Hitron";
		int n = name.length(); // not a static method
		System.out.println(n);
		
		int x = name.indexOf("Hit");
		System.out.println(x); 
		int y = name.indexOf("superman"); 
		System.out.println(y);
		
		String last = name.substring(4);
		System.out.println(last);
		String middle = name.substring(2, 7);
		System.out.println(middle);
		int result = name.compareTo("Hello");
		/*
		 * str1.compareTo(str2)
		 * 
		 * < 0 if str1 comes first
		 * = 0 if str1 and str2 are the same
		 * > 0 if str2 comes first
		 * 
		 * The largest valid position in a string
		 * of length n is n-1
		 */
		System.out.println(result);
		
		String something = name.substring(name.length());
		System.out.println(something);
		
	}
}
