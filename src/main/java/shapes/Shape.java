package shapes;

import java.awt.*;

public abstract class Shape implements shapes.DrawShapes {
    protected Point pos;
    protected Color col;
    protected int x;
    protected int y;

    public Shape(Point initPos, Color col) {
        pos = initPos;
        this.col = col;
    }
    public Shape (int initX, int initY, Color col){
        x = initX;
        y = initY;
        this.col = col;
    }

    public abstract void draw(Graphics g);
}
