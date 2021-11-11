package drawingUI;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class CircleDimensions extends JPanel {
    protected JSlider slider;
    protected JSlider slider2;
    public CircleDimensions() {
        JPanel control = new JPanel();
        JPanel control2 = new JPanel();
        setLayout(new GridLayout(1, 2));

        control.setLayout(new GridLayout(2, 1));
        control2.setLayout(new GridLayout(2, 1));

        slider = new JSlider(0, 100);
        slider.setMajorTickSpacing(20);
        slider.setMinorTickSpacing(5);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);

        slider2 = new JSlider(0, 100);
        slider2.setMajorTickSpacing(20);
        slider2.setMinorTickSpacing(5);
        slider2.setPaintTicks(true);
        slider2.setPaintLabels(true);

        control2.add(new JLabel("Height"));
        control2.add(slider2);

        control.add(new JLabel("Circle Radius or Rectangle/Square side"));
        control.add(slider);
        add(control);
        add(control2);
    }

    public int getRadius() {
        return slider.getValue();
    }
    public int getHeight() {
        return slider2.getValue();
    }
}
