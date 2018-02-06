package hospital;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class NurseTest {

	@Test
	public void shouldDrawBlood() {
		BloodDrawer underTest = new Nurse();
		Patient patient = new Patient();
		int bloodsBefore = patient.getBloods();
		underTest.drawBlood(patient);
		
		int bloodsAfter = patient.getBloods();
		assertThat(bloodsBefore - bloodsAfter, is(1));
	}
	
	@Test
	public void shouldcareForPatient() {
		CareTaker underTest = new Nurse();
		Patient patient = new Patient();

		underTest.attendPatient(patient);
		int takenCareOf = patient.getCareStatus();
		assertThat(takenCareOf, is(15));
		
	}
	
	@Test
	public void shouldReturnNumberOfPatients() {
		Nurse underTest = new Nurse();
		int number = underTest.numberOfPatients();
		assertThat(number, is(10));
	}
	
}
