package ExperimentalWithGraphics;

import javax.swing.*;

public class Window_Form {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                CreateWindowForm  createWindowForm = new CreateWindowForm();
                createWindowForm.setVisible(true);
            }
        });
    }
}
