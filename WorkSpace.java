import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class WorkSpace {
     private List<Shape> shapes = new ArrayList<>();

    public void add(Shape shape) {
        shapes.add(shape);
    }

    public Shape get(int index) {
        return shapes.get(index);
    }

    public int size() {
        return shapes.size();

    }

    public List getCircles() {
        List<Shape> circles = new ArrayList<>();
        for (Shape shape: shapes) {
            if (shape instanceof Circle)
                circles.add(shape);
        }
        return circles;
    }

    public List getRectangles() {
        List<Shape> rects = new ArrayList<>();
        for (Shape shape: shapes) {
            if (shape instanceof Rectangle)
                rects.add(shape);
        }
        return rects;
    }

    public List getTriangles() {
        List<Shape> triangles = new ArrayList<>();
        for (Shape shape: shapes) {
            if (shape instanceof Triangle)
                triangles.add(shape);
        }
        return triangles;
    }

    public List getShapesByColor(Color color) {
        List<Shape> colored = new ArrayList<>();
        for (Shape shape: shapes) {
            if (shape instanceof Circle)
                colored.add(shape);
        }
        return colored;
    }

    public double getAreaOfAllShapes() {
        double result = 0.0;
        for (Shape shape: shapes) {
            result += shape.getArea();
        }
        return result;
    }

    public double getPerimeterOfAllShapes() {
        double result = 0.0;
        for (Shape shape: shapes) {
            result += shape.getPerimeter();
        }
        return result;
    }
}
