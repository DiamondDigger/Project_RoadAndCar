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

        setSize(500,500);
        setTitle("This is my GUI window");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        MyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("You've pressed the button");
            }
        });
    }

}
