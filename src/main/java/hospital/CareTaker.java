package hospital;

public interface CareTaker {

	public default void attendPatient(Counsellable patient) {
		attendPatient(patient, 1);
	}
	public default void attendPatient(Counsellable patient,int happy) {
		patient.addHappiness(happy);
	}
	
}
