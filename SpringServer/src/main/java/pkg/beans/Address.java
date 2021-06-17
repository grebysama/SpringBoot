package pkg.beans;

public class Address {
	
	private String addressStreet;
	private int addressNumber;
	
	public Address() {
		
	}

	public Address(String addressStreet, int addressNumber) {
		super();
		this.addressStreet = addressStreet;
		this.addressNumber = addressNumber;
	}

	public String getAddressStreet() {
		return addressStreet;
	}

	public void setAddressStreet(String addressStreet) {
		this.addressStreet = addressStreet;
	}

	public int getAddressNumber() {
		return addressNumber;
	}

	public void setAddressNumber(int addressNumber) {
		this.addressNumber = addressNumber;
	}
	

	
}
