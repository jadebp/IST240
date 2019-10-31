import java.awt.*;
import javax.swing.*;

public class MainMap extends JPanel {

    Game1 g1;
    Game2 g2;
    Game3 g3;
    GameOver go;
    

    public MainMap() {
        super();
        BorderLayout border = new BorderLayout();
        setLayout(border);
        setBackground(Color.gray);
        GridLayout grid = new GridLayout(4, 1);
        setLayout(grid);

        g1 = new Game1();
        g2 = new Game2();
        g3 = new Game3();
        go = new GameOver();

        add(g1, "Center");
        add(g2, "Center");
        add(g3, "Center");
        add(go, "Center");
        
    }

}