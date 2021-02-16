package by.kotik.homework.task;

/*
* Даны две точки А(х1, у1) и В(х2, у2).
* Составить алгоритм, определяющий, которая из точек находится ближе к началу координат. x y.
* */

public class Task7 {
    private static double distance(double[] point) {
        double distance = Math.sqrt(Math.pow(point[0], 2) + Math.pow(point[1], 2));

        return distance;
    }

    public static String longestDistance(double[] a, double[] b) {
        if (distance(a) > distance(b)) {
            return "A";
        }

        if (distance(a) < distance(b)) {
            return "B";
        }

        return "";
    }
}
