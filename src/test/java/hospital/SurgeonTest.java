package hospital;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class SurgeonTest {

	Surgeon underTest = new Surgeon("", "", "", true);
	
	@Test
	public void shouldReturnOperatingStatus() {
		boolean check = underTest.isOperating();
		assertThat(check, is(true));
	}
	
//	@Test
//	public void shouldGoIntoSurgery() {
//		Patient patient = new Patient();
//		int bloodsBefore = patient.getBloods();
//		int healthbefore = patient.getCareStatus();
//		
//		
//	}
	
	
}
