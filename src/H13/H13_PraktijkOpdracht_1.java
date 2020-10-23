package H13;
import java.applet.*;
import java.awt.*;

public class H13_PraktijkOpdracht_1 extends Applet {

    public void paint(Graphics g) {
        Tree(g, 150, 90);
    }

    void Tree(Graphics g, int x, int y) {
        g.setColor(Color.orange);
        g.fillRect(x, y, 20, 100);
        g.setColor(Color.green);
        g.fillArc(x - 35, y - 70, 90, 90, 0, 360);
    }
}