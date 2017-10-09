package theme8;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Задача 8.1.2 программа для вычисления факториала,
 * для 0 =< N =< 20;
 * Вычисляет значение если ввести N и нажать на Enter.
 * Если нажать кнопку Next - выводит значение для N+1.
 */
public class FactorialCalc extends Frame {


    public FactorialCalc() {
        setTitle("Factorial calculator");
        setSize(380, 100);
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

        Label labelN = new Label("N");
        Label labelF = new Label("  Factorial(N)");
        Button button = new Button("Next");
        TextField nInput = new TextField("1", 2);
        TextField resoult = new TextField("0", 20);

        add(labelN);
        add(nInput);
        add(labelF);
        add(resoult);
        add(button);

        nInput.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int n;
                try {
                    n = Integer.parseInt(nInput.getText());
                    if (n<0) n = 0;
                    if (n>20) n = 20;
                } catch (Exception err) {
                    resoult.setText("1");
                    n = 1;
                }
                resoult.setText(""+calcFactorial(n));
                nInput.setText(""+n);
            }
        });
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int n;
                try {
                    n = 1 + Integer.parseInt(nInput.getText());
                    if (n<0 || n>20) n = 0;
                } catch (Exception err) {
                    resoult.setText("1");
                    n = 1;
                }
                resoult.setText(""+calcFactorial(n));
                nInput.setText(""+n);
            }
        });

        setVisible(true);

    }

    private long calcFactorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
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
        new FactorialCalc();
    }


}
