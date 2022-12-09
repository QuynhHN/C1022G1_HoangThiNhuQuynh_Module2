package ss5.bai_tap.point2D_point3D;

import java.util.Arrays;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        super.setXY(x, y);
        this.z = z;
    }

    public float[] getXYZ() {
        float arr[] = {super.getX(), super.getY(), this.z};
        return arr;
    }

    @Override
    public String toString() {
        return "Point3D{" + "x=" + getX() + "y=" + getY() +
                "z=" + z + ", x,y,z=" + Arrays.toString(getXYZ()) +
                '}';
    }
}
