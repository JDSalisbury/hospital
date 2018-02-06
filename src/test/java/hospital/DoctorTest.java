package hospital;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class DoctorTest {

	@Test
	public void shouldDrawBlood() {
		Doctor underTest = new Doctor();
		Patient patient = new Patient();
		int bloodsBefore = patient.getBloods();
		underTest.drawBlood(patient);
		
		int bloodsAfter = patient.getBloods();
		assertThat(bloodsBefore - bloodsAfter, is(1));
	}
	boolean wasBled = false;
	public class BleedableDouble implements Bleedable {

		@Override
		public void removeBlood(int amount) {
			wasBled = true;
			
		}
		
	}
	// this test uses behavior verification.
	@Test
	public void shouldDrawBloodFromDouble() {
		Doctor underTest = new Doctor();
		Bleedable patient = new BleedableDouble();
		
		underTest.drawBlood(patient);
		
		assertThat(wasBled, is(true));
	
	}
	
	@Test
	public void shouldHaveSalarty() {
		Employee underTest = new Doctor();
		
		int salary = underTest.getSalary();
		
		assertThat(salary, is(90000));
	}
	
}
