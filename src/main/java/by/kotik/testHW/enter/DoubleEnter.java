package by.kotik.testHW.enter;

import java.util.Scanner;

public class DoubleEnter {
    public static double enterDouble() {
        Scanner in = new Scanner(System.in);

        double data;

        while (!in.hasNextDouble()) {
            in.nextLine();
            System.out.println("Invalid data!");
            System.out.print(">> ");
        }

        data = in.nextDouble();
        return data;
    }
}
