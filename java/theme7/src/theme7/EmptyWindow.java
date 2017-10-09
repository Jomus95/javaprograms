package theme7;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Задача 7.1 класс, который выводит пустое окно.
 */
public class EmptyWindow extends Frame {


    public EmptyWindow(){
        setTitle("Empty window");
        setSize(320, 200);
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

    public static void main(String[] args) {
       
        new MessageWindow();
    }


}
