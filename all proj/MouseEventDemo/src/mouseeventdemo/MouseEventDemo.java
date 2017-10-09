/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mouseeventdemo;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MouseEventDemo extends Frame implements MouseListener {
    
    

       public MouseEventDemo (){
        setLayout (new FlowLayout());
      


       //labels
       Label labelx = new Label("X-клик:");
       Label labely = new Label("Y-клик:");
       add(labelx);
       add(labely);

       //2 страница TextField

        TextField mousex = new TextField(10);

       //сделаем только для чтения
        TextField mousey = new TextField(10);
      

      
       //сделаем только для чтения
        add(mousex);
        add(mousey);

       //3 страница добавляем слушатель к мышу

       addMouseListener(this);
       setTitle("Демонстрация событий мыши");
       setSize(350,100);
       setVisible(true);

       
       addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
       }
       

        public static void main (String [] args){
        new MouseEventDemo();
         }

         //обработчик событий мыши
         
       @Override
         public void mouseClicked(MouseEvent e){
             mousex.setText(e.getX()+" ");
             mousey.setText(e.getY()+" ");
             
         }
         /*mousex.setText(e.getX()+" ");
         mousey.setText(e.getY()+" ");
         }*/
       @Override
         public void mousePressed(MouseEvent e){}

         
       @Override
         public void mouseReleased(MouseEvent e){}

         
       @Override
         public void mouseEntered(MouseEvent e){}

        
       @Override
         public void mouseExited(MouseEvent e){}

       
         public void windowClosing(WindowEvent e){
         System.exit(0);
         }
       
         public void windowOpened(WindowEvent e){}

        
         public void windowClosed(WindowEvent e){}

        
         public void windowIconListened(WindowEvent e){}

        
         public void windowOpenedDeiconField(WindowEvent e){}

        
         public void windowActivated(WindowEvent e){}

        
         public void windowDeactivated(WindowEvent e){}


    
}
