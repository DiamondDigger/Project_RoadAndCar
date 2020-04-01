package ExperimentalWithGraphics;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JavaOracleTutorial_1 {

    public static class Beeper extends JPanel
            implements ActionListener {
        JButton button;

        public Beeper() {
            super(new BorderLayout());
            button = new JButton("Bite me!");
            button.setPreferredSize(new Dimension(800, 400));
            add(button, BorderLayout.WEST);
            button.addActionListener(this);
        }

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            Toolkit.getDefaultToolkit().beep();
        }

        private static void CreateAndShowGUI() {

            //Create and set up the window
            JFrame jFrame = new JFrame();
            jFrame.setSize(1000,1000);
            jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            jFrame.setVisible(true);

            //Create and setup the content pane
            JComponent newContentPane = new Beeper();
            newContentPane.setOpaque(true); //content panes must be opaque
            jFrame.setContentPane(newContentPane);

            //Display the window
            jFrame.pack();
            jFrame.setVisible(true);
        }

        public static void main(String[] args) {
            javax.swing.SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    CreateAndShowGUI();
                }
            });
        }
    }
}
