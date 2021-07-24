package com.dmitrydunai;

public class Circle {

    private double distanceToCenter;
    private double radius;
    private Point center;

    public void setCenter(Point center) {
        this.center = center;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getDistanceToCenter(Point point) {
        distanceToCenter = Math.sqrt(Math.pow((point.getX()) - center.getX(), 2) + Math.pow((point.getY()) - center.getY(), 2));
        return distanceToCenter;
    }

    public boolean circleContainsPoint(Point point) {
        distanceToCenter = Math.sqrt(Math.pow((point.getX()) - center.getX(), 2) + Math.pow((point.getY()) - center.getY(), 2));
        return distanceToCenter < radius;
    }
}