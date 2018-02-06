package hospital;

public class Surgeon extends Doctor implements CareTaker {

	private boolean isPracticing;
	private String specialty;

	public Surgeon(String empNumber, String empName, String specialty, boolean isPracticing) {
		super(empNumber, empName);
		this.isPracticing = isPracticing;
		this.setSpecialty(specialty);
	}

	@Override
	public int getSalary() {
		
		return 120000;
	}

	public boolean isOperating() {
		return isPracticing;
	}
	

	public String getSpecialty() {
		return specialty;
	}
	

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}
	
}
