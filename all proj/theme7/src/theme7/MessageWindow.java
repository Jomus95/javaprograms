package theme7;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Задача 7.3, проверка вывода строки в окне.
 */
public class MessageWindow extends Frame {


    public MessageWindow(){
        setTitle("Message Window");
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
        //g.setColor(Color.BLACK);
        //g.drawString("Демонстрация вывода строки.",70, 100);
        //g.drawString("С использованием метода drawString().",50, 120);
    }

    public static void main(String[] args) {
        new MessageWindow();
    }


}
