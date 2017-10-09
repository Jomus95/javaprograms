package theme7;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Задача 7.2, проверка вcех методов для рисования
 */
public class DrawDemo extends Frame {


    public DrawDemo() {
        setTitle("Draw demo");
        setSize(512, 320);
        setResizable(false);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((dim.width - 512) / 2, (dim.height - 320) / 2);
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
        /**
         * Color a = new Color (255,0,0);
         * g.setColor (a):
         */
        g.setColor(Color.BLACK);
        g.drawString("a) drawLine(...)", 16, 100);
        g.drawString("б) drawPolyline(...)", 136, 100);
        g.drawString("в) drawRect(...)", 264, 100);
        g.drawString("г) drawOval(...)", 392, 100);
        g.drawString("д) draw3DRect(...)", 16, 200);
        g.drawString("е) drawRoundRect(...)", 136, 200);
        g.drawString("ж) drawPolygon(...)", 264, 200);
        g.drawString("з) fillRect(...)", 392, 200);
        g.drawString("и) fillOval(...)", 16, 300);
        g.drawString("к) fill3DRect(...)", 136, 300);
        g.drawString("л) fillRoundRect(...)", 264, 300);
        g.drawString("м) fillPolygon(...)", 392, 300);

        g.setColor(Color.ORANGE);
        g.drawLine(16, 70, 100, 55);
        g.drawPolyline(new int[]{136, 160, 190, 220, 240}, new int[]{40, 85, 40, 85, 40}, 5);
        g.drawRect(275, 40, 64, 40);
        g.drawOval(405, 40, 64, 40);

        g.draw3DRect(26, 135, 64, 40, true);
        g.drawRoundRect(150, 135, 64, 40, 12, 12);
        g.drawPolygon(new int[]{280, 290, 310, 325, 340, 360, 370}, new int[]{180, 120, 150, 120, 150, 120, 180}, 7);
        g.fillRect(410, 135, 64, 40);

        g.fillOval(26, 230, 64, 40);
        g.fill3DRect(150, 230, 64, 40, true);
        g.fillRoundRect(280, 230, 64, 40, 12, 12);
        g.fillPolygon(new int[]{400, 400, 420, 440, 460, 480, 480}, new int[]{280, 220, 260, 220, 260, 220, 280}, 7);

    }

    public static void main(String[] args) {
        new DrawDemo();
    }


}
