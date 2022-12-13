package ss6.bai_tap.colorable;

public class Test {
    public static void main(String[] args) {
        Geometry[] geometrys = new Geometry[2];
        Geometry geometry1 = new Square("white", true, 5);
        Geometry geometry2 = new Circle("blue", false, 4);
        geometrys[0] = geometry1;
        geometrys[1] = geometry2;
        for (Geometry geometry : geometrys) {
            if (geometry instanceof Square) {
                Square square = (Square) geometry;
                square.howToColor();
            }
        }
    }
}
