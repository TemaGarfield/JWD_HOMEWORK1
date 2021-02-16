package by.kotik.testHW.task2test;

import by.kotik.testHW.task.Task2;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)
public class Task2NumberOfDaysTest {
    int year;
    int month;
    int excepted;

    @Parameters
    public static Collection<Object[]> days() {
        return Arrays.asList(new Object[][] {
                {2020, 2, 29},
                {2020, 8, 31},
                {2021, 1, 31}
        });
    }

    public Task2NumberOfDaysTest(int year, int month, int excepted) {
        this.year = year;
        this.month = month;
        this.excepted = excepted;
    }

    @Test
    public void numberOfDaysTest001() {
        int actual;

        actual = Task2.numberOfDays(year, month);

        Assert.assertEquals(excepted, actual);
    }
}
