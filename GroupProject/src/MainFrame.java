
import java.awt.*;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class MainFrame extends JFrame {

    IntroPanel IP;

    public MainFrame() {
        super("Assignment 07");
        MacLayoutSetup();
        IP = new IntroPanel();
        getContentPane().add(IP, "Center");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 480);
        setVisible(true);
    }

    public void MacLayoutSetup() {
        // On some MACs it might be necessary to have the statement below 
        //for the background color of the button to appear 
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
