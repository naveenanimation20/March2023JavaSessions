package OOP_Encapsulation;

public class Register {

	//POJO - plain old java object
	
	public String dob;
	
	private String name;
	private int age;
	private long phoneNumber;
	private String city;
	private boolean isPerm;

	public Register(String name, int age, long phoneNumber, String city, boolean isPerm) {
		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.city = city;
		this.isPerm = isPerm;
	}

	public Register(String name, long phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	// public getter/setter:
	public String getName() {
		return name;
	}

	public void setName(String name) {
		
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public boolean isPerm() {
		return isPerm;
	}

	public void setPerm(boolean isPerm) {
		this.isPerm = isPerm;
	}

}
