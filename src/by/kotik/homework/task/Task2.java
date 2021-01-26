package by.kotik.homework.task;

/*
* Составить программу, которая по заданным году и номеру месяца определяет количество дней в этом месяце
* и корректно определялись все високосные года.
* */

public class Task2 {
    private static boolean isLeapYear(int year) {
        return (year % 4 == 0);
    }

    public static int numberOfDays(int year, int month) {
        if (month == 2) {
            if (isLeapYear(year)) {
                return 29;
            }

            return 28;
        }

        if (month % 2 != 0 || month == 8) {
            return 31;
        }

        return 30;
    }

}
