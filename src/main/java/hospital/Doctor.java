package hospital;

public class Doctor extends Employee implements CareTaker {

	
	private String specialty;


	public Doctor(String empNumber, String empName, String specialty) {
		this.empNumber = empNumber;
		this.empName = empName;
		this.specialty= specialty;
	}


	@Override
	public void attendPatient(Counsellable patient) {
		patient.administerCare(10);
	}
	
	
	@Override
	public int getSalary() {
		return 90000;
	}


	public String getSpecialty() {
		return specialty;
	}


	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}

}
