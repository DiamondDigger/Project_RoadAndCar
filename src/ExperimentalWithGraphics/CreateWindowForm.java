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
    private int countOfClicks = 0;

    CreateWindowForm() {
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
            int clicks = 1;

            @Override
            public void mouseClicked(MouseEvent e) {

                super.mouseClicked(e);
//                JOptionPane.showMessageDialog(rootPanelLeft,"You've clicked something");
                System.out.println("textArea1.getLineCount(): " + textArea1.getLineCount());
                if (clicks == 1) {
                    textArea1.append("\nHello, I'm John - your consultant.\n");
                } else if (clicks == 2) {
                    textArea1.append("\nHow can I help ?\n");
                } else {
                    textArea1.append("\nPrint down your question or request, please.\n");
                }
                countOfClicks = ++clicks;
            }

        });
    }
}
