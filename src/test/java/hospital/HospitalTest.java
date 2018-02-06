package hospital;

import static org.hamcrest.Matchers.contains;
import static org.junit.Assert.assertThat;

import java.util.Collection;

import org.junit.Test;

public class HospitalTest {

	Hospital hospital = new Hospital();
	
	@Test
	public void shouldBeAbleToHireAnEmployee() {
		
		Doctor doctor = new Doctor("","");
		hospital.addEmployee(doctor);
		Collection<Employee> check = hospital.getAllEmployees();
		assertThat(check, contains(doctor));			
	}
	
	@Test
	public void shouldAddTwoEmployees() {
		Doctor doctor = new Doctor("1111","");
		Nurse nurse = new Nurse("2222","",0);
		hospital.addEmployee(doctor);
		hospital.addEmployee(nurse);
		Collection<Employee> check = hospital.getAllEmployees();
		assertThat(check, contains(doctor,nurse));
	}
	
	
	
	
}
