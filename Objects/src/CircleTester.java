
public class CircleTester {
	
	public static void main(String[] args) {
		
		Circle c1 = new Circle(1);
		
		System.out.println(c1.getCircumference());
		System.out.println(c1.getArea()); 
		c1.scale(0.5);
		System.out.println(c1.getCircumference());
		System.out.println(c1.getArea());
		
		// An object is an instance of a class
		// An object is a certain type and the type is a class
		// The class is like the template
	}
	
}
