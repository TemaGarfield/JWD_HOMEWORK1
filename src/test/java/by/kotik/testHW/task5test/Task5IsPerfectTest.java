package by.kotik.testHW.task5test;

import by.kotik.testHW.task.Task5;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class Task5IsPerfectTest {
    private int number;
    private boolean excepted;

    @Parameters
    public static Collection<Object[]> isPerfectResults() {
        return Arrays.asList(new Object[][]{
                {496, true},
                {20, false},
                {28, true},
                {13, false}
        });
    }

    public Task5IsPerfectTest(int number, boolean excepted) {
        this.number = number;
        this.excepted = excepted;
    }

    @Test
    public void isPerfectTest001() {
        boolean actual;
        actual = Task5.isPerfect(number);

        Assert.assertEquals(excepted, actual);
    }
}
