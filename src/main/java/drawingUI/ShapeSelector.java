package drawingUI;

import javax.swing.*;

public class ShapeSelector extends JPanel {
    JRadioButton bCir;
    JRadioButton bRect;
    JRadioButton bSquare;
    public ShapeSelector (){
        bCir = new JRadioButton("Circle");
        bRect = new JRadioButton("Rectangle");
        bSquare = new JRadioButton("Square");
        ButtonGroup bg = new ButtonGroup();

        bg.add(bCir);
        bg.add(bRect);
        bg.add(bSquare);

        add(bCir);
        add(bRect);
        add(bSquare);
    }
    public String getShape() {
        if (bCir.isSelected()){
            return "Circle";
        }
        else if (bRect.isSelected()){
            return "Rectangle";
        }
        else if (bSquare.isSelected()){
            return "Square";
        }
        else{
            return "None";
        }
    }
}
