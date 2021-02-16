package by.kotik.homework.task10test;

import by.kotik.homework.task.Task10;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class Task10MatrixTest {
    private double a;
    private double b;
    private double h;
    private double[][] excepted;

    @Parameters
    public static Collection<Object[]> matrixResults() {
        return Arrays.asList(new Object[][]{
                {1, 2, 0.5, new double[][] {
                        {1, 1.55},
                        {1.5, 14.10}
                }},
                {1, 3, 1, new double[][] {
                        {1, 1.55},
                        {2, -2.18}
                }}
        });
    }

    public Task10MatrixTest(double a, double b, double h, double[][] excepted) {
        this.a = a;
        this.b = b;
        this.h = h;
        this.excepted = excepted;
    }

    @Test
    public void matrixTest() {
        double[][] actual;
        actual = Task10.matrix(a, b, h);

        for (int i = 0; i < excepted.length; i++) {
            for (int j = 0; j < excepted[i].length; j++) {
                Assert.assertEquals(excepted[i][j], actual[i][j], 0.01);
            }
        }
    }
}
