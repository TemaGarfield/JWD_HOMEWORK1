package by.kotik.homework.tasks;

/*
* Вычислить длину окружности и площадь круга одного и того же заданного радиуса R.
* */

public class Task9 {
    public static double circleLength (double radius) {
        double lenght = 2 * Math.PI * radius;

        return lenght;
    }

    public static double circleSquare (double radius) {
        double square = Math.PI * Math.pow(radius, 2);

        return square;
    }
}
