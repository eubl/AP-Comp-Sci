public class Person {
	
  private String name;
  private int age;
 
  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }
 
  public void growOlder() {
    age += 1;
  }
 
  public void changeName(String name) {
    this.name = name;
  }
 
  public int getAgeIn(int years) {
    return age + years;
  }
 
  public String toString() {
    return name + " (" + age + ")";
  }
}