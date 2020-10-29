package ru.vsu.cs;

public class Picture {

    private final Circle circle1;
    private final Circle circle2;
    private final Circle circle3;
    private final Rectangle rectangle1;
    private final Rectangle rectangle2;

    public Picture(Circle circle1, Circle circle2, Circle circle3, Rectangle rectangle1, Rectangle rectangle2) {
        this.circle1 = circle1;
        this.circle2 = circle2;
        this.circle3 = circle3;
        this.rectangle1 = rectangle1;
        this.rectangle2 = rectangle2;
    }

    public SimpleColor getColor(Point point) {
        double x = point.x;
        double y = point.y;

        if (circle1.isPointInside(x, y) && !circle2.isPointInside(x, y) && x > -2 && y > -2) {
            return SimpleColor.GREY;
        }
        if (circle1.isPointInside(x, y) && !circle2.isPointInside(x, y) && x > -4 && x < -2) {
            return SimpleColor.GREY;
        }
        if (circle3.isPointInside(x, y) && rectangle2.isPointInside(x, y) && !rectangle1.isPointInside(x, y)) {
            return SimpleColor.GREY;
        }
        if (!rectangle1.isPointInside(x, y) && rectangle2.isPointInside(x, y) && !circle3.isPointInside(x, y)) {
            return SimpleColor.GREEN;
        }
        if (rectangle1.isPointInside(x, y) && !circle1.isPointInside(x, y) && x <= -2 && y > 0) {
            return SimpleColor.WHITE;
        }
        if (circle3.isPointInside(x, y) && !rectangle2.isPointInside(x, y) && !rectangle1.isPointInside(x, y)) {
            return SimpleColor.WHITE;
        }
        if (circle2.isPointInside(x, y) && rectangle1.isPointInside(x, y)) {
            return SimpleColor.BLUE;
        }
        if (circle2.isPointInside(x, y) && !rectangle1.isPointInside(x, y)) {
            return SimpleColor.YELLOW;
        }
        if (circle1.isPointInside(x, y) && !circle2.isPointInside(x, y) && !rectangle1.isPointInside(x, y)) {
            return SimpleColor.BLUE;
        }
        if (circle1.isPointInside(x, y) && !circle2.isPointInside(x, y) && !rectangle1.isPointInside(x, y) && y > 0) {
            return SimpleColor.BLUE;
        }
        if (rectangle1.isPointInside(x, y)) {
            return SimpleColor.ORANGE;
        }
        return SimpleColor.YELLOW;
    }
}

