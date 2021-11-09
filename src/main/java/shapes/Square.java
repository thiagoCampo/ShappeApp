package shapes;

import shapes.Rect;

import java.awt.*;

public class Square extends Rect{
    public Square (Point initPos, Color col, int w){
        super (initPos, col, w, w);
    }
    public Square (int initX, int initY, Color col, int w) {super (initX, initY, col, w, w);}
    @Override
    public void draw (Graphics g){
        g.setColor(col);
        //g.fillRect(pos.x, pos.y, w, w);
        g.fillRect(pos.x, pos.y, w, w);
    }

}
