package shapes;

import java.awt.*;

/**
 * The Circle class encapsulates the information describing a circle and can draw it in
 * an AWT Graphics object using AWT library methods
 * */
public class Circle extends Shape{
    private int rad;

    public Circle (Point initPos, Color col, int radius){
        super(initPos, col);
        rad = radius;
    }
    public Circle (int initX, int initY, Color col, int radius){
        super (initX, initY, col);
        rad = radius;
    }
    @Override
    public void draw(Graphics g) {
        g.setColor(col);
        g.fillOval(pos.x, pos.y, rad, rad);
        //g.fillOval(pos.x,pos.y,rad, rad);
    }

}

