
public class PersonTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("Dave", 18);
		System.out.println(p1);
		
		p1.growOlder();
		System.out.println(p1);
		
		p1.changeName("David");
		System.out.println(p1);
		
		int x = p1.getAgeIn(5);
		System.out.println(x);
		System.out.println(p1);
		
		// A method that changes the state of an object is called a mutator
		// e.g. changeName, growOlder
		// A method that does NOT modify that state 
		// but only accesses information is called an accessor
		// e.g. getAgeIn
		// Strings are immutable so you can't change them
		
		age10Years(p1);
		System.out.println(p1);
		
		int y1 = 3;
		int y2 = y1;
		y1++;
		System.out.println(y1);
		System.out.println(y2);
		
		Person p2 = new Person("Harry", 7);
		Person p3 = p2;
	}
	
	public static void age10Years(Person p) {
		for(int i = 0; i < 10; i++) {
			p.growOlder();
		}
	}

}
