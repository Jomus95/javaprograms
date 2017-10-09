package theme8;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


/**
 * Задача 8.2, программа сумматор
 * после ввода числа в первое поле и нажатия на Enter (на клавиатуре)
 * это число из первого поля будет присуммировано к числу во втором поле,
 * если в любом из полей поле окажется недопустимый
 * символ - значение поля сбросится на 0
 */

public class Accumulator extends Frame{


    public Accumulator() {
        setTitle("Accumulator");
        setSize(320, 100);
        setResizable(false);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((dim.width - 160) / 2, (dim.height - 200) / 2);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        setLayout(new FlowLayout(FlowLayout.RIGHT));

        Label label = new Label("Enter an integer ");
        Label label1 = new Label("Accumulated sum is ");
        TextField input = new TextField("0",20);
        TextField resoult = new TextField("0",20);
        add(label);
        add(input);
        add(label1);
        add(resoult);

        input.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                long inputNum;
                long resoultNum;
                try{
                    inputNum = Long.parseLong(input.getText());
                }catch (Exception err){
                    inputNum = 0;
                    input.setText("0");
                }
                try{
                    resoultNum = Long.parseLong(resoult.getText());
                }catch (Exception err){
                    resoultNum = 0;
                    resoult.setText("0");
                }

                resoult.setText("" + (resoultNum+inputNum));


            }
        });



        setVisible(true);
    }
        /**
     * Для того, что бы отловить исключение, используется конструкция try...catch. 
     * В блоке try выполняются операции, которые могут привести к исключительной ситуации,
     * а блок catch позволяет принять решение что делать, если исключение было брошено.
     * 
 * Метод parseInt() в Java используется для получения примитивного типа данных определенной строки. 
 * parseXxx() — это статический метод и может иметь один аргумент или два.
 * @param args 
 */

    public static void main(String[] args) {
        new Accumulator();
    }

}
