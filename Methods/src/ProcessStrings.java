
public class ProcessStrings {
	
	public static void main(String[] args) {
		
		System.out.println(replaceO("oOoOoOoOoOoOoOoOoOoOoOoOoOoOoOoOoOoO"));
		System.out.println(removeX("axxabxxbcxxc "));
		System.out.println(countDoubles("aabbbccdd"));
		
	}
	
	public static String replaceO(String str) {
		String result = "";
		
		for(int i = 0; i < str.length(); i++) {
			if(str.substring(i,i+1).equalsIgnoreCase("o")) {
				result += "0";
			}
			else {
				result += str.substring(i,i+1);
			}
		}
		
		return result;
	}
	
	public static String removeX(String str) {
		String result = "";
		
		for(int i = 0; i < str.length(); i++) {
			if(str.substring(i,i+1).equalsIgnoreCase("x")) {
				result += "";
			}
			else {
				result += str.substring(i,i+1);
			}
		}
		return result;
	}
	
	public static int countDoubles(String str) {
		int count = 0;
		
		for(int i = 0; i < str.length() - 1; i++) {
			
			String one = str.substring(i,i+1);
			String two = str.substring(i+1,i+2);
			
			if(one.equals(two)) {
				count++;
			}
		}
		
		return count;
	}
}
