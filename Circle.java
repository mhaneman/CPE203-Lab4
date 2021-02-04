import java.awt.*;

public class Circle implements Shape{
    private double radius;
    private Point center;
    private Color color;

    public Circle(double radius, Point center, Color color) {
        this.radius = radius;
        this.center = center;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public boolean equals(Object o) {
        if (o instanceof Circle && o != null)
            if (this.radius == (((Circle) o)).radius &&
                    this.center.equals(((Circle) o).center) &&
                    this.color.equals(((Circle) o).color))
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
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    public void translate(Point p) {
        this.center.x += p.x;
        this.center.y += p.y;
    }
}
