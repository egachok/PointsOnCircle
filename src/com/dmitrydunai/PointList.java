package com.dmitrydunai;

import java.util.Arrays;

public class PointList {

    private Point[] PointList = new Point[0];

    public void add(Point point) {
        Point[] temp = new Point[PointList.length + 1];
        System.arraycopy(PointList, 0, temp, 0, PointList.length);
        temp[temp.length - 1] = point;
        PointList = temp;
    }

    public int size() {
        return PointList.length;
    }

    public Point get(int index) {
        return PointList[index];
    }

    @Override
    public String toString() {
        return Arrays.toString(PointList);
    }
}