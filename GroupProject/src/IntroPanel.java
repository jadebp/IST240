import java.awt.*;
import javax.swing.*;

public class IntroPanel extends JPanel {

    CreditPanel cp;
    InstructionPanel inp;
    OptionPanel op;
    MainMap mm;

    public IntroPanel() {
        super();
        BorderLayout border = new BorderLayout();
        setLayout(border);
        setBackground(Color.gray);
        GridLayout grid = new GridLayout(4, 1);
        setLayout(grid);

        cp = new CreditPanel();
        inp = new InstructionPanel();
        op = new OptionPanel();
        mm = new MainMap();

        add(cp, "Center");
        add(inp, "Center");
        add(op, "Center");
        add(mm, "Center");
    }

}