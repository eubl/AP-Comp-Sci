
public class Typer {
	public static void main(String[] args) throws InterruptedException {
		
		String word = "bla bla bla bla bla bla bla bla bla bla";
		
		for(int i = 0; i < word.length(); i++) {
			Thread.sleep(125);
			System.out.print(word.substring(i, i+1));
		}
	}
}
