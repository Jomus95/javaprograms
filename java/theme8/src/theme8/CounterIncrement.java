package theme8;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Задача 8.1 программа "счётчик", добавляет +1 к значению в текстовом поле
 * при нажатии на кнопку, значение в текстовом поле можно менять по усмотрению,
 * если в поле окажется недопустимый символ - значение поля сбросится на 0
 */
public class CounterIncrement extends Frame {


    public CounterIncrement() {
        setTitle("Counter");
        setSize(320, 100);
        setResizable(false);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((dim.width - 320) / 2, (dim.height - 200) / 2);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        setLayout(new GridBagLayout());
        TextField textField = new TextField("0", 20);
        Button button = new Button("Count");
        Label label = new Label("Counter");
        add(label);
        add(textField);
        add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    textField.setText(""+(1+Integer.parseInt(textField.getText())));
                } catch (Exception err) {
                    textField.setText("1");
                }
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
        new CounterIncrement();
    }


}
