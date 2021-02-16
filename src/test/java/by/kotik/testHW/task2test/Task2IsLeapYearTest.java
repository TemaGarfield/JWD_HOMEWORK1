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
public class Task2IsLeapYearTest {
    int year;
    boolean excepted;

    @Parameters
    public static Collection<Object[]> years() {
        return Arrays.asList(new Object[][]{
                {2020, true},
                {2021, false},
                {2016, true}
        });
    }

    public Task2IsLeapYearTest(int year, boolean excepted) {
        this.year = year;
        this.excepted = excepted;
    }

    @Test
    public void isLeapTest001() {
        boolean actual;

        actual = Task2.isLeapYear(year);

        Assert.assertEquals(excepted, actual);
    }

}
