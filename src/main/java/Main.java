import drawingUI.DrawingUIController;

import javax.swing.*;
import java.awt.*;

public class Main {
    static GraphicsConfiguration gc;
    public static void main(String[] args) {
        JFrame frame = new JFrame(gc);
        DrawingUIController dc = new DrawingUIController();

        frame.setSize(1000, 3000);
        frame.setVisible(true);
        frame.getContentPane().add(dc.getMainPanel());
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
