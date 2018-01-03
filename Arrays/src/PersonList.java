
public class PersonList {
	
	private Person[] people;
	
	public PersonList(int size) {
		people = new Person[size];
	}
	
	public void fillUp() {
		// somehow fills the people variable
		// with actual Person objects so every
		// position in the array refers to a Person
		// and is not null
	}
	
		/*
		 * should return true if all people are students
		 * return false otherwise
		 * precondition: no nulls in people
		 */
	public boolean allStudent() {
		for(int i = 0; i < people.length; i++) {
			if(!people[i].getIsStudent()) {
				return false;
			}
		}
		return true;
	}
	
	/*
	 * return the average age of the people
	 * Precondition: no nulls
	 * Precondition: people.length > 0
	 */
	public double averageAge() {
		int sum = 0;
		for(int i = 0; i < people.length; i++) {
			sum += people[i].getAge();
		}
		return (double) sum / people.length;
	}
	
	public boolean hasSomeoneNamed(String name) {
		for(int i = 0; i < people.length; i++) {
			if(people[i].getName().equals(name)) {
				return true;
			}
		}
		return false;
	}
	
	// return true if ages increase (or stay steady)
	// as we move through the array
	public boolean agesIncrease() {
		for(int i = 0; i < people.length-1; i++) {
			if(people[i+1].getAge() < people[i].getAge()) {
				return false;
			}
		}
		return true;
	}
}








































