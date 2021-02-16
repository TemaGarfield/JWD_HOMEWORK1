package by.kotik.testHW.task8test;

import by.kotik.testHW.task.Task8;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class Task8FunctionTest {
    private double x;
    private double excepted;

    @Parameters
    public static Collection<Object[]> functionResults() {
        return Arrays.asList(new Object[][] {
                {2, 0.5},
                {3, 9},
                {5, -1}
        });
    }

    public Task8FunctionTest(double x, double excepted) {
        this.x = x;
        this.excepted = excepted;
    }

    @Test
    public void functionTest001() {
        double actual;
        actual = Task8.result(x);

        Assert.assertEquals(excepted, actual, 0.0);
    }
}
