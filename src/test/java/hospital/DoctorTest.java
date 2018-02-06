package hospital;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class DoctorTest {

	Doctor underTest = new Doctor("1111", "Phil", "Heart");
	
	@Test
	public void shouldDrawBlood() {
		
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
		
		Bleedable patient = new BleedableDouble();
		
		underTest.drawBlood(patient);
		
		assertThat(wasBled, is(true));
	
	}
	
	@Test
	public void shouldHaveSalarty() {
		
		
		int salary = underTest.getSalary();
		
		assertThat(salary, is(90000));
	}
	
	@Test
	public void shouldcareForPatient() {
		
		Patient patient = new Patient();

		underTest.attendPatient(patient);
		int takenCareOf = patient.getCareStatus();
		assertThat(takenCareOf, is(20));
		
	}
	
	@Test
	public void shouldReturnEmpNumber() {
		
		String check = underTest.getEmpNumber();
		assertEquals(check, "1111");
	}
	
	@Test
	public void shouldReturnEmpName() {
		
		String check = underTest.getEmpName();
		assertEquals(check, "Phil");
	}
	
}
