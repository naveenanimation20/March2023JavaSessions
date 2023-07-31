package OOP_Abstraction;

public class FortisHospital extends Medical implements USMedical, UKMedical, IndianMedical {

	// US
	@Override
	public void physioServices() {
		System.out.println("FH -- physioServices");
	}

	@Override
	public void cardioServices() {
		System.out.println("FH -- cardioServices");

	}

	@Override
	public void ENTServices() {
		System.out.println("FH -- ENTServices");

	}

	// UK
	@Override
	public void neuroServices() {
		System.out.println("FH -- neuroServices");

	}

	@Override
	public void orthoServices() {
		System.out.println("FH -- orthoServices");

	}

	// India
	@Override
	public void oncologyServices() {
		System.out.println("FH -- oncologyServices");

	}

	@Override
	public void dentalServices() {
		System.out.println("FH -- dentalServices");

	}

	@Override
	public void gynoServices() {
		System.out.println("FH -- gynoServices");

	}

	// FH - individual
	public void medicalTraining() {
		System.out.println("FH -- medicalTraining");
	}

	public void medicalInsurance() {
		System.out.println("FH -- medicalInsurance");
	}

	//common
	@Override
	public void emergencyServices() {
		System.out.println("FH -- emergencyServices");
	}

	@Override
	public void test(int a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String get(int a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String get(int a, int b) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void covidVaccination() {
		System.out.println("FH -- covidVaccination");
	}

	@Override
	public void medicalNews() {
		System.out.println("FH -- medicalNews");
	}
	
	@Override
	public void billing() {
		System.out.println("FH -- medical billing");
	}

}
