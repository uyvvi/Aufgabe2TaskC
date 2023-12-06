package main.java.com.taskc;

import java.time.LocalTime;

public class Time {
    private LocalTime time;

    public Time(int hours, int minutes, int seconds) {
        this.time = LocalTime.of(hours, minutes, seconds);
    }
}
