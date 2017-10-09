package theme7;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


/**
 * Задача 7.5а программа, которая в окне рисует домик.
 */
public class House extends Frame {


    public House(){
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
        g.setColor(Color.decode("#CCCCFF"));
        g.fillRect(0,0,320,200);
        g.setColor(Color.decode("#227711"));
        g.fillRect(0,150,320,50);
        g.setColor(Color.decode("#AA7700"));
        g.fillRect(140,120,80,50);
        g.setColor(Color.decode("#772200"));
        g.fillPolygon(new int[]{120, 180, 240}, new int[]{120, 90, 120},3);
        g.fillRect(152,135,20,35);
        g.setColor(Color.decode("#222299"));
        g.fillRect(183,136,25,20);

    }

    public static void main(String[] args) {
        new House();
    }
}
