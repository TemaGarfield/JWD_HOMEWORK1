package by.kotik.homework.task;

/*
* Идет n-я секунда суток, определить, сколько полных часов, полных минут и секунд прошло к этому моменту.
* */

public class Task6 {
    private static int findHours(int seconds) {
        int hours = seconds / 3600;

        return hours;
    }

    private static int findMinutes(int seconds) {
        int minutes = (seconds / 60) - (findHours(seconds) * 60);

        return minutes;
    }

    private static int findSeconds (int seconds) {
        int secs = seconds - (findHours(seconds) * 3600) - (findMinutes(seconds) * 60);

        return secs;
    }

    public static String time(int seconds) {

        int[] time = new int[3];

        time[0] = findHours(seconds);
        time[1] = findMinutes(seconds);
        time[2] = findSeconds(seconds);

        return time[0] + ":" + time[1] + ":" + time[2];
    }
}
