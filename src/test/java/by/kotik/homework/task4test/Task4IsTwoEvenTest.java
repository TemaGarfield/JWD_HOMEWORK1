package by.kotik.homework.task4test;

import by.kotik.homework.task.Task4;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)
public class Task4IsTwoEvenTest {
    private double a;
    private double b;
    private double c;
    private double d;
    private boolean excepted;

    @Parameters
    public static Collection<Object[]> results() {
        return Arrays.asList(new Object[][]{
                {1, 2, 3, 4, true},
                {1, 1, 1, 1, false}
        });
    }

    public Task4IsTwoEvenTest(double a, double b, double c, double d, boolean excepted) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.excepted = excepted;
    }

    @Test
    public void isTwoEvenTest004() {
        boolean actual;

        actual = Task4.isTwoEven(a, b, c, d);

        Assert.assertEquals(excepted, actual);
    }
}
