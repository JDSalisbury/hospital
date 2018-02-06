package hospital;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class NurseTest {

	@Test
	public void shouldReturnNumberOfPatients() {
		Nurse underTest = new Nurse("","", 10);
		int patientCount = underTest.numOfPatients();
		assertThat(patientCount, is(10));
	}
	
	@Test
	public void shouldDrawBlood() {
		BloodDrawer underTest = new Nurse("2222", "Bill", 10);
		Patient patient = new Patient();
		int bloodsBefore = patient.getBloods();
		underTest.drawBlood(patient);
		
		int bloodsAfter = patient.getBloods();
		assertThat(bloodsBefore - bloodsAfter, is(1));
	}
	
	@Test
	public void shouldcareForPatient() {
		CareTaker underTest = new Nurse("2222", "Bill", 10);
		Patient patient = new Patient();

		underTest.attendPatient(patient);
		int takenCareOf = patient.getCareStatus();
		assertThat(takenCareOf, is(15));
		
	}
	
	
	@Test
	public void shouldReturnEmpNumber() {
		Employee underTest = new Nurse("2222", "Bill", 10);
		String check = underTest.getEmpNumber();
		assertEquals(check, "2222");
	}
	
	@Test
	public void shouldReturnEmpName() {
		Employee underTest = new Nurse("2222", "Bill", 10);
		String check = underTest.getEmpName();
		assertEquals(check, "Bill");
	}
	
}
