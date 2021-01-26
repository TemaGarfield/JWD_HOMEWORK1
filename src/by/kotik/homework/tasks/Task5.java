package by.kotik.homework.tasks;

/*
* ⦁	Составить программу, печатающую значение true, если указанное высказывание является истинным,
* и false — в противном случае: является ли целое число совершенным (сумма делителей равна самому числу).
* */

public class Task5 {
    private static int sumOfDivisors(int number) {
        int sum = 0;
        for (int i = number / 2; i >= 1; i--) {
            if (number % i == 0) {
                sum += i;
            }
        }

        return sum;
    }

    public static boolean isPerfect (int number) {
        int sum = sumOfDivisors(number);

        if (sum == number) {
            return true;
        }

        return false;
    }
}
