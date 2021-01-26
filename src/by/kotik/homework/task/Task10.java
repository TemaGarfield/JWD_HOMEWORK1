package by.kotik.homework.task;

/*
* Составить программу для вычисления значений функции F(x) на отрезке [а, b] с шагом h.
* Результат представить в виде таблицы,
* первый столбец которой – значения аргумента, второй - соответствующие значения функции.
* */

public class Task10 {

    private static int calculateSize(double a, double b, double h) {
        int size = 0;

        if (a > b) {
            double tmp = a;
            a = b;
            b = tmp;
        }

        for (double i = a; i < b; i+= h) {
            size++;
        }

        return size;
    }

    public static double[][] matrix (double a, double b, double h) {
        double[][] results = new double[calculateSize(a, b, h)][2];

        if (a > b) {
            double tmp = a;
            a = b;
            b = tmp;
        }

        int j = 0;
        for (double i = a; i < b; i+=h) {
            results[j][0] = i;
            results[j][1] = Math.tan(i);
            j++;
        }

        return results;
    }
}
