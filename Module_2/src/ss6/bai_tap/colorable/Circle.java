package ss6.bai_tap.colorable;

public class Circle extends Geometry implements IColorable {
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
    public void howToColor() {
        if (isFiller()) {
            System.out.println("Color all four sides");
        } else {
            System.out.println("No color");
        }
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius + getArea() +
                '}';
    }
}
