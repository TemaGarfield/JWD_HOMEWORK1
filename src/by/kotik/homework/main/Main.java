package by.kotik.homework.main;

import by.kotik.homework.enter.DoubleEnter;
import by.kotik.homework.enter.IntEnter;
import by.kotik.homework.task.*;
import by.kotik.homework.view.*;


public class Main {
    public static void main(String[] args) {
        MainView.helloMessage();
        int choice = IntEnter.enterInt();
        switch (choice) {
            case 1: {
                HelloMessage.showHelloMessage("Написать программу, позволяющую по последней цифре " +
                        "числа определить последнюю цифру его квадрата.", 1);

                EnterMessage.showEnterMessage("Enter your number: ");
                int number = IntEnter.enterInt();

                ResultMessage.showResultMessage("Result is: " + Task1.findLastNumber(Task1.lastNumberSquare(number)));
                break;
            }

            case 2: {
                HelloMessage.showHelloMessage("Составить программу, которая по заданным году и номеру" +
                        " месяца определяет количество дней в этом месяце и корректно определялись" +
                        " все високосные года.", 2);

                int year;
                do {
                    EnterMessage.showEnterMessage("Enter year: ");
                    year = IntEnter.enterInt();
                } while (year < 0);

                int month;
                do {
                    EnterMessage.showEnterMessage("Enter month: ");
                    month = IntEnter.enterInt();
                } while (month > 12 || month < 1);

                ResultMessage.showResultMessage("There are " +
                        Task2.numberOfDays(year, month) + " days in this month.");
                break;
            }
            case 3: {
                HelloMessage.showHelloMessage("Окружность вписана в квадрат заданной площади." +
                        " Найти площадь квадрата, вписанного в эту окружность." +
                        " Во сколько раз площадь вписанного квадрата меньше площади заданного?", 3);


                double square;
                do {
                    EnterMessage.showEnterMessage("Enter square: ");
                    square = DoubleEnter.enterDouble();
                } while (square < 0);

                ResultMessage.showResultMessage("Result is: " + Task3.findCircleSquare(square));
                break;
            }
            case 4: {
                HelloMessage.showHelloMessage("Составить программу, печатающую значение true, " +
                        "если указанное высказывание является истинным, " +
                        "и false — в противном случае: " +
                        "среди заданных целых чисел А, В, С, D есть хотя бы два четных.", 4);

                EnterMessage.showEnterMessage("Enter A: ");
                double a = DoubleEnter.enterDouble();
                EnterMessage.showEnterMessage("Enter B: ");
                double b = DoubleEnter.enterDouble();
                EnterMessage.showEnterMessage("Enter C: ");
                double c = DoubleEnter.enterDouble();
                EnterMessage.showEnterMessage("Enter D: ");
                double d = DoubleEnter.enterDouble();

                ResultMessage.showResultMessage("Result is: " + Task4.isTwoEven(a, b, c, d));
                break;
            }

            case 5: {
                HelloMessage.showHelloMessage("Составить программу, печатающую значение true, " +
                        "если указанное высказывание является истинным, " +
                        "и false — в противном случае: " +
                        "является ли целое число совершенным (сумма делителей равна самому числу).", 5);

                int number;
                do {
                    EnterMessage.showEnterMessage("Enter number: ");
                    number = IntEnter.enterInt();
                } while (number < 0);

                ResultMessage.showResultMessage("Result is: " + Task5.isPerfect(number));
                break;
            }

            case 6: {
                HelloMessage.showHelloMessage("Идет n-я секунда суток, определить, сколько полных часов," +
                        " полных минут и секунд прошло к этому моменту.", 6);

                int seconds;
                do {
                    EnterMessage.showEnterMessage("Enter seconds: ");
                    seconds = IntEnter.enterInt();
                } while (seconds < 0);

                ResultMessage.showResultMessage("Result is: " + Task6.time(seconds));
                break;
            }

            case 7: {
                HelloMessage.showHelloMessage("Даны две точки А(х1, у1) и В(х2, у2). " +
                        "Составить алгоритм, определяющий, " +
                        "которая из точек находится ближе к началу координат. x y.", 7);

                EnterMessage.showEnterMessage("Enter A:");
                double[] a = new double[2];
                EnterMessage.showEnterMessage("Enter x1: ");
                a[0] = DoubleEnter.enterDouble();
                EnterMessage.showEnterMessage("Enter y1: ");
                a[1] = DoubleEnter.enterDouble();
                EnterMessage.showEnterMessage("Enter B: ");
                double[] b = new double[2];
                EnterMessage.showEnterMessage("Enter x2: ");
                b[0] = DoubleEnter.enterDouble();
                EnterMessage.showEnterMessage("Enter y2: ");
                b[1] = DoubleEnter.enterDouble();

                ResultMessage.showResultMessage("Result is: " + Task7.longestDistance(a, b));
                break;
            }

            case 8: {
                HelloMessage.showHelloMessage("Вычислить значение функции.", 8);

                EnterMessage.showEnterMessage("Enter x: ");
                double x = DoubleEnter.enterDouble();

                ResultMessage.showResultMessage("Result is: " + Task8.result(x));
                break;
            }

            case 9: {
                HelloMessage.showHelloMessage("Вычислить длину окружности и площадь круга одного" +
                        " и того же заданного радиуса R.", 9);

                double radius;
                do {
                    EnterMessage.showEnterMessage("Enter radius: ");
                    radius = DoubleEnter.enterDouble();
                } while (radius < 0);

                ResultMessage.showResultMessage("Circle length: " + Task9.circleLength(radius));
                ResultMessage.showResultMessage("Circle square: " + Task9.circleSquare(radius));
                break;
            }

            case 10: {
                HelloMessage.showHelloMessage("Составить программу для вычисления значений " +
                        "функции F(x) на отрезке [а, b] с шагом h. " +
                        "Результат представить в виде таблицы, первый столбец которой – значения аргумента, " +
                        "второй - соответствующие значения функции.", 10);

                EnterMessage.showEnterMessage("Enter a: ");
                double a = DoubleEnter.enterDouble();
                EnterMessage.showEnterMessage("Enter b: ");
                double b = DoubleEnter.enterDouble();
                EnterMessage.showEnterMessage("Enter h: ");
                double h = DoubleEnter.enterDouble();

                double[][] results = Task10.matrix(a, b, h);

                for (double[] result : results) {
                    for (int j = 0; j < result.length; j++) {
                        System.out.print(result[j] + " ");
                    }
                    System.out.println();
                }
                break;
            }
            default: {
                System.out.println("Error!");
                break;
            }

        }
    }
}
