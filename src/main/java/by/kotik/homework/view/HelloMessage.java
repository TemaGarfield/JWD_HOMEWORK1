package by.kotik.homework.view;

public class HelloMessage {
    public static void showHelloMessage(String taskDescription, int taskNumber) {
        System.out.println("You choose Task" + taskNumber + ".");
        System.out.println("Task" + taskNumber + " is: ");
        System.out.println(taskDescription);
    }
}
