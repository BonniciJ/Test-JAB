import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.MalformedURLException;
import java.net.URL;
public class UI extends JFrame {


    private static int nextY;
    private static int nextGap;

    public UI() {

        //Set up JFrame
        setSize(1000,500);
        setVisible(true);
        addWindowListener(new WindowAdapter() {// Ends program if close window is clicked
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setLayout(null);


    }

    public void addPanel(JPanel panel) {
        panel.setLocation(0, nextY);
        addGap();
        panel.setVisible(true);
        add(panel);
    }

    public static void addGap() {
        nextY += nextGap;
    }

    public static int getNextY() {
        return nextY;
    }

    public static int getNextGap() {
        return nextGap;
    }

    public static void setNextGap(int nextGap) {
        UI.nextGap = nextGap;
    }
}
