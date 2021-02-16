package by.kotik.testHW.task3test;

import by.kotik.testHW.task.Task3;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class Task3FindRatioTest {
    private double rectangleSquare;
    private double excepted;

    @Parameters
    public static Collection<Object[]> ratios() {
        return Arrays.asList(new Object[][]{
                {4, 8},
                {8, 4},
        });
    }

    public Task3FindRatioTest(double rectangleSquare, double excepted) {
        this.rectangleSquare = rectangleSquare;
        this.excepted = excepted;
    }

    @Test
    public void findRatioTest001() {
        double actual;
        actual = Task3.findRatio(rectangleSquare);

        Assert.assertEquals(excepted, actual, 0.0);
    }
}
