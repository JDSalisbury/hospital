package hospital;

public class HospitalApp {

	public static void main(String[] args) {
	
		Doctor phil = new Doctor("1111", "Phil", "Heart");
		Surgeon harry = new Surgeon("2222", "Harry", "Plastic", false);
		Nurse jackie = new Nurse("3333", "Jackie", 0);
		Janitor rosie = new Janitor("4444", "Rosie", false);
		Receptionist janine = new Receptionist("5555", "Janine", true);
		
		Hospital hospital = new Hospital();
		hospital.addEmployee(rosie);
		hospital.addEmployee(jackie);
		hospital.addEmployee(harry);
		hospital.addEmployee(phil);
		
		
		hospital.showPayRates();

		hospital.showAllMedicalPersonnel();
		
		
		hospital.showAllBloodDrawers();
		
		
		System.out.print("Is Jackie Sweeping?: " + rosie.isSweeping());
		System.out.println("");
		System.out.print("Is Janine on the Phone?: " + janine.isOnPhone());
	}

}
