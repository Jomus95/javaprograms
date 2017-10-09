package theme7;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


/**
 * Задача 7.5г программа, которая в окне рисует звезду.
 */
public class Star extends Frame {


    public Star(){
        setTitle("Star");
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
        g.setColor(Color.decode("#EEB31D"));
        g.fillPolygon(new int[]{99,160,221},new int[]{145,40,145},3);
        g.fillPolygon(new int[]{99,160,221},new int[]{75,180,75},3);


    }

    public static void main(String[] args) {
        new Star();
    }
}