package drawingUI;
import shapes.Drawing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;



public class DrawingUIController extends JPanel{
    //Field declaration
    protected JPanel mainPanel;
    protected JPanel controlsPanel;
    protected JPanel subPanel;
    protected JPanel shapeCount;
    protected Drawing drawPanel;
    protected ColourSelector cSel;
    protected CircleDimensions cDim;

    protected int cirCount;
    protected int rectCount;
    protected int squareCount;

    public DrawingUIController () {
        //Fields initialization
        mainPanel = new JPanel();
        controlsPanel = new JPanel();
        subPanel = new JPanel();
        shapeCount = new JPanel();

        drawPanel = new Drawing();
        cSel = new ColourSelector();
        cDim = new CircleDimensions();

        cirCount = 0;
        rectCount = 0;
        squareCount = 0;

        JLabel cir = new JLabel("Circles: " + cirCount);
        JLabel rect = new JLabel("Rectangles: " + rectCount);
        JLabel sq = new JLabel("Squares: " + squareCount);


        ShapeSelector sSel = new ShapeSelector();

        //Layout declaration
        mainPanel.setLayout(new GridLayout(2, 1));
        controlsPanel.setLayout(new GridLayout(6, 2));
        subPanel.setLayout(new GridLayout(1, 2));
        shapeCount.setLayout(new GridLayout(3, 1));

        controlsPanel.add(cDim);
        subPanel.add(sSel);
        subPanel.add(cSel);

        shapeCount.add(cir);
        shapeCount.add(rect);
        shapeCount.add(sq);

        controlsPanel.add(new JLabel(" "));
        controlsPanel.add(subPanel);
        controlsPanel.add(new JLabel(" "));
        controlsPanel.add(shapeCount);
        mainPanel.add(controlsPanel);
        mainPanel.add(drawPanel);

        drawPanel.addMouseListener(new MouseListener() {
            Point p1 = new Point();
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {
                p1 = e.getPoint();
                //System.out.println(p1);
                drawPanel.addShapes(sSel.getShape(), p1, cSel.getColor(), cDim.getRadius(), 100);
                drawPanel.repaint();
                if (sSel.getShape().equals("Circle")){
                    cirCount = cirCount + 1;
                    cir.setText("Circles: " + cirCount);
                }
                else if (sSel.getShape().equals("Rectangle")) {
                    rectCount = rectCount + 1;
                    rect.setText("Rectangles: " + rectCount);
                }
                else if (sSel.getShape().equals("Square")) {
                    squareCount = squareCount + 1;
                    sq.setText("Squares: " + squareCount);
                }



            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });


    }

    public JPanel getMainPanel(){
        return mainPanel;
    }

}