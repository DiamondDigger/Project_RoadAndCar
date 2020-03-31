package ExperimentalWithGraphics;

import javax.swing.*;
import java.awt.*;

public class CreateWindow extends JFrame {

    CreateWindow(String s) {
        super(s);
        setLayout(null);
        setSize(800, 800);
        setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void paint(Graphics window) {
    }

    public static void main(String[] args) {
        CreateWindow createWindow = new CreateWindow("Window - created");

    }

}
