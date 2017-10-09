package theme7;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


/**
 * Задача 7.5б программа, которая в окне рисует шахматную доску.
 */
public class ChessTable extends Frame {


    public ChessTable(){
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
        
          Color a = new Color (255,0,0);
          g.setColor (a);
        //g.setColor(Color.decode( "#EE0000"));
        g.fillRect(80,30,160,160);
        g.setColor(Color.BLACK);
        //for (int i = 0; i < 64; i++){
            //if ((i%8+i/8)%2 == 1)g.fillRect(80+20*(i%8),30+20*(i/8),20,20);
        //}
        for (int i =0; i<8;i++){
            for (int j = 0; j<8; j++){
                if ((i+j)%2 == 1)
                g.fillRect(80+20*i,30+20*j,20,20);
            }
        }

    }

    public static void main(String[] args) {
        new ChessTable();
    }
}