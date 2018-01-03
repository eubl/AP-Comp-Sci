
public class ArrayBasics {
	public static void main(String[] args) {
		/*
		 * An array is a list of values of the same type
		 * that has a fixed length.
		 * 
		 * An array itself is an object, regardless of 
		 * what type of values it contains.
		 * 
		 * An array type is specifies by adding [] to 
		 * an other type
		 *
		 * e.g., int[], String[], boolean[], BankAccount[]
		 * 
		 * Declaring and Constructing an array:
		 * 
		 * 	int[] args = new int[5];
		 * 	String[] names = new String[17];
		 * 
		 * Array positions are indexed just like string 
		 * positions i.e., 0-based
		 * 
		 * Referencing a particular position:
		 * 
		 * 	ages[1]
		 * 	names[13]
		 */
		
		String[] names = new String[3];
		System.out.println(names[0]);
		names[0] = "Tom-Rishi";
		names[1] = "Nikhil-Elon";
		names[2] = "Raj-Caleb";
		System.out.println(names[1]);
		System.out.println(names[2].toUpperCase());
		System.out.println(names[2].substring(1, 5));
		System.out.println(names.length);
		
		int[] ages = {3,4,1,9};
		
	}
}
