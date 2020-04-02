package ExperimentalWithGraphics;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyGUIForm extends JFrame{
    private JButton MyButton;
    private JTextArea myTextArea;
    private JPanel rootPanel;

    MyGUIForm(){
        //This uses the form designer form
        add(rootPanel);

        setSize(400,500);
        setTitle("This is my GUI window");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        MyButton.addActionListener(new ActionListener() {int i = 1;
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (i!=1) {
                    System.out.println("You've pressed "+i+" times");
                } else {
                    System.out.println("You've pressed the button");
                }
                i++;
                JOptionPane.showMessageDialog(rootPanel,"Yaap! You pressed the button!");

            }
        });
    }

}
