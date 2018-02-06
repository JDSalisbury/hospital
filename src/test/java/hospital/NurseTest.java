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
		int 
		
	}
}
