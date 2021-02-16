package by.kotik.testHW.enter;

import java.util.Scanner;

public class IntEnter {
    public static int enterInt() {
        Scanner in = new Scanner(System.in);
        int data;
        String tmp;

        while (!in.hasNextInt()) {
            in.nextLine();
            System.out.println("Invalid data!");
            System.out.print(">> ");
        }

        data = in.nextInt();
        return data;
    }

}
