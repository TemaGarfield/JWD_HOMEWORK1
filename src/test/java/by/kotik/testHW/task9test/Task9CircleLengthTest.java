package by.kotik.testHW.task9test;

import by.kotik.testHW.task.Task9;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class Task9CircleLengthTest {
    private double radius;
    private double excepted;

    @Parameters
    public static Collection<Object[]> circleLengthResults() {
        return Arrays.asList(new Object[][]{
                {0, 0},
                {5, 31.4},
                {1, 6.3}
        });
    }

    public Task9CircleLengthTest(double radius, double excepted) {
        this.radius = radius;
        this.excepted = excepted;
    }

    @Test
    public void circleLengthTest001() {
        double actual;
        actual = Task9.circleLength(radius);

        Assert.assertEquals(excepted, actual, 0.1);
    }

}
