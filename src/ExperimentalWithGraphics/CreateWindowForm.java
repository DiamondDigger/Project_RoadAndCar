package ExperimentalWithGraphics;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CreateWindowForm extends JFrame {
    private JPanel mainPanel;
    private JPanel rootPanelLeft;
    private JPanel rootPanelRight;
    private JButton LEFTButton;
    private JButton RIGHTButton;
    private JTextArea textArea1;
    private JTextArea textArea2;
    private Cursor cursor;

    CreateWindowForm(){
        add(mainPanel);
        setSize(800, 400);
        setTitle("Your main window");
        add(rootPanelRight);
        add(rootPanelLeft);
        setCursor(1);


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

        textArea1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                JOptionPane.showMessageDialog(rootPanelLeft,"You've clicked something");
            }
        });
    }
}
