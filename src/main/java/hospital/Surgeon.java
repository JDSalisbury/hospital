package hospital;

public class Surgeon extends Doctor implements BloodDrawer, CareTaker {

	public Surgeon(String empNumber, String empName) {
		super(empNumber, empName);
		
	}

	@Override
	public int getSalary() {
		return 120000;
	}
	
}
