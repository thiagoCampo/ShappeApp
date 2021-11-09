package shapes;

import shapes.Rect;
import shapes.Square;
import shapes.Circle;
import shapes.Shape;
import shapes.ShapeDB;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;


public class Drawing extends Canvas implements addShapes {
    private Frame f;
    private ShapeDB dataB;

    //Point p = new Point(200, 200);
    //Point p2 = new Point (50, 50);
    //Point p3 = new Point (80, 80);

    Color c = new Color(0x992266);
    Color c2 = new Color(0xf89820);
    Color c3 = new Color(0xed008c);

    Circle cir = new Circle(200, 200, c, 50);
    Rect rec = new Rect(50, 50, c2, 30, 60);
    Square sq = new Square(80, 80, c3, 30);

    public Drawing() {
        dataB = new ShapeDB();
        //setupFrame();
        setupCanvas();

    }

    private void setupCanvas() {
        setBackground(Color.WHITE);
        setSize(400, 400);
    }

    private void setupFrame() {
        f = new Frame("My window");
        f.add(this);
        f.setLayout(null);
        f.setSize(400, 400);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() { // Closes the program if close window clicked
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });
    }

    public void paint(Graphics g) {
        //dataB.addShapes("Circle", 140, 150, c2, 70, 0);
        //dataB.addShapes("Square", 40, 50, c, 80, 0);
        //dataB.addShapes("Rectangle", 200, 100, c3, 100, 30);
        //cir.draw(g);
        //rec.draw(g);
        //sq.draw(g);
        //cir2.draw(g);

        for (Shape shape : dataB.shapeList) {
            shape.draw(g);
        }

    }

    @Override
    public void addShapes(String classType, Point p, Color col, int WorRad, int h) {

        switch (classType) {
            case "Circle":
                dataB.getList().add(new Circle(p, col, WorRad));
                break;
            case "Rectangle":
                dataB.getList().add(new Rect(p, col, WorRad, h));
                break;
            case "Square":
                dataB.getList().add(new Square(p, col, WorRad));
                break;

        }
    }
}
