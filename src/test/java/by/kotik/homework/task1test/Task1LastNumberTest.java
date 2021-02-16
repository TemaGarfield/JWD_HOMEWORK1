package by.kotik.homework.task1test;

import by.kotik.homework.task.Task1;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)
public class Task1LastNumberTest {
    private int number;
    private int excepted;

    @Parameters
    public static Collection<Object[]> resultsLastNumber() {
        return Arrays.asList(new Object[][] {
                {10, 0},
                {13, 3},
                {6777, 7}
        });
    }

    public Task1LastNumberTest(int number, int excepted) {
        this.number = number;
        this.excepted = excepted;
    }

    @Test
    public void lastNumber001() {
        int actual;

        actual = Task1.findLastNumber(number);
        Assert.assertEquals(excepted, actual);
    }
}
