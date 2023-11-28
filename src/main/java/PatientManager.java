import java.util.ArrayList;

public class PatientManager {

    private ArrayList<Patient> patients;
    private UI ui;

    public PatientManager() {
        patients = new ArrayList<>();

        ui = new UI();
    }

    public void addPatient(Patient newPatient) {
        patients.add(newPatient);
        ui.addPanel(newPatient.getPatientDisplay());
    }

    public ArrayList<Patient> getPatients() {
        return patients;
    }

    public void displayForAdmin(){
        for (Patient p : patients) {
            System.out.println(p.adminOutput());
        }
    }

    //Methods to add
    //Export patient list
    //Import patient list

}
