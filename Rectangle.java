import java.awt.*;

public class Rectangle implements Shape{

    private double width;
    private double height;
    private Point topLeft;
    private Color color;

    Rectangle(double width, double height, Point topLeft, Color color) {
        this.width = width;
        this. height = height;
        this.topLeft = topLeft;
        this.color = color;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Point getTopLeft() {
        return topLeft;
    }

    public boolean equals(Object o) {
        if (this.getClass() == o.getClass())
            return true;
        return false;

    }

    @Override
    public Color getColor() {
        return this.color;
    }

    @Override
    public void setColor(Color c) {
        this.color = c;

    }

    @Override
    public double getArea() {
        return this.width * this.height;
    }

    @Override
    public double getPerimeter() {
        return 2*width + 2*height;
    }

    @Override
    public void translate(Point p) {
        this.topLeft.x += p.x;
        this.topLeft.y += p.y;

    }
}
