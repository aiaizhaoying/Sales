
public class Person {
	private String firstName;
	private String lastName;

	//encapsulation: hiding the internal details

	// accessor function
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String name) {
		firstName = name;
	}

/*	public Person(String fName, String lName) {
		firstName = fName;
		lastName = lName;
	}
*/
	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	
	public static void main(String[] a) {
		Person p1 = null; // null
		Person p2 = new Person("Dov", "Kruger");//constructor
		System.out.println(p1);
		System.out.println(p2.firstName);
		System.out.println(p1.firstName);
	}
}







