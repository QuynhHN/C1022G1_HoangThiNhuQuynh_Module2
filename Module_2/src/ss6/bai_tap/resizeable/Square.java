package ss6.bai_tap.resizeable;

public class Square extends Geometry implements IResizeable {
    private double edge;

    public Square(double edge) {
        this.edge = edge;
    }

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }

    @Override
    public double getArea() {
        return Math.pow(this.edge, 2);
    }

    @Override
    public void resize(double percent) {
        double newArea = getArea() + getArea() * percent / 100;
        System.out.println("Diện tích hình vuông sau khi sửa đổi:" + newArea);
    }

}
