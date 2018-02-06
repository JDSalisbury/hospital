package hospital;

public class Nurse extends Employee implements BloodDrawer, CareTaker {

	@Override
	public int getSalary() {
		return 50000;
	}

	public int numberOfPatients() {
		
		return 10;
	}

	

	
}
