package by.kotik.homework.task9test;

import by.kotik.homework.task.Task9;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class Task9CircleSquareTest {
    private double radius;
    private double excepted;

    @Parameters
    public static Collection<Object[]> squareResults() {
        return Arrays.asList(new Object[][] {
                {0, 0},
                {1, 3.14},
                {2, 12.56},
        });
    }

    public Task9CircleSquareTest(double radius, double excepted) {
        this.radius = radius;
        this.excepted = excepted;
    }

    @Test
    public void circleSquareTest001() {
        double actual = Task9.circleSquare(radius);

        Assert.assertEquals(excepted, actual, 0.01);
    }
}
