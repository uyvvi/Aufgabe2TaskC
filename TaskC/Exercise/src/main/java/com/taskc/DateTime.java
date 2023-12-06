package main.java.com.taskc;

import main.java.com.taskc.Kalenderdatum.CalendarDate;

public class DateTime {
    private Time time;
    private CalendarDate calendarDate;

    public DateTime(Time time, CalendarDate calendarDate) {
        this.time = time;
        this.calendarDate = calendarDate;
    }
}
