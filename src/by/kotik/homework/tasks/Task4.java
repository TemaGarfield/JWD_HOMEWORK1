package by.kotik.homework.tasks;

/*
* Составить программу, печатающую значение true, если указанное высказывание является истинным,
* и false — в противном случае: среди заданных целых чисел А, В, С, D есть хотя бы два четных.
* */

public class Task4 {
    private static int countEven(double a, double b, double c, double d) {
        int counter = 0;
        if (a % 2 == 0) {
            counter++;
        }

        if (b % 2 == 0) {
            counter++;
        }

        if (c % 2 == 0) {
            counter++;
        }

        if (d % 2 == 0) {
            counter++;
        }

        return counter;
    }

    public static boolean isTwoEven(double a, double b, double c, double d) {
        int counter = countEven(a, b, c, d);

        if (counter >= 2) {
            return true;
        }
        return false;
    }
}
