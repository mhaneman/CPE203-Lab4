import java.awt.*;

public class Triangle implements Shape {

    private Point a;
    private Point b;
    private Point c;
    private Color color;

    Triangle(Point a, Point b, Point c, Color color) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.color = color;
    }

    public Point getVertexA() {
        return a;
    }

    public Point getVertexB() {
        return b;
    }

    public Point getVertexC() {
        return c;
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
        double a = Math.pow(Math.pow(this.a.x - this.b.x, 2) + Math.pow(this.a.y - this.b.y, 2), 0.5);
        double b = Math.pow(Math.pow(this.b.x - this.c.x, 2) + Math.pow(this.b.y - this.c.y, 2), 0.5);
        double c = Math.pow(Math.pow(this.c.x - this.a.x, 2) + Math.pow(this.c.y - this.a.y, 2), 0.5);
        double p = (a + b + c) / 2;
        return Math.pow(p * (p - a)* (p - b) * (p - c), 0.5);
    }

    @Override
    public double getPerimeter() {
        return Math.pow(Math.pow(this.a.x - this.b.x, 2) + Math.pow(this.a.y - this.b.y, 2), 0.5) +
                Math.pow(Math.pow(this.b.x - this.c.x, 2) + Math.pow(this.b.y - this.c.y, 2), 0.5) +
                Math.pow(Math.pow(this.c.x - this.a.x, 2) + Math.pow(this.c.y - this.a.y, 2), 0.5);
    }

    @Override
    public void translate(Point p) {
        this.a.x += p.x;
        this.a.y += p.y;

        this.b.x += p.x;
        this.b.y += p.y;

        this.c.x += p.x;
        this.c.y += p.y;
    }
}
