package by.kotik.testHW.task1test;

import by.kotik.testHW.task.Task1;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)
public class Task1LastNumberSquareTest {
    private int number;
    private int excepted;

    @Parameterized.Parameters
    public static Collection<Object[]> resultsLastNumberSquare() {
        return Arrays.asList(new Object[][] {
                {10, 0},
                {13, 9},
                {6777, 49}
        });
    }

    public Task1LastNumberSquareTest (int number, int excepted) {
        this.number = number;
        this.excepted = excepted;
    }

    @Test
    public void lastNumberSquare001() {
        int actual;

        actual = Task1.lastNumberSquare(number);
        Assert.assertEquals(excepted, actual);
    }
}
