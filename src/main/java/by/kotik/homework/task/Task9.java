package by.kotik.homework.task;

/*
* Вычислить длину окружности и площадь круга одного и того же заданного радиуса R.
* */

public class Task9 {
    public static double circleLength (double radius) {
        double length = 2 * Math.PI * radius;

        return length;
    }

    public static double circleSquare (double radius) {
        double square = Math.PI * Math.pow(radius, 2);

        return square;
    }
}
