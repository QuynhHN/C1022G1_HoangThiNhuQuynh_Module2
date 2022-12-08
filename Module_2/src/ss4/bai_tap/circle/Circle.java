package ss4.bai_tap.circle;

public class Circle {
    private double radius = 1.0;
    private String color = "red";
    public static final double PI = Math.PI;

    public Circle() {
    }

    public Circle(double r) {
        this.radius = r;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        return Math.pow(this.radius, 2) * PI;
    }
}


