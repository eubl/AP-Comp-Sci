
public class NumberListTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberList myList = new NumberList(20);
		myList.fillRandom(1, 100);
		System.out.println(myList.sum());
		System.out.println(myList.contains(50));
		/*int count = 0;
		for(int i = 0; i < 500; i++) {
			NumberList a = new NumberList(20);
			a.fillRandom(1, 100);
			if(a.contains(50)) {
				count++;
			}
		}
		System.out.println(count);
		System.out.println((double) count / 500); */
		System.out.println(myList.allClose());
	}

}
