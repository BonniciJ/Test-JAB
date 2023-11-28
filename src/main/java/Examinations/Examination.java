package Examinations;

import javax.swing.*;
import java.time.LocalDate;

public class Examination {

    protected LocalDate date;

    public Examination(LocalDate date) {
        this.date = date;
    }

    public LocalDate getDate() {
        return date;
    }

    public JLabel displayExam() {
        JLabel output = new JLabel();
        output.setText(date.toString());
        output.setSize(100, 200);
        return output;
    }

    public String adminOutput() {
        return date.toString();
    }

}
