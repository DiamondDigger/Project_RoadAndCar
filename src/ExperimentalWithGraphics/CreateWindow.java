package ExperimentalWithGraphics;

import javax.swing.*;
import java.awt.*;

public class CreateWindow extends JFrame {

    CreateWindow(String s) throws AWTException {
        super(s);
        setLayout(null);
        setTitle("CurrentWindow");
        setSize(800, 800);
        setCursor(Cursor.getPredefinedCursor(1));
        setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void paint(Graphics window) {
    }

    public static void main(String[] args) throws AWTException {
        CreateWindow createWindow = new CreateWindow("Window - created");

    }
}
