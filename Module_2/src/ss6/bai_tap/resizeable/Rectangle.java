package ss6.bai_tap.resizeable;

public class Rectangle extends Geometry implements IResizeable {
    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return this.height * this.width ;
    }

    @Override
    public void resize(double percent) {
        double newArea = getArea() + getArea() * percent / 100;
        System.out.println("Diện tích hình chữ nhật sau khi sửa đổi:" + newArea);
    }


}
