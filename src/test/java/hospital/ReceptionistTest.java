package hospital;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ReceptionistTest {

	@Test
	public void shouldTellIfUsingPhone() {
		Receptionist underTest = new Receptionist("","",true);
		boolean check = underTest.isOnPhone();
		assertThat(check, is(true));
	}
	
	
	
	
}
