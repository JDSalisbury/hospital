package hospital;

public class Patient implements Bleedable, Counsellable {

	public static final int DEFAULT_BLOODS = 42;
	private int bloods = DEFAULT_BLOODS;
	private int qualityOfLife = 50;
	public int getBloods() {
		return bloods;
	}
	
	public void removeBlood(int amount) {
		bloods -= amount;	
	}

	public int getCareStatus() {
		return qualityOfLife;
		
	}
	public void addHappiness(int happy) {
		qualityOfLife += happy;
	}
	

}
