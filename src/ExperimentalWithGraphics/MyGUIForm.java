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
    private JLabel LabelButton;
    private JLabel LabelAnotherButton;
    private JButton ResetButton;

    private int count1 = 0;
    private int count2 = 0;
    private int resetNumber = 0;
    private int newResetNumber = 0;
    private boolean getZero = false;
    private boolean flagZero1Butt = false;
    private boolean flagZero2Butt = false;
    private String[] listOfResults = new String[5]; // with 5 no need capacity, may be will be fixed later

    MyGUIForm() {
        //This uses the form designer form
        add(rootPanel);
        setSize(400, 500);
        setTitle("This is my GUI window");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        ResetButton.addActionListener(new ActionListener() {
            int countOfReset = 1;
            boolean flagToZero = true;

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                myTextArea.append("\nTHE RESET IS DONE!");
                newResetNumber = countOfReset;
                countOfReset++;
                resetNumber = countOfReset;
                getZero = flagToZero;
                LabelButton.setText("Count of clicks: ");
                LabelAnotherButton.setText("Count of clicks: ");
            }
        });

        MyButton.addActionListener(new ActionListener() {
            int count = 1;
            boolean flagToZero = false;


            @Override
            public void actionPerformed(ActionEvent actionEvent) {
//                JOptionPane.showMessageDialog(rootPanel, "Yaap! You pressed the button!");
                if (getZero) {
                    count = 0;
                    flagToZero = true;
                }
//                getZero = false;
                if (count != 1) {
                    System.out.println("You've pressed button " + count + " times");
                } else {
                    System.out.println("You've pressed the button");
                }
                LabelButton.setText("Count of clicks: " + count);
                count++;
                count1 = count - 1; // -1 because after existing it make ++
                flagZero1Butt = flagToZero;
            }
        });

        MyAnotherButton.addActionListener(new ActionListener() {
            int count = 1;
            boolean flagToZero = false;

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
//                JOptionPane.showMessageDialog(MyAnotherButton, "All right! You pressed another button");
                if (getZero) {
                    count = 0;
                    flagToZero = true;
                }
                if (count != 1) {
                    System.out.println("You've pressed another button " + count + " times");
                } else {
                    System.out.println("You've pressed another button");
                }
                LabelAnotherButton.setText("Count of clicks: " + count);
                count++;
                count2 = count - 1;
                flagZero2Butt = flagToZero;
            }
        });

        theResultButton.addActionListener(new ActionListener() {
            int result = 0;
            int countRows = 0;

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                result = count1 + count2;
                String message = "\n<<<<<<- THE RESULTS ARE ->>>>>>\n" +
                        "button score: " + count1 + "\n" +
                        "another button score: " + count2 + "\n" +
                        "Total SCORE: " + result;
                JOptionPane.showMessageDialog(theResultButton, message);
                listOfResults[countRows] = message;
                myTextArea.append(listOfResults[countRows]);
                if (flagZero1Butt&&flagZero2Butt) {
                    getZero =false;
                }
            }
        });

    }
}
