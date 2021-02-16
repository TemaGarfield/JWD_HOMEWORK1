package by.kotik.testHW.task3test;

import by.kotik.testHW.task.Task3;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)
public class Task3FindRectangleInCircleSquareTest {
    private double rectangleSquare;
    private double excepted;

    @Parameters
    public static Collection<Object[]> squares() {
        return Arrays.asList(new Object[][]{
                {4, 0.5},
                {8, 2},
                {12, 4.5}
        });
    }

    public Task3FindRectangleInCircleSquareTest(double rectangleSquare, double excepted) {
        this.rectangleSquare = rectangleSquare;
        this.excepted = excepted;
    }

    @Test
    public void rectangleSquareTest001() {
        double actual;

        actual = Task3.findRectangleInCircleSquare(rectangleSquare);

        Assert.assertEquals(excepted, actual, 0.0);
    }

}
