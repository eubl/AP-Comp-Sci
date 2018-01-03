
public class Person {
	
	private String name;
	private int age;
	private boolean isStudent;
	
	public Person(String n, int a, boolean s) {
		name = n;
		age = a;
		isStudent = s;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public boolean getIsStudent() {
		return isStudent;
	}
}
