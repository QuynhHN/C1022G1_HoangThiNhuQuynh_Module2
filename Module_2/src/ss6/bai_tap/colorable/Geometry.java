package ss6.bai_tap.colorable;

public abstract class Geometry implements IColorable {
    private String color = "white";
    private boolean filler = true;

    public Geometry(String color, boolean filler) {
        this.color = color;
        this.filler = filler;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFiller() {
        return this.filler;
    }

    public void setFiller(boolean filler) {
        this.filler = filler;
    }

    public abstract double getArea();

    @Override
    public void howToColor() {

    }

    @Override
    public String toString() {
        return "Geometry{" +
                "color='" + color + '\'' +
                ", filler=" + filler + getArea() +
                '}';
    }

}
