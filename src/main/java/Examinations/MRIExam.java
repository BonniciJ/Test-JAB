package Examinations;

import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalDate;

public class MRIExam extends Examination{

    private URL imageURL;
    private float strength; //Not sure if this can be non integer or not

    public MRIExam(LocalDate date, String imageURLString, float strength) {
        super(date);
        this.strength = strength;

        URL imageURL=null;
        try {
            imageURL = new URL(imageURLString);
        }
        catch (MalformedURLException e){
            System.out.println(e.getMessage());
        }


    }

    public String adminOutput() {
        String output = "";

        output += "MRI " + strength + " Tesla, " + date.toString();

        return output;
    }


    public JLabel displayExam() {
        JLabel label = new JLabel();
        //ImageIcon thisImageIcon = new ImageIcon(imageURL); //Couldn't get this to work, must be setting URL to null after i set it in the constructor
        //label.setIcon(thisImageIcon);
        label.setSize(200, 200);
        return label;
    }

    public URL getImageURL() {
        return imageURL;
    }

    public float getStrength() {
        return strength;
    }
}
