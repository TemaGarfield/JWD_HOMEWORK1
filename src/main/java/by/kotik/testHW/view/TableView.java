package by.kotik.testHW.view;

public class TableView {
    public static void tableView(double[][] matrix) {
        for (double[] value:matrix) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(value[j] + "\t");
            }
            System.out.println();
        }
    }
}
