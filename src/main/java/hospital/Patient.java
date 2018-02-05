package hospital;

public class Patient {

	public static final int DEFAULT_BLOOD = 42;
	private int bloods = Patient.DEFAULT_BLOOD;
	public int getBloods() {
		return bloods;
	}
	public void removeBlood(int amount) {
		bloods -= amount;
		
	}

	

}
