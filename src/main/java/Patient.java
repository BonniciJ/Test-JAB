import Examinations.Examination;

import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;

public class Patient {

    private String name;
    private URL profilePicURL;
    private int yearOfBirth;
    private ArrayList<Examination> exams;

    public Patient(String name, String profilePicURLString, int age) {
        this.name = name;
        yearOfBirth = LocalDate.now().getYear() - age;
        exams = new ArrayList<>();

        URL profilePicURL=null;
        try {
            profilePicURL = new URL(profilePicURLString);
        }
        catch (MalformedURLException e){
            System.out.println(e.getMessage());
        }



    }

    public String adminOutput() {
        String output =  "Patient: " + name + " : ";

        for (Examination examination : exams) {
            output += examination.adminOutput();
        }

        return output;
    }

    public JPanel getPatientDisplay() { //gets a panel with all the tests going horizontally, need to add scroll bar
        JPanel output = new JPanel();

        output.setVisible(true);
        output.setSize(500, 200);
        output.setLayout(null);

        JLabel patientInfo = getPatientInfoLabel();
        patientInfo.setLocation(0, 0);
        output.add(patientInfo);

        //JLabel profilePic = getProfileLabel();  //Couldn't get this to work, must be setting URL to null after i set it in the constructor
        //profilePic.setLocation(210, 0);
        //output.add(profilePic);

        for (int i = 0; i < exams.size() ; i++) {
            System.out.println(i);
            JLabel nextLabel = exams.get(i).displayExam();
            nextLabel.setLocation(i*200 + 400, 0);
            output.add(nextLabel);
        }

        return output;
    }

    public JLabel getProfileLabel() {
        JLabel label = new JLabel();
        ImageIcon thisImageIcon = new ImageIcon(profilePicURL);
        label.setIcon(thisImageIcon);
        label.setSize(200, 200);
        return label;
    }

    private JLabel getPatientInfoLabel() {
        JLabel label = new JLabel();
        label.setText("<html>" + "Name: " + name + "<br>" + "Age: " + getAge() + "</html>");
        label.setSize( 80, 100);
        label.setVisible(true);
        return label;
    }

    public void addExam(Examination e) {
        exams.add(e);
    }

    public ArrayList<Examination> getExams() {
        return exams;
    }

    public String getName() {
        return name;
    }

    public URL getProfilePicURL() {
        return profilePicURL;
    }

    public int getAge() {
        int age = LocalDate.now().getYear() - yearOfBirth;
        return age;
    }
}
