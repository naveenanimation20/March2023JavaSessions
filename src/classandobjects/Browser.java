package classandobjects;

import java.util.ArrayList;

public class Browser {
	
	//WAF:
	//getEmployeeDevices(String empName)
	//you have to collect all the devices and return
	//Return: ArrayList<String>
	
	public ArrayList<String> getEmployeeDevices(String empName) {
		System.out.println("getting the device list for : " + empName);
		
		empName = empName.trim().toLowerCase();
		ArrayList<String> devicesList = new ArrayList<String>();//pc=0
		
		if(empName.equals("vinayak")) {
			//iphon14,macbook pro,airtel sim, mouse
			devicesList.add("iphone 14");
			devicesList.add("Macbook Pro");
			devicesList.add("Airtel SIM");
			devicesList.add("Apple Mouse");
		}
		else if(empName.equals("waseem")) {
			//samsng,mouse
			devicesList.add("samsung s13");
			devicesList.add("HP Mouse");
		}
		else if(empName.equals("prashant")) {
			//samsng,mouse, keyboard
			devicesList.add("Macbook Air");
			devicesList.add("Apple Mouse");
			devicesList.add("Apple Keyboard");

		}
		else {
			System.out.println("Plz pass the right emp name...emp is not found....");
		}
		
		return devicesList;
		
	}
	
	

	public static void main(String[] args) {

		Browser obj = new Browser();
		ArrayList<String> devList = obj.getEmployeeDevices("prashant");
		System.out.println(devList);
		
		System.out.println("total number of devices:" + devList.size());
		
	}

}
