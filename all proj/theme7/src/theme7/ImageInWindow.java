package theme7;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;

/**
 * Задача 7.4 проверка работы метода, drawImage, для отрисовки картинок,
 * для теста будут отрисованы три картинки в форматах jpg, png и gif
 */
public class ImageInWindow extends Frame {


    private Image imgPng;
    private Image imgJpg;
    private Image imgGif;

    public ImageInWindow(){
        setTitle("Images in window");
        setSize(400, 200);
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

        imgPng = Toolkit.getDefaultToolkit().getImage("src/theme7/images/hype.png");
        imgJpg = Toolkit.getDefaultToolkit().getImage("src/theme7/images/hype.jpg");
        imgGif = Toolkit.getDefaultToolkit().getImage("src/theme7/images/hype.gif");
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawImage(imgPng,8,50,this);
        g.drawImage(imgJpg,136,50,this);
        g.drawImage(imgGif,264,50,this);

        g.drawString("PNG",8+52,160);
        g.drawString("JPG",136+52,160);
        g.drawString("GIF",264+52,160);

    }

    public static void main(String[] args) {
        new ImageInWindow();
    }


}
