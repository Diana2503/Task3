package ru.vsu.cs;

public class TestCase {
    double x;
    double y;
    SimpleColor correctColor;

    public TestCase(double x, double y, SimpleColor correctColor) {
        this.x = x;
        this.y = y;
        this.correctColor = correctColor;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public SimpleColor getCorrectColor() {
        return correctColor;
    }
}

