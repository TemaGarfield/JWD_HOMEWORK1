package by.kotik.testHW.task7test;

import by.kotik.testHW.task.Task7;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class Task7LongestDistanceTest {
    private double[] a;
    private double[] b;
    private String excepted;

    @Parameters
    public static Collection<Object[]> LongestDistanceResults() {
        return Arrays.asList(new Object[][]{
                {new double[]{1, 2}, new double[]{2, 3}, "B"},
                {new double[]{2, 3}, new double[]{1, 2}, "A"},
                {new double[] {0, 0}, new double[]{0, 0}, ""}
        });
    }

    public Task7LongestDistanceTest(double[] a, double[] b, String excepted) {
        this.a = a;
        this.b = b;
        this.excepted = excepted;
    }

    @Test
    public void longestDistanceTest001() {
        String actual;
        actual = Task7.longestDistance(a, b);

        Assert.assertEquals(excepted, actual);
    }

}
