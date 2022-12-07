package ss3;

public class Fan {
    final int slow = 1;
    final int medium = 2;
    final int fast = 3;

    private int speed = slow;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public int getSpeed(int fast) {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn(boolean on) {
        return this.on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if (this.on) {
            return "Fan{" +
                    "speed=" + speed +
                    ", radius=" + radius +
                    ", color='" + color + '\'' + "fan is on" +
                    '}';

        } else {
            return "Fan{" +
                    "radius=" + radius +
                    ", color='" + color + '\'' + "fan is off" +
                    '}';
        }
    }

}
