package ru.vsu.cs;

public class Rectangle {
    double xLeftSide;
    double xRightSide;
    double yUpperSide;
    double yDownSide;

    public Rectangle(double xLeftSide, double xRightSide, double yUpperSide, double yDownSide) {
        this.xLeftSide = xLeftSide;
        this.xRightSide = xRightSide;
        this.yUpperSide = yUpperSide;
        this.yDownSide = yDownSide;
    }

    boolean isPointInside(double x, double y) {
        return x >= this.xLeftSide && x <= this.xRightSide && y >= this.yDownSide && y <= this.yUpperSide;
    }
}