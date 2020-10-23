package H13;
import java.applet.*;
import java.awt.*;

public class H13_PraktijkOpdracht_2 extends Applet {

    public void paint(Graphics g) {
        Tree(g,50,90);
    }

    void Tree(Graphics g, int x, int y) {
        int counter;
        int xcopy = x;
        for(counter = 0; counter < 10; counter++) {
            g.setColor(Color.orange);
            g.fillRect(x,y,20,100);
            g.setColor(Color.green);
            g.fillArc(x-35,y-70,90,90,0,360);
            x += 100;
            if (counter == 4) {
                y += 100;
                x = xcopy + 50;
            }
        }
    }
}