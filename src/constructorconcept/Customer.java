package constructorconcept;

public class Customer {

	String name;
	int custId;
	String city;
	long phoneNumber;

	public Customer(String name, int custId, String city, long phoneNumber) {
		this.name = name;
		this.custId = custId;
		this.city = city;
		this.phoneNumber = phoneNumber;
		
		//buss logic--getsalary --- finalsalry --return????
		
	}
	
	
	//buss logic, feature logic, implenetation logic
	public int getSalary(int totalCTC, int bonus) {
		return totalCTC + bonus;
	}

}
