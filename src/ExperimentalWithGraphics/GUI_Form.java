package ExperimentalWithGraphics;

import javax.swing.*;

public class GUI_Form {
    public static void main(String[] args) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MyGUIForm myGUIForm = new MyGUIForm();
                myGUIForm.setVisible(true);
            }
        });
    }
}
