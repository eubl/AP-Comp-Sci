
public class BankAccountTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// instance variables get default values
		// 		numbers: 0
		// 		boolean: false
        //		reference types: null
		BankAccount myChecking = new BankAccount("Rishi");
		BankAccount mySavings = new BankAccount(100, "Jake");
		
		System.out.println(myChecking.getBalance());
		System.out.println(myChecking.getOwner());
		
		myChecking.deposit(500); 
		myChecking.deposit(myChecking.getBalance());
		myChecking.withdraw(150);
		
		System.out.println(myChecking.getBalance());
		
		myChecking.changeOwner("Caleb Hitron");
		
		System.out.println(myChecking.getOwner());
		
		myChecking.deposit(100);
		myChecking.withdraw(25);
		
		System.out.println(myChecking.getBalance());
		
		myChecking.withdraw(20000000);
		
		System.out.println(myChecking.getBalance());
		
		myChecking.withdraw(2000);
		
	}

}
