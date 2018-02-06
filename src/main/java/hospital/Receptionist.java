package hospital;

public class Receptionist extends Employee {

	private boolean onPhone;

	public Receptionist(String empNumber, String empName, boolean onPhone) {
		this.onPhone = onPhone;
	}

	@Override
	public int getSalary() {
		
		return 45000;
	}

	public boolean isOnPhone() {
	
		return onPhone;
	}

}
