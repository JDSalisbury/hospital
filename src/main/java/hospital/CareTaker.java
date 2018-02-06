package hospital;

public interface CareTaker extends BloodDrawer {

//	public default void attendPatient(Counsellable patient) {
//		attendPatient(patient, 1);
//	}
//	public default void attendPatient(Counsellable patient,int happy) {
//		patient.addHappiness(happy);
//	}
	
	public default void attendPatient(Counsellable patient) {
		patient.administerCare(5);
	}
}
