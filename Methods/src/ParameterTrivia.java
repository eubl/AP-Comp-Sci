
public class ParameterTrivia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(doSomething(3));
		
		int x = 3;
		int y = doSomething(x);
		System.out.println(x);
		System.out.println(y);
		
		int a = 3;
		int b = doSomething(a);
		System.out.println(a);
		System.out.println(b);
	}
	
	public static int doSomething(int a) {
		a++;
		return a * 2;
	}
	
}
