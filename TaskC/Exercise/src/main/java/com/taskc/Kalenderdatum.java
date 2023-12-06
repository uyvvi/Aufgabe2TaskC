package main.java.com.taskc;

import java.time.LocalDate;
import java.time.Month;

public class Kalenderdatum {
   public class CalendarDate {
    private LocalDate date;

    public CalendarDate(int year, Month month, int day) {
        this.date = LocalDate.of(year, month.ordinal() + 1, day);
    }
   }
}
