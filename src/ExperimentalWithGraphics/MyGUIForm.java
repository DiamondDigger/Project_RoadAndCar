package ExperimentalWithGraphics;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyGUIForm extends JFrame {
    private JButton MyButton;
    private JTextArea myTextArea;
    private JPanel rootPanel;
    private JButton MyAnotherButton;
    private JButton theResultButton;

    private int count1 = 0;
    private int count2 = 0;

    MyGUIForm() {
        //This uses the form designer form
        add(rootPanel);

        setSize(400, 500);
        setTitle("This is my GUI window");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        MyButton.addActionListener(new ActionListener() {
            int count = 1;

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(rootPanel, "Yaap! You pressed the button!");
                if (count != 1) {
                    System.out.println("You've pressed button " + count + " times");
                } else {
                    System.out.println("You've pressed the button");
                }
                count++;
                count1 = count-1; // -1 because after existing it make ++
            }
        });

        MyAnotherButton.addActionListener(new ActionListener() {
            int count = 1;

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(MyAnotherButton, "All right! You pressed another button");
                if (count != 1) {
                    System.out.println("You've pressed another button " + count + " times");
                } else {
                    System.out.println("You've pressed another button");
                }
                count++;
                count2 = count-1;
            }
        });

        theResultButton.addActionListener(new ActionListener() {int result = 0;
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                result= count1+count2;
                JOptionPane.showMessageDialog(theResultButton, "<<<<<<- THE RESULTS ARE ->>>>>>\n" +
                        "button score: " + count1 + "\n" +
                        "another button score: " + count2 + "\n" +
                        "Total SCORE: " + result);
            }
        });
    }

}
