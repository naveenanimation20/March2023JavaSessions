package OOP_Abstraction;

public class TestHospital {

	public static void main(String[] args) {

		FortisHospital fh = new FortisHospital();
		fh.physioServices();
		fh.cardioServices();
		fh.neuroServices();
		fh.emergencyServices();
		fh.dentalServices();
		fh.medicalInsurance();
		fh.medicalTraining();
		System.out.println(USMedical.min_fee);
		System.out.println(FortisHospital.min_fee);

		USMedical.USMedPharmacy();
		fh.billing();

		//
		// can not create the object of interface
		// USMedical us = new USMedical();

		// top casting:
		// child class object can be referred by parent interface ref variable
		USMedical us = new FortisHospital();
		us.physioServices();
		us.ENTServices();
		us.cardioServices();
		us.emergencyServices();

		// down casting: CT -- NA
		// FortisHospital fh1 = (FortisHospital)new USMedical();

	}

}
