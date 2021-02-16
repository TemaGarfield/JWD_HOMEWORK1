package by.kotik.testHW.task6test;

import by.kotik.testHW.task.Task6;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class Task6TimeTest {
    private int seconds;
    private String excepted;

    @Parameters
    public static Collection<Object[]> timeResults() {
        return Arrays.asList(new Object[][]{
                {90, "0:1:30"},
                {3600, "1:0:0"},
                {7302, "2:1:42"}
        });
    }

    public Task6TimeTest(int seconds, String excepted) {
        this.seconds = seconds;
        this.excepted = excepted;
    }

    @Test
    public void timeTest001() {
        String actual;
        actual = Task6.time(seconds);

        Assert.assertEquals(excepted, actual);
    }

}
