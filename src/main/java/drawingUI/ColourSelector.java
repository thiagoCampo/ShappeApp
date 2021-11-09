package drawingUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColourSelector extends JPanel {
    protected Color currentColor;
    protected JButton but1;

    public ColourSelector () {
        currentColor = Color.BLACK;
        but1 = new JButton("Choose Color");
        add(but1);

        but1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Color newColor = JColorChooser.showDialog(but1, "Choose Color", currentColor);
                currentColor = newColor;
                but1.setBackground(currentColor);
            }
        });

    }

    public Color getColor () {
        return currentColor;
    }
}


