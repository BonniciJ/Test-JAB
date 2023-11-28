package Examinations;

import javax.swing.*;
import java.time.LocalDate;

public class BPExam extends Examination{

    int systolic;
    int diastolic;
    String term;

    public BPExam(LocalDate date, int systolic, int diastolic, String term) {
        super(date);
        this.systolic = systolic;
        this.diastolic = diastolic;
        this.term = term;
    }

    public JLabel displayOutput() {
        JLabel label = new JLabel();
        label.setText("<html>" + "Blood Pressure" + "<br>" + systolic + " over " + diastolic + "</html>");
        label.setSize(80, 100);
        label.setVisible(true);
        return label;
    }

    public String adminOutput() {
        String output = "BP: " + term + ", " + date.toString();
        return output;
    }



}
