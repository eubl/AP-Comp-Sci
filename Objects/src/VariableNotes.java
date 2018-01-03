
public class VariableNotes {
	/*
	 *  3 categories of variables: instance, local, parameter
	 * 
	 *  instance variables
	 *  	declared inside a class, but not in a method
	 *  	have a visibility modifier (public/private)
	 *  	scope is at least the entire class
	 *   	are assigned default values (0/false/null)
	 *   	
	 *  local variables
	 *  	declared inside a method
	 *  	do not have a visibility modifier
	 *  	scope is the method in which it is declared
	 *  	are not assigned default values
	 *  
	 *  parameters
	 *  	declared in a method header
	 *  	do not have a visibility modifier
	 *  	scope is the method in which hit is declared
	 *  	values are assigned when method is called
	 *  
	 *  A local variable with the same name as
	 *  an instance variable is said to shadow the 
	 *  instance variable. Any use of the name will
	 *  refer to the local variable. The instance 
	 *  variable can be refereed to with this, e.g. this.x
	 *  
	 *  If an object variable is null, trying to call a 
	 *  method on it will cause a NullPointerException
	 *  runtime error
	 *  
	 *  You can check if an object variable is null by
	 *  using == e.eg., if(something != null) {...}
	 *  
	 */
}
