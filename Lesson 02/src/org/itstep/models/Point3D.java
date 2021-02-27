package org.itstep.models;

public class Point3D<T> extends Point2D<T> {
    private T z;
    public Point3D(T x, T y, T z) {
        super(x, y);
        this.z = z;
    }
}
