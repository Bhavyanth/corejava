package hibernate.pojo;

public class Address {
	private int addressId;
	private String city;
	private String state;
	private Student1 s;
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Student1 getS() {
		return s;
	}
	public void setS(Student1 s) {
		this.s = s;
	}
	
	
	
}
