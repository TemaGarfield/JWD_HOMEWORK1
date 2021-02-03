package by.kotik.homework.task;

/*
* Окружность вписана в квадрат заданной площади. Найти площадь квадрата, вписанного в эту окружность.
* Во сколько раз площадь вписанного квадрата меньше площади заданного?
* */

public class Task3 {
    private static double findRadius (double rectangleSquare) {
        return rectangleSquare / 4;
    }

    public static double findRectangleInCircleSquare(double rectangleSquare) {
        double circleSquare = 2 * (Math.pow(findRadius(rectangleSquare), 2));

        return circleSquare;
    }

    public static double findRatio(double rectangleSquare) {
        return rectangleSquare / findRectangleInCircleSquare(rectangleSquare);
    }
}
