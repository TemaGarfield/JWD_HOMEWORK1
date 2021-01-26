package by.kotik.homework.tasks;
/*
* Вычислить значение функции
* */
public class Task8 {
    private static double firstFunction (double x) {
        double function = -Math.pow(x, 2) + 3 * x + 9;

        return function;
    }

    private static double secondFunction (double x) {
        double function = 1 / (Math.pow(x, 3) - 6);

        return function;
    }

    public static double result(double x) {
        double result;

        if (x >= 3) {
            result = firstFunction(x);
            return result;
        }

        result = secondFunction(x);
        return result;
    }
}
