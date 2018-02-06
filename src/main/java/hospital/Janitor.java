package hospital;

public class Janitor extends Employee implements BloodDrawer {

	private boolean isSweeping;

	public Janitor(String empNumber, String empName, boolean isSweeping ) {
		this.empNumber = empNumber;
		this.empName = empName;
		this.isSweeping= isSweeping;
	}
	
	

	@Override
	public int getSalary() {
		
		return 40000;
	}



	public boolean isSweeping() {
		return isSweeping;
	}



	public void setSweeping(boolean isSweeping) {
		this.isSweeping = isSweeping;
	}
	
	
}
