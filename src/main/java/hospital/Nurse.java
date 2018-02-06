package hospital;

public class Nurse extends Employee implements BloodDrawer {

	@Override
	public int getSalary() {
		return 50000;
	}

	
}
