package ss6.bai_tap.colorable;

public class Square extends Geometry {
    private double edge;

    public Square(String color, boolean filler, double edge) {
        super(color, filler);
        this.edge = edge;
    }

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }

    public double getArea() {
        return Math.pow(this.edge, 2);
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
        return "Square{" +
                "edge=" + edge + getArea() + "." + super.toString() +
                '}';
    }
}
