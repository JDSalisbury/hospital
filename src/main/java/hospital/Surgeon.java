package hospital;

public class Surgeon extends Doctor implements BloodDrawer, CareTaker {

	@Override
	public int getSalary() {
		return 120000;
	}
	
}
