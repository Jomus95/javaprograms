package theme8;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Задача 8.1.1, счётчик, который считает в сторону убывания,
 * по умолчанию счёт начинается с 88, но можно вручную ввести
 * любое число, если в поле окажется недопустимый символ
 * - значение поля сбросится на 88
 */
public class CounterDecrement extends Frame {


    public CounterDecrement() {
        setTitle("Counter decrement");
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
        TextField textField = new TextField("88", 20);
        Button button = new Button("Count");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    textField.setText(""+(-1+Integer.parseInt(textField.getText())));
                } catch (Exception err) {
                    textField.setText("88");
                }
            }
        });
        Label label = new Label("Counter");
        setLayout(new GridBagLayout());
        add(label);
        add(textField);
        add(button);
        setVisible(true);
    }


    public static void main(String[] args) {
        new CounterDecrement();
    }


}
