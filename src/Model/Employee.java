package Model;

public class Employee extends Base_Model {
	String name,Address,email;
	int number;
	public Employee(int id1,String name, String address, String email, int number) {
		super(id1);
		this.name = name;
		Address = address;
		this.email = email;
		this.number = number;
	
	}
	
	

	


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", Address=" + Address + ", email=" + email + ", number=" + number + "]";
	}

	
	
}
