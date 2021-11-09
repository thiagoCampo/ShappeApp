package shapes;

import java.awt.*;

public class Rect extends Shape{
    protected int h;
    protected int w;
    public Rect (Point initPos, Color col, int w, int h) {
        super(initPos, col);
        this.h = h;
        this.w = w;
    }
    public Rect (int initX, int initY, Color col, int w, int h){
        super (initX, initY, col);
        this.h = h;
        this.w = w;
    }
    @Override
    public void draw (Graphics g){
        g.setColor(col);
        //g.fillRect(pos.x, pos.y, w, h);
        g.fillRect(pos.x, pos.y, w, h);
        }
    }
