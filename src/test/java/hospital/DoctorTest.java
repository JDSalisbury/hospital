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
	
	
}
