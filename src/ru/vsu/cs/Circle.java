package ru.vsu.cs;

public class Circle {
    double x0;
    double y0;
    double radius;

    public Circle(double x0, double y0, double radius) {
        this.x0 = x0;
        this.y0 = y0;
        this.radius = radius;
    }

    public boolean isPointInside(double x, double y) {
        return Math.pow(radius, 2) >= Math.pow((x - x0), 2) + Math.pow((y - y0), 2);
    }
}
