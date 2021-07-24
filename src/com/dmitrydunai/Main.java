package com.dmitrydunai;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PointList pointList = new PointList();
        Circle circle = new Circle();
        System.out.println("Enter point coordinates. ");
        while (true) {
            System.out.print("x:");
            double pointX = scanner.nextInt();
            System.out.print("y:");
            double pointY = scanner.nextInt();
            Point newPoint = new Point(pointX, pointY);
            pointList.add(newPoint);
            System.out.println("Would you like to add more? (1-yes 2- no)");
            System.out.print("Your choice: ");
            int addOneMore = scanner.nextInt();
            if (addOneMore == 2) {
                break;
            }
        }
        System.out.println("Enter the coordinates of the center of the circle:");
        System.out.print("x:");
        double centerX = scanner.nextInt();
        System.out.print("y:");
        double centerY = scanner.nextInt();
        Point center = new Point(centerX, centerY);
        circle.setCenter(center);
        System.out.println("Enter the radius of the circle:");
        System.out.print("r:");
        double radius = scanner.nextInt();
        circle.setRadius(radius);
        for (
                int i = 0; i < pointList.size(); i++) {
            if (circle.circleContainsPoint(pointList.get(i))) {
                System.out.println("Point lying in a circle: ");
                System.out.println(pointList.get(i));
            }else {
                System.out.println("Point does not lie in a circle");
                System.out.println(pointList.get(i));
            }
        }
    }
}