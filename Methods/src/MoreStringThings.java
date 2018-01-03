
public class MoreStringThings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(removeAll("the the the the the theory of everythingyth a th thasdf", "th"));
	}
	
	/*
	 * removeAll("the theory of everything", "th");
	 * 		=> "e eory of everying"
	 */
	
	public static String removeAll(String str, String part) {
		String temp = str;
		int found = temp.indexOf(part);
		
		/*while(found != -1) {
			temp = temp.substring(0,found) + temp.substring(found + part.length());
			found = temp.indexOf(part);
		}*/
		for(int x = found; x != -1; x = temp.indexOf(part)) {
			temp = temp.substring(0,x) + temp.substring(x + part.length());
		}
		return temp;
	}
	
}
