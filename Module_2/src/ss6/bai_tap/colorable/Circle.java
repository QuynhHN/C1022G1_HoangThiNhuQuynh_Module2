package ss6.bai_tap.colorable;

public class Circle extends Geometry {
    private double radius;

    public Circle(String color, boolean filler, double radius) {
        super(color, filler);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.pow(this.radius, 2) * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius + getArea() +
                '}';
    }
}
