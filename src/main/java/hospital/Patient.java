package hospital;

public class Patient implements Bleedable {

	public static final int DEFAULT_BLOODS = 42;
	private int bloods = DEFAULT_BLOODS;
	public int getBloods() {
		return bloods;
	}
	
	public void removeBlood(int amount) {
		bloods -= amount;	
	}

	

}
