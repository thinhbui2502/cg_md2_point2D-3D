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

    public float[] getXYZ() {
        float[] array = new float[3];
        array[0] = getX();
        array[1] = getY();
        array[2] = z;
        return array;
    }

    public void setXYZ(float x, float y, float z) {
        this.z = z;
        super.setXY(x,y);
    }


    @Override
    public String toString() {
        return "Point3D{"
                + " x="
                + getX()
                + " y="
                + getY()
                + " z="
                + z
                + '}';
    }
}

