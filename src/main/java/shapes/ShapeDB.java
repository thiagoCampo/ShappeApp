package shapes;

import java.awt.*;
import java.util.ArrayList;
import shapes.Rect;
import shapes.Square;
import shapes.Circle;
import shapes.Shape;

public class ShapeDB implements addShapes {
    protected ArrayList<Shape> shapeList;

    public ShapeDB(){
        shapeList = new ArrayList<Shape>();
    }
    @Override
    public void addShapes(String classType, Point p, Color col, int WorRad, int h){
        switch (classType) {
            case "Circle":
                shapeList.add(new Circle(p, col, WorRad));
                break;
            case "Rectangle":
                shapeList.add(new Rect(p, col, WorRad, h));
                break;
            case "Square":
                shapeList.add(new Square(p, col, WorRad));
                break;
        }
    }

    public ArrayList<Shape> getList (){
        return shapeList;
    }

    }

