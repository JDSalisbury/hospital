package hospital;

public class Nurse extends Employee implements CareTaker {

	private int numOfPatients;


	public Nurse(String empNumber , String empName, int numOfPatients) {
		this.empNumber = empNumber;
		this.empName = empName;
		this.numOfPatients = numOfPatients;
	}
	

	@Override
	public int getSalary() {
		return 50000;
	}

	
	public int numOfPatients() {
		return numOfPatients;
	}
	
		

	

	
}
