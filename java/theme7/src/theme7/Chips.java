package theme7;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Задача 7.5д программа, которая в окне рисует игральные кубики.
 */
public class Chips extends Frame {


    public Chips(){
        setTitle("House");
        setSize(320, 200);
        setResizable(false);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((dim.width- 320)/2,(dim.height- 200)/2);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        setVisible(true);

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        drawField(80,30, g);
    }

    private void drawField(int x, int y, Graphics g) {
        g.setColor(Color.decode( "#E8B32D"));
        //поле
        g.fillRect(150,30,160,160);
        g.setColor(Color.decode( "#EE0000"));
        g.drawRect(80,30,160,160);

        draw4chips(90,40, g);
        draw3chips(170,120, g);
    }

    private void draw3chips(int x, int y, Graphics g) {
        g.setColor(Color.decode( "#f2d489"));
        g.fillRect(x,y,60,60);
        g.setColor(Color.decode( "#EE0000"));
        g.drawRect(x,y,60,60);
        g.fillOval(x+60/2-14/2,y+60/2-14/2,14,14);
        g.fillOval(x+5,y+5,14,14);
        g.fillOval(x+60-14-5,y+60-14-5,14,14);
    }

    private void draw4chips(int x, int y, Graphics g) {
        g.setColor(Color.decode( "#f2d489"));
        g.fillRect(x,y,60,60);
        g.setColor(Color.decode( "#EE0000"));
        g.drawRect(x,y,60,60);
        g.fillOval(x+5,y+5,14,14);
        g.fillOval(x+60-14-5,y+5,14,14);
        g.fillOval(x+5,y+60-14-5,14,14);
        g.fillOval(x+60-14-5,y+60-14-5,14,14);
    }

    public static void main(String[] args) {
        new Chips();
    }
}
