
package H13;
import java.awt.*;
import java.applet.*;

public class H13_2 extends Applet {

    public void paint(Graphics g) {
        brickWall(g,10,10,400,300);
    }

    void brickWall(Graphics g, int x, int y, int width, int height) {
        int counter;
        g.setColor(Color.red);
        g.fillRect(x,y,width,height);
        g.setColor(Color.black);
        int ystart = y;
        int width1 = width / 20;
        int height1 = height / 20;
        for (counter = 0; counter < height * width / height1; counter += width / 20) {
            g.drawRect(x,y,width1,height1);
            y += height1;
            while (y >= height) {
                y = ystart;
                x += width1;
            }
        }
    }

}