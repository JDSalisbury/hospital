package hospital;

public interface BloodDrawer {

	public default void drawBlood(Bleedable patient) {
		drawBlood(patient, 1);
	}
	public default void drawBlood(Bleedable patient,int amount) {
		patient.removeBlood(amount);
	}
}