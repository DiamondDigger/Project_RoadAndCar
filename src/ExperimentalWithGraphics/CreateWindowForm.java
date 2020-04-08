package ExperimentalWithGraphics;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreateWindowForm extends JFrame {
    private JPanel mainPanel;
    private JPanel rootPanelLeft;
    private JPanel rootPanelRight;
    private JButton LEFTButton;
    private JButton RIGHTButton;
    private JTextArea textArea1;
    private JTextArea textArea2;

    CreateWindowForm(){
        add(mainPanel);
        setSize(800, 400);
        setTitle("Your main window");
        add(rootPanelRight);
        add(rootPanelLeft);


        LEFTButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(rootPanelLeft, "You've pressed the left button!");
                System.out.println("Left button");
            }
        });
        RIGHTButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(rootPanelRight, "You've pressed the right button!");
                System.out.println("Right button");
            }
        });
    }
}
