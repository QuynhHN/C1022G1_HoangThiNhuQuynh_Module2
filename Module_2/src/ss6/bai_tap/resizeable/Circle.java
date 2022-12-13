package ss6.bai_tap.resizeable;

public class Circle extends Geometry implements IResizeable {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.pow(this.radius, 2) * Math.PI;
    }

    @Override
    public void resize(double percent) {
        double newArea = getArea() + getArea() * percent / 100;
        System.out.println("Diện tích hình tròn sau khi sửa đổi:" + newArea);
    }
}

