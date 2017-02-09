
public class Customer {
	
	//Instance Fields
	public String firstName;
	public String lastName;
	public String fullName;
	
	// Constructor
	public Customer(String fullName){
		this.fullName = fullName;	
	}
	
	public Customer(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public Customer () { }
	
	// Accessor Methods
	public String getFirstName(){
		return firstName; 
	}
	
	public String getLastName(){
		return lastName;
	}
	
	public String getFullName(){
		return fullName;
	}
	
}
