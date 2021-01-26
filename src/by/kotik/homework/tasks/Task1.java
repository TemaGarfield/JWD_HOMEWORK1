package by.kotik.homework.tasks;

/*
* Написать программу, позволяющую по последней цифре числа определить последнюю цифру его квадрата.
* */
public class Task1 {
    public static int findLastNumber(int number) {
        return number % 10;
    }
    public static int lastNumberSquare(int number) {
        return findLastNumber(number) * findLastNumber(number);
    }


}
