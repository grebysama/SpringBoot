package pkg.beans;

public class Person {

	private int userId;//": "integer",
	private String userName;
	private double password;
	private String email;
	private Address address;
	
	public Person() {
		
	}
	
	public Person(int userId, String userName, double password, String email) {
	
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.address = new Address();
		
		
	}
	
	public Person(int userId, String userName, double password, String email, String street, int number) {
	
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.address = new Address(street, number);
		
		
	}
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public double getPassword() {
		return password;
	}
	public void setPassword(double password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	
}
