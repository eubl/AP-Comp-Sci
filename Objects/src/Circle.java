
public class Circle {
	
	// instance variable, or field
	// this represents the state of an object
	private double radius;
	
	// constructor
	public Circle(double r) {
		radius = r;
	}
	
	// methods
	
	// mutator
	public void scale(double factor) {
		radius *= (1 + factor);
	}
	
	// accessor
	public double getCircumference() {
		return 2 * Math.PI * radius;
	}
	
	// accessor
	public double getArea() {
		return Math.PI * radius * radius;
	}
		
	/*
	 * instance variables     |
	 * 1 or more constructors |  what a class holds
	 * methods                |
	 */
}
// 