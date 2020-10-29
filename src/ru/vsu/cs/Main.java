package ru.vsu.cs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Picture picture = new Picture(
                new Circle(-4, 0, 3),
                new Circle(-4, 0, 2),
                new Circle(1, 5, 2),
                new Rectangle(-4, 6, 5, -5),
                new Rectangle(-2, 0, 8, -2)
        );

        System.out.println("Color finding test: ");
        doCompleteProgram(testPoints(picture), picture);
    }

    private static boolean testPoints(Picture picture) {
        TestCase[] testCases = {new TestCase(0, 0, SimpleColor.ORANGE),
                new TestCase(-1.5, 0, SimpleColor.GREY),
                new TestCase(-3, 0, SimpleColor.BLUE),
                new TestCase(-4, 2, SimpleColor.BLUE),
                new TestCase(-3, 4, SimpleColor.WHITE),
                new TestCase(-5, 0, SimpleColor.YELLOW),
                new TestCase(0, 6, SimpleColor.GREY),
                new TestCase(1, 6, SimpleColor.WHITE),
                new TestCase(-1, 7, SimpleColor.GREEN),
                new TestCase(7, 0, SimpleColor.YELLOW)};

        boolean testResult = true;
        for (int i = 0; i < testCases.length; i++) {
            TestCase testCase = testCases[i];
            Point point = new Point(testCase.getX(), testCase.getY());
            SimpleColor color = picture.getColor(point);
            SimpleColor correctColor = testCase.getCorrectColor();

            if (checkResult(color, correctColor)) {
                printTest(color, correctColor, point, "TRUE");
            } else {
                printTest(color, correctColor, point, "FALSE");
                testResult = false;
            }
        }
        return testResult;
    }

    private static boolean checkResult(SimpleColor color, SimpleColor correctColor) {
        return color == correctColor;
    }

    private static double readDouble(String name) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter coordinate %s ", name);
        return scanner.nextDouble();
    }

    private static void doCompleteProgram(boolean testResult, Picture picture) {
        if (!testResult) {
            System.out.println("The program is not working correctly!");
        } else {
            double x = readDouble("x = ");
            double y = readDouble("y = ");

            Point point = new Point(x, y);
            SimpleColor color = picture.getColor(point);

            printColorForPoint(point, color);
        }
    }

    private static void printColorForPoint(Point point, SimpleColor color) {
        System.out.print("(" + point.x + ";" + point.y + ") —> " + color);
    }

    private static void printTest(SimpleColor color, SimpleColor correctColor, Point point, String testResult) {
        System.out.println("(" + point.x + ";" + point.y + ") --> " + color +
                ". Right color --> " + correctColor + ". " + testResult);
    }
}



