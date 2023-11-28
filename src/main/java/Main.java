import Examinations.MRIExam;

import java.net.URL;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args){

        //Please read:
        //Images dont work but i think its only a small thing... not sure where that went wrong
        //BP isnt added for patient below
        //please resize the window to display the stuff
        //havent added all patients yet, should be trivial though as i have done one

        PatientManager pm = new PatientManager();

        Patient p = new Patient("name", "https://martinh.netfirms.com/BIOE60010/SebastianCompton.jpg", 20);
        MRIExam mriExam = new MRIExam(LocalDate.now(), "https://martinh.netfirms.com/BIOE60010/mri2.jpg", 4);
        p.addExam(mriExam);
        pm.addPatient(p);
        pm.displayForAdmin();


    }
}
