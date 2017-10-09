package theme8;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


/**
 * Задача 8.2.1, сумматор с лейблом, вместо текстового поля, для результата
 * в остальном отличий нет
 */
public class NewAccumulator extends Frame{

    private long resoultNum;

    public NewAccumulator() {
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
        setLayout(new FlowLayout(FlowLayout.LEFT));

        Label label = new Label("         Enter an integer");
        Label label1 = new Label("Accumulated sum is ");
        TextField input = new TextField("0",20);
        Label resoult = new Label("0                                       ");
        add(label);
        add(input);
        add(label1);
        add(resoult);

        input.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                long inputNum;
                try{
                    inputNum = Long.parseLong(input.getText());
                }catch (Exception err){
                    inputNum = 0;
                    input.setText("0");
                }
                resoultNum +=inputNum;
                resoult.setText("" + resoultNum);
            }
        });

        setVisible(true);
    }


    public static void main(String[] args) {
        new NewAccumulator();
    }

}
