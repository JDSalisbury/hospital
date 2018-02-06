package hospital;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class DoctorTest {

	@Test
	public void shouldDrawBlood() {
		Doctor underTest = new Doctor("", "Phil");
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
		Doctor underTest = new Doctor("", "Phil");
		Bleedable patient = new BleedableDouble();
		
		underTest.drawBlood(patient);
		
		assertThat(wasBled, is(true));
	
	}
	
	@Test
	public void shouldHaveSalarty() {
		Employee underTest = new Doctor("", "Phil");
		
		int salary = underTest.getSalary();
		
		assertThat(salary, is(90000));
	}
	
	@Test
	public void shouldcareForPatient() {
		CareTaker underTest = new Doctor("", "Phil");
		Patient patient = new Patient();

		underTest.attendPatient(patient);
		int takenCareOf = patient.getCareStatus();
		assertThat(takenCareOf, is(20));
		
	}
	
	@Test
	public void shouldReturnEmpNumber() {
		Employee underTest = new Doctor("1111", "Phil");
		String check = underTest.getEmpNumber();
		assertEquals(check, "1111");
	}
	
	@Test
	public void shouldReturnEmpName() {
		Employee underTest =  new Doctor("1111", "Phil");
		String check = underTest.getEmpName();
		assertEquals(check, "Phil");
	}
	
}
