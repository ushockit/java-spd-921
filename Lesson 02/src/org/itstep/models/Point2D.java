package org.itstep.models;

public class Point2D<T extends Object> {
    private T x;
    private T y;

    public Point2D(T x, T y) {
        this.x = x;
        this.y = y;
    }
}
