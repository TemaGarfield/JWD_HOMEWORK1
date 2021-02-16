package by.kotik.testHW.main;

import by.kotik.testHW.data.TaskDescription;
import by.kotik.testHW.enter.DoubleEnter;
import by.kotik.testHW.enter.IntEnter;
import by.kotik.testHW.task.*;
import by.kotik.testHW.view.*;


public class Main {
    public static void main(String[] args) {
        MainView.helloMessage();

        int choice = IntEnter.enterInt();
        switch (choice) {
            case 1: {
                HelloMessage.showHelloMessage(TaskDescription.Task1.getTaskDescription(), 1);

                EnterMessage.showEnterMessage("Enter your number: ");
                int number = IntEnter.enterInt();

                ResultMessage.showResultMessage("Result is: " + Task1.squareOfLastNumberSquareLastNumber(number));

                break;
            }

            case 2: {
                HelloMessage.showHelloMessage(TaskDescription.Task2.getTaskDescription(), 2);

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
                HelloMessage.showHelloMessage(TaskDescription.Task3.getTaskDescription(), 3);

                double square;
                do {
                    EnterMessage.showEnterMessage("Enter square: ");
                    square = DoubleEnter.enterDouble();
                } while (square < 0);

                ResultMessage.showResultMessage("Rectangle in circle square: "
                        + Task3.findRectangleInCircleSquare(square));
                ResultMessage.showResultMessage("Ratio: " + Task3.findRatio(square));

                break;
            }
            case 4: {
                HelloMessage.showHelloMessage(TaskDescription.Task4.getTaskDescription(), 4);

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
                HelloMessage.showHelloMessage(TaskDescription.Task5.getTaskDescription(), 5);

                int number;
                do {
                    EnterMessage.showEnterMessage("Enter number: ");
                    number = IntEnter.enterInt();
                } while (number < 0);

                ResultMessage.showResultMessage("Result is: " + Task5.isPerfect(number));

                break;
            }

            case 6: {
                HelloMessage.showHelloMessage(TaskDescription.Task6.getTaskDescription(), 6);

                int seconds;
                do {
                    EnterMessage.showEnterMessage("Enter seconds: ");
                    seconds = IntEnter.enterInt();
                } while (seconds < 0);

                ResultMessage.showResultMessage("Result is: " + Task6.time(seconds));

                break;
            }

            case 7: {
                HelloMessage.showHelloMessage(TaskDescription.Task7.getTaskDescription(), 7);

                double[] a = new double[2];
                double[] b = new double[2];

                EnterMessage.showEnterMessage("Enter A:");
                EnterMessage.showEnterMessage("Enter x1: ");
                a[0] = DoubleEnter.enterDouble();
                EnterMessage.showEnterMessage("Enter y1: ");
                a[1] = DoubleEnter.enterDouble();

                EnterMessage.showEnterMessage("Enter B: ");
                EnterMessage.showEnterMessage("Enter x2: ");
                b[0] = DoubleEnter.enterDouble();
                EnterMessage.showEnterMessage("Enter y2: ");
                b[1] = DoubleEnter.enterDouble();

                ResultMessage.showResultMessage("Result is: " + Task7.longestDistance(a, b));

                break;
            }

            case 8: {
                HelloMessage.showHelloMessage(TaskDescription.Task8.getTaskDescription(), 8);

                EnterMessage.showEnterMessage("Enter x: ");
                double x = DoubleEnter.enterDouble();

                ResultMessage.showResultMessage("Result is: " + Task8.result(x));

                break;
            }

            case 9: {
                HelloMessage.showHelloMessage(TaskDescription.Task9.getTaskDescription(), 9);

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
                HelloMessage.showHelloMessage(TaskDescription.Task10.getTaskDescription(), 10);

                EnterMessage.showEnterMessage("Enter a: ");
                double a = DoubleEnter.enterDouble();
                EnterMessage.showEnterMessage("Enter b: ");
                double b = DoubleEnter.enterDouble();
                EnterMessage.showEnterMessage("Enter h: ");
                double h = DoubleEnter.enterDouble();

                double[][] results = Task10.matrix(a, b, h);

                TableView.tableView(results);

                break;
            }
            default: {
                System.out.println("Invalid input!");

                break;
            }

        }
    }
}
