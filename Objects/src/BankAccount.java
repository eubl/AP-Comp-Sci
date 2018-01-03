
public class BankAccount {
	
	// instance variable - represents part of the state
	private double balance;
	private String owner;
	
	// A constructor is a special method that has
	// no return type (not even void), and the same
	// name as the class
	public BankAccount(double b, String o) {
		balance = b;
		owner = o;
	}
	
	public BankAccount(String o) {
		balance = 0;
		owner = o;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount){
		if(amount <= balance){
			balance -= amount;
		}
	}
	
	public double getBalance() {
		return balance;
	}
	
	public String getOwner() {
		return owner;
	}
	
	public void changeOwner(String person) {
		owner = person;
	}
	
}
