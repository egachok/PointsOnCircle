package com.dmitrydunai;

public class Point {
    public  static final Point ORIGIN = new Point(0,0);
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    double distanceTo(Point p) {
        double dx = p.x - x;
        double dy = p.y - y;
        return Math.sqrt(dx*dx + dy*dy);
    }

    double distanceToOrigin() {
        return distanceTo(ORIGIN);
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
