package org.example.homework_nr_5;

public enum Weekday {

    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    public boolean isWeekday() {
        return this != SATURDAY && this != SUNDAY;

    }

    public boolean isHoliday() {
        return this == SATURDAY || this == SUNDAY;
    }
}














