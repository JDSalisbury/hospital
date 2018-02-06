package hospital;

public class Doctor extends Employee implements BloodDrawer, CareTaker {

	
	public Doctor(String empNumber, String empName) {
		this.empNumber = empNumber;
		this.empName = empName;
	}


	@Override
	public void attendPatient(Counsellable patient) {
		patient.administerCare(10);
	}
	
	
	@Override
	public int getSalary() {
		return 90000;
	}

}
